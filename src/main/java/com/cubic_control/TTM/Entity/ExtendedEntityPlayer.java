package com.cubic_control.TTM.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedEntityPlayer implements IExtendedEntityProperties{
	public final static String EXT_PROP_NAME = "ExtendedEntityPlayer";
	
	private final EntityPlayer player;
	
	private int currentCharge, maxCharge;
	
	public ExtendedEntityPlayer(EntityPlayer player) {
		this.player = player;
	}
	
	public static final void register(EntityPlayer player) {
		player.registerExtendedProperties(ExtendedEntityPlayer.EXT_PROP_NAME, new ExtendedEntityPlayer(player));
	}
	
	public static final ExtendedEntityPlayer get(EntityPlayer player) {
		return (ExtendedEntityPlayer)player.getExtendedProperties(EXT_PROP_NAME);
	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();
		
		properties.setInteger("CurrentCharge", this.currentCharge);
		properties.setInteger("MaxCharge", this.maxCharge);
		
		compound.setTag(EXT_PROP_NAME, properties);
	}
	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		
		this.currentCharge = properties.getInteger("CurrentCharge");
		this.maxCharge = properties.getInteger("MaxCharge");
		System.out.println("[TTM] Charge from NBT: " + this.currentCharge + "/" + this.maxCharge);
	}
	@Override
	public void init(Entity entity, World world) {}
	
	public boolean consumeCharge(int amount) {
		boolean sufficient = amount <= this.currentCharge;
		this.currentCharge -= (amount < this.currentCharge ? amount : this.currentCharge);
		return sufficient;
	}
	
	public void replenishCharge() {
		this.currentCharge = this.maxCharge;
	}

}
