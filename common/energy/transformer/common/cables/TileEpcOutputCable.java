package energy.transformer.common.cables;

import net.minecraft.tileentity.TileEntity;
import energy.transformer.common.epc.IEPCContainer;
import energy.transformer.common.utils.DirectionHelper;

public class TileEpcOutputCable extends TileEpcTransportCable
{
	@Override
	protected void executePostAction()
	{
		if(epcContained == 0)
		{
			for(int out = 0; out < 6; ++out)
			{
				TileEntity te = nearbyTileEntity[out];
				if(te instanceof IEPCContainer)
				{
					IEPCContainer epcContainer = (IEPCContainer)te;
					if(epcContainer.getContainerEPC() < 100 && epcContainer.hasEPC())
					{
						this.takeEPC(DirectionHelper.castDirectionFromInt(out), epcContainer.getContainerEPC());
						epcContainer.setContainerEPC(0);
					}
					if(epcContainer.getContainerEPC() >= 100)
					{
						this.takeEPC(DirectionHelper.castDirectionFromInt(out), 100);
						epcContainer.setContainerEPC(epcContainer.getContainerEPC() - 100);
					}
				}
			}
		}
	}
}