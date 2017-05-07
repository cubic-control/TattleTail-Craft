package com.cubic_control.TTM.Events;

import com.cubic_control.TTM.Entity.ExtendedEntityPlayer;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class MEventCharge {
	
	@SubscribeEvent
	public static void onEntityConstructing(EntityConstructing event) {
		if(event.entity instanceof EntityPlayer && ExtendedEntityPlayer.get((EntityPlayer)event.entity) == null){
			ExtendedEntityPlayer.register((EntityPlayer)event.entity);
		}
		if(event.entity instanceof EntityPlayer && event.entity.getExtendedProperties(ExtendedEntityPlayer.EXT_PROP_NAME) == null){
			event.entity.registerExtendedProperties(ExtendedEntityPlayer.EXT_PROP_NAME, new ExtendedEntityPlayer((EntityPlayer)event.entity));
		}
	}

}
