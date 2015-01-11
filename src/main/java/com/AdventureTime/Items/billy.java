package AdventureTime.Items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import AdventureTime.Main.AdventureTimeMain;

public class billy extends ItemSword {

	public billy(int ItemID, EnumToolMaterial material) {
		super(ItemID, material);
		setCreativeTab(AdventureTimeMain.tabATimemain);
	}

}