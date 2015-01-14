package com.AdventureTime.Registry;

import com.AdventureTime.Blocks.ModBlocks;
import com.AdventureTime.Items.ModItems;
import com.AdventureTime.Main.AdventureTimeMain;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Registry extends GameRegistry {
	public static void mainRegistry() {

		Registry.addRecipe(new ItemStack(ModItems.foodbacon, 1), " P ", " P ",
				" P ", Character.valueOf('P'), Items.porkchop);

		Registry.addRecipe(new ItemStack(ModItems.rootSword, 1), " s ", " s ",
				"srs", Character.valueOf('s'), ModItems.SteelIngot,
				Character.valueOf('r'), Blocks.sapling);

		Registry.addRecipe(new ItemStack(ModItems.pancake, 1), "   ", " m ", "fff",
				Character.valueOf('f'), ModItems.flour, Character.valueOf('m'),
				Items.milk_bucket);

		Registry.addToolsetRecipe(ModItems.CrystalGem, ModItems.CrystalSword,
				ModItems.CrystalShovel, ModItems.CrystalPicaxe, ModItems.CrystalHoe,
				ModItems.CrystalAxe);

		Registry.addVerticleRecipe(ModItems.DemonSword, ModItems.demoningot,
				ModItems.demoningot, Items.stick);

		Registry.addRecipe(new ItemStack(ModItems.foodGemApple, 1), "xxx", "xyx",
				"xxx", Character.valueOf('x'), ModItems.CrystalGem,
				Character.valueOf('y'), Items.apple);

		Registry.addShapelessRecipe(new ItemStack(ModItems.baconpancake, 1),
				ModItems.foodbacon, ModItems.pancake);

		Registry.addShapelessRecipe(new ItemStack(Blocks.ice, 1), ModItems.shardIce);

		Registry.addShapelessRecipe(new ItemStack(ModItems.shardIce, 1), Blocks.ice);

		Registry.addShapelessRecipe(new ItemStack(ModItems.bubblegumitem, 1),
				Items.sugar, Items.water_bucket);

		Registry.addVerticleRecipe(ModItems.jakesword, ModItems.SteelIngot, Items.stick,
				Items.stick);

		Registry.addRecipe(new ItemStack(ModItems.Lollipop, 1), " c ", " s ",
				Character.valueOf('c'), ModItems.candy, Character.valueOf('s'),
				Items.stick);

		Registry.addSmelting(ModItems.bubblegumitem,
				new ItemStack(ModItems.candy), 0.1f);

		Registry.addRecipe(new ItemStack(ModBlocks.CrystalBlock, 1), "ccc", "ccc",
				"ccc", Character.valueOf('c'), ModItems.CrystalGem);

		Registry.addSmelting(ModBlocks.SteelOre,
				new ItemStack(ModItems.SteelIngot), 0.1f);

		Registry.addSmelting(ModBlocks.DemonOre,
				new ItemStack(ModItems.Demonblood), 0.1f);

		Registry.addSmelting(ModBlocks.CandyOre, new ItemStack(ModItems.candy),
				0.1F);

		Registry.addRecipe(new ItemStack(ModItems.demoningot, 1), "ddd", "ddd",
				"ddd", Character.valueOf('d'), ModItems.Demonblood);

		Registry.addShapelessRecipe(new ItemStack(ModItems.flour, 1), Items.wheat);

		Registry.addRecipe(new ItemStack(ModItems.fourdsword, 1), "ede", "ede",
				"ese", Character.valueOf('e'), Items.ender_pearl,
				Character.valueOf('d'), Items.diamond, Character.valueOf('s'),
				Items.stick);

		Registry.addRecipe(new ItemStack(ModItems.conttoncandy), "sss", "scs",
				" t ", Character.valueOf('s'), Items.string,
				Character.valueOf('c'), ModItems.candy, Character.valueOf('t'),
				Items.stick);

	}

public static void addToolsetRecipe(Object CraftedWith, Item Sword,
			Item Shovel, Item Pickaxe, Item Hoe, Item Axe) {
		Registry.addVerticleRecipe(Sword, CraftedWith, CraftedWith, Items.stick);
		Registry.addVerticleRecipe(Shovel, CraftedWith, Items.stick, Items.stick);
		Registry.addRecipe(new ItemStack(Pickaxe, 1), "111", " 2 ", " 2 ",
				Character.valueOf('1'), CraftedWith, Character.valueOf('2'),
				Items.stick);
		Registry.addRecipe(new ItemStack(Axe, 1), "ww ", "ws ", " s ",
				Character.valueOf('s'), Items.stick, Character.valueOf('w'),
				CraftedWith);
		Registry.addRecipe(new ItemStack(Axe, 1), " ww", " sw", " s ",
				Character.valueOf('s'), Items.stick, Character.valueOf('w'),
				CraftedWith);
		Registry.addRecipe(new ItemStack(Hoe, 1), "ww ", " s ", " s ",
				Character.valueOf('s'), Items.stick, Character.valueOf('w'),
				CraftedWith);
	}

	/**
	 * Add in a verticle recipe. Works with mc version 1.6.4
	 * 
	 * @author Cyphereion
	 * @param output
	 * @param top
	 * @param mid
	 * @param bottom
	 */
	public static void addVerticleRecipe(Item output, Object top, Object mid,
			Object bottom) {
		if (top instanceof Item || top instanceof Block && mid instanceof Item
				|| mid instanceof Block && bottom instanceof Item
				|| bottom instanceof Item) {
			Registry.addRecipe(new ItemStack(output, 1), " 1 ", " 2 ", " 3 ",
					Character.valueOf('1'), top, Character.valueOf('2'), mid,
					Character.valueOf('3'), bottom);
			Registry.addRecipe(new ItemStack(output, 1), "  1", "  2", "  3",
					Character.valueOf('1'), top, Character.valueOf('2'), mid,
					Character.valueOf('3'), bottom);
			Registry.addRecipe(new ItemStack(output, 1), "1  ", "2  ", "3  ",
					Character.valueOf('1'), top, Character.valueOf('2'), mid,
					Character.valueOf('3'), bottom);
		} else {
			System.err
					.println("Cannot create a verticle recipe with the following attributes: \n OUTPUT: ("
							+ output.toString()
							+ ") top: ("
							+ top.toString()
							+ ") mid: ("
							+ mid.toString()
							+ ") bottom: ("
							+ bottom.toString() + ")");
		}
	}
}
