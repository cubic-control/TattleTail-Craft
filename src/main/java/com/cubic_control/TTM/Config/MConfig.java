package com.cubic_control.TTM.Config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.cubic_control.TTM.Lib.RefStrings;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class MConfig extends Configuration{
	
	private static String PATH;

	public static Configuration config;
	
	public static boolean doesTattleEffect = false;
	public static boolean doesMamaLayEggs = false;
	public static boolean tattleTextMode = false;
	public static int vaseDropCandlesChance = 25;

	/**
	 * Creates Config file in custom folder in .minecraft folder.
	 */
	public static void createConfig(){
		PATH = "config/cubic_control/TTM/1.7/";
		File file = new File(PATH + "ConfigurationFile.cfg");
		config = new Configuration(file);
		config.load();
		syncConfig();
	}
	
	public static void syncConfig() {
		addBooleans();
		addInts();

	    if(config.hasChanged()){
	    	config.save();
	    }
	  }
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if(eventArgs.modID.equals(RefStrings.MODID)){
			syncConfig();
		}
	}
	
	/**
	 * Add Booleans to config file.
	 */
	public static void addBooleans(){
		config.getCategory(ConfigTypes.BOOLEANS);
		doesTattleEffect = config.getBoolean("doesTattleEffect", ConfigTypes.BOOLEANS, false, "makes tattleTail give player effects depending on color.");
		doesMamaLayEggs = config.getBoolean("doesMamaLayEggs", ConfigTypes.BOOLEANS, false, "makes Mama(and other forms of Mama) lay mystery eggs.");
		tattleTextMode = config.getBoolean("tattleTextMode", ConfigTypes.BOOLEANS, false, "makes TattleTail(and other forms of TattleTail) use text instead of voice.");
	}
	
	public static void addInts(){
		config.getCategory(ConfigTypes.INTS);
		vaseDropCandlesChance = config.getInt("vaseDropCandlesChance", ConfigTypes.INTS, 25, 0, 100, "sets the chance out of 100 for the vase to drop candles.");
	}
	
	public static Configuration getConfig(){
		return config;
	}

}