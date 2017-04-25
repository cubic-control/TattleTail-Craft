package com.cubic_control.TTM.CreativeTabs;

import com.cubic_control.TTM.Items.MItemManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCustom extends CreativeTabs {

	public CreativeTabCustom(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return MItemManager.bendy_TattleTail;
	}

}
