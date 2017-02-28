package com.cubic_control.TTM.Events;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;

public class MEventHandler {

	public static void registerEvents() {
		FMLCommonHandler.instance().bus().register(new MEventFlashlight());
		MinecraftForge.EVENT_BUS.register(new MEventTattleTail());
		FMLCommonHandler.instance().bus().register(new MEventWelcomeMessage());
		MinecraftForge.EVENT_BUS.register(new MEventTattleTailDropped());
		FMLCommonHandler.instance().bus().register(new MEventUpdateChecker());
	}

}
