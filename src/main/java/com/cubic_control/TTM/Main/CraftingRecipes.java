package com.cubic_control.TTM.Main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.cubic_control.TTM.Items.MItemManager;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipes {
	public static void createRecipes(){
		GameRegistry.addShapedRecipe(new ItemStack(MItemManager.ritual), "ABA", "CDE", "FGF", 'A', MItemManager.yellow_TattleTail, 'B', MItemManager.purple_TattleTail, 'C', MItemManager.candles, 'D', MItemManager.mama_story_disc, 'E', MItemManager.cupcakes, 'F', MItemManager.blue_TattleTail, 'G', MItemManager.christmas_light);
		GameRegistry.addShapedRecipe(new ItemStack(MItemManager.present), "WRW", "RRR", "WRW", 'W', new ItemStack(Blocks.wool, 1, 0), 'R', new ItemStack(Blocks.wool, 1, 14));
		GameRegistry.addShapedRecipe(new ItemStack(MItemManager.cPresent), "WBW", "BBB", "WBW", 'W', new ItemStack(Blocks.wool, 1, 0), 'B', new ItemStack(Blocks.wool, 1, 11));
		GameRegistry.addShapedRecipe(new ItemStack(MItemManager.candles), "TTT", "CCC", "DDD", 'T', Blocks.torch, 'C', Items.clay_ball, 'D', new ItemStack(Items.dye, 1, 1));
	}
}
