package com.cubic_control.TTM.Blocks;

import com.cubic_control.cubic_core.Bases.BaseBlock;

import net.minecraft.block.Block;

public class MBlockManager {
	public static BaseBlock purple_TattleTail;
	public static BaseBlock yellow_TattleTail;
	public static BaseBlock blue_TattleTail;
	public static BaseBlock white_TattleTail;
	public static BaseBlock black_TattleTail;
	public static BaseBlock ketchup;

	public static void createBlocks() {
		purple_TattleTail = new ModBlockTattleTail("TattleTail_purple");
		yellow_TattleTail = new ModBlockTattleTail("TattleTail_yellow");
		blue_TattleTail = new ModBlockTattleTail("TattleTail_blue");
		white_TattleTail = new ModBlockTattleTail("TattleTail_white");
		black_TattleTail = new ModBlockTattleTail("TattleTail_black");
		ketchup = new ModBlockKetchup("Ketchup_block");
	}

}
