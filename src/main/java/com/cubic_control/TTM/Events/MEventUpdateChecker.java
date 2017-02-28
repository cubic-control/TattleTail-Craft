package com.cubic_control.TTM.Events;

import com.cubic_control.TTM.Lib.RefStrings;
import com.cubic_control.TTM.Main.MainRegistry;

import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class MEventUpdateChecker {
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onPlayerTickEvent(PlayerTickEvent event) {
	    if (!MainRegistry.haveWarnedVersionOutOfDate && event.player.worldObj.isRemote 
	          && !MainRegistry.versionChecker.isLatestVersion()) {
	        ClickEvent versionCheckChatClickEvent = new ClickEvent(ClickEvent.Action.OPEN_URL, 
	              "");
	        ChatStyle clickableChatStyle = new ChatStyle().setChatClickEvent(versionCheckChatClickEvent);
	        ChatComponentText versionWarningChatComponent = 
	              new ChatComponentText(RefStrings.NAME + " is not the latest version! Click here to update.");
	        versionWarningChatComponent.setChatStyle(clickableChatStyle);
	        event.player.addChatMessage(versionWarningChatComponent);
	        MainRegistry.haveWarnedVersionOutOfDate = true;
	    }
	  
	}

}
