package com.cubic_control.TTM.Events;

import com.cubic_control.TTM.Entity.EntityMama;
import com.cubic_control.TTM.Lib.RefStrings;
import com.cubic_control.cubic_core.Utils.ModUtils;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class MEventMamaLightsOut {
	
	@SubscribeEvent
    public void onLivingUpdateEvent(LivingUpdateEvent event) {
		EntityLivingBase entity = event.entityLiving;
		
		if(entity instanceof EntityMama){
			World world = entity.worldObj;
			int posX = (int) entity.posX;
			int posY = (int) entity.posY;
			int posZ = (int) entity.posZ;
			Block[] blocks = ModUtils.getBlocksAroundPoint(world, posX, posY, posZ);
			
			if(!world.isRemote){
				for(int i = 0; i < blocks.length; i++){
					Block block = blocks[i];
					
					if(block.getLightValue() > 0.0F){
						//block.setLightLevel(0.0F);
						System.out.println("["+RefStrings.MODID+"]: Going to change light value to 0.0F later.");
					}
				}
			}
		}
	}

}
