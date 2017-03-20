package com.cubic_control.TTM.Items;

import com.cubic_control.TTM.Blocks.MBlockManager;
import com.cubic_control.TTM.Lib.RefStrings;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ModItemMamaTattleTail extends ModItemBlockPlacer{
	String message;
	String sound;

	public ModItemMamaTattleTail(String name, float f1) {
		super(name, f1, MBlockManager.mama_TattleTail);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		message = mamaSpeach(message);
		sound = mamaSound(sound);
		
		if(world.isRemote){
			//player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.WHITE+"<"+
			//		EnumChatFormatting.RED+"Mama"+EnumChatFormatting.WHITE+">"+EnumChatFormatting.RED
			//		+message));
		}else{
			world.playSoundAtEntity(player, RefStrings.MODID + ":" + sound, 0.5F, 1.0F);
		}
		return stack;
	}
	
	private String mamaSpeach(String string){
		switch(this.itemRand.nextInt(4)){
		case 0:
			string=("Come To Mama!");
			return string;
		case 1:
			string=("Mama Will Look After You!");
			return string;
		case 2:
			string=("Mama's Looking After You!");
			return string;
		case 3:
			string=("Mama's Coming!");
			return string;
		}
		return string;
	}
	
	private String mamaSound(String string){
		switch(this.itemRand.nextInt(4)){
		case 0:
			string=("mama.cometomama");
			return string;
		case 1:
			string=("mama.mamawilllookafteryou");
			return string;
		case 2:
			string=("mama.mamaslookingafteryou");
			return string;
		case 3:
			string=("mama.mamascoming");
			return string;
		}
		return string;
	}

}