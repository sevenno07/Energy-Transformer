package energy.transformer.common.epc;

import energy.transformer.common.blocks.EnergyBlockList;

public class EnergyModsEPCValuesList
{

	public static void loadEPCValues()
	{
		loadETEPCValues();

	}

	/**
	 * Loads ET's EPC values
	 */
	private static void loadETEPCValues()
	{
		EPCDatabase.setEPCValue(EnergyBlockList.pixelCondenser, 42011);
	}

}
