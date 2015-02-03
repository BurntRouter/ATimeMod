package com.AdventureTime.Main;

import com.AdventureTime.Blocks.ModBlocks;
import com.AdventureTime.Entity.ModEntities;
import com.AdventureTime.Items.ModItems;
import com.AdventureTime.Registry.Registry;
import com.AdventureTime.WorldGeneration.ModOre;
import com.AdventureTime.WorldGeneration.WorldGenCCTree;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "AdventureTime", name = "AdventureTime Mod", version = "6.1")
public class AdventureTimeMain {

	@Instance("AdventureTime")
	public static AdventureTimeMain instance;

	public static final ArmorMaterial jakearmor = EnumHelper
			.addArmorMaterial("jakearmor", 200, new int[] { 3, 8, 6, 3 }, 30);

	public static ToolMaterial billy = EnumHelper.addToolMaterial(
			"HighPower", 3, 2000, 8.0F, 10, 18);
	public static ToolMaterial jakesword = EnumHelper.addToolMaterial(
			"HighPower", 2, 250, 6.0F, 2.0F, 14);
	public static ToolMaterial papertools = EnumHelper.addToolMaterial(
			"LowPower", 0, 59, 2.0F, 0.0F, 15);
	public static final ToolMaterial CrystalTools = EnumHelper.addToolMaterial(
			"HighPower", 2, 1000, 7.0F, 6, 15);
	public static ToolMaterial Finntools = EnumHelper.addToolMaterial(
			"LowPower", 2, 500, 6.0F, 6, 15);
	public static ToolMaterial DemonTools = EnumHelper.addToolMaterial(
			"HighPower", 3, 1100, 8.0F, 6, 15);
	public static ToolMaterial root = EnumHelper.addToolMaterial(
			"Root", 3,700, 7.0F, 6, 15);
	
	

	@SidedProxy(clientSide = "com.AdventureTime.Client.ClientProxy", serverSide = "com.AdventureTime.Main.CommonProxy")
	public static CommonProxy proxy;

	public static int dimensionId = 8;


		@EventHandler
		public void preInit(FMLPreInitializationEvent event){
			System.out.println("[AdventureTime Mod] Attempting to load mod... Crossing fingers...");
			ModCreativeTabs.initTabs();
			ModItems.mainRegistry();
			ModBlocks.mainRegistry();
			Registry.mainRegistry();
			GameRegistry.registerWorldGenerator(new ModOre(), 1);

			
			proxy.registerRenderers();
		}
		
		@EventHandler
		public void Init(FMLInitializationEvent event){
			ModEntities.mainRegistry();
			System.out.println("[AdventureTime Mod] Got through the hard part... Let's finish it...");
		}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("[AdventureTime Mod] Mod seems to have loaded... Mathematical!");
	}

}