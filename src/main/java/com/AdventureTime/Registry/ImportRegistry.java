package AdventureTime.Registry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.biome.BiomeGenBase;
import AdventureTime.Entity.EntityBMO;
import AdventureTime.Entity.EntityBilly;
import AdventureTime.Entity.EntityFP;
import AdventureTime.Entity.EntityFinn;
import AdventureTime.Entity.EntityGunter;
import AdventureTime.Entity.EntityIceKing;
import AdventureTime.Entity.EntityJake;
import AdventureTime.Entity.EntityLich;
import AdventureTime.Entity.EntityMarceline;
import AdventureTime.Entity.EntityNEPTR;
import AdventureTime.Entity.EntityPB;
import AdventureTime.Entity.EntityTreeTrunks;
import AdventureTime.Items.DemonSword;
import AdventureTime.Items.ItemBass;
import AdventureTime.Items.ItemEnchiridion;
import AdventureTime.Items.JakeSuit;
import AdventureTime.Items.billy;
import AdventureTime.Main.AdventureTimeMain;
import AdventureTime.Main.Manager.ATimeConfig;
import cpw.mods.fml.common.registry.EntityRegistry;

/**
 * Used to handle the mods imports.
 * 
 * @author Cyphereion
 * 
 */
public class ImportRegistry {

	/**
	 * Get the entity spawn list.
	 */
	private static void importEntitySpawnlist() {
		EntityRegistry.addSpawn(EntityGunter.class, 10, 5, 8,
				EnumCreatureType.creature, new BiomeGenBase[] {
						BiomeGenBase.iceMountains, BiomeGenBase.icePlains,
						BiomeGenBase.frozenRiver, BiomeGenBase.taiga,
						BiomeGenBase.taigaHills });

		EntityRegistry.addSpawn(EntityFinn.class, 30, 1, 1,
				EnumCreatureType.creature,
				new BiomeGenBase[] { BiomeGenBase.plains });

		EntityRegistry.addSpawn(EntityJake.class, 20, 1, 1,
				EnumCreatureType.creature,
				new BiomeGenBase[] { BiomeGenBase.plains });

		EntityRegistry.addSpawn(EntityMarceline.class, 25, 1, 1,
				EnumCreatureType.monster);

		EntityRegistry.addSpawn(EntityIceKing.class, 25, 1, 1,
				EnumCreatureType.creature, new BiomeGenBase[] {
						BiomeGenBase.iceMountains, BiomeGenBase.icePlains,
						BiomeGenBase.frozenRiver, BiomeGenBase.taiga,
						BiomeGenBase.taigaHills });

		EntityRegistry.addSpawn(EntityNEPTR.class, 25, 1, 1,
				EnumCreatureType.creature,
				new BiomeGenBase[] { BiomeGenBase.plains });

		EntityRegistry.addSpawn(EntityPB.class, 30, 1, 1,
				EnumCreatureType.creature,
				new BiomeGenBase[] { BiomeGenBase.plains });

		EntityRegistry.addSpawn(EntityFP.class, 25, 1, 1,
				EnumCreatureType.creature,
				new BiomeGenBase[] { BiomeGenBase.hell });

		EntityRegistry.addSpawn(EntityBilly.class, 25, 1, 1,
				EnumCreatureType.creature,
				new BiomeGenBase[] { BiomeGenBase.extremeHills });

		EntityRegistry.addSpawn(EntityTreeTrunks.class, 25, 1, 1,
				EnumCreatureType.creature,
				new BiomeGenBase[] { BiomeGenBase.plains });
	}

	/**
	 * Import all of the mod's entities.
	 * 
	 * @param mod
	 */
	public static void importEntities(AdventureTimeMain mod) {
		Registry.registerMobEntity(mod, EntityGunter.class, "Gunter", 0,
				16777215);
		Registry.registerMobEntity(mod, EntityFinn.class, "Finn", 381439, 64579);
		Registry.registerMobEntity(mod, EntityJake.class, "Jake", 15132201,
				16776960);
		Registry.registerMobEntity(mod, EntityMarceline.class, "Marceline", 0,
				16711680);
		Registry.registerMobEntity(mod, EntityBMO.class, "BMO", 1306816, 65505);
		Registry.registerMobEntity(mod, EntityIceKing.class, "Ice King", 7935,
				28415);
		Registry.registerMobEntity(mod, EntityNEPTR.class, "NEPTR", 0, 5987158);
		Registry.registerMobEntity(mod, EntityFP.class, "Fire Princess",
				16711680, 16776960);
		Registry.registerMobEntity(mod, EntityBilly.class, "Billy", 16720581,
				8371507);
		Registry.registerMobEntity(mod, EntityPB.class, "Princess Bubblegum",
				381239, 65329);
		Registry.registerFlyingMobEntity(mod, EntityLich.class, "Lich", 64233,
				874364);
		Registry.registerMobEntity(mod, EntityTreeTrunks.class, "Tree Trunks",
				516313, 546454);

		// DO NOT REMOVE
		importEntitySpawnlist();
	}

	/**
	 * Import the items needed.
	 * 
	 * @param mod
	 * @param config
	 */
	public static void importItems(AdventureTimeMain mod, ATimeConfig config) {
		mod.everythingburrito = new ItemFood(config.item1, 20, 30F, true);
		Registry.registerItem(mod, mod.everythingburrito, "Everything Burrito");

		mod.foodbacon = new ItemFood(config.item2, 4, 4F, true);
		Registry.registerItem(mod, mod.foodbacon, "Bacon");

		mod.conttoncandy = new ItemFood(config.item3, 6, 8F, true);
		Registry.registerItem(mod, mod.conttoncandy, "Cotton Candy");

		mod.Lollipop = new ItemFood(config.item4, 6, 8F, true);
		Registry.registerItem(mod, mod.Lollipop, "Lollipop");

		mod.foodDonut = new ItemFood(config.item5, 6, 10, true);
		Registry.registerItem(mod, mod.foodDonut, "Donut");

		mod.foodGemApple = new ItemFood(config.item6, 30, 50, true);
		Registry.registerItem(mod, mod.foodGemApple, "Gem Apple");

		mod.bubblegumitem = new ItemFood(config.item7, 4, 2, true);
		Registry.registerItem(mod, mod.bubblegumitem, "Bubblegum");

		mod.baconpancake = new ItemFood(config.item8, 6, 8, true);
		Registry.registerItem(mod, mod.baconpancake, "Bacon Pancake");

		mod.pancake = new ItemFood(config.item9, 5, 6, true);
		Registry.registerItem(mod, mod.pancake, "Pancake");

		mod.candy = new ItemFood(config.item10, 5, 6, true);
		Registry.registerItem(mod, mod.candy, "Candy");

		mod.bass = new ItemBass(config.item11, mod.DemonTools);
		Registry.registerItem(mod, mod.bass, "Bass");

		mod.shardIce = new Item(config.item12);
		Registry.registerItem(mod, mod.shardIce, "Ice Shard");

		mod.DemonSword = new DemonSword(config.item13, mod.DemonTools);
		Registry.registerItem(mod, mod.DemonSword, "Demon Sword");

		mod.FinnSword = new ItemSword(config.item14, mod.Finntools);
		Registry.registerItem(mod, mod.FinnSword, "Finn Sword");

		mod.CrystalGem = new Item(config.item15);
		Registry.registerItem(mod, mod.CrystalGem, "Crystal Gem");

		mod.CrystalSword = new ItemSword(config.item16, mod.CrystalTools);
		Registry.registerItem(mod, mod.CrystalSword, "Crystal Sword");

		mod.CrystalAxe = new ItemAxe(config.item17, mod.CrystalTools);
		Registry.registerItem(mod, mod.CrystalAxe, "Crystal Axe");

		mod.CrystalPicaxe = new ItemPickaxe(config.item18, mod.CrystalTools);
		Registry.registerItem(mod, mod.CrystalPicaxe, "Crystal Pickaxe");

		mod.CrystalHoe = new ItemHoe(config.item19, mod.CrystalTools);
		Registry.registerItem(mod, mod.CrystalHoe, "Crystal Hoe");

		mod.CrystalShovel = new ItemSpade(config.item20, mod.CrystalTools);
		Registry.registerItem(mod, mod.CrystalShovel, "Crystal Shovel");

		mod.demoningot = new Item(config.item21);
		Registry.registerItem(mod, mod.demoningot, "Demon Ingot");

		mod.enchiridion = new ItemEnchiridion(config.item22);
		Registry.registerItem(mod, mod.enchiridion, "Enchiridion");

		mod.Demonblood = new Item(config.item23);
		Registry.registerItem(mod, mod.Demonblood, "Demon Blood");

		mod.SteelIngot = new Item(config.item24);
		Registry.registerItem(mod, mod.SteelIngot, "Steel Ingot");

		mod.jakeswords = new ItemSword(config.item25, mod.jakesword);
		Registry.registerItem(mod, mod.jakeswords, "Jakes Sword");

		mod.billygauntlet = new billy(config.item26, mod.billy);
		Registry.registerItem(mod, mod.billygauntlet, "Billy Gauntlet");

		mod.papersword = new ItemSword(config.item27, mod.papertools);
		Registry.registerItem(mod, mod.papersword, "Paper Sword");

		mod.jakehead = new JakeSuit(config.item28, mod.jakearmor, 0, 0,
				"jakesuit");
		Registry.registerItem(mod, mod.jakehead, "Jake Head");

		mod.jakechest = new JakeSuit(config.item29, mod.jakearmor, 0, 1,
				"jakesuit");
		Registry.registerItem(mod, mod.jakechest, "Jake Chest");

		mod.jakelegs = new JakeSuit(config.item30, mod.jakearmor, 0, 2,
				"jakesuit");
		Registry.registerItem(mod, mod.jakelegs, "Jake Legs");

		mod.jakeboots = new JakeSuit(config.item31, mod.jakearmor, 0, 3,
				"jakesuit");
		Registry.registerItem(mod, mod.jakeboots, "Jake Boots");

		mod.rootSword = new ItemSword(config.item32, mod.root);
		Registry.registerItem(mod, mod.rootSword, "Root Sword");

		mod.fourdsword = new ItemSword(config.item33, mod.root);
		Registry.registerItem(mod, mod.fourdsword, "4D Sword");

		mod.grasssword = new ItemSword(config.item34, mod.root);
		Registry.registerItem(mod, mod.grasssword, "Grass Sword");

		mod.flour = new Item(config.item35);
		Registry.registerItem(mod, mod.flour, "Flour");

		mod.applepie = new Item(config.item36);
		Registry.registerItem(mod, mod.applepie, "Apple Pie");
	}

	/**
	 * Import the blocks associated with this mod.
	 * 
	 * @param mod
	 * @param config
	 */
	public static void importBlocks(AdventureTimeMain mod, ATimeConfig config) {
		mod.CrystalOre = new Block(config.block1, Material.ground)
				.setResistance(10).setHardness(3);
		Registry.registerBlock(mod.CrystalOre, "Crystal Ore");

		mod.SteelOre = new Block(config.block2, Material.ground).setResistance(
				10).setHardness(0.5F);
		Registry.registerBlock(mod.SteelOre, "Steel Ore");

		mod.DemonOre = new Block(config.block3, Material.ground)
				.setHardness(0.5F);
		Registry.registerBlock(mod.DemonOre, "Demon Ore");

		mod.CrystalBlock = new Block(config.block4, Material.rock)
				.setHardness(3.5F);
		Registry.registerBlock(mod.CrystalBlock, "Crystal Block");

		mod.CandyOre = new Block(config.block5, Material.rock);
		Registry.registerBlock(mod.CandyOre, "Candy Ore");
	}

	/**
	 * Import the recipes for the mod.
	 * 
	 * @param mod
	 */
	public static void importRecipes(AdventureTimeMain mod) {

		Registry.addRecipe(new ItemStack(mod.foodbacon, 1), " P ", " P ",
				" P ", Character.valueOf('P'), Item.porkRaw);

		Registry.addRecipe(new ItemStack(mod.rootSword, 1), " s ", " s ",
				"srs", Character.valueOf('s'), mod.SteelIngot,
				Character.valueOf('r'), Block.sapling);

		Registry.addRecipe(new ItemStack(mod.pancake, 1), "   ", " m ", "fff",
				Character.valueOf('f'), mod.flour, Character.valueOf('m'),
				Item.bucketMilk);

		Registry.addToolsetRecipe(mod.CrystalGem, mod.CrystalSword,
				mod.CrystalShovel, mod.CrystalPicaxe, mod.CrystalHoe,
				mod.CrystalAxe);

		Registry.addVerticleRecipe(mod.DemonSword, mod.demoningot,
				mod.demoningot, Item.stick);

		Registry.addRecipe(new ItemStack(mod.foodGemApple, 1), "xxx", "xyx",
				"xxx", Character.valueOf('x'), mod.CrystalGem,
				Character.valueOf('y'), Item.appleRed);

		Registry.addShapelessRecipe(new ItemStack(mod.baconpancake, 1),
				mod.foodbacon, mod.pancake);

		Registry.addShapelessRecipe(new ItemStack(Block.ice, 1), mod.shardIce);

		Registry.addShapelessRecipe(new ItemStack(mod.shardIce, 1), Block.ice);

		Registry.addShapelessRecipe(new ItemStack(mod.bubblegumitem, 1),
				Item.sugar, Item.bucketWater);

		Registry.addVerticleRecipe(mod.jakeswords, mod.SteelIngot, Item.stick,
				Item.stick);

		Registry.addRecipe(new ItemStack(mod.Lollipop, 1), " c ", " s ",
				Character.valueOf('c'), mod.candy, Character.valueOf('s'),
				Item.stick);

		Registry.addSmelting(mod.bubblegumitem.itemID,
				new ItemStack(mod.candy), 0.1f);

		Registry.addRecipe(new ItemStack(mod.CrystalBlock, 1), "ccc", "ccc",
				"ccc", Character.valueOf('c'), mod.CrystalGem);

		Registry.addSmelting(mod.SteelOre.blockID,
				new ItemStack(mod.SteelIngot), 0.1f);

		Registry.addSmelting(mod.DemonOre.blockID,
				new ItemStack(mod.Demonblood), 0.1f);

		Registry.addSmelting(mod.CandyOre.blockID, new ItemStack(mod.candy),
				0.1F);

		Registry.addRecipe(new ItemStack(mod.demoningot, 1), "ddd", "ddd",
				"ddd", Character.valueOf('d'), mod.Demonblood);

		Registry.addShapelessRecipe(new ItemStack(mod.flour, 1), Item.wheat);

		Registry.addRecipe(new ItemStack(mod.fourdsword, 1), "ede", "ede",
				"ese", Character.valueOf('e'), Item.enderPearl,
				Character.valueOf('d'), Item.diamond, Character.valueOf('s'),
				Item.stick);

		Registry.addRecipe(new ItemStack(mod.conttoncandy), "sss", "scs",
				" t ", Character.valueOf('s'), Item.silk,
				Character.valueOf('c'), mod.candy, Character.valueOf('t'),
				Item.stick);

	}
}
