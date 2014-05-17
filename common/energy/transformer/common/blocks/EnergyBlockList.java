package energy.transformer.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class EnergyBlockList
{
	public static Block craftingLibrary;
	public static Block pixelCondenser;
	public static Block fabricator;
	
	public static void loadBlocks()
	{
		craftingLibrary = new CraftingLibrary().setBlockName("craftingLibrary").setBlockTextureName("energy_transformer:crafting_library");
		pixelCondenser = new PixelCondenser().setBlockName("pixelCondenser").setBlockTextureName("energy_transformer:pixel_condenser");
		fabricator = new Fabricator().setBlockName("fabricator").setBlockTextureName("energy_transformer:fabricator");
		
		GameRegistry.registerBlock(craftingLibrary, "crafting_library");
		GameRegistry.registerBlock(pixelCondenser, "pixel_condenser");
		GameRegistry.registerBlock(fabricator, "fabricator");
	}
}