package com.cubic_control.TTM.Entity.TileEntity;

import cpw.mods.fml.common.registry.GameRegistry;

public class MTileEntity {

	public static void createTileEntity() {
		GameRegistry.registerTileEntity(TileEntityTattleTail_purple.class, "TattleTail_purple");
		GameRegistry.registerTileEntity(TileEntityTattleTail_yellow.class, "TattleTail_yellow");
		GameRegistry.registerTileEntity(TileEntityTattleTail_blue.class, "TattleTail_blue");
		GameRegistry.registerTileEntity(TileEntityTattleTail_snowglobe.class, "TattleTail_snowglobe");
		GameRegistry.registerTileEntity(TileEntityTattleTail_nightnight.class, "TattleTail_nightnight");
		GameRegistry.registerTileEntity(TileEntityTattleTail_butternut.class, "TattleTail_butternut");
		GameRegistry.registerTileEntity(TileEntityMama.class, "Mama");
		GameRegistry.registerTileEntity(TileEntityPapa.class, "Papa");
		GameRegistry.registerTileEntity(TileEntityKetchup.class, "Ketchup");
	}

}
