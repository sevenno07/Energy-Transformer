package energy.transformer.common.cables;

import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public interface IEPCCable
{
	public int getCableQuery(World world, int x, int y, int z);
	public int getCableEPC(World world, int x, int y, int z);
	public int getContainedEPC();
	public int getQueriedEPC();
	public ForgeDirection castDirectionFromInt(int i);
	public void takeEPC(ForgeDirection from, int epc);
	public void queryEPC(ForgeDirection from, int epc);
}
