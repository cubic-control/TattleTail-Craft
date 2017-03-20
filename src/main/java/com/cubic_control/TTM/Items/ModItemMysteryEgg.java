package com.cubic_control.TTM.Items;

import java.util.List;

import com.cubic_control.TTM.Blocks.MBlockManager;
import com.cubic_control.TTM.Lib.RefStrings;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ModItemMysteryEgg extends ModItem{
	public IIcon[] icons = new IIcon[4];

	public ModItemMysteryEgg(String name, float f1) {
		super(name, f1);
		this.setHasSubtypes(true);
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
	@Override
	public void registerIcons(IIconRegister reg) {
	    for(int i = 0; i < 4; i ++) {
	        this.icons[i] = reg.registerIcon(this.iconString + "_" + i);
	    }
	}
	@Override
	public IIcon getIconFromDamage(int meta) {
	    if(meta > 3) {
	        meta = 0;
	    }
	    
	    return this.icons[meta];
	}
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
	    for(int i = 0; i < 4; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}

}
