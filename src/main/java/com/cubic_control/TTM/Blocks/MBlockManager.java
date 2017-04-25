package com.cubic_control.TTM.Blocks;

import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_bendy;
import com.cubic_control.TTM.Items.MItemManager;
import com.cubic_control.cubic_core.Bases.BaseBlock;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class MBlockManager {
	public static BaseBlock purple_TattleTail;
	public static BaseBlock yellow_TattleTail;
	public static BaseBlock blue_TattleTail;
	public static BaseBlock snowglobe_TattleTail;
	public static BaseBlock nightnight_TattleTail;
	public static BaseBlock butternut_TattleTail;
	public static BaseBlock mama_TattleTail;
	public static BaseBlock ketchup;
	public static BaseBlock present;
	public static BaseBlock candles;
	public static BaseBlock vase;
	//Custom
	public static BaseBlock cPresent;
		//TattleTails
	public static BaseBlock bendy_TattleTail;
	public static BaseBlock beta_TattleTail;
	public static BaseBlock candy_corn_TattleTail;
	public static BaseBlock cubic_TattleTail;
	public static BaseBlock dark_TattleTail;
	public static BaseBlock demonic_TattleTail;
	public static BaseBlock fairy_TattleTail;
	public static BaseBlock freddy_TattleTail;
	public static BaseBlock girrafe_TattleTail;
	public static BaseBlock lol_TattleTail;
	public static BaseBlock neighbor_TattleTail;
	public static BaseBlock pumpkin_TattleTail;
	public static BaseBlock red_TattleTail;
	public static BaseBlock sans_TattleTail;
	public static BaseBlock scott_TattleTail;
	public static BaseBlock shadow_TattleTail;
	public static BaseBlock spring_TattleTail;
	public static BaseBlock withered_TattleTail;
		//Mammas
	public static BaseBlock papa_TattleTail;

	public static void createBlocks() {
		purple_TattleTail = new ModBlockTattleTail("TattleTail_purple");
		yellow_TattleTail = new ModBlockTattleTail("TattleTail_yellow");
		blue_TattleTail = new ModBlockTattleTail("TattleTail_blue");
		snowglobe_TattleTail = new ModBlockTattleTail("TattleTail_snowglobe");
		nightnight_TattleTail = new ModBlockTattleTail("TattleTail_nightnight");
		butternut_TattleTail = new ModBlockTattleTail("TattleTail_butternut");
		mama_TattleTail = new ModBlockMama("TattleTail_mama");
		papa_TattleTail = new ModBlockPapa("TattleTail_papa");
		ketchup = new ModBlockKetchup("Ketchup_block");
		present = new ModBlockPresent("present_block");
		candles = new ModBlockCandles("candles_block");
		vase = new ModBlockVase("vase_block");
		//Custom
		cPresent = new ModBlockCPresent("cPresent_block");
			//TattleTails
		bendy_TattleTail = new ModBlockCTattleTail("TattleTail_bendy");
		beta_TattleTail = new ModBlockCTattleTail("TattleTail_beta");
		candy_corn_TattleTail = new ModBlockCTattleTail("TattleTail_candy_corn");
		cubic_TattleTail = new ModBlockCTattleTail("TattleTail_cubic");
		dark_TattleTail = new ModBlockCTattleTail("TattleTail_dark");
		demonic_TattleTail = new ModBlockCTattleTail("TattleTail_demonic");
		fairy_TattleTail = new ModBlockCTattleTail("TattleTail_fairy");
		freddy_TattleTail = new ModBlockCTattleTail("TattleTail_freddy");
		girrafe_TattleTail = new ModBlockCTattleTail("TattleTail_girrafe");
		lol_TattleTail = new ModBlockCTattleTail("TattleTail_lol");
		neighbor_TattleTail = new ModBlockCTattleTail("TattleTail_neighbor");
		pumpkin_TattleTail = new ModBlockCTattleTail("TattleTail_pumpkin");
		red_TattleTail = new ModBlockCTattleTail("TattleTail_red");
		sans_TattleTail = new ModBlockCTattleTail("TattleTail_sans");
		scott_TattleTail = new ModBlockCTattleTail("TattleTail_scott");
		shadow_TattleTail = new ModBlockCTattleTail("TattleTail_shadow");
		spring_TattleTail = new ModBlockCTattleTail("TattleTail_spring");
		withered_TattleTail = new ModBlockCTattleTail("TattleTail_withered");
	}

}
