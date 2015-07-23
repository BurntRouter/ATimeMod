package com.AdventureTime.Registry;

import com.AdventureTime.Blocks.ModBlocks;
import com.AdventureTime.Items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Registry extends GameRegistry {
	public static void mainRegistry() {

		Registry.addRecipe(new ItemStack(ModItems.Bacon, 1), " P ", " P ",
				" P ", Character.valueOf('P'), Items.porkchop);

		Registry.addRecipe(new ItemStack(ModItems.RootSword, 1), " s ", " s ",
				"srs", Character.valueOf('s'), ModItems.SteelIngot,
				Character.valueOf('r'), Blocks.sapling);

		Registry.addRecipe(new ItemStack(ModItems.Pancake, 1), "   ", " m ", "fff",
				Character.valueOf('f'), ModItems.Flour, Character.valueOf('m'),
				Items.milk_bucket);

		Registry.addToolsetRecipe(ModItems.CrystalGem, ModItems.CrystalSword,
				ModItems.CrystalShovel, ModItems.CrystalPickaxe, ModItems.CrystalHoe,
				ModItems.CrystalAxe);

		Registry.addVerticleRecipe(ModItems.DemonSword, ModItems.DemonIngot,
				ModItems.DemonIngot, Items.stick);

		Registry.addRecipe(new ItemStack(ModItems.GemApple, 1), "xxx", "xyx",
				"xxx", Character.valueOf('x'), ModItems.CrystalGem,
				Character.valueOf('y'), Items.apple);

		Registry.addShapelessRecipe(new ItemStack(ModItems.BaconPancake, 1),
				ModItems.Bacon, ModItems.Pancake);

		Registry.addShapelessRecipe(new ItemStack(Blocks.ice, 1), ModItems.IceShard);

		Registry.addShapelessRecipe(new ItemStack(ModItems.IceShard, 1), Blocks.ice);

		Registry.addShapelessRecipe(new ItemStack(ModItems.BubbleGum, 1),
				Items.sugar, Items.water_bucket);

		Registry.addVerticleRecipe(ModItems.JakeSword, ModItems.SteelIngot, Items.stick,
				Items.stick);

		Registry.addRecipe(new ItemStack(ModItems.Lollipop, 1), " c ", " s ",
				Character.valueOf('c'), ModItems.Candy, Character.valueOf('s'),
				Items.stick);

		Registry.addSmelting(ModItems.BubbleGum,
				new ItemStack(ModItems.Candy), 0.1f);

		Registry.addRecipe(new ItemStack(ModBlocks.CrystalBlock, 1), "ccc", "ccc",
				"ccc", Character.valueOf('c'), ModItems.CrystalGem);

		Registry.addSmelting(ModBlocks.SteelOre,
				new ItemStack(ModItems.SteelIngot), 0.1f);

		Registry.addSmelting(ModBlocks.DemonOre,
				new ItemStack(ModItems.DemonBlood), 0.1f);

		Registry.addSmelting(ModBlocks.CandyOre, new ItemStack(ModItems.Candy),
				0.1F);

		Registry.addRecipe(new ItemStack(ModItems.DemonIngot, 1), "ddd", "ddd",
				"ddd", Character.valueOf('d'), ModItems.DemonBlood);

		Registry.addShapelessRecipe(new ItemStack(ModItems.Flour, 1), Items.wheat);

		Registry.addRecipe(new ItemStack(ModItems.FourDSword, 1), "ede", "ede",
				"ese", Character.valueOf('e'), Items.ender_pearl,
				Character.valueOf('d'), Items.diamond, Character.valueOf('s'),
				Items.stick);

		Registry.addRecipe(new ItemStack(ModItems.CottonCandy), "sss", "scs",
				" t ", Character.valueOf('s'), Items.string,
				Character.valueOf('c'), ModItems.Candy, Character.valueOf('t'),
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
