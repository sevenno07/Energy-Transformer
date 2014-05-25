package energy.transformer.common.blocks.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import energy.transformer.common.tileentity.TileEntityPixelCondenser;

public class ContainerPixelCondenser extends Container
{
	public ContainerPixelCondenser(InventoryPlayer inventory, TileEntityPixelCondenser te)
	{
		
	}

	@Override
	public boolean canInteractWith(EntityPlayer var1)
	{
		return false;
	}
}