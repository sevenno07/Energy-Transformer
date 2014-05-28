package energy.transformer.common.blocks.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import energy.transformer.common.tileentity.TileEntityPixelCondenser;

public class ContainerPixelCondenser extends Container
{
	private TileEntityPixelCondenser tileEntityPixelCondenser;
	
	public ContainerPixelCondenser(InventoryPlayer inventory, TileEntityPixelCondenser te)
	{
		this.tileEntityPixelCondenser = te;
	}

	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return tileEntityPixelCondenser.isUseableByPlayer(player);
	}
}