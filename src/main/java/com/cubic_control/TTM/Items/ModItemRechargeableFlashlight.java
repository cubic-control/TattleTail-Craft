package com.cubic_control.TTM.Items;

import com.cubic_control.cubic_core.Utils.ModUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ModItemRechargeableFlashlight extends ModItem /*implements ICharge, IExtendedEntityProperties*/{
	//public float chargeFloat = 0.0f;

	public ModItemRechargeableFlashlight(String name, float f1) {
		super(name, f1);
	}
	//@Override
	//public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		//chargeFloat = 50.0f;
		//return stack;
	//}
	@Override
	public boolean isItemTool(ItemStack stack) {
		return super.isItemTool(stack);
	}
	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 72000;
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		player.setItemInUse(stack, getMaxItemUseDuration(stack));
		return stack;
	}
	@Override
	public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int i1) {
		MovingObjectPosition mop = Minecraft.getMinecraft().renderViewEntity.rayTrace(200, 1.0F);
		ModUtils.updateLightByMOP(world, mop);
	}
	//@Override
	//public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int i1) {
	//}
	
	//@Override
	//public void onUpdate(ItemStack stack, World world, Entity entity, int i1, boolean b1) {
		//if(chargeFloat != 0.0f){
			//--chargeFloat;
		//}
		//if(chargeFloat < 0.0f){
			//chargeFloat = 0.0f;
		//}
		//super.onUpdate(stack, world, entity, i1, b1);
	//}
	
	//public boolean isOut(){
		//if(chargeFloat > 0.0f){
			//return false;
		//}else{
			//return true;
		//}
	//}
	//@Override
	//public void saveNBTData(NBTTagCompound compound) {
	//}
	//@Override
	//public void loadNBTData(NBTTagCompound compound) {
	//}
	//@Override
	//public void init(Entity entity, World world) {
	//}
}