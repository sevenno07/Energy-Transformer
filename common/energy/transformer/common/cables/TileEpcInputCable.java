package energy.transformer.common.cables;

import net.minecraft.tileentity.TileEntity;
import energy.transformer.common.tileentity.IEPCContainer;
import energy.transformer.common.utils.DirectionHelper;

public class TileEpcInputCable extends TileEpcTransportCable implements IEPCCable
{
	@Override
	protected void executeSideAction(int side, TileEntity te, int epcUsed)
	{
		if(te instanceof IEPCContainer)
		{
			this.queryEPC(DirectionHelper.castDirectionFromInt(side), 100);
			((IEPCContainer)te).setContainerEPC(((IEPCContainer)te).getContainerEPC() + epcUsed);
		}
	}
}