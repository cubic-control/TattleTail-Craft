package com.cubic_control.TTM.CreativeTabs;

import com.cubic_control.TTM.Lib.RefStrings;

import net.minecraft.creativetab.CreativeTabs;

public class MCreativeTabs {
	public static CreativeTabs tabOriginal;
	public static CreativeTabs tabCustom;
	
	public static void createTabs(){
		tabOriginal = new CreativeTabOriginal(RefStrings.MODID + ":tabOriginal");
		tabCustom = new CreativeTabCustom(RefStrings.MODID + ":tabCustom");
	}
}
