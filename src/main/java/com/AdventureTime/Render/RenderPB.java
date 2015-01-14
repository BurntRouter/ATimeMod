package com.AdventureTime.Render;

import static net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED;
import static net.minecraftforge.client.IItemRenderer.ItemRendererHelper.BLOCK_3D;

import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.opengl.GL11;

import com.AdventureTime.Models.ModelPB;
import com.google.common.collect.Maps;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPB extends RenderLiving
{
    private static final ResourceLocation textureLocation = new ResourceLocation("adventuretime:textures/entity/PB.png");
	
    protected ModelPB modelPBMain;
    protected float field_77070_b;
    protected ModelPB field_82423_g;
    protected ModelPB field_82425_h;
    private static final Map field_110859_k = Maps.newHashMap();

    /** List of armor texture filenames. */
    public static String[] FinnArmorFilenamePrefix = new String[] {"leather", "chainmail", "iron", "diamond", "gold"};

    public RenderPB(ModelPB par1ModelPB, float par2)
    {
        this(par1ModelPB, par2, 1.0F);
    }

    public RenderPB(ModelPB par1ModelPB, float par2, float par3)
    {
        super(par1ModelPB, par2);
        this.modelPBMain = par1ModelPB;
        this.field_77070_b = par3;
        this.func_82421_b();
    }

    protected void func_82421_b()
    {
        this.field_82423_g = new ModelPB();
        this.field_82425_h = new ModelPB();
    }


    protected ResourceLocation func_110856_a(EntityLiving par1EntityLiving)
    {
        return null;
    }

    protected void func_130005_c(EntityLiving par1EntityLiving, float par2)
    {
        float f1 = 1.0F;
        GL11.glColor3f(f1, f1, f1);
        super.renderEquippedItems(par1EntityLiving, par2);
        ItemStack itemstack = par1EntityLiving.getHeldItem();
        ItemStack itemstack1 = par1EntityLiving.func_130225_q(3);
        float f2;


        if (itemstack1 != null)
        {
            GL11.glPushMatrix();
            this.modelPBMain.Head.postRender(0.0625F);

            IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(itemstack1, EQUIPPED);
            boolean is3D = (customRenderer != null && customRenderer.shouldUseRenderHelper(EQUIPPED, itemstack1, BLOCK_3D));

            

        if (itemstack != null)
        {
            GL11.glPushMatrix();

            if (this.mainModel.isChild)
            {
                f2 = 0.5F;
                GL11.glTranslatef(0.0F, 0.625F, 0.0F);
                GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
                GL11.glScalef(f2, f2, f2);
            }

            this.modelPBMain.RightArm.postRender(0.0625F);
            GL11.glTranslatef(-0.09F, 0.4F, -0.15F);
        }
        }
    }


    protected void func_82422_c()
    {
        GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
    }

    protected void func_82439_b(EntityLivingBase par1, int par2, float par3)
    {
        this.func_82408_c((EntityLiving)par1, par2, par3);
    }

    protected void renderEquippedItems(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.func_130005_c((EntityLiving)par1EntityLivingBase, par2);
    }

    public void renderPlayer(EntityLivingBase par1, double par2, double par4, double par6, float par8, float par9)
    {
        this.doRender((EntityLiving)par1, par2, par4, par6, par8, par9);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return textureLocation;
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.doRender((EntityLiving)par1Entity, par2, par4, par6, par8, par9);
    }
}
