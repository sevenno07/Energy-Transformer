package energy.transformer.common.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import energy.transformer.common.EnergyTransformer;
import energy.transformer.common.blocks.container.ContainerPixelCondenser;
import energy.transformer.common.tileentity.TileEntityPixelCondenser;

public class GuiPixelCondenser extends GuiContainer
{
	private static final ResourceLocation pixelCondenserGuiTexture = new ResourceLocation(EnergyTransformer.MODID.toLowerCase() + ":EnergyPixelCondenserGui");
	
	private TileEntityPixelCondenser pixelCondenser;
	
	public GuiPixelCondenser(InventoryPlayer inventory, TileEntityPixelCondenser te)
	{
		super(new ContainerPixelCondenser(inventory, te));
		this.pixelCondenser = te;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(pixelCondenserGuiTexture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	}
}