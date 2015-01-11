package AdventureTime.Client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import AdventureTime.Entity.EntityBMO;
import AdventureTime.Entity.EntityBilly;
import AdventureTime.Entity.EntityFP;
import AdventureTime.Entity.EntityFinn;
import AdventureTime.Entity.EntityGunter;
import AdventureTime.Entity.EntityIceKing;
import AdventureTime.Entity.EntityJake;
import AdventureTime.Entity.EntityLich;
import AdventureTime.Entity.EntityMarceline;
import AdventureTime.Entity.EntityNEPTR;
import AdventureTime.Entity.EntityPB;
import AdventureTime.Entity.EntityTreeTrunks;
import AdventureTime.Main.AdventureTimeMain;
import AdventureTime.Main.CommonProxy;
import AdventureTime.Main.Manager.EventManager;
import AdventureTime.Models.ModelBMO;
import AdventureTime.Models.ModelBilly;
import AdventureTime.Models.ModelFP;
import AdventureTime.Models.ModelFinn;
import AdventureTime.Models.ModelGunter;
import AdventureTime.Models.ModelIceKing;
import AdventureTime.Models.ModelJake;
import AdventureTime.Models.ModelLich;
import AdventureTime.Models.ModelMarceline;
import AdventureTime.Models.ModelNEPTR;
import AdventureTime.Models.ModelPB;
import AdventureTime.Models.ModelTreeTrunks;
import AdventureTime.Render.RenderBMO;
import AdventureTime.Render.RenderBilly;
import AdventureTime.Render.RenderFP;
import AdventureTime.Render.RenderFinn;
import AdventureTime.Render.RenderGauntlet;
import AdventureTime.Render.RenderGunter;
import AdventureTime.Render.RenderIceKing;
import AdventureTime.Render.RenderJake;
import AdventureTime.Render.RenderLich;
import AdventureTime.Render.RenderMarceline;
import AdventureTime.Render.RenderNEPTR;
import AdventureTime.Render.RenderPB;
import AdventureTime.Render.RenderTreeTrunks;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers() {

		RenderingRegistry.registerEntityRenderingHandler(EntityGunter.class,
				new RenderGunter(new ModelGunter(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFinn.class,
				new RenderFinn(new ModelFinn(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityIceKing.class,
				new RenderIceKing(new ModelIceKing(), 0.6F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMarceline.class,
				new RenderMarceline(new ModelMarceline(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityJake.class,
				new RenderJake(new ModelJake(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBMO.class,
				new RenderBMO(new ModelBMO(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityNEPTR.class,
				new RenderNEPTR(new ModelNEPTR(), 0.4F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFP.class,
				new RenderFP(new ModelFP(), 0.8F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBilly.class,
				new RenderBilly(new ModelBilly(), 1.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPB.class,
				new RenderPB(new ModelPB(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityLich.class,
				new RenderLich(new ModelLich(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(
				EntityTreeTrunks.class, new RenderTreeTrunks(
						new ModelTreeTrunks(), 0.5F));

		MinecraftForgeClient.registerItemRenderer(
				AdventureTimeMain.billygauntlet.itemID, new RenderGauntlet());

		MinecraftForge.EVENT_BUS.register(new EventManager());

	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if (tileEntity != null) {
			switch (ID) {
			case 0: /* your GUIs go here */
			}
		}
		return null;

	}

}
