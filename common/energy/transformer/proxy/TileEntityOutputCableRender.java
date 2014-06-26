package energy.transformer.proxy;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import energy.transformer.client.renders.IInventoryRender;
import energy.transformer.common.EnergyTransformer;
import energy.transformer.common.cables.TileEpcOutputCable;

public class TileEntityOutputCableRender extends TileEntitySpecialRenderer implements IInventoryRender
{
	// TODO
	// private final ModelOutputCable model = new ModelOutputCable();
	public static final ResourceLocation textureLocation = new ResourceLocation(EnergyTransformer.MODID, "textures/blocks/modelOutputCable.png");

	public TileEntityOutputCableRender()
	{
		this.func_147497_a(TileEntityRendererDispatcher.instance);
	}

	@Override
	public void renderInventory(double x, double y, double z)
	{
		this.renderAt(null, x, y, z, 0.0F);
	}

	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float tick)
	{
		this.renderAt((TileEpcOutputCable)te, x, y, z, tick);
	}

	public void renderAt(TileEpcOutputCable te, double x, double y, double z, float tick)
	{
		GL11.glPushMatrix();
		GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);
		this.bindTexture(textureLocation);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		// this.model.render(0.0625F);
		GL11.glPopMatrix();
	}
}
