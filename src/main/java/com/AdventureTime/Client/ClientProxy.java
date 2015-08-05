package com.AdventureTime.Client;


import com.AdventureTime.Entity.EntityBMO;
import com.AdventureTime.Entity.EntityBilly;
import com.AdventureTime.Entity.EntityFP;
import com.AdventureTime.Entity.EntityFinn;
import com.AdventureTime.Entity.EntityIceKing;
import com.AdventureTime.Entity.EntityJake;
import com.AdventureTime.Entity.EntityNEPTR;
import com.AdventureTime.Entity.EntityPB;
import com.AdventureTime.Items.ModItems;
import com.AdventureTime.Main.CommonProxy;
import com.AdventureTime.Models.ModelBMO;
import com.AdventureTime.Models.ModelBilly;
import com.AdventureTime.Models.ModelFP;
import com.AdventureTime.Models.ModelFinn;
import com.AdventureTime.Models.ModelIceKing;
import com.AdventureTime.Models.ModelJake;
import com.AdventureTime.Models.ModelNEPTR;
import com.AdventureTime.Models.ModelPB;
import com.AdventureTime.Render.RenderBMO;
import com.AdventureTime.Render.RenderBilly;
import com.AdventureTime.Render.RenderFP;
import com.AdventureTime.Render.RenderFinn;
import com.AdventureTime.Render.RenderGauntlet;
import com.AdventureTime.Render.RenderIceKing;
import com.AdventureTime.Render.RenderJake;
import com.AdventureTime.Render.RenderNEPTR;
import com.AdventureTime.Render.RenderPB;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

	public void registerRenderers() {

//		RenderingRegistry.registerEntityRenderingHandler(EntityGunter.class,
//				new RenderGunter(new ModelGunter(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFinn.class,
				new RenderFinn(new ModelFinn(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityIceKing.class,
				new RenderIceKing(new ModelIceKing(), 0.6F));
//		RenderingRegistry.registerEntityRenderingHandler(EntityMarceline.class,
//				new RenderMarceline(new ModelMarceline(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityJake.class,
				new RenderJake(new ModelJake(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBMO.class,
				new RenderBMO(new ModelBMO(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityNEPTR.class,
				new RenderNEPTR(new ModelNEPTR(), 0.4F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFP.class,
				new RenderFP(new ModelFP(), 0.8F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBilly.class,
				new RenderBilly(null, new ModelBilly(), 1.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPB.class,
				new RenderPB(new ModelPB(), 0.5F));
//		RenderingRegistry.registerEntityRenderingHandler(EntityLich.class,
//				new RenderLich(new ModelLich(), 0.5F));
//		RenderingRegistry.registerEntityRenderingHandler(EntityTreeTrunks.class,
	//			new RenderTreeTrunks(new ModelTreeTrunks(), 0.5F));

		MinecraftForgeClient.registerItemRenderer(
				ModItems.BillyGauntlet, new RenderGauntlet());

	}

}
