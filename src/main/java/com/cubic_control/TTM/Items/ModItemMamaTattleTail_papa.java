package com.cubic_control.TTM.Items;

import com.cubic_control.TTM.Blocks.MBlockManager;
import com.cubic_control.TTM.CreativeTabs.MCreativeTabs;
import com.cubic_control.TTM.Lib.RefStrings;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ModItemMamaTattleTail_papa extends ModItemBlockPlacer{
	String message;

	public ModItemMamaTattleTail_papa(String name, float f1) {
		super(name, f1, MBlockManager.papa_TattleTail);
		this.setCreativeTab(MCreativeTabs.tabCustom);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		message = papaSpeach(message);
		
		if(world.isRemote){
			player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.WHITE+"<"+
					EnumChatFormatting.GREEN+"Papa"+EnumChatFormatting.WHITE+">"+EnumChatFormatting.GREEN
					+message));
		}
		return stack;
	}
	
	private String papaSpeach(String string){
		switch(this.itemRand.nextInt(4)){
		case 0:
			string=("Come To Papa!");
			return string;
		case 1:
			string=("Papa Will Look After You!");
			return string;
		case 2:
			string=("Papa's Looking After You!");
			return string;
		case 3:
			string=("Papa's Coming!");
			return string;
		}
		return string;
	}

}