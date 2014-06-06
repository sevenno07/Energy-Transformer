package energy.transformer.common.utils;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import energy.transformer.common.cables.IEPCCable;

public class CableHelper
{
	/**
	 * Returns the query of a cable at coords x, y and z
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * @return The cable query
	 */
	public static int getCableEPC(World w, int x, int y, int z)
	{
		TileEntity te = w.getTileEntity(x, y, z);
		if(te != null && te instanceof IEPCCable)
		{
			return ((IEPCCable)te).getContainedEPC();
		}
		return 0;
	}

	/**
	 * Returns the cable's EPC
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static int getCableQuery(World w, int x, int y, int z)
	{
		TileEntity te = w.getTileEntity(x, y, z);
		if(te != null && te instanceof IEPCCable)
		{
			return ((IEPCCable)te).getQueriedEPC();
		}
		return 0;
	}
}
