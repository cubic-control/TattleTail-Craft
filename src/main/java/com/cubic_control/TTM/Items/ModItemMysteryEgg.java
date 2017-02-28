package com.cubic_control.TTM.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModItemMysteryEgg extends ModItem{

	public ModItemMysteryEgg(String name, float f1) {
		super(name, f1);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		Item[] items = new Item[]{MItemManager.bandage, MItemManager.broken_crayon,
			MItemManager.car_key, MItemManager.chewed_dog_food, MItemManager.christmas_light,
			MItemManager.cupcake_wrapper, MItemManager.dead_beetle, MItemManager.doll_hair,
			MItemManager.dust_bunny, MItemManager.fingernail_clipping, MItemManager.french_fry,
			MItemManager.hairball, MItemManager.ketchup, MItemManager.loose_change,
			MItemManager.lost_earring, MItemManager.missing_sock, MItemManager.old_napkin,
			MItemManager.peanut_shells, MItemManager.pencil_shavings, MItemManager.rabbits_foot,
			MItemManager.seashells_soap, MItemManager.used_bandage};
		
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
