package com.cubic_control.TTM.Events;

import com.cubic_control.TTM.Blocks.MBlockManager;
import com.cubic_control.TTM.Items.MItemManager;
import com.cubic_control.TTM.Lib.RefStrings;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class MEventTattleTailDropped {
	
	@SubscribeEvent
    public void onEntityJoinedWorld(EntityJoinWorldEvent event) {
		if(event.entity instanceof EntityItem){
			System.out.println(RefStrings.NAME + "[TEST]: TattleTail Event Started");
			World world = event.entity.worldObj;
			int posX = (int) event.entity.posX;
			int posY = (int) event.entity.posY;
			int posZ = (int) event.entity.posZ;
			if(((EntityItem)event.entity).getEntityItem().getItem() == MItemManager.purple_TattleTail){
				world.setBlock(posX, posY, posZ, MBlockManager.purple_TattleTail);
				event.entity.setDead();
				System.out.println(RefStrings.NAME + "[TEST]: TattleTail Placed");
			}
			if(((EntityItem)event.entity).getEntityItem().getItem() == MItemManager.yellow_TattleTail){
				world.setBlock(posX, posY, posZ, MBlockManager.yellow_TattleTail);
				event.entity.setDead();
				System.out.println(RefStrings.NAME + "[TEST]: TattleTail Placed");
			}
			if(((EntityItem)event.entity).getEntityItem().getItem() == MItemManager.blue_TattleTail){
				world.setBlock(posX, posY, posZ, MBlockManager.blue_TattleTail);
				event.entity.setDead();
				System.out.println(RefStrings.NAME + "[TEST]: TattleTail Placed");
			}
			if(((EntityItem)event.entity).getEntityItem().getItem() == MItemManager.white_TattleTail){
				world.setBlock(posX, posY, posZ, MBlockManager.white_TattleTail);
				event.entity.setDead();
				System.out.println(RefStrings.NAME + "[TEST]: TattleTail Placed");
			}
			if(((EntityItem)event.entity).getEntityItem().getItem() == MItemManager.black_TattleTail){
				world.setBlock(posX, posY, posZ, MBlockManager.black_TattleTail);
				event.entity.setDead();
				System.out.println(RefStrings.NAME + "[TEST]: TattleTail Placed");
			}
		}
	}

}
