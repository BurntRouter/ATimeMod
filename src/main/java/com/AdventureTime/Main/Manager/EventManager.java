package AdventureTime.Main.Manager;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EventManager {

	@ForgeSubscribe
	@SideOnly(Side.CLIENT)
	public void onSound(SoundLoadEvent event) {
		event.manager.addSound("AdventureTime:wenkonce.ogg");
		event.manager.addSound("AdventureTime:wenkdouble.ogg");
	}
}