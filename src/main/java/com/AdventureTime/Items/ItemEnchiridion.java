package com.AdventureTime.Items;

import com.AdventureTime.Main.ModCreativeTabs;

import net.minecraft.item.Item;

public class ItemEnchiridion extends Item {
	public ItemEnchiridion() {
		super();
		setCreativeTab(ModCreativeTabs.tabATime);
	}

//	@Override
//	public ItemStack onItemRightClick(ItemStack itemstack, World world,
//			EntityPlayer player) {
//		player.openGui(AdventureTimeMain.instance, 0, world, 0, 0, 0);
//		return itemstack;
//	}
}
