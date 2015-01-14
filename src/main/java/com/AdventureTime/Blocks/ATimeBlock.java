package com.AdventureTime.Blocks;

import java.util.Random;

import com.AdventureTime.Items.ModItems;
import com.AdventureTime.Main.ModCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ATimeBlock extends Block{

	protected ATimeBlock(Material material) {
		super(material);
		this.setHarvestLevel("pickaxe", 3);
		this.setCreativeTab(ModCreativeTabs.tabATime);
		
	}
}