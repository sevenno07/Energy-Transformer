package energy.transformer.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import energy.transformer.client.renders.IInventoryRender;
import energy.transformer.common.EnergyTransformer;
import energy.transformer.common.cables.TileEpcTransportCable;

public class TileEntityCableRender extends TileEntitySpecialRenderer implements IInventoryRender
{
	//TODO
	//private final ModelCable model = new ModelCablel();
	public static final ResourceLocation textureLocation = new ResourceLocation(EnergyTransformer.MODID, "textures/blocks/modelCable.png");

	public TileEntityCableRender()
	{
		//TODO
		//this.setTileEntityRenderer(TileEntityRenderer.instance);
	}

	@Override
	public void renderInventory(double x, double y, double z)
	{}

	@Override
	public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8)
	{}

	public void renderAt(TileEpcTransportCable te, double x, double y, double z, float tick)
	{

	}

}
