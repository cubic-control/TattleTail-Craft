package com.cubic_control.TTM.Blocks;

import com.cubic_control.cubic_core.Bases.BaseBlock;

import net.minecraft.block.Block;

public class MBlockManager {
	public static BaseBlock purple_TattleTail;
	public static BaseBlock yellow_TattleTail;
	public static BaseBlock blue_TattleTail;
	public static BaseBlock snowglobe_TattleTail;
	public static BaseBlock nightnight_TattleTail;
	public static BaseBlock butternut_TattleTail;
	public static BaseBlock mama_TattleTail;
	public static BaseBlock papa_TattleTail;
	public static BaseBlock ketchup;

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
	}

}
