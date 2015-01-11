package AdventureTime.Main.Manager;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import AdventureTime.GUI.EnchiridionGUI;
import cpw.mods.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world,
			int x, int y, int z) {
		switch (id) {
		default:
			return null;
		case 0:
			return new EnchiridionGUI();
		}
	}

}