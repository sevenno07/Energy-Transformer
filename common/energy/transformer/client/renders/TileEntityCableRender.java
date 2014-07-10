package energy.transformer.client.renders;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import energy.transformer.client.models.ModelCable;
import energy.transformer.client.models.ModelCableDirectional;
import energy.transformer.common.EnergyTransformer;
import energy.transformer.common.cables.TileEpcTransportCable;

public class TileEntityCableRender extends TileEntitySpecialRenderer implements IInventoryRender
{
	private final ModelCable model = new ModelCable();
	private final ModelCableDirectional model2 = new ModelCableDirectional();
	
	private static final ResourceLocation texture = new ResourceLocation(EnergyTransformer.MODID, "textures/blocks/model_cable.png");
	private static final ResourceLocation texture2 = new ResourceLocation(EnergyTransformer.MODID, "textures/blocks/model_cable_directional.png");

	public TileEntityCableRender()
	{
		this.func_147497_a(TileEntityRendererDispatcher.instance);
	}

	@Override
	public void renderInventory(double x, double y, double z)
	{
		this.renderTileEpcTransportCableBaseAt(null, x, y, z, 0.0F);
	}

	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale)
	{
		TileEpcTransportCable tileEntity = (TileEpcTransportCable)te;
		if(tileEntity.render[0])
			this.renderTileEpcTransportCableDirectionalAt((TileEpcTransportCable)te, x, y, z, scale, 0F);
		if(tileEntity.render[1])
			this.renderTileEpcTransportCableDirectionalAt((TileEpcTransportCable)te, x, y, z, scale, 180F);
		if(tileEntity.render[2])
			this.renderTileEpcTransportCableDirectionalAt((TileEpcTransportCable)te, x, y, z, scale, 270F);
		if(tileEntity.render[3])
			this.renderTileEpcTransportCableDirectionalAt((TileEpcTransportCable)te, x, y, z, scale, 90F);
		if(tileEntity.render[4])
			this.renderTileEpcTransportCableDirectionalAxeNegYAt((TileEpcTransportCable)te, x, y, z, scale);
		if(tileEntity.render[5])
			this.renderTileEpcTransportCableDirectionalAxePosYAt((TileEpcTransportCable)te, x, y, z, scale);
		this.renderTileEpcTransportCableBaseAt((TileEpcTransportCable)te, x, y, z, scale);
	}

	private void renderTileEpcTransportCableDirectionalAt(TileEpcTransportCable te, double x, double y, double z, float scale, float angle)
	{
		GL11.glPushMatrix();
		GL11.glTranslated((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		this.bindTexture(texture2);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(angle, 0.0F, 1.0F, 0.0F);
		this.model2.render(0.0625F);
		GL11.glPopMatrix();
	}

	public void renderTileEpcTransportCableBaseAt(TileEpcTransportCable te, double x, double y, double z, float scale)
	{
		GL11.glPushMatrix();
		GL11.glTranslated((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		this.bindTexture(texture);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(0F, 0.0F, 1.0F, 1.0F);
		this.model.render(0.0625F);
		GL11.glPopMatrix();
	}
	
	private void renderTileEpcTransportCableDirectionalAxeNegYAt(TileEpcTransportCable te, double x, double y, double z, float scale)
	{
		GL11.glPushMatrix();
		GL11.glTranslated((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		this.bindTexture(texture2);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(90F, 1.0F, 0.0F, 0.0F);
		GL11.glScalef(1.0F, 1.0F, 1.05F);
		GL11.glTranslatef(0.0F, -1.313F, -1.24F);
		this.model2.render(0.0625F);
		GL11.glPopMatrix();
	}
	
	private void renderTileEpcTransportCableDirectionalAxePosYAt(TileEpcTransportCable te, double x, double y, double z, float scale)
	{
		GL11.glPushMatrix();
		GL11.glTranslated((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		this.bindTexture(texture2);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(90F, 1.0F, 0.0F, 0.0F);
		GL11.glTranslatef(0.0F, -1.313F, -0.69F);
		this.model2.render(0.0625F);
		GL11.glPopMatrix();
	}
}