package com.AdventureTime.Items;

import com.AdventureTime.Main.AdventureTimeMain;
import com.AdventureTime.Main.ModCreativeTabs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEnchiridion extends Item {
	public ItemEnchiridion(int par1) {
		super();
		setCreativeTab(ModCreativeTabs.tabATime);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world,
			EntityPlayer player) {
		player.openGui(AdventureTimeMain.instance, 0, world, 0, 0, 0);
		return itemstack;
	}
}
