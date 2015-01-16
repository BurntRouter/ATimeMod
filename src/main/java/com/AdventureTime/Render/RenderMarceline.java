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
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.opengl.GL11;

import com.AdventureTime.Models.ModelMarceline;
import com.google.common.collect.Maps;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMarceline extends RenderLiving
{
    private static final ResourceLocation textureLocation = new ResourceLocation("adventuretime:Marceline");

    protected ModelMarceline modelMarcelineMain;
    protected float field_77070_b;
    protected ModelMarceline field_82423_g;
    protected ModelMarceline field_82425_h;
    private static final Map field_110859_k = Maps.newHashMap();


    public RenderMarceline(ModelMarceline par1ModelMarceline, float par2)
    {
        this(par1ModelMarceline, par2, 1.0F);
    }

    public RenderMarceline(ModelMarceline par1ModelMarceline, float par2, float par3)
    {
        super(par1ModelMarceline, par2);
        this.modelMarcelineMain = par1ModelMarceline;
        this.field_77070_b = par3;
        this.func_82421_b();
    }

    protected void func_82421_b()
    {
        this.field_82423_g = new ModelMarceline();
        this.field_82425_h = new ModelMarceline();
    }


    /**
     * More generic ForgeHook version of the above function, it allows for Items to have more control over what texture they provide.
     * 
     * @param entity Entity wearing the armor
     * @param stack ItemStack for the armor
     * @param slot Slot ID that the item is in
     * @param type Subtype, can be null or "overlay"
     * @return ResourceLocation pointing at the armor's texture
     */


    protected void func_130005_c(EntityLiving par1EntityLiving, float par2)
    {
        float f1 = 1.0F;
        GL11.glColor3f(f1, f1, f1);
        super.renderEquippedItems(par1EntityLiving, par2);
        ItemStack itemstack = par1EntityLiving.getHeldItem();
        ItemStack itemstack1 = par1EntityLiving.func_130225_q(3);
        float f2;
        
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

            this.modelMarcelineMain.rightarm.postRender(0.0625F);
            GL11.glTranslatef(-0.09F, 0.6F, -0.15F);
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
