package com.cubic_control.TTM.Items;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

import com.cubic_control.cubic_core.Utils.CubicUtils;

public class ModItemRechargeableFlashlight extends ModItem implements ICharge{
	private float charge = 0.0f;
	private float maxCharge;

	public ModItemRechargeableFlashlight(String name, float f1, float max) {
		super(name, f1);
		this.maxCharge = max;
	}
	//@Override
	//public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		//this.charge = this.maxCharge;
		//return stack;
	//}
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int i1, boolean b1) {
		if(charge > 0.0f){
			--charge;
		}
		super.onUpdate(stack, world, entity, i1, b1);
	}
	@Override
	public boolean isOut() {
		if(this.getChargeFloat() <= 0.0f){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public boolean isLow() {
		if(this.getChargeFloat() <= (this.maxCharge / 2)){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public float getChargeFloat() {
		return charge;
	}
	//TODO: REMOVE THIS CODE PERMANETLY
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
		CubicUtils.updateLightByMOP(world, mop);
	}
}