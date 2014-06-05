package energy.transformer.common.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import energy.transformer.common.cables.EpcInputCable;
import energy.transformer.common.cables.EpcOutputCable;
import energy.transformer.common.cables.EpcTransportCable;

/**
 * Block list
 * 
 * @author Superloup10
 * 
 */
public class EnergyBlockList
{
	public static Block craftingLibrary;
	public static Block pixelCondenser;
	public static Block fabricator;
	public static Block epcCable, epcOutputCable, epcInputCable;

	/**
	 * Loads blocks and registers them
	 */
	public static void loadBlocks()
	{
		craftingLibrary = new CraftingLibrary();
		pixelCondenser = new PixelCondenser().setBlockName("pixel_condenser");
		fabricator = new Fabricator();
		epcCable = new EpcTransportCable();
		epcInputCable = new EpcInputCable();
		epcOutputCable = new EpcOutputCable();

		GameRegistry.registerBlock(craftingLibrary, "crafting_library");
		GameRegistry.registerBlock(pixelCondenser, "pixel_condenser");
		GameRegistry.registerBlock(fabricator, "fabricator");
		GameRegistry.registerBlock(epcCable, "epc_cable");
		GameRegistry.registerBlock(epcInputCable, "epc_input_cable");
		GameRegistry.registerBlock(epcOutputCable, "epc_output_cable");
	}
}