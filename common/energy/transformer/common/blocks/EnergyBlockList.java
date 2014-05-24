package energy.transformer.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Block list
 * @author Superloup10
 *
 */
public class EnergyBlockList
{
	public static Block craftingLibrary;
	public static Block pixelCondenser;
	public static Block fabricator;

	/**
	 * Loads blocks and registers them
	 */
	public static void loadBlocks()
	{
		craftingLibrary = new CraftingLibrary();
		pixelCondenser = new PixelCondenser();
		fabricator = new Fabricator();

		GameRegistry.registerBlock(craftingLibrary, "crafting_library");
		GameRegistry.registerBlock(pixelCondenser, "pixel_condenser");
		GameRegistry.registerBlock(fabricator, "fabricator");
	}
}