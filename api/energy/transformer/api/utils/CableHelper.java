package energy.transformer.api.utils;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;
import energy.transformer.api.epc.EnumActionType;
import energy.transformer.api.epc.IEPCCable;
import energy.transformer.api.epc.IEPCContainer;
import energy.transformer.api.epc.IUpgradeListener;

/**
 * Cable stuff, useful for getting cable values
 * 
 * @author utybo
 * 
 */
public class CableHelper
{
	/**
	 * Returns the cable's EPC
	 * 
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static int getCableEPC(IBlockAccess w, int x, int y, int z)
	{
		TileEntity te = w.getTileEntity(x, y, z);
		if(te instanceof IEPCCable)
		{
			return ((IEPCCable)te).getContainedEPC();
		}
		return 0;
	}

	/**
	 * Returns the query of a cable at coords x, y and z
	 * 
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * @return The cable query
	 */
	public static int getCableQuery(IBlockAccess w, int x, int y, int z)
	{
		TileEntity te = w.getTileEntity(x, y, z);
		if(te instanceof IEPCCable)
		{
			return ((IEPCCable)te).getQueriedEPC();
		}
		return 0;
	}

	public static boolean canConnectWithSideCable(IBlockAccess world, int x, int y, int z, ForgeDirection d)
	{
		if(world.getTileEntity(x + d.offsetX, y + d.offsetY, z + d.offsetZ) instanceof IEPCCable)
			return true;
		return false;
	}

	public static boolean canConnectWithSideEPCContainer(IBlockAccess world, int x, int y, int z, ForgeDirection d)
	{
		TileEntity te = world.getTileEntity(x + d.offsetX, y + d.offsetY, z + d.offsetZ);
		if(te instanceof IEPCContainer && te instanceof IUpgradeListener)
		{
			return (!((IUpgradeListener)te).hasUpgrade(EnumActionType.UNPLUGGABLECABLES));
		}
		return te instanceof IEPCContainer;
	}
}