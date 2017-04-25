package com.cubic_control.TTM.CreativeTabs;

import com.cubic_control.TTM.Items.MItemManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabOriginal extends CreativeTabs {

	public CreativeTabOriginal(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return MItemManager.purple_TattleTail;
	}

}
