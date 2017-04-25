package com.cubic_control.TTM.Items;

import com.cubic_control.TTM.CreativeTabs.MCreativeTabs;
import com.cubic_control.cubic_core.Bases.BaseBlock;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ModItemMamaTattleTail_choco extends ModItemBlockPlacer{

	public ModItemMamaTattleTail_choco(String name, float f1, BaseBlock block) {
		super(name, f1, block);
		this.setCreativeTab(MCreativeTabs.tabCustom);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if(world.isRemote){
			player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.DARK_RED+"<"+
					EnumChatFormatting.GOLD+"Choco Mama"+EnumChatFormatting.DARK_RED+">"+
					EnumChatFormatting.WHITE+"work in progress..."));
		}
		return stack;
	}
}