package com.AdventureTime.Blocks;

import com.AdventureTime.Items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	
	public static void mainRegistry(){
		initBlocks();
		regBlocks();
	}
	public static Block CrystalOre, SteelOre, DemonOre, CrystalBlock, CandyOre, CottonCandyLog, CottonCandyLeaves,
	CottonCandySapling, CandiedDirt;
	
	public static void initBlocks(){
		CrystalOre = new CrystalOre(Material.rock).setUnlocalizedName("CrystalOre").setHardness(7);
		CandyOre = new ATimeBlock(Material.coral).setUnlocalizedName("CandyOre").setHardness(5);
		SteelOre = new ATimeBlock(Material.rock).setUnlocalizedName("SteelOre").setHardness(6);
		CrystalBlock = new ATimeBlock(Material.glass).setUnlocalizedName("CrystalBlock").setHardness(7);
		DemonOre = new ATimeBlock(Material.iron).setUnlocalizedName("DemonOre").setHardness(10);
		CottonCandyLog = new ATimeBlock(Material.wood).setUnlocalizedName("CottonCandyLog").setHardness(3);
		CandiedDirt = new ATimeBlock(Material.grass).setUnlocalizedName("CandiedDirt");
		System.out.println("[AdventureTime Mod] All Above/3 Sqr(Swag) / 53 1/4");
	}
	 
	public static void regBlocks(){
		GameRegistry.registerBlock(CrystalOre, "CrystalOre").getUnlocalizedName().substring(5);
		GameRegistry.registerBlock(CandyOre, "CandyOre").getUnlocalizedName().substring(5);
		GameRegistry.registerBlock(SteelOre, "SteelOre").getUnlocalizedName().substring(5);
		GameRegistry.registerBlock(CrystalBlock, "CrystalBlock").getUnlocalizedName().substring(5);
		GameRegistry.registerBlock(DemonOre, "DemonOre").getUnlocalizedName().substring(5);
		GameRegistry.registerBlock(CottonCandyLog, "CottonCandyLog").getUnlocalizedName().substring(5);
		GameRegistry.registerBlock(CottonCandyLeaves, "CottonCandyLeaves").getUnlocalizedName().substring(5);
		GameRegistry.registerBlock(CottonCandySapling, "CottonCandySapling").getUnlocalizedName().substring(5);
		GameRegistry.registerBlock(CandiedDirt, "CandiedDirt").getUnlocalizedName().substring(5);
	}

}
