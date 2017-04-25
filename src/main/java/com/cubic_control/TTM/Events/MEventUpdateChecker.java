package com.cubic_control.TTM.Events;

import com.cubic_control.TTM.Lib.RefStrings;
import com.cubic_control.TTM.Main.MainRegistry;

import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class MEventUpdateChecker {
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onPlayerTickEvent(PlayerTickEvent event) {
		if(!MainRegistry.haveWarnedVersionOutOfDate && event.player.worldObj.isRemote && !MainRegistry.versionChecker.isLatestVersion()) {
			ClickEvent versionCheckChatClickEvent = new ClickEvent(ClickEvent.Action.OPEN_URL, "http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/2800851");
	        ChatStyle clickableChatStyle = new ChatStyle().setChatClickEvent(versionCheckChatClickEvent);
	        ChatComponentText versionWarningChatComponent = new ChatComponentText(EnumChatFormatting.DARK_PURPLE+"["+EnumChatFormatting.YELLOW+RefStrings.NAME+EnumChatFormatting.DARK_PURPLE+"]:"+EnumChatFormatting.RED+" You are running an outdated version of TattleTail Craft! Click here to update.");
	        versionWarningChatComponent.setChatStyle(clickableChatStyle);
	        event.player.addChatMessage(versionWarningChatComponent);
	        MainRegistry.haveWarnedVersionOutOfDate = true;
	    }
	  
	}

}
