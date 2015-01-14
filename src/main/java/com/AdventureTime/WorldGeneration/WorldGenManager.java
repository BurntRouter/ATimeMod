package com.AdventureTime.WorldGeneration;

import java.util.Random;

import com.AdventureTime.Blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenManager {

	public static void mainRegistry(){
		initWorldGen();
	}
	
	public static void initWorldGen(){
		regWorldGen(new ModOre(), 1);
	}
	
	public static void regWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}
}