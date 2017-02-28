package com.cubic_control.TTM.CreativeTabs;

import com.cubic_control.TTM.Items.MItemManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabAll extends CreativeTabs {

	public CreativeTabAll(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return MItemManager.rechargable_flashlight_blue;
	}

}
