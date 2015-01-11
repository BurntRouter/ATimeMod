package AdventureTime.Render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import AdventureTime.Models.ModelNEPTR;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderNEPTR extends RenderLiving
{
    private static final ResourceLocation textureLocation = new ResourceLocation("adventuretime","textures/entity/NEPTR.png");

    public RenderNEPTR(ModelNEPTR par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return textureLocation;
    }
}
