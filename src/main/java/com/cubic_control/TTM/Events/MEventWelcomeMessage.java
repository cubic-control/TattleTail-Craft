package com.cubic_control.TTM.Events;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import com.cubic_control.TTM.Lib.RefStrings;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class MEventWelcomeMessage {
	
	@SubscribeEvent
    public void onPlayerLogin(PlayerLoggedInEvent event) {
    	event.player.addChatComponentMessage(new ChatComponentText(
    		EnumChatFormatting.DARK_PURPLE+"["+EnumChatFormatting.YELLOW+RefStrings.NAME+
    		EnumChatFormatting.DARK_PURPLE+"]:"+EnumChatFormatting.RED+" Welcome "+
    		event.player.getDisplayName()+" to "+EnumChatFormatting.YELLOW+RefStrings.NAME+
    		EnumChatFormatting.DARK_PURPLE+":"+EnumChatFormatting.RED+" The TattleTail Mod!"+
    		EnumChatFormatting.WHITE+EnumChatFormatting.ITALIC+" This mod is copyright 2017 by cubic_control."));
    }

}
