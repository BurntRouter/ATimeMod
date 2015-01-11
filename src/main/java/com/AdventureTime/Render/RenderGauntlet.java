package AdventureTime.Render;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import AdventureTime.Models.ModelGauntlet;

/**
 * The class used to render the Gauntlet item.
 * 
 * @author Cyphereion
 * 
 */
public class RenderGauntlet implements IItemRenderer {

	protected ModelGauntlet gauntlet;

	private static final ResourceLocation tex = new ResourceLocation(
			"adventuretime:textures/model/gauntlet.png");

	public RenderGauntlet() {
		gauntlet = new ModelGauntlet();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch (type) {
		default:
			return false;
		case EQUIPPED:
			return true;
		case EQUIPPED_FIRST_PERSON:
			return true;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch (type) {
		case EQUIPPED: {
			GL11.glPushMatrix();
			GL11.glScalef(1.2F, 1.1F, 1.2F);
			GL11.glTranslatef(0.5F, 0, -0.15F);
			GL11.glRotatef(0, 0, 0, 0);
			Minecraft.getMinecraft().renderEngine.bindTexture(tex);
			gauntlet.renderModel(.0625F);
			GL11.glPopMatrix();
			break;
		}
		case EQUIPPED_FIRST_PERSON: {
			GL11.glPushMatrix();
			GL11.glScalef(1, 1.3F, 1);
			GL11.glTranslatef(0.2F, 0, -0.2F);
			GL11.glRotatef(180, 10 * 3.14F, 180, 1);
			Minecraft.getMinecraft().renderEngine.bindTexture(tex);
			gauntlet.renderModel(.0625F);
			GL11.glPopMatrix();
			break;
		}
		default:
			break;
		}
	}
}
