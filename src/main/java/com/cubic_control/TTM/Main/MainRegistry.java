package com.cubic_control.TTM.Main;

import com.cubic_control.TTM.Blocks.MBlockManager;
import com.cubic_control.TTM.Config.MConfig;
import com.cubic_control.TTM.CreativeTabs.MCreativeTabs;
import com.cubic_control.TTM.Entity.MEntityManager;
import com.cubic_control.TTM.Entity.TileEntity.MTileEntity;
import com.cubic_control.TTM.Events.MEventHandler;
import com.cubic_control.TTM.Items.MItemManager;
import com.cubic_control.TTM.Lib.RefStrings;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION,
	guiFactory = RefStrings.GUIFACTORY, dependencies = "required-after:cubic_core")
public class MainRegistry {
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@Mod.Instance(RefStrings.MODID)
	public static MainRegistry instance;
	
	// Version checking instance
	public static VersionChecker versionChecker;
	public static boolean haveWarnedVersionOutOfDate = false;
	
	@EventHandler
	public static void Preload(FMLPreInitializationEvent PreEvent){
		boolean flag = Loader.isModLoaded("cubic_core");
		if(flag){
			System.out.println("["+RefStrings.NAME+"]: CubicCore Loaded! Let The Fun Begin!");
		}else{
			System.out.println("["+RefStrings.NAME+"]: CubicCore Not Loaded! We Are About To Crash!");
		}
		MConfig.createConfig();
		MCreativeTabs.createTabs();
		MTileEntity.createTileEntity();
		MBlockManager.createBlocks();
		MEntityManager.createEntity();
		MItemManager.createItems();
		CraftingRecipes.createRecipes();
		proxy.registerRenderInfo();
	}
	@EventHandler
	public static void load(FMLInitializationEvent event){
		FMLCommonHandler.instance().bus().register(instance);
		MEventHandler.registerEvents();
	}
	@EventHandler
	public static void Postload(FMLPostInitializationEvent PostEvent){
		MainRegistry.versionChecker = new VersionChecker();
		Thread versionCheckThread = new Thread(MainRegistry.versionChecker, "Version Check");
		versionCheckThread.start();
	}
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if(eventArgs.modID.equals(RefStrings.MODID)){
			MConfig.syncConfig();
		}
	}
}
