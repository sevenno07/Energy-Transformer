package energy.transformer.common.woldgenerator;

import cpw.mods.fml.common.registry.GameRegistry;

public class EnergyGenerator
{
	public static void loadGenerator()
	{
		GameRegistry.registerWorldGenerator(new WorldGenerator(), 0);
	}
}