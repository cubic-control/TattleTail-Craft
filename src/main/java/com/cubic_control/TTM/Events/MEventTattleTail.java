package com.cubic_control.TTM.Events;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import com.cubic_control.TTM.Config.MConfig;
import com.cubic_control.TTM.Gui.Gui1;
import com.cubic_control.TTM.Items.MItemManager;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class MEventTattleTail {
	
	@SubscribeEvent
    public void renderOverlay(RenderGameOverlayEvent event) {
		Minecraft mc = Minecraft.getMinecraft();
        EntityPlayer player = mc.thePlayer;
        boolean flag = player.inventory.hasItem(MItemManager.purple_TattleTail);
        boolean flag2 = player.inventory.hasItem(MItemManager.yellow_TattleTail);
        boolean flag3 = player.inventory.hasItem(MItemManager.blue_TattleTail);
        boolean flag4 = player.inventory.hasItem(MItemManager.white_TattleTail);
        boolean flag5 = player.inventory.hasItem(MItemManager.black_TattleTail);
        
        if(flag || flag2 || flag3 || flag4 || flag5) {
        	Gui1 gui = new Gui1();
        	gui.RenderGui(event.resolution);
        }
        if(MConfig.doesTattleEffect){
        	if(flag){
        		player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 1, 1));
        	}
        	if(flag2){
        		player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 1, 1));
        	}
        	if(flag3){
        		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1, 1));
        	}
        	if(flag4){
        		player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 1, 1));
        	}
        	if(flag5){
        		player.addPotionEffect(new PotionEffect(Potion.weakness.id, 1, 1));
        	}
        }
	}
}
