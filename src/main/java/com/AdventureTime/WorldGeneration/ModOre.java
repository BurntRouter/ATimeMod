package com.AdventureTime.WorldGeneration;

import java.util.Random;

import com.AdventureTime.Blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class ModOre implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			genNether(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			genOverworld(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			genEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		}
	}

	private void addOre(Block block, Block blockspawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVein, int maxVein, int spawnChance){
		for(int i = 0; i < spawnChance; i++){
			int defaultChunkSize = 16;
			
			int xPos = posX + random.nextInt(defaultChunkSize);
			int zPos = posZ + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			
			new WorldGenMinable(block, (minVein + random.nextInt(maxVein - minVein)),blockspawn).generate(world, random, xPos, yPos, zPos);
			
		}
	}
	
	/*
	 * If you want to add an ore to generate type addOre() and fill
	 * in the args that go with it in the dimension it will spawn in.
	 */
	
	private void genNether(Random random, int chunkX, int chunkZ, World world) {
		
	}

	private void genOverworld(Random random, int chunkX , int chunkZ, World world) {	
		addOre(ModBlocks.CrystalOre, Blocks.stone, random, world, chunkX, chunkZ, 20, 25, 4, 6, 50);
//		addOre(ModBlocks.CandyOre, Blocks.stone, random, world, chunkX, chunkZ, 10, 35, 3, 7 ,50);
	}

	private void genEnd(Random random, int chunkX, int chunkZ, World world) {
		
		
	}

	
}