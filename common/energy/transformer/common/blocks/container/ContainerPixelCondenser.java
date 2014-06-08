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

		for(int j = 0; j < 5; j++)
		{
			this.addSlotToContainer(new Slot(te, j * 9 + 16, 35 + j * 18, 26));
		}
		
		for(int i = 0; i < 3; i++)
		{
			this.addSlotToContainer(new Slot(te, i * 9 + 30, 51 + i * 20, 65));
		}
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				this.addSlotToContainer(new Slot(te, i + j * 10, 35 + i * 18, 99 + j * 18));
			}
		}
		
		this.addSlotToContainer(new Slot(te, 40, 146, 94));
		
		this.bindPlayerInventory(inventory);
	}

	private void bindPlayerInventory(InventoryPlayer inventory)
	{
		int i;
		for(i = 0; i < 3; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9, 47 + j * 18, 103 + i * 18 + 62));
			}
		}
		
		for(i = 0; i < 9; i++)
		{
			this.addSlotToContainer(new Slot(inventory, i, 47 + i * 18, 223));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return tileEntityPixelCondenser.isUseableByPlayer(player);
	}
}