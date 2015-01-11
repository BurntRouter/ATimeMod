package AdventureTime.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCandyZombie3 extends ModelBase
{
    ModelRenderer feet1;
    ModelRenderer feet2;
    ModelRenderer feet3;
    ModelRenderer feet4;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer Body3;
    ModelRenderer Arm1;
    ModelRenderer Arm2;
    ModelRenderer Arm3;
    ModelRenderer Arm4;
    ModelRenderer Arm5;
    ModelRenderer Arm6;

    public ModelCandyZombie3()
    {
    	
    	
        this.textureWidth = 128;
        this.textureHeight = 256;
        this.feet3 = new ModelRenderer(this, 12, 0);
        this.feet3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.feet3.setRotationPoint(-3.0F, 22.0F, 0.0F);
        this.feet3.setTextureSize(128, 256);
        this.feet3.mirror = true;
        this.setRotation(this.feet3, 0.0F, 0.0F, 0.0F);
        this.feet4 = new ModelRenderer(this, 12, 0);
        this.feet4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.feet4.setRotationPoint(2.0F, 22.0F, 0.0F);
        this.feet4.setTextureSize(128, 256);
        this.feet4.mirror = true;
        this.setRotation(this.feet4, 0.0F, 0.0F, 0.0F);
        this.leg1 = new ModelRenderer(this, 12, 39);
        this.leg1.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1);
        this.leg1.setRotationPoint(-3.0F, 17.0F, 0.0F);
        this.leg1.setTextureSize(128, 256);
        this.leg1.mirror = true;
        this.setRotation(this.leg1, 0.0F, 0.0F, 0.0F);
        this.leg2 = new ModelRenderer(this, 12, 39);
        this.leg2.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1);
        this.leg2.setRotationPoint(2.0F, 17.0F, 0.0F);
        this.leg2.setTextureSize(128, 256);
        this.leg2.mirror = true;
        this.setRotation(this.leg2, 0.0F, 0.0F, 0.0F);
        this.body1 = new ModelRenderer(this, 76, 0);
        this.body1.addBox(0.0F, 0.0F, 0.0F, 10, 8, 10);
        this.body1.setRotationPoint(-5.0F, 10.0F, -4.5F);
        this.body1.setTextureSize(128, 256);
        this.body1.mirror = true;
        this.setRotation(this.body1, 0.0F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 32, 18);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 9, 8, 9);
        this.body2.setRotationPoint(-4.5F, 2.0F, -4.0F);
        this.body2.setTextureSize(128, 256);
        this.body2.mirror = true;
        this.setRotation(this.body2, 0.0F, 0.0F, 0.0F);
        this.body2.mirror = false;
        this.Body3 = new ModelRenderer(this, 0, 19);
        this.Body3.addBox(0.0F, 0.0F, 0.0F, 7, 7, 7);
        this.Body3.setRotationPoint(-3.5F, -5.0F, -3.0F);
        this.Body3.setTextureSize(128, 256);
        this.Body3.mirror = true;
        this.setRotation(this.Body3, 0.0F, 0.0F, 0.0F);
        this.Arm1 = new ModelRenderer(this, 50, 100);
        this.Arm1.addBox(0.0F, 0.0F, 0.0F, 1, 12, 1);
        this.Arm1.setRotationPoint(-6.0F, 12.0F, 0.0F);
        this.Arm1.setTextureSize(128, 256);
        this.Arm1.mirror = true;
        this.setRotation(this.Arm1, 0.0F, 0.0F, 0.0F);
        this.Arm2 = new ModelRenderer(this, 50, 100);
        this.Arm2.addBox(0.0F, 0.0F, 0.0F, 1, 12, 1);
        this.Arm2.setRotationPoint(5.0F, 12.0F, 0.0F);
        this.Arm2.setTextureSize(128, 256);
        this.Arm2.mirror = true;
        this.setRotation(this.Arm2, 0.0F, 0.0F, 0.0F);
        this.Arm3 = new ModelRenderer(this, 100, 50);
        this.Arm3.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1);
        this.Arm3.setRotationPoint(-5.5F, 3.0F, 0.0F);
        this.Arm3.setTextureSize(128, 256);
        this.Arm3.mirror = true;
        this.setRotation(this.Arm3, 0.0F, 0.0F, 0.0F);
        this.Arm4 = new ModelRenderer(this, 100, 50);
        this.Arm4.addBox(0.0F, 1.0F, 0.0F, 1, 10, 1);
        this.Arm4.setRotationPoint(4.5F, 2.0F, 0.0F);
        this.Arm4.setTextureSize(128, 256);
        this.Arm4.mirror = true;
        this.setRotation(this.Arm4, 0.0F, 0.0F, 0.0F);
        this.Arm5 = new ModelRenderer(this, 0, 41);
        this.Arm5.addBox(0.0F, 0.0F, 0.0F, 1, 9, 1);
        this.Arm5.setRotationPoint(-4.5F, -4.0F, 0.0F);
        this.Arm5.setTextureSize(128, 256);
        this.Arm5.mirror = true;
        this.setRotation(this.Arm5, 0.0F, 0.0F, 0.0F);
        this.Arm6 = new ModelRenderer(this, 0, 41);
        this.Arm6.addBox(0.0F, 0.0F, 0.0F, 1, 9, 1);
        this.Arm6.setRotationPoint(3.5F, -4.0F, 0.0F);
        this.Arm6.setTextureSize(128, 256);
        this.Arm6.mirror = true;
        this.setRotation(this.Arm6, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        //this.feet3.render(f5);
        //this.feet4.render(f5);
        this.leg1.render(f5);
        this.leg2.render(f5);
        this.body1.render(f5);
        this.body2.render(f5);
        this.Body3.render(f5);
        this.Arm1.render(f5);
        this.Arm2.render(f5);
        this.Arm3.render(f5);
        this.Arm4.render(f5);
        this.Arm5.render(f5);
        this.Arm6.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par7Entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, par7Entity);
        float f6 = MathHelper.sin(this.onGround * (float)Math.PI);
        float f7 = MathHelper.sin((1.0F - (1.0F - this.onGround) * (1.0F - this.onGround)) * (float)Math.PI);
        this.Arm1.rotateAngleZ = 0.2F;
        this.Arm2.rotateAngleZ = 0.2F;
        this.Arm1.rotateAngleY = -(0.1F - f6 * 0.6F);
        this.Arm2.rotateAngleY = 0.1F - f6 * 0.6F;
        this.Arm1.rotateAngleX = -((float)Math.PI / 2F);
        this.Arm2.rotateAngleX = -((float)Math.PI / 2F);
        this.Arm1.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        this.Arm2.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        this.Arm1.rotateAngleZ += MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
        this.Arm2.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
        this.Arm1.rotateAngleX += MathHelper.sin(f2 * 0.067F) * 0.05F;
        this.Arm2.rotateAngleX -= MathHelper.sin(f2 * 0.067F) * 0.05F;
        this.Arm3.rotateAngleZ = 0.2F;
        this.Arm4.rotateAngleZ = 0.2F;
        this.Arm3.rotateAngleY = -(0.1F - f6 * 0.6F);
        this.Arm4.rotateAngleY = 0.1F - f6 * 0.6F;
        this.Arm3.rotateAngleX = -((float)Math.PI / 2F);
        this.Arm4.rotateAngleX = -((float)Math.PI / 2F);
        this.Arm3.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        this.Arm4.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        this.Arm3.rotateAngleZ += MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
        this.Arm4.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
        this.Arm3.rotateAngleX += MathHelper.sin(f2 * 0.067F) * 0.05F;
        this.Arm4.rotateAngleX -= MathHelper.sin(f2 * 0.067F) * 0.05F;
        this.Arm5.rotateAngleZ = 0.2F;
        this.Arm6.rotateAngleZ = 0.2F;
        this.Arm5.rotateAngleY = -(0.1F - f6 * 0.6F);
        this.Arm6.rotateAngleY = 0.1F - f6 * 0.6F;
        this.Arm5.rotateAngleX = -((float)Math.PI / 2F);
        this.Arm6.rotateAngleX = -((float)Math.PI / 2F);
        this.Arm5.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        this.Arm6.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        this.Arm5.rotateAngleZ += MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
        this.Arm6.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
        this.Arm5.rotateAngleX += MathHelper.sin(f2 * 0.067F) * 0.05F;
        this.Arm6.rotateAngleX -= MathHelper.sin(f2 * 0.067F) * 0.05F;
        this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
        this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
        
        leg1.addChild(feet3);
    	leg2.addChild(feet4);
    }
}
