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
		GameRegistry.registerTileEntity(TileEntityKetchup.class, "Ketchup");
		GameRegistry.registerTileEntity(TileEntityPresent.class, "present");
		GameRegistry.registerTileEntity(TileEntityCandles.class, "candles");
		GameRegistry.registerTileEntity(TileEntityVase.class, "vase");
		//Custom
		GameRegistry.registerTileEntity(TileEntityCPresent.class, "cPresent");
			//TattleTails
		GameRegistry.registerTileEntity(TileEntityCTattleTail_bendy.class, "CTattleTail_bendy");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_beta.class, "CTattleTail_beta");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_candy_corn.class, "CTattleTail_candy_corn");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_cubic.class, "CTattleTail_cubic");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_dark.class, "CTattleTail_dark");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_demonic.class, "CTattleTail_demonic");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_fairy.class, "CTattleTail_fairy");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_freddy.class, "CTattleTail_freddy");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_girrafe.class, "CTattleTail_girrafe");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_lol.class, "CTattleTail_lol");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_neighbor.class, "CTattleTail_neighbor");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_pumpkin.class, "CTattleTail_pumpkin");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_red.class, "CTattleTail_red");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_sans.class, "CTattleTail_sans");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_scott.class, "CTattleTail_scott");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_shadow.class, "CTattleTail_shadow");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_spring.class, "CTattleTail_spring");
		GameRegistry.registerTileEntity(TileEntityCTattleTail_withered.class, "CTattleTail_withered");
			//Mammas
		GameRegistry.registerTileEntity(TileEntityPapa.class, "Papa");
		GameRegistry.registerTileEntity(TileEntityCMamaTattleTail_choco.class, "Choco_Mama");
		GameRegistry.registerTileEntity(TileEntityCMamaTattleTail_golden.class, "Golden_Mama");
		GameRegistry.registerTileEntity(TileEntityCMamaTattleTail_nightmare.class, "Nightmare_Mama");
	}

}
