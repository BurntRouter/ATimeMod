package com.AdventureTime.Render;

import com.AdventureTime.Models.ModelBilly;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBilly extends RenderLiving
{
    public RenderBilly(RenderManager p_i46153_1_, ModelBase p_i46153_2_,
			float p_i46153_3_) {
		super(p_i46153_1_, p_i46153_2_, p_i46153_3_);
		// TODO Auto-generated constructor stub
	}

	private static final ResourceLocation textureLocation = new ResourceLocation("adventuretime:textures/entity/Billy.png");

    @Override
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return textureLocation;
    }
}
