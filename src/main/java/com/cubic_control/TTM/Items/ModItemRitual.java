package com.cubic_control.TTM.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModItemRitual extends ModItem{

	public ModItemRitual(String name, float f1) {
		super(name, f1);
		this.setMaxDamage(1);
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
        stack.damageItem(1, par3EntityLivingBase);
        return true;
    }
	@Override
	@SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.block;
    }
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
        return stack;
    }

}
