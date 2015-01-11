package AdventureTime.WorldGeneration;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import AdventureTime.Main.AdventureTimeMain;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenManager implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateEnd(World world, Random random, int x, int z) {

	}

	private void generateSurface(World world, Random random, int x, int z) {
		this.addOreSpawn(AdventureTimeMain.CrystalOre, world, random, x, z, 16,
				16, 4 + random.nextInt(3), 5, 15, 50);
		this.addOreSpawn(AdventureTimeMain.SteelOre, world, random, x, z, 16,
				16, 4 + random.nextInt(3), 5, 15, 50);
		this.addOreSpawn(AdventureTimeMain.DemonOre, world, random, x, z, 16,
				16, 4 + random.nextInt(3), 5, 15, 50);
		this.addOreSpawn(AdventureTimeMain.CandyOre, world, random, x, z, 16,
				16, 4 + random.nextInt(2), 7, 40, 77);
	}

	private void generateNether(World world, Random random, int x, int z) {

	}

	public void addOreSpawn(Block block, World world, Random random,
			int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
			int chancesToSpawn, int minY, int maxY) {
		int maxPossY = minY + (maxY - 1);
		assert maxY > minY;
		assert maxX > 0 && maxX <= 16;
		assert minY > 0;
		assert maxY < 256 && maxY > 0;
		assert maxZ > 0 && maxZ <= 16;

		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block.blockID, maxVeinSize)).generate(world,
					random, posX, posY, posZ);
		}
	}
}