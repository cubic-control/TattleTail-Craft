package com.cubic_control.TTM.Items;

import com.cubic_control.TTM.Blocks.MBlockManager;

import net.minecraft.item.Item;

public class MItemManager {
	public static Item purple_TattleTail;
	public static Item yellow_TattleTail;
	public static Item blue_TattleTail;
	public static Item white_TattleTail;
	public static Item black_TattleTail;
	public static Item rechargable_flashlight_blue;
	public static Item rechargable_flashlight_gold;
	public static Item mystery_egg;
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

	public static void createItems() {
		purple_TattleTail = new ModItemTattleTail("purple_TattleTail", 1.5f, 1);
		yellow_TattleTail = new ModItemTattleTail("yellow_TattleTail", 1.5f, 2);
		blue_TattleTail = new ModItemTattleTail("blue_TattleTail", 1.5f, 3);
		white_TattleTail = new ModItemTattleTail("white_TattleTail", 1.5f, 4);
		black_TattleTail = new ModItemTattleTail("black_TattleTail", 1.5f, 5);
		rechargable_flashlight_blue = new ModItemRechargableFlashlight("rechargable_flashlight_blue", 1.3f);
		rechargable_flashlight_gold = new ModItemRechargableFlashlight("rechargable_flashlight_gold", 2.5f);
		mystery_egg = new ModItemMysteryEgg("mystery_egg", 0.5f);
		bandage = new ModItem("Bandage", 0.7f);
		broken_crayon = new ModItem("Broken Crayon", 0.8f);
		car_key = new ModItem("Car Key", 1.2f);
		chewed_dog_food = new ModItem("Chewed Dog Food", 0.3f);
		christmas_light = new ModItem("Christmas Light", 1.5f);
		cupcake_wrapper = new ModItem("Cupcake Wrapper", 0.4f);
		dead_beetle = new ModItem("Dead Beetle", 0.6f);
		doll_hair = new ModItem("Doll Hair", 0.2f);
		dust_bunny = new ModItem("Dust Bunny", 0.3f);
		fingernail_clipping = new ModItem("Fingernail Clipping", 0.7f);
		french_fry = new ModItem("French Fry", 0.5f);
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
		used_bandage = new ModItem("Used Bandage", 0.5f);
	}

}
