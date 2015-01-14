package com.AdventureTime.Items;

import com.AdventureTime.Main.AdventureTimeMain;
import com.AdventureTime.Main.ModCreativeTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;

public class ModItems {
	
	public static void mainRegistry(){
		initItems();
		regItems();
	}
	
	public static Item FinnSword, CrystalAxe, CrystalHoe, CrystalSword,
	CrystalPicaxe, CrystalShovel, CrystalGem, demoningot, Demonblood,
	DemonSword, SteelIngot, shardIce, jakesword, billygauntlet,
	papersword, jakehead, jakechest, jakelegs, jakeboots, bass,
	everythingburrito, foodbacon, conttoncandy, Lollipop, foodGemApple,
	foodDonut, bubblegumitem, baconpancake, candy, enchiridion,
	rootSword, fourdsword, pancake, grasssword, flour, applepie;
	
	public static void initItems(){
		FinnSword = new ItemSword(AdventureTimeMain.Finntools).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("FinnSword").setTextureName("adventuretime:FinnSword");
		CrystalGem = new Item().setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("CrystalGem").setTextureName("adventuretime:crystalgem");
		CrystalAxe = new ATimeAxe(AdventureTimeMain.CrystalTools).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("CrystalAxe").setTextureName("adventuretime:CrystalAxe");
		CrystalHoe = new ATimeHoe(AdventureTimeMain.CrystalTools).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("CrystalHoe").setTextureName("adventuretime:CrystalHoe");
	}
	
	public static void regItems(){
		GameRegistry.registerItem(FinnSword, "FinnSword");
		GameRegistry.registerItem(CrystalGem, "CrystalGem");
		GameRegistry.registerItem(CrystalAxe, "CrystalAxe");
		GameRegistry.registerItem(CrystalHoe, "CrystalHoe");
	}

}
