package energy.transformer.common.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityPixelCondenser extends TileEntity implements IEPCContainer, IInventory
{
	private ItemStack[] inventory = new ItemStack[70];
	private String customName;
	private int storedEPC = 0;

	@Override
	public void readFromNBT(NBTTagCompound nbttag)
	{
		super.readFromNBT(nbttag);
		NBTTagList nbtTagList = nbttag.getTagList("Items", 10);
		this.inventory = new ItemStack[this.getSizeInventory()];

		this.storedEPC = nbttag.getInteger("StoredEPC");

		if(nbttag.hasKey("CustomName"))
		{
			this.customName = nbttag.getString("CustomName");
		}

		for(int i = 0; i < nbtTagList.tagCount(); i++)
		{
			NBTTagCompound compound = (NBTTagCompound)nbtTagList.getCompoundTagAt(i);
			int j = compound.getByte("Slot");

			if(j >= 0 && j < this.inventory.length)
			{
				this.inventory[j] = ItemStack.loadItemStackFromNBT(compound);
			}
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTagCompound)
	{
		super.writeToNBT(nbtTagCompound);
		NBTTagList nbtTagList = new NBTTagList();

		nbtTagCompound.setInteger("StoredEPC", storedEPC);

		for(int i = 0; i < this.inventory.length; i++)
		{
			if(this.inventory[i] != null)
			{
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte)i);
				this.inventory[i].writeToNBT(nbttagcompound1);
				nbtTagList.appendTag(nbttagcompound1);
			}
		}

		nbtTagCompound.setTag("Items", nbtTagList);

		if(this.hasCustomInventoryName())
		{
			nbtTagCompound.setString("CustomName", this.customName);
		}
	}

	public Packet getDescriptionPacket()
	{
		NBTTagCompound nbttagcompound = new NBTTagCompound();
		this.writeToNBT(nbttagcompound);
		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 3, nbttagcompound);
	}

	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity updateTileEntity)
	{
		this.readFromNBT(updateTileEntity.func_148857_g());
	}

	@Override
	public int getContainerEPC()
	{
		return this.storedEPC;
	}

	@Override
	public void setContainerEPC(int epc)
	{
		this.storedEPC = epc;
	}

	@Override
	public boolean hasEPC()
	{
		return this.storedEPC == 0;
	}

	@Override
	public int getSizeInventory()
	{
		return this.inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int slot)
	{
		return this.inventory[slot];
	}

	@Override
	public ItemStack decrStackSize(int slot, int quantity)
	{
		if(this.inventory[slot] != null)
		{
			ItemStack itemstack;

			if(this.inventory[slot].stackSize <= quantity)
			{
				itemstack = this.inventory[slot];
				this.inventory[slot] = null;
				this.markDirty();
				return itemstack;
			}
			else
			{
				itemstack = this.inventory[slot].splitStack(quantity);

				if(this.inventory[slot].stackSize == 0)
				{
					this.inventory[slot] = null;
				}

				this.markDirty();
				return itemstack;
			}
		}
		else
		{
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot)
	{
		if(this.inventory[slot] != null)
		{
			ItemStack itemstack = this.inventory[slot];
			this.inventory[slot] = null;
			return itemstack;
		}
		else
		{
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack stack)
	{
		this.inventory[slot] = stack;

		if(stack != null && stack.stackSize > this.getInventoryStackLimit())
		{
			stack.stackSize = this.getInventoryStackLimit();
		}

		this.markDirty();
	}

	@Override
	public String getInventoryName()
	{
		return this.hasCustomInventoryName() ? this.customName : "container.pixel_condenser";
	}

	@Override
	public boolean hasCustomInventoryName()
	{
		return this.customName != null && this.customName.length() > 0;
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player)
	{
		return worldObj.getTileEntity(xCoord, yCoord, zCoord) == this && player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) < 64;
	}

	@Override
	public void openInventory()
	{

	}

	@Override
	public void closeInventory()
	{

	}

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack stack)
	{
		return false;
	}
}