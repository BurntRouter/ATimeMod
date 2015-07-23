package com.AdventureTime.Blocks;

import com.AdventureTime.Main.ModCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ATimeBlock extends Block{

	protected ATimeBlock(Material material) {
		super(material);
		this.setCreativeTab(ModCreativeTabs.tabATime);
		
	}
}