package com.cubic_control.TTM.Items;

import com.cubic_control.TTM.Blocks.MBlockManager;
import com.cubic_control.TTM.CreativeTabs.MCreativeTabs;
import com.cubic_control.cubic_core.Bases.BaseBlock;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModItemCPresent extends ModItemBlockPlacer {

	public ModItemCPresent(String name, float f1) {
		super(name, f1, MBlockManager.cPresent);
		this.setCreativeTab(MCreativeTabs.tabCustom);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		Item[] items = new Item[]{MItemManager.bendy_TattleTail, MItemManager.beta_TattleTail,
			MItemManager.candy_corn_TattleTail, MItemManager.cubic_TattleTail,
			MItemManager.dark_TattleTail, MItemManager.demonic_TattleTail,
			MItemManager.fairy_TattleTail, MItemManager.freddy_TattleTail,
			MItemManager.girrafe_TattleTail, MItemManager.lol_TattleTail,
			MItemManager.neighbor_TattleTail, MItemManager.pumpkin_TattleTail,
			MItemManager.red_TattleTail, MItemManager.scott_TattleTail,
			MItemManager.shadow_TattleTail, MItemManager.spring_TattleTail,
			MItemManager.withered_TattleTail};
		
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
