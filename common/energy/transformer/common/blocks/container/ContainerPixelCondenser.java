package energy.transformer.common.blocks.container;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import energy.transformer.common.tileentity.TileEntityPixelCondenser;

public class ContainerPixelCondenser extends Container
{
	private List itemList = new ArrayList();

	private TileEntityPixelCondenser tileEntityPixelCondenser;

	private static InventoryBasic inventory = new InventoryBasic("tmp", true, 45);

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

		this.scrollTo(0.0F);
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

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slotId)
	{
		ItemStack itemstack = null;
		Slot slot = (Slot)this.inventorySlots.get(slotId);

		if(slot != null && slot.getHasStack())
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if(slotId < 9)
			{
				if(!this.mergeItemStack(itemstack1, 9, this.inventorySlots.size(), true))
				{
					return null;
				}
			}
			else if(!this.mergeItemStack(itemstack1, 0, 9, false))
			{
				return null;
			}

			if(itemstack1.stackSize == 0)
			{
				slot.putStack((ItemStack)null);
			}
			else
			{
				slot.onSlotChanged();
			}
		}
		return itemstack;
	}

	public void scrollTo(float currentScroll)
	{
		int i = this.itemList.size() / 9 - 5 + 1;
		int j = (int)((double)(currentScroll * (float)i) + 0.5D);

		if(j < 0)
		{
			j = 0;
		}

		for(int k = 0; k < 5; ++k)
		{
			for(int l = 0; l < 9; ++l)
			{
				int i1 = l + (k + j) * 9;

				if(i1 >= 0 && i1 < this.itemList.size())
				{
					this.inventory.setInventorySlotContents(l + k * 9, (ItemStack)this.itemList.get(i1));
				}
				else
				{
					this.inventory.setInventorySlotContents(l + k * 9, (ItemStack)null);
				}
			}
		}
	}
}