package com.AdventureTime.Render;

import com.AdventureTime.Models.ModelCandyZombie3;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCZ3 extends RenderLiving
{
    private static final ResourceLocation textureLocation = new ResourceLocation("adventuretime:CandyZombie3");

    public RenderCZ3(ModelCandyZombie3 par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return textureLocation;
	}
}
