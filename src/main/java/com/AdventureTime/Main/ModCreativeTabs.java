package com.AdventureTime.Main;

import net.minecraft.creativetab.CreativeTabs;

public class ModCreativeTabs{

	public static CreativeTabs tabATime;
	
	public static void initTabs(){
		
		tabATime = new CreativeTabsATime("tabATime");
	}
}