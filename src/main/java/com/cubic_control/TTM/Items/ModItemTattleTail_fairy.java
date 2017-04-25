package com.cubic_control.TTM.Items;

import com.cubic_control.TTM.Blocks.MBlockManager;
import com.cubic_control.TTM.CreativeTabs.MCreativeTabs;
import com.cubic_control.cubic_core.Bases.BaseBlock;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ModItemTattleTail_fairy extends ModItemBlockPlacer{

	public ModItemTattleTail_fairy(String name, float f1) {
		super(name, f1, MBlockManager.fairy_TattleTail);
		this.setCreativeTab(MCreativeTabs.tabCustom);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if(world.isRemote){
			player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE+"<"+
					EnumChatFormatting.WHITE+"Fairy Tail"+EnumChatFormatting.LIGHT_PURPLE+">"+
					EnumChatFormatting.WHITE+"work in progress..."));
		}
		return stack;
	}
}