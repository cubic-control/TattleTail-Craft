package com.cubic_control.TTM.Items;

import net.minecraft.item.Item;

import com.cubic_control.TTM.Blocks.MBlockManager;
import com.cubic_control.TTM.CreativeTabs.MCreativeTabs;

public class MItemManager {
	public static Item purple_TattleTail;
	public static Item yellow_TattleTail;
	public static Item blue_TattleTail;
	public static Item snowglobe_TattleTail;
	public static Item nightnight_TattleTail;
	public static Item butternut_TattleTail;
	public static Item rechargeable_flashlight_blue;
	public static Item rechargeable_flashlight_gold;
	public static Item mystery_egg;
	public static Item mama_TattleTail;
	public static Item ritual;
	public static Item candles;
	public static Item mama_story_disc;
	public static Item cupcakes;
	public static Item present;
	public static Item vase;
	//Mystery Egg Drops
	public static Item bandage;
	public static Item broken_crayon;
	public static Item car_key;
	public static Item chewed_dog_food;
	public static Item christmas_light;
	public static Item cupcake_wrapper;
	public static Item dead_beetle;
	public static Item doll_hair;
	public static Item dust_bunny;
	public static Item fingernail_clipping;
	public static Item french_fry;
	public static Item hairball;
	public static Item ketchup;
	public static Item loose_change;
	public static Item lost_earring;
	public static Item missing_sock;
	public static Item old_napkin;
	public static Item peanut_shells;
	public static Item pencil_shavings;
	public static Item rabbits_foot;
	public static Item seashells_soap;
	public static Item used_bandage;
	
	public static Item spawn_egg;
	//Custom
	public static Item cPresent;
		//TattleTails
	public static Item bendy_TattleTail;
	public static Item beta_TattleTail;
	public static Item candy_corn_TattleTail;
	public static Item cubic_TattleTail;
	public static Item dark_TattleTail;
	public static Item demonic_TattleTail;
	public static Item fairy_TattleTail;
	public static Item freddy_TattleTail;
	public static Item girrafe_TattleTail;
	public static Item lol_TattleTail;
	public static Item neighbor_TattleTail;
	public static Item pumpkin_TattleTail;
	public static Item red_TattleTail;
	public static Item sans_TattleTail;
	public static Item scott_TattleTail;
	public static Item shadow_TattleTail;
	public static Item spring_TattleTail;
	public static Item withered_TattleTail;
		//Mammas
	public static Item papa_TattleTail;
	public static Item choco_mama_TattleTail;
	public static Item golden_mama_TattleTail;
	public static Item nightmare_mama_TattleTail;

	public static void createItems() {
		//Originals
			//TattleTails
		purple_TattleTail = new ModItemTattleTail("purple_TattleTail", 1.5f, 1, MBlockManager.purple_TattleTail);
		yellow_TattleTail = new ModItemTattleTail("yellow_TattleTail", 1.5f, 2, MBlockManager.yellow_TattleTail);
		blue_TattleTail = new ModItemTattleTail("blue_TattleTail", 1.5f, 3, MBlockManager.blue_TattleTail);
		snowglobe_TattleTail = new ModItemTattleTail("snowglobe_TattleTail", 1.5f, 4, MBlockManager.snowglobe_TattleTail);
		nightnight_TattleTail = new ModItemTattleTail("nightnight_TattleTail", 1.5f, 5, MBlockManager.nightnight_TattleTail);
		butternut_TattleTail = new ModItemTattleTail("butternut_TattleTail", 1.5f, 6, MBlockManager.butternut_TattleTail);
			//Mammas
		mama_TattleTail = new ModItemMamaTattleTail("mama_TattleTail", 2.5f);
			//Miscellaneous
		rechargeable_flashlight_blue = new ModItemRechargeableFlashlight("rechargeable_flashlight_blue", 1.3f, 100.0f);
		rechargeable_flashlight_gold = new ModItemRechargeableFlashlight("rechargeable_flashlight_gold", 2.5f, 200.0f);
		mystery_egg = new ModItemMysteryEgg("mystery_egg", 0.5f);
		ritual = new ModItemRitual("ritual", 666.0f);
		candles = new ModItemBlockPlacer("candles", 2.7f, MBlockManager.candles);
		mama_story_disc = new ModItemDisc("mama_story_disc");
		cupcakes = new ModItemFood(5, 1.5f, false, "cupcakes");
		present = new ModItemPresent("present", 1.7f);
		vase = new ModItemBlockPlacer("vase", 1.2f, MBlockManager.vase);
			//Mystery Egg Drops
		bandage = new ModItemBandage("Bandage", 0.7f);
		broken_crayon = new ModItem("Broken Crayon", 0.8f);
		car_key = new ModItem("Car Key", 1.2f);
		chewed_dog_food = new ModItemFood(2, 0.3f, true, "Chewed Dog Food");
		christmas_light = new ModItem("Christmas Light", 1.5f);
		cupcake_wrapper = new ModItem("Cupcake Wrapper", 0.4f);
		dead_beetle = new ModItem("Dead Beetle", 0.6f);
		doll_hair = new ModItem("Doll Hair", 0.2f);
		dust_bunny = new ModItem("Dust Bunny", 0.3f);
		fingernail_clipping = new ModItem("Fingernail Clipping", 0.7f);
		french_fry = new ModItemFood(3, 0.5f, false, "French Fry");
		hairball = new ModItem("HairBall", 0.3f);
		ketchup = new ModItemBlockPlacer("Ketchup", 1.1f, MBlockManager.ketchup);
		loose_change = new ModItem("Loose Change", 0.5f);
		lost_earring = new ModItem("Lost Earring", 0.8f);
		missing_sock = new ModItem("Missing Sock", 0.3f);
		old_napkin = new ModItem("Old Napkin", 0.2f);
		peanut_shells = new ModItem("Peanut Shells", 0.3f);
		pencil_shavings = new ModItem("Pencil Shavings", 0.2f);
		rabbits_foot = new ModItem("Rabbit's Foot", 1.8f);
		seashells_soap = new ModItem("Seashells Soap", 0.8f);
		used_bandage = new ModItemUsedBandage("Used Bandage", 0.5f);
		//Spawn Eggs
		spawn_egg = new ModItemMonsterPlacer("Mama", 0x6B4327, 0xE8D5C8, "Mama");
		spawn_egg = new ModItemMonsterPlacer("Papa", 0x356B27, 0x92D490, "Papa").setCreativeTab(MCreativeTabs.tabCustom);
		spawn_egg = new ModItemMonsterPlacer("Mama_choco", 0x7D632A, 0xB59E6D, "Mama_choco").setCreativeTab(MCreativeTabs.tabCustom);
		spawn_egg = new ModItemMonsterPlacer("Mama_golden", 0xFAFFA3, 0xF3FF14, "Mama_golden").setCreativeTab(MCreativeTabs.tabCustom);
		spawn_egg = new ModItemMonsterPlacer("Mama_nightmare", 0x000000, 0x990000, "Mama_nightmare").setCreativeTab(MCreativeTabs.tabCustom);
		//Custom
		cPresent = new ModItemCPresent("cPresent", 1.7f);
			//TattleTails
		bendy_TattleTail = new ModItemTattleTail_bendy("bendy_TattleTail", 1.7f);
		beta_TattleTail = new ModItemTattleTail_beta("beta_TattleTail", 1.3f);
		candy_corn_TattleTail = new ModItemTattleTail_candy_corn("candy_corn_TattleTail", 1.4f);
		cubic_TattleTail = new ModItemTattleTail_cubic("cubic_TattleTail", 1.6f);
		dark_TattleTail = new ModItemTattleTail_dark("dark_TattleTail", 1.4f);
		demonic_TattleTail = new ModItemTattleTail_demonic("demonic_TattleTail", 2.1f);
		fairy_TattleTail = new ModItemTattleTail_fairy("fairy_TattleTail", 1.3f);
		freddy_TattleTail = new ModItemTattleTail_freddy("freddy_TattleTail", 1.5f);
		girrafe_TattleTail = new ModItemTattleTail_girrafe("girrafe_TattleTail", 1.2f);
		lol_TattleTail = new ModItemTattleTail_lol("lol_TattleTail", 1.1f);
		neighbor_TattleTail = new ModItemTattleTail_neighbor("neighbor_TattleTail", 1.8f);
		pumpkin_TattleTail = new ModItemTattleTail_pumpkin("pumpkin_TattleTail", 1.4f);
		red_TattleTail = new ModItemTattleTail_red("red_TattleTail", 1.5f);
		sans_TattleTail = new ModItemTattleTail_sans("sans_TattleTail", 1.7f);
		scott_TattleTail = new ModItemTattleTail_scott("scott_TattleTail", 2.2f);
		shadow_TattleTail = new ModItemTattleTail_shadow("shadow_TattleTail", 1.9f);
		spring_TattleTail = new ModItemTattleTail_spring("spring_TattleTail", 1.8f);
		withered_TattleTail = new ModItemTattleTail_withered("withered_TattleTail", 1.2f);
			//Mammas
		papa_TattleTail = new ModItemMamaTattleTail_papa("papa_MamaTattleTail", 2.5f);
		choco_mama_TattleTail = new ModItemMamaTattleTail_choco("choco_MamaTattleTail", 2.3f);
		golden_mama_TattleTail = new ModItemMamaTattleTail_golden("golden_MamaTattleTail", 2.7f);
		nightmare_mama_TattleTail = new ModItemMamaTattleTail_nightmare("nightmare_MamaTattleTail", 3.2f);
	}

}
