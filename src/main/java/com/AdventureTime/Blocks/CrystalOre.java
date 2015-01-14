package com.AdventureTime.Blocks;

import java.util.Random;

import com.AdventureTime.Items.ModItems;
import com.AdventureTime.Main.ModCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class CrystalOre extends Block {

	protected CrystalOre(Material material) {
		super(material);
		this.setHarvestLevel("pickaxe", 3);
		this.setCreativeTab(ModCreativeTabs.tabATime);
	}
	@Override
	public Item getItemDropped(int metadata, Random random, int fortune){
		return ModItems.CrystalGem;
	}

}
