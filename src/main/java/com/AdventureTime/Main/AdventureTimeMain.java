package AdventureTime.Main;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import AdventureTime.Main.Manager.ATimeConfig;
import AdventureTime.Main.Manager.EventManager;
import AdventureTime.Main.Manager.GUIHandler;
import AdventureTime.Registry.ImportRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "AdventureTime", name = "Adventure Time Mod", version = "5.2")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AdventureTimeMain {

	@Instance("AdventureTime")
	public static AdventureTimeMain instance;

	public static final EnumArmorMaterial jakearmor = EnumHelper
			.addArmorMaterial("jakearmor", 200, new int[] { 3, 8, 6, 3 }, 30);

	public static EnumToolMaterial billy = EnumHelper.addToolMaterial(
			"HighPower", 3, 2000, 8.0F, 10, 18);
	public static EnumToolMaterial jakesword = EnumHelper.addToolMaterial(
			"HighPower", 2, 250, 6.0F, 2.0F, 14);
	public static EnumToolMaterial papertools = EnumHelper.addToolMaterial(
			"LowPower", 0, 59, 2.0F, 0.0F, 15);
	public static EnumToolMaterial CrystalTools = EnumHelper.addToolMaterial(
			"HighPower", 2, 1000, 7.0F, 6, 15);

	public static EnumToolMaterial Finntools = EnumHelper.addToolMaterial(
			"LowPower", 2, 500, 6.0F, 6, 15);

	public static EnumToolMaterial DemonTools = EnumHelper.addToolMaterial(
			"HighPower", 3, 1100, 8.0F, 6, 15);

	public static EnumToolMaterial root = EnumHelper.addToolMaterial("Root", 3,
			700, 7.0F, 6, 15);

	@SidedProxy(clientSide = "AdventureTime.Client.ClientProxy", serverSide = "AdventureTime.Main.CommonProxy")
	public static CommonProxy proxy;

	public static Item FinnSword, CrystalAxe, CrystalHoe, CrystalSword,
			CrystalPicaxe, CrystalShovel, CrystalGem, demoningot, Demonblood,
			DemonSword, SteelIngot, shardIce, jakeswords, billygauntlet,
			papersword, jakehead, jakechest, jakelegs, jakeboots, bass,
			everythingburrito, foodbacon, conttoncandy, Lollipop, foodGemApple,
			foodDonut, bubblegumitem, baconpancake, candy, enchiridion,
			rootSword, fourdsword, pancake, grasssword, flour, applepie;

	public static Block CrystalOre, SteelOre, DemonOre, CrystalBlock, CandyOre;

	public static int dimensionId = 8;

	public static final CreativeTabs tabATimemain = new CreativeTabs(
			"tabATimemain") {
		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(FinnSword, 1, 0);
		}
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
			MinecraftForge.EVENT_BUS.register(new EventManager());
		}
		ATimeConfig.loadAndGatherIntel(event);
	}

	ATimeConfig config;

	@EventHandler
	public void load(FMLInitializationEvent event) {
		NetworkRegistry.instance().registerGuiHandler(this.instance,
				new GUIHandler());

		ImportRegistry.importItems(this, config);
		ImportRegistry.importBlocks(this, config);
		ImportRegistry.importEntities(this);
		ImportRegistry.importRecipes(this);

		MinecraftForge.setBlockHarvestLevel(DemonOre, "pickaxe", 3);
		LanguageRegistry.instance().addStringLocalization(
				"itemGroup.tabATimemain", "AdventureTime Mod");

		proxy.registerRenderers();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}

}