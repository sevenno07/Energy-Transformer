package energy.transformer.common.cables;

import energy.transformer.common.EnergyTransformer;
import energy.transformer.common.tileentity.IEPCContainer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEpcInputCable extends TileEntity implements IEPCCable
{
	private int[] nearbyCableEPCContained = new int[6];
	private int[] nearbyCableEPCQueried = new int[6];
	private TileEntity[] nearbyTileEntity = new TileEntity[6];
	private World world = this.getWorldObj();
	private int epcQueried = 0;
	private int epcContained = 0;
	private int[] nextEPC = new int[6];
	private int[] nextEPCQuery = new int[6];

	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		for(int i = 0; i < 6; i++)
		{
			nbt.setInteger("nearbyCableEPCQueried" + i, nearbyCableEPCQueried[i]);
			nbt.setInteger("nearbyCableEPCContained" + i, nearbyCableEPCContained[i]);
			nbt.setInteger("nextEPC" + i, nextEPC[i]);
			nbt.setInteger("nextQuery" + i, nextEPCQuery[i]);
		}
		nbt.setInteger("epcContained", epcContained);
		nbt.setInteger("epcQueried", epcQueried);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		for(int i = 0; i < 6; i++)
		{
			nearbyCableEPCQueried[i] = nbt.getInteger("nearbyCableEPCQueried" + i);
			nearbyCableEPCContained[i] = nbt.getInteger("nearbyCableEPCContained" + i);
			nextEPC[i] = nbt.getInteger("nextEPC" + i);
			nextEPCQuery[i] = nbt.getInteger("nextEPCQuery" + i);
		}
		epcContained = nbt.getInteger("epcContained");
		epcQueried = nbt.getInteger("epcQeried");
	}
	
	@Override
	public void updateEntity()
	{
		int x = this.xCoord;
		int y = this.yCoord;
		int z = this.zCoord;

		for(int i = 0; i < 6; i++)
		{
			epcContained += nextEPC[i];
		}

		for(int j = 0; j < 6; j++)
		{
			epcQueried += nextEPCQuery[j];
		}

		nextEPCQuery = new int[5];
		nextEPC = new int[5];

		nearbyTileEntity[0] = world.getTileEntity(x++, y, z);
		nearbyTileEntity[1] = world.getTileEntity(x--, y, z);
		nearbyTileEntity[2] = world.getTileEntity(x, y, z++);
		nearbyTileEntity[3] = world.getTileEntity(x, y, z--);
		nearbyTileEntity[4] = world.getTileEntity(x, y++, z);
		nearbyTileEntity[5] = world.getTileEntity(x, y--, z);

		nearbyCableEPCContained[0] = this.getCableEPC(world, x++, y, z);
		nearbyCableEPCContained[1] = this.getCableEPC(world, x--, y, z);
		nearbyCableEPCContained[2] = this.getCableEPC(world, x, y, z++);
		nearbyCableEPCContained[3] = this.getCableEPC(world, x, y, z--);
		nearbyCableEPCContained[4] = this.getCableEPC(world, x, y++, z);
		nearbyCableEPCContained[5] = this.getCableEPC(world, x, y--, z);

		nearbyCableEPCQueried[0] = this.getCableQuery(world, x++, y, z);
		nearbyCableEPCQueried[1] = this.getCableQuery(world, x--, y, z);
		nearbyCableEPCQueried[2] = this.getCableQuery(world, x, y, z++);
		nearbyCableEPCQueried[3] = this.getCableQuery(world, x, y, z--);
		nearbyCableEPCQueried[4] = this.getCableQuery(world, x, y++, z);
		nearbyCableEPCQueried[5] = this.getCableQuery(world, x, y--, z);

		for(int in = 0; in < 6; ++in)
		{
			epcContained += nearbyCableEPCContained[in];
		}

		for(int out = 0; out < 6; ++out)
		{
			if(nearbyCableEPCContained[out] == 0)
			{
				epcQueried += nearbyCableEPCQueried[out];
			}
		}

		if(epcContained > 0)
		{
			for(int out = 0; out < 6; ++out)
			{
				TileEntity te = nearbyTileEntity[out];
				if(nearbyCableEPCQueried[out] > 0 && nearbyCableEPCContained[out] == 0)
				{
					int epcUsed = nearbyCableEPCQueried[out] / epcQueried * epcContained;
					if(te instanceof IEPCCable)
					{
						((IEPCCable)te).takeEPC(castDirectionFromInt(out), epcUsed);
					}

					if(te instanceof IEPCContainer)
					{
						this.queryEPC(castDirectionFromInt(out), 100);
						((IEPCContainer)te).setContainerEPC(((IEPCContainer)te).getContainerEPC() + epcUsed);
					}
				}
			}
		}

	}

	@Override
	public int getContainedEPC()
	{
		return epcContained;
	}

	@Override
	public int getQueriedEPC()
	{
		return epcQueried;
	}

	@Override
	public void takeEPC(ForgeDirection from, int epc)
	{
		assert from == ForgeDirection.UNKNOWN : "Cannot give an EPC value to an unknown side!";
		switch(from)
		{
		case EAST:
			nextEPC[0] += epc;
			break;
		case WEST:
			nextEPC[1] += epc;
			break;
		case SOUTH:
			nextEPC[2] += epc;
			break;
		case NORTH:
			nextEPC[3] += epc;
			break;
		case UP:
			nextEPC[4] += epc;
			break;
		case DOWN:
			nextEPC[5] += epc;
			break;
		default:
			EnergyTransformer.LOGGER.error("A mod tried to put " + epc + " epc(s) in unknown side " + from.toString() + "!");
			break;
		}
	}

	@Override
	public void queryEPC(ForgeDirection from, int epc)
	{
		assert from == ForgeDirection.UNKNOWN : "Cannot query an EPC value to an unknown side!";
		switch(from)
		{
		case EAST:
			nextEPCQuery[0] += epc;
			break;
		case WEST:
			nextEPCQuery[1] += epc;
			break;
		case SOUTH:
			nextEPCQuery[2] += epc;
			break;
		case NORTH:
			nextEPCQuery[3] += epc;
			break;
		case UP:
			nextEPCQuery[4] += epc;
			break;
		case DOWN:
			nextEPCQuery[5] += epc;
			break;
		default:
			EnergyTransformer.LOGGER.error("A mod tried to query " + epc + " epc(s) in unknown side " + from.toString() + "!");
			break;
		}
	}

	@Override
	public int getCableQuery(World world, int x, int y, int z)
	{
		return epcQueried;
	}

	@Override
	public int getCableEPC(World world, int x, int y, int z)
	{
		return epcContained;
	}

	@Override
	public ForgeDirection castDirectionFromInt(int i)
	{
		switch(i)
		{
		case 0:
			return ForgeDirection.EAST;
		case 1:
			return ForgeDirection.WEST;
		case 2:
			return ForgeDirection.SOUTH;
		case 3:
			return ForgeDirection.NORTH;
		case 4:
			return ForgeDirection.UP;
		case 5:
			return ForgeDirection.DOWN;
		default:
			return ForgeDirection.UNKNOWN;
		}
	}

}
