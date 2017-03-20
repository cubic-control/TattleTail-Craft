package com.cubic_control.TTM.Items;

import com.cubic_control.TTM.CreativeTabs.MCreativeTabs;
import com.cubic_control.TTM.Lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;

public class ModItemFood extends ItemFood{
	
	public ModItemFood(int p_i45340_1_, boolean DogFood, String name) {
		super(p_i45340_1_, DogFood);
		this.setCreativeTab(MCreativeTabs.tabAll);
        this.setUnlocalizedName(name);
        this.setTextureName(RefStrings.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
	}
	
	public ModItemFood(int p_i45339_1_, float p_i45339_2_, boolean DogFood, String name){
		super(p_i45339_1_, p_i45339_2_, DogFood);
		this.setCreativeTab(MCreativeTabs.tabAll);
        this.setUnlocalizedName(name);
        this.setTextureName(RefStrings.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
	}

}
