package com.AdventureTime.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabsATime extends CreativeTabs {

	public CreativeTabsATime(String label) {
		super(label);
		
	}

	@Override
	public Item getTabIconItem() {
		return Items.apple;
	}

}
