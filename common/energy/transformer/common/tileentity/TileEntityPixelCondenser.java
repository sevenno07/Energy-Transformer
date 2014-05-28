package energy.transformer.common.tileentity;

import net.minecraft.tileentity.TileEntity;

public class TileEntityPixelCondenser extends TileEntity implements IEPCContainer
{

	@Override
	public int getContainerEPC()
	{
		return 0;
	}

	@Override
	public void setContainerEPC(int epc){}

	@Override
	public boolean hasEPC()
	{
		return false;
	}
	
}