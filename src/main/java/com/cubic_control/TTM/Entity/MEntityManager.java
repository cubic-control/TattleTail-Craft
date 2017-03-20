package com.cubic_control.TTM.Entity;

import org.apache.commons.lang3.ArrayUtils;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

import com.cubic_control.TTM.Main.MainRegistry;

import cpw.mods.fml.common.registry.EntityRegistry;

public class MEntityManager {
	public static void createEntity(){
		EntityRegistry.registerModEntity(EntityMama.class, "Mama", 1, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityPapa.class, "Papa", 2, MainRegistry.instance, 64, 1, true);
		addSpawn();
	}
	
	public static void addSpawn(){
		BiomeGenBase[] spawnBiomes = new BiomeGenBase[0];
		spawnBiomes = ArrayUtils.addAll(spawnBiomes, BiomeDictionary.getBiomesForType(Type.FOREST));
		EntityRegistry.addSpawn(EntityMama.class, 5, 1, 3, EnumCreatureType.monster, spawnBiomes);
		EntityRegistry.addSpawn(EntityPapa.class, 5, 1, 3, EnumCreatureType.monster, spawnBiomes);
	}
}
