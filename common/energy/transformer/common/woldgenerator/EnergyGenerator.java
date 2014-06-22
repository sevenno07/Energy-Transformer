package energy.transformer.common.woldgenerator;

import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.registry.GameRegistry;
import energy.transformer.common.configs.EnergyProperties;
import energy.transformer.common.woldgenerator.dimensions.EnergyWorldProvider;

public class EnergyGenerator
{
	public static void loadGenerator()
	{
		GameRegistry.registerWorldGenerator(new WorldGenerator(), 0);
	}
	
	public static void loadDimension()
	{
		DimensionManager.registerProviderType(EnergyProperties.dimensionID, EnergyWorldProvider.class, false);
		DimensionManager.registerDimension(EnergyProperties.dimensionID, EnergyProperties.dimensionID);
	}
}