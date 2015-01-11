package AdventureTime.Main.Manager;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ATimeConfig {

	public static int item1, item2, item3, item4, item5, item6, item7, item8,
			item9, item10, item11, item12, item13, item14, item15, item16,
			item17, item18, item19, item20, item21, item22, item23, item24,
			item25, item26, item27, item28, item29, item30, item31, item32,
			item33, item34, item35, item36;
	public static int block1, block2, block3, block4, block5;
	public static int dimensionId;
	public static int DimID;
	/**
	 * None of these are used.
	 */
	public static int mobID1, mobID2, mobID3, mobID4, mobID5, mobID6, mobID7,
			mobID8, mobID9, mobID10, mobID11, mobID12, mobID13, mobID14,
			mobID15;

	/**
	 * Loads up the config and sets the data according.
	 * 
	 * @param event
	 */
	public static void loadAndGatherIntel(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(
				event.getSuggestedConfigurationFile());

		System.out.println("Loading config...");

		config.load();

		block1 = config.get("Block", "Crystal Ore", 501).getInt();
		block2 = config.get("Block", "Steel Ore", 502).getInt();
		block3 = config.get("Block", "Demon Ore", 503).getInt();
		block4 = config.get("Block", "Crystal Block", 504).getInt();
		block5 = config.get("Block", "CandyOre", 505).getInt();

		item1 = config.get("Item", "Everything Burrito", 3101).getInt();
		item2 = config.get("Item", "Bacon", 3102).getInt();
		item3 = config.get("Item", "Cotton Candy", 3103).getInt();
		item4 = config.get("Item", "Lollipop", 3104).getInt();
		item5 = config.get("Item", "Donut", 3105).getInt();
		item6 = config.get("Item", "Gem Apple", 3106).getInt();
		item7 = config.get("Item", "Bubblegum", 3107).getInt();
		item8 = config.get("Item", "Bacon Pancakes", 3108).getInt();
		item9 = config.get("Item", "Pancake", 3109).getInt();
		item10 = config.get("Item", "Candy", 3110).getInt();
		item11 = config.get("Item", "Axe Bass", 3111).getInt();
		item12 = config.get("Item", "Ice Shard", 3112).getInt();
		item13 = config.get("Item", "Demon Sword", 3113).getInt();
		item14 = config.get("Item", "Scarlet", 3114).getInt();
		item15 = config.get("Item", "Crystal", 3115).getInt();
		item16 = config.get("Item", "Crystal Sword", 3116).getInt();
		item17 = config.get("Item", "Crystal Axe", 3117).getInt();
		item18 = config.get("Item", "Crystal Pickaxe", 3118).getInt();
		item19 = config.get("Item", "Crystal Hoe", 3119).getInt();
		item20 = config.get("Item", "Crystal Shovel", 3120).getInt();
		item21 = config.get("Item", "Demon Ingot", 3121).getInt();
		item22 = config.get("Item", "Enchirdion", 3122).getInt();
		item23 = config.get("Item", "Demon Blood", 3123).getInt();
		item24 = config.get("Item", "Steel Ingot", 3124).getInt();
		item25 = config.get("Item", "Jake's Sword", 3125).getInt();
		item26 = config.get("Item", "The Gauntlet of Billy", 3126).getInt();
		item27 = config.get("Item", "Paper Sword", 3127).getInt();
		item28 = config.get("Item", "Jake's Head", 3128).getInt();
		item29 = config.get("Item", "Jake's Chest", 3129).getInt();
		item30 = config.get("Item", "Jake's Legs", 3130).getInt();
		item31 = config.get("Item", "Jake's Boots", 3131).getInt();
		item32 = config.get("Item", "Root Sword", 3132).getInt();
		item33 = config.get("Item", "4-D Sword", 3133).getInt();
		item34 = config.get("Item", "Grass Sword", 3134).getInt();
		item35 = config.get("Item", "Flour", 3135).getInt();
		item36 = config.get("Item", "Apple Pie", 3136).getInt();

		config.save();

	}
}
