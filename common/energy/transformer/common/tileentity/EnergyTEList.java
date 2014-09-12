package energy.transformer.common.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;
import energy.transformer.common.cables.TileEpcInputCable;
import energy.transformer.common.cables.TileEpcOutputCable;
import energy.transformer.common.cables.TileEpcTransportCable;

public class EnergyTEList
{
	public static void loadTileEntity()
	{
		GameRegistry.registerTileEntity(TileEntityPixelCondenser.class, "TileEntityPixelCondenser");
		GameRegistry.registerTileEntity(TileEpcInputCable.class, "TileEpcInputCable");
		GameRegistry.registerTileEntity(TileEpcOutputCable.class, "TileEpcOutputCable");
		GameRegistry.registerTileEntity(TileEpcTransportCable.class, "TileEpcTransportCable");
	}
}