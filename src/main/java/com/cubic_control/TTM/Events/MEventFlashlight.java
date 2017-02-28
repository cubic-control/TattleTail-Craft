package com.cubic_control.TTM.Events;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.cubic_control.TTM.Items.ModItemRechargableFlashlight;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class MEventFlashlight {
	
	@SubscribeEvent
	public void onPlayerTickEvent(PlayerTickEvent event) {
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = event.player;
		World world = player.worldObj;
		ItemStack stack = player.getHeldItem();
		if(world.isRemote){
			if(stack != null) {
				boolean flag = stack.getItem() instanceof ModItemRechargableFlashlight;
				if(flag){
					//MovingObjectPosition mop = Minecraft.getMinecraft().renderViewEntity.rayTrace(200, 1.0F);
				
					//if(mop != null){
						//if(!((ModItemRechargableFlashlight)stack.getItem()).isOut()){
							//ModUtils.addLight(world, mop, player);
						//}
					//}
					if(!((ModItemRechargableFlashlight)stack.getItem()).isOut()){
					}
				}
			}
		}
	}
	
	

}
