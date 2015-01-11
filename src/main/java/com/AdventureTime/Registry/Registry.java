package AdventureTime.Registry;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import AdventureTime.Main.AdventureTimeMain;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Used to register items, blocks, etc... DO NOT EDIT THIS CLASS!!!!
 * 
 * @author Cypherion
 * 
 */
public class Registry extends GameRegistry {

	/**
	 * Used as the entity ID counter.
	 */
	private static int startEntityId = 300;

	/**
	 * Registers a basic block. Works with mc version 1.6.4
	 * 
	 * @author Cyphereion
	 * @param block
	 * @param name
	 */
	public static void registerBlock(Block block, String name) {
		block.setUnlocalizedName(name);
		GameRegistry.registerBlock(block, name);
		LanguageRegistry.addName(block, name);
		block.setTextureName("adventuretime:"
				+ name.toLowerCase().replace(" ", ""));
		block.setCreativeTab(AdventureTimeMain.tabATimemain);
	}

	/**
	 * Register a mob entity with the mod.
	 * 
	 * @param mod
	 * @param entityClass
	 * @param name
	 * @param color1
	 * @param color2
	 */
	public static void registerMobEntity(AdventureTimeMain mod,
			Class<? extends EntityCreature> entityClass, String name,
			int color1, int color2) {
		EntityRegistry.registerModEntity(entityClass, name,
				getUniqueEntityId(), mod, 80, 3, true);
		registerEntityEgg(entityClass, color1, color2);
		LanguageRegistry.instance().addStringLocalization(
				"entity.AdventureTime." + name + ".name", name);
	}

	/**
	 * Register a mob entity with the mod.
	 * 
	 * @param mod
	 * @param entityClass
	 * @param name
	 * @param color1
	 * @param color2
	 */
	public static void registerFlyingMobEntity(AdventureTimeMain mod,
			Class<? extends EntityFlying> entityClass, String name, int color1,
			int color2) {
		EntityRegistry.registerModEntity(entityClass, name,
				getUniqueEntityId(), mod, 80, 3, true);
		registerEntityEgg(entityClass, color1, color2);
		LanguageRegistry.instance().addStringLocalization(
				"entity.AdventureTime." + name + ".name", name);
	}

	/**
	 * Register an item to be used.
	 */
	public static void registerItem(AdventureTimeMain mod, Item item,
			String name) {
		item.setCreativeTab(mod.tabATimemain);
		item.setUnlocalizedName(name);
		item.setTextureName("adventuretime:"
				+ name.toLowerCase().replace(" ", ""));
		LanguageRegistry.addName(item, name);
	}

	/**
	 * Get the entity's id.
	 * 
	 * @return
	 */
	public static int getUniqueEntityId() {
		do {
			++startEntityId;
		} while (EntityList.getStringFromID(startEntityId) != null);

		return startEntityId;
	}

	/**
	 * Bind an egg to an entity.
	 * 
	 * @param entity
	 * @param primaryColour
	 * @param secondaryColour
	 */
	public static void registerEntityEgg(Class entity, int primaryColour,
			int secondaryColour) {
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(Integer.valueOf(id), entity);
		EntityList.entityEggs.put(Integer.valueOf(id), new EntityEggInfo(id,
				primaryColour, secondaryColour));
	}

	/**
	 * Adds a complete tool set recipe. Works with mc version 1.6.4
	 * 
	 * @author Cyphereion
	 * @param CraftedWith
	 * @param Sword
	 * @param Shovel
	 * @param Pickaxe
	 * @param Hoe
	 * @param Axe
	 */
	public static void addToolsetRecipe(Object CraftedWith, Item Sword,
			Item Shovel, Item Pickaxe, Item Hoe, Item Axe) {
		Registry.addVerticleRecipe(Sword, CraftedWith, CraftedWith, Item.stick);
		Registry.addVerticleRecipe(Shovel, CraftedWith, Item.stick, Item.stick);
		Registry.addRecipe(new ItemStack(Pickaxe, 1), "111", " 2 ", " 2 ",
				Character.valueOf('1'), CraftedWith, Character.valueOf('2'),
				Item.stick);
		Registry.addRecipe(new ItemStack(Axe, 1), "ww ", "ws ", " s ",
				Character.valueOf('s'), Item.stick, Character.valueOf('w'),
				CraftedWith);
		Registry.addRecipe(new ItemStack(Axe, 1), " ww", " sw", " s ",
				Character.valueOf('s'), Item.stick, Character.valueOf('w'),
				CraftedWith);
		Registry.addRecipe(new ItemStack(Hoe, 1), "ww ", " s ", " s ",
				Character.valueOf('s'), Item.stick, Character.valueOf('w'),
				CraftedWith);
	}

	/**
	 * Add in a verticle recipe. Works with mc version 1.6.4
	 * 
	 * @author Cyphereion
	 * @param output
	 * @param top
	 * @param mid
	 * @param bottom
	 */
	public static void addVerticleRecipe(Item output, Object top, Object mid,
			Object bottom) {
		if (top instanceof Item || top instanceof Block && mid instanceof Item
				|| mid instanceof Block && bottom instanceof Item
				|| bottom instanceof Item) {
			Registry.addRecipe(new ItemStack(output, 1), " 1 ", " 2 ", " 3 ",
					Character.valueOf('1'), top, Character.valueOf('2'), mid,
					Character.valueOf('3'), bottom);
			Registry.addRecipe(new ItemStack(output, 1), "  1", "  2", "  3",
					Character.valueOf('1'), top, Character.valueOf('2'), mid,
					Character.valueOf('3'), bottom);
			Registry.addRecipe(new ItemStack(output, 1), "1  ", "2  ", "3  ",
					Character.valueOf('1'), top, Character.valueOf('2'), mid,
					Character.valueOf('3'), bottom);
		} else {
			System.err
					.println("Cannot create a verticle recipe with the following attributes: \n OUTPUT: ("
							+ output.toString()
							+ ") top: ("
							+ top.toString()
							+ ") mid: ("
							+ mid.toString()
							+ ") bottom: ("
							+ bottom.toString() + ")");
		}
	}
}
