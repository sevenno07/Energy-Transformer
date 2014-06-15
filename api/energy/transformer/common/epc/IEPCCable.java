package energy.transformer.common.epc;

import net.minecraftforge.common.util.ForgeDirection;

/**
 * Any cable TileEntity implements this
 * 
 * @author utybo
 * 
 */
public interface IEPCCable
{
	/**
	 * Used by CableHelper
	 * 
	 * @return contained EPC
	 */
	public int getContainedEPC();

	/**
	 * Used by CableHelper
	 * 
	 * @return queried EPC
	 */
	public int getQueriedEPC();

	/**
	 * Takes EPC from the cable
	 * 
	 * @param from
	 * @param epc
	 */
	public void takeEPC(ForgeDirection from, int epc);

	/**
	 * Queries EPC
	 * 
	 * @param from
	 * @param epc
	 */
	public void queryEPC(ForgeDirection from, int epc);
}