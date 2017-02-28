package com.cubic_control.TTM.Entity.TileEntity;

import cpw.mods.fml.common.registry.GameRegistry;

public class MTileEntity {

	public static void createTileEntity() {
		GameRegistry.registerTileEntity(TileEntityTattleTail_purple.class, "TattleTail_purple");
		GameRegistry.registerTileEntity(TileEntityTattleTail_yellow.class, "TattleTail_yellow");
		GameRegistry.registerTileEntity(TileEntityTattleTail_blue.class, "TattleTail_blue");
		GameRegistry.registerTileEntity(TileEntityTattleTail_white.class, "TattleTail_white");
		GameRegistry.registerTileEntity(TileEntityTattleTail_black.class, "TattleTail_black");
	}

}
