package com.AdventureTime.Blocks;

import com.AdventureTime.Items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item.ToolMaterial;

public class ModBlocks {
	
	
	public static void mainRegistry(){
		initBlocks();
		regBlocks();
	}
	public static Block CrystalOre, SteelOre, DemonOre, CrystalBlock, CandyOre, CottonCandyLog, CottonCandyLeaves,
	CottonCandySapling, CandiedDirt;
	
	public static void initBlocks(){
		CrystalOre = new CrystalOre(Material.rock).setBlockName("CrystalOre").setBlockTextureName("adventuretime:CrystalOre").setHardness(7);
		CandyOre = new ATimeBlock(Material.coral).setBlockName("CandyOre").setBlockTextureName("adventuretime:CandyOre").setHardness(5);
		SteelOre = new ATimeBlock(Material.rock).setBlockName("SteelOre").setBlockTextureName("adventuretime:SteelOre").setHardness(6);
		CrystalBlock = new ATimeBlock(Material.glass).setBlockName("CrystalBlock").setBlockTextureName("adventuretime:CrystalBlock").setHardness(7);
		DemonOre = new ATimeBlock(Material.iron).setBlockName("DemonOre").setBlockTextureName("adventuretime:DemonOre").setHardness(10);
		CottonCandyLog = new ATimeBlock(Material.wood).setBlockName("CottonCandyLog").setBlockTextureName("adventuretime:CottonCandyLog").setHardness(3);
		CottonCandyLeaves = new CCLeaves().setBlockName("CottonCandyLeaves").setBlockTextureName("adventuretime:CottonCandyLeaves").setHardness(1);
		CottonCandySapling = new CCSapling().setBlockName("CottonCandySapling").setBlockTextureName("adventuretime:CottonCandySapling").setHardness(0);
		CandiedDirt = new ATimeBlock(Material.grass).setBlockName("CandiedDirt").setBlockTextureName("adventuretime:CandiedDirt");
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
