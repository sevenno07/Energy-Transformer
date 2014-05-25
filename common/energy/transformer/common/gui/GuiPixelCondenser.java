package energy.transformer.common.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import energy.transformer.common.blocks.container.ContainerPixelCondenser;
import energy.transformer.common.tileentity.TileEntityPixelCondenser;

public class GuiPixelCondenser extends GuiContainer
{
	private TileEntityPixelCondenser pixelCondenser;
	
	public GuiPixelCondenser(InventoryPlayer inventory, TileEntityPixelCondenser te)
	{
		super(new ContainerPixelCondenser(inventory, te));
		this.pixelCondenser = te;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
	{
		
	}
}