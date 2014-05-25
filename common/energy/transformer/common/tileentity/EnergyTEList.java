package energy.transformer.common.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;

public class EnergyTEList
{
	public static void loadTileEntity()
	{
		GameRegistry.registerTileEntity(TileEntityPixelCondenser.class, "TileEntityPixelCondenser");
	}
}