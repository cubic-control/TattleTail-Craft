package com.cubic_control.TTM.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModItemBandage extends ModItem{

	public ModItemBandage(String name, float f1) {
		super(name, f1);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if(player.getHealth() >= player.getMaxHealth()){
			return stack;
		}else{
			player.heal(5.0F);
			player.inventory.addItemStackToInventory(new ItemStack(MItemManager.used_bandage));
			--stack.stackSize;
			return stack;
		}
	}

}
