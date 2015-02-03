package com.AdventureTime.WorldGeneration;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import com.AdventureTime.Blocks.ModBlocks;

public class WorldGenCCTree {
	public WorldGenCCTree() {
	}

	public boolean generate(World world, Random rand, int i, int j, int k) {
		if (world.getBlock(i + 2, j - 1, k + 2) == Blocks.netherrack
				&& world.getBlock(i + 3, j, k + 2) == Blocks.air
				&& world.getBlock(i, j + 5, k) == Blocks.air
				&& world.getBlock(i + 3, j + 5, k + 3) == Blocks.air
				&& world.getBlock(i - 3, j + 5, k + 3) == Blocks.air
				&& world.getBlock(i + 3, j + 5, k - 3) == Blocks.air
				&& world.getBlock(i - 3, j + 5, k - 3) == Blocks.air) {
			world.setBlock(i + 0, j + 2, k + 1, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 0, j + 2, k + 3, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 1, j + 1, k + 2, ModBlocks.CottonCandyLog);
			world.setBlock(i + 1, j + 2, k + 0, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 1, j + 2, k + 1, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 1, j + 2, k + 2, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 1, j + 2, k + 3, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 1, j + 2, k + 4, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 1, j + 3, k + 1, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 1, j + 3, k + 3, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 2, j + 0, k + 2, ModBlocks.CottonCandyLog);
			world.setBlock(i + 2, j + 1, k + 1, ModBlocks.CottonCandyLog);
			world.setBlock(i + 2, j + 1, k + 2, ModBlocks.CottonCandyLog);
			world.setBlock(i + 2, j + 1, k + 3, ModBlocks.CottonCandyLog);
			world.setBlock(i + 2, j + 2, k + 1, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 2, j + 2, k + 2, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 2, j + 2, k + 3, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 2, j + 3, k + 2, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 2, j + 4, k + 2, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 3, j + 1, k + 2, ModBlocks.CottonCandyLog);
			world.setBlock(i + 3, j + 2, k + 0, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 3, j + 2, k + 1, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 3, j + 2, k + 2, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 3, j + 2, k + 3, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 3, j + 2, k + 4, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 3, j + 3, k + 1, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 3, j + 3, k + 3, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 4, j + 2, k + 1, ModBlocks.CottonCandyLeaves);
			world.setBlock(i + 4, j + 2, k + 3, ModBlocks.CottonCandyLeaves);
		}
		return true;
	}
}