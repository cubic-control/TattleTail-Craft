package com.cubic_control.TTM.Items;

import com.cubic_control.TTM.Blocks.MBlockManager;
import com.cubic_control.cubic_core.Bases.BaseBlock;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModItemPresent extends ModItemBlockPlacer {

	public ModItemPresent(String name, float f1) {
		super(name, f1, MBlockManager.present);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		Item[] items = new Item[]{MItemManager.purple_TattleTail, MItemManager.yellow_TattleTail,
			MItemManager.blue_TattleTail, MItemManager.snowglobe_TattleTail,
			MItemManager.nightnight_TattleTail, MItemManager.butternut_TattleTail};
		
		Item item = items[itemRand.nextInt(items.length)];
		
		if(item != null){
			player.inventory.addItemStackToInventory(new ItemStack(item));
			--stack.stackSize;
			return stack;
		}else{
			return stack;
		}
	}

}
