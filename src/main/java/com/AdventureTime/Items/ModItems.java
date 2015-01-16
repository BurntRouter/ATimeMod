package com.AdventureTime.Items;

import com.AdventureTime.Main.AdventureTimeMain;
import com.AdventureTime.Main.ModCreativeTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;

public class ModItems {
	
	public static void mainRegistry(){
		initItems();
		regItems();
	}
	
	public static Item Scarlet, CrystalAxe, CrystalHoe, CrystalSword,
	CrystalPickaxe, CrystalShovel, CrystalGem, DemonIngot, DemonBlood,
	DemonSword, SteelIngot, IceShard, JakeSword, BillyGauntlet,
	PaperSword, JakeHead, JakeChest, JakeLegs, JakeBoots, BassAxe,
	EverythingBurrito, Bacon, CottonCandy, Lollipop, GemApple,
	Donut, BubbleGum, BaconPancake, Candy, Enchiridion,
	RootSword, FourDSword, Pancake, GrassSword, Flour, ApplePie;
	
	public static void initItems(){
		Scarlet = new ItemSword(AdventureTimeMain.Finntools).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("Scarlet").setTextureName("adventuretime:Scarlet");
		CrystalGem = new Item().setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("CrystalGem").setTextureName("adventuretime:crystalgem");
		CrystalAxe = new ATimeAxe(AdventureTimeMain.CrystalTools).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("CrystalAxe").setTextureName("adventuretime:CrystalAxe");
		CrystalHoe = new ATimeHoe(AdventureTimeMain.CrystalTools).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("CrystalHoe").setTextureName("adventuretime:CrystalHoe");
		CrystalPickaxe = new ATimePickaxe(AdventureTimeMain.CrystalTools).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("CrystalPickaxe").setTextureName("adventuretime:CrystalPickaxe");
		CrystalSword = new ItemSword(AdventureTimeMain.CrystalTools).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("CrystalSword").setTextureName("adventuretime:CrystalSword");
		CrystalShovel = new ATimeShovel(AdventureTimeMain.CrystalTools).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("CrystalShovel").setTextureName("adventuretime:CrystalShovel");
		DemonIngot = new Item().setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("DemonIngot").setTextureName("adventuretime:DemonIngot");
		DemonBlood = new Item().setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("DemonBlood").setTextureName("adventuretime:DemonBlood");
		DemonSword = new ItemSword(AdventureTimeMain.DemonTools).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("DemonSword").setTextureName("adventuretime:DemonSword");
		SteelIngot = new Item().setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("SteelIngot").setTextureName("adventuretime:SteelIngot");
		IceShard = new Item().setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("IceShard").setTextureName("adventuretime:IceShard");
		JakeSword = new ItemSword(AdventureTimeMain.jakesword).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("JakeSword").setTextureName("adventuretime:JakeSword");
		BillyGauntlet = new billy(AdventureTimeMain.billy).setUnlocalizedName("BillyGauntlet").setTextureName("adventuretime:BillyGauntlet");
		PaperSword = new ItemSword(AdventureTimeMain.papertools).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("PaperSword").setTextureName("adventuretime:PaperSword");
		JakeHead = new JakeSuit(AdventureTimeMain.jakearmor, 0, 0, "JakeSuit").setUnlocalizedName("JakeHead");
		JakeChest = new JakeSuit(AdventureTimeMain.jakearmor, 0, 1, "JakeSuit").setUnlocalizedName("JakeChest");
		JakeLegs = new JakeSuit(AdventureTimeMain.jakearmor, 0, 2, "JakeSuit").setUnlocalizedName("JakeLegs");
		JakeBoots = new JakeSuit(AdventureTimeMain.jakearmor, 0, 3, "JakeSuit").setUnlocalizedName("JakeBoots");
		BassAxe = new ItemBass(AdventureTimeMain.DemonTools).setUnlocalizedName("BassAxe").setTextureName("adventuretime:BassAxe");
		EverythingBurrito = new ItemFood(10, false).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("EverythingBurrito").setTextureName("adventuretime:EverythingBurrito");
		Bacon = new ItemFood(3, true).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("Bacon").setTextureName("adventuretime:Bacon");
		CottonCandy = new ItemFood(1, false).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("CottonCandy").setTextureName("adventuretime:CottonCandy");
		Lollipop = new ItemFood(1, false).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("Lollipop").setTextureName("adventuretime:Lollipop");
		GemApple = new ItemFood(7, false).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("GemApple").setTextureName("adventuretime:GemApple");
		Donut = new ItemFood(5, false).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("Donut").setTextureName("adventuretime:Donut");
		BubbleGum = new ItemFood(1, false).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("BubbleGum").setTextureName("adventuretime:BubbleGum");
		BaconPancake = new ItemFood(12, true).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("BaconPancake").setTextureName("adventuretime:BaconPancake");
		Candy = new ItemFood(1, false).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("Candy").setTextureName("adventuretime:Candy");
		Enchiridion = new ItemEnchiridion().setUnlocalizedName("Enchirideon").setTextureName("adventuretime:Enchiridion");
		RootSword = new ItemSword(AdventureTimeMain.root).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("RootSword").setTextureName("adventuretime:RootSword");
		FourDSword = new ItemSword(AdventureTimeMain.Finntools).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("FourDSword").setTextureName("adventuretime:FourDSword");
		Pancake = new ItemFood(6, false).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("Pancake").setTextureName("adventuretime:Pancake");
		GrassSword = new ItemSword(AdventureTimeMain.Finntools).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("GrassSword").setTextureName("adventuretime:GrassSword");
		Flour = new Item().setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("Flour").setTextureName("adventuretime:Flour");
		ApplePie = new ItemFood(8, false).setCreativeTab(ModCreativeTabs.tabATime).setUnlocalizedName("ApplePie").setTextureName("adventuretime:ApplePie");
		}
	
	public static void regItems(){
		GameRegistry.registerItem(Scarlet, "Scarlet");
		GameRegistry.registerItem(CrystalGem, "CrystalGem");
		GameRegistry.registerItem(CrystalAxe, "CrystalAxe");
		GameRegistry.registerItem(CrystalHoe, "CrystalHoe");
		GameRegistry.registerItem(CrystalSword, "CrystalSword");
		GameRegistry.registerItem(CrystalShovel, "CrystalShovel");
		GameRegistry.registerItem(CrystalPickaxe, "CrystalPickaxe");
		GameRegistry.registerItem(DemonIngot, "DemonIngot");
		GameRegistry.registerItem(DemonBlood, "DemonBlood");
		GameRegistry.registerItem(DemonSword, "DemonSword");
		GameRegistry.registerItem(SteelIngot, "SteelIngot");
		GameRegistry.registerItem(IceShard, "IceShard");
		GameRegistry.registerItem(JakeSword, "JakeSword");
		GameRegistry.registerItem(BillyGauntlet, "BillyGauntlet");
		GameRegistry.registerItem(PaperSword, "PaperSword");
//		GameRegistry.registerItem(JakeHead, "JakeHead");
//		GameRegistry.registerItem(JakeChest, "JakeChest");
//		GameRegistry.registerItem(JakeLegs, "JakeLegs");
//		GameRegistry.registerItem(JakeBoots, "JakeBoots");
		GameRegistry.registerItem(BassAxe, "BassAxe");
		GameRegistry.registerItem(EverythingBurrito, "EverythingBurrito");
		GameRegistry.registerItem(Bacon, "Bacon");
		GameRegistry.registerItem(CottonCandy, "CottonCandy");
		GameRegistry.registerItem(Lollipop, "Lollipop");
		GameRegistry.registerItem(GemApple, "GemApple");
		GameRegistry.registerItem(Donut, "Donut");
		GameRegistry.registerItem(BubbleGum, "BubbleGum");
		GameRegistry.registerItem(BaconPancake, "BaconPancake");
		GameRegistry.registerItem(Candy, "Candy");
		GameRegistry.registerItem(Enchiridion, "Enchiridion");
		GameRegistry.registerItem(RootSword, "RootSword");
		GameRegistry.registerItem(FourDSword, "FourDSword");
		GameRegistry.registerItem(Pancake, "Pancake");
		GameRegistry.registerItem(GrassSword, "GrassSword");
		GameRegistry.registerItem(Flour, "Flour");
//		GameRegistry.registerItem(ApplePie, "ApplePie");
		
	}

}
