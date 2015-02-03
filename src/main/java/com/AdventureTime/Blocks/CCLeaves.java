package com.AdventureTime.Blocks;

import java.util.Random;

import com.AdventureTime.Items.ModItems;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CCLeaves extends ATimeLeaves {
	
	public CCLeaves() {
		super(Material.cloth, "realmsofchaos:charwood_leaves",
				"leavesCharwood", 0.0f, 5.0f, ATimeBlock.soundTypeCloth);
	}

	@Override
	public Item getItemDropped(int par1, Random rand, int par3) {
		int dropChance = rand.nextInt(40);
		if (dropChance == 10 || dropChance == 20) {
			return ModItems.CottonCandy;
		}
		if (dropChance == 30) {
			return Item.getItemFromBlock(ModBlocks.CottonCandySapling);
		}
		return Item.getItemFromBlock(Blocks.air);
	}
}