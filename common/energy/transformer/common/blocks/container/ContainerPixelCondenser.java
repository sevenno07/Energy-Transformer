package energy.transformer.common.blocks.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import energy.transformer.common.tileentity.TileEntityPixelCondenser;

public class ContainerPixelCondenser extends Container
{
	private TileEntityPixelCondenser tileEntityPixelCondenser;
	
	public ContainerPixelCondenser(InventoryPlayer inventory, TileEntityPixelCondenser te)
	{
		this.tileEntityPixelCondenser = te;
		
		/*for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				this.addSlotToContainer(new Slot(te, j + i * 9, 8 + j * 18, 18 + i *18));
			}
		}*/
	}

	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return tileEntityPixelCondenser.isUseableByPlayer(player);
	}
}