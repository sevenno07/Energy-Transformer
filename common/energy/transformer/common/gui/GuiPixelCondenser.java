package energy.transformer.common.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import energy.transformer.common.EnergyTransformer;
import energy.transformer.common.blocks.container.ContainerPixelCondenser;
import energy.transformer.common.tileentity.TileEntityPixelCondenser;

public class GuiPixelCondenser extends GuiContainer
{
	private static final ResourceLocation pixelCondenserGuiTexture = new ResourceLocation(EnergyTransformer.MODID.toLowerCase() + ":textures/gui/EnergyPixelCondenserGui.png");

	private TileEntityPixelCondenser pixelCondenser;

	private GuiButton convert;
	
	public GuiPixelCondenser(InventoryPlayer inventory, TileEntityPixelCondenser te)
	{
		super(new ContainerPixelCondenser(inventory, te));
		this.pixelCondenser = te;
		this.xSize = 195;
		this.ySize = 256;
	}
	
	@Override
	public void initGui()
	{
		this.buttonList.clear();
		this.buttonList.add(this.convert = new GuiButton(0, this.xSize + 158, this.ySize / 4 - 7, 67, 20, "Convert"));
	}
	

	@Override
	protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_)
	{
		this.fontRendererObj.drawString(this.pixelCondenser.hasCustomInventoryName() ? this.pixelCondenser.getInventoryName() : StatCollector.translateToLocal(this.pixelCondenser.getInventoryName()), 278, this.ySize - 207, 4210752);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 250, this.ySize - 54, 4210752);
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