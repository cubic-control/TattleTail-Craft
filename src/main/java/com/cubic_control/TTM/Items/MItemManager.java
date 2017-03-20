package com.cubic_control.TTM.Items;

import net.minecraft.item.Item;

import com.cubic_control.TTM.Blocks.MBlockManager;

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
	public static Item papa_TattleTail;
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

	public static void createItems() {
		purple_TattleTail = new ModItemTattleTail("purple_TattleTail", 1.5f, 1, MBlockManager.purple_TattleTail);
		yellow_TattleTail = new ModItemTattleTail("yellow_TattleTail", 1.5f, 2, MBlockManager.yellow_TattleTail);
		blue_TattleTail = new ModItemTattleTail("blue_TattleTail", 1.5f, 3, MBlockManager.blue_TattleTail);
		snowglobe_TattleTail = new ModItemTattleTail("snowglobe_TattleTail", 1.5f, 4, MBlockManager.snowglobe_TattleTail);
		nightnight_TattleTail = new ModItemTattleTail("nightnight_TattleTail", 1.5f, 5, MBlockManager.nightnight_TattleTail);
		butternut_TattleTail = new ModItemTattleTail("butternut_TattleTail", 1.5f, 6, MBlockManager.butternut_TattleTail);
		rechargeable_flashlight_blue = new ModItemRechargeableFlashlight("rechargeable_flashlight_blue", 1.3f);
		rechargeable_flashlight_gold = new ModItemRechargeableFlashlight("rechargeable_flashlight_gold", 2.5f);
		mystery_egg = new ModItemMysteryEgg("mystery_egg", 0.5f);
		mama_TattleTail = new ModItemMamaTattleTail("mama_TattleTail", 2.5f);
		papa_TattleTail = new ModItemPapaTattleTail("papa_TattleTail", 2.5f);
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
		
		spawn_egg = new ModItemMonsterPlacer("Mama", 0x6B4327, 0xE8D5C8, "Mama");
		spawn_egg = new ModItemMonsterPlacer("Papa", 0x356B27, 0x92D490, "Papa");
	}

}
