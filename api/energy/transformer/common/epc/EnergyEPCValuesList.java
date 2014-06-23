package energy.transformer.common.epc;

import energy.transformer.common.blocks.EnergyBlockList;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * EPC values list
 * 
 * @author utybo
 * 
 */
public class EnergyEPCValuesList
{
	/**
	 * Loads EPC values
	 */
	public static void loadEPCValues()
	{
		loadVanillaEPCValues();
		loadEnergyTransformerEPCValues();
	}

	/**
	 * Loads EPC values for Vanilla items & blocks
	 */
	private static void loadVanillaEPCValues()
	{
		// Blocks
		EPCDatabase.setEPCValue(Blocks.cobblestone, 1);
		setBlockMetaEPCValue(Blocks.stone_slab, 1, 7);
		EPCDatabase.setEPCValue(Blocks.deadbush, 1);
		setBlockMetaEPCValue(Blocks.tallgrass, 1, 2);
		EPCDatabase.setEPCValue(Blocks.dirt, 1);
		EPCDatabase.setEPCValue(Blocks.grass, 1);
		EPCDatabase.setEPCValue(Blocks.ice, 1);
		setBlockMetaEPCValue(Blocks.leaves, 1, 3);
		setBlockMetaEPCValue(Blocks.leaves2, 1, 1);
		EPCDatabase.setEPCValue(Blocks.mycelium, 1);
		EPCDatabase.setEPCValue(Blocks.netherrack, 1);
		EPCDatabase.setEPCValue(Blocks.sand, 1);
		EPCDatabase.setEPCValue(Blocks.snow, 1);
		EPCDatabase.setEPCValue(Blocks.stone, 1);
		EPCDatabase.setEPCValue(Blocks.stonebrick, 1);
		EPCDatabase.setEPCValue(Blocks.stone_brick_stairs, 1);
		EPCDatabase.setEPCValue(Blocks.stone_stairs, 1);
		EPCDatabase.setEPCValue(Blocks.end_stone, 1);
		EPCDatabase.setEPCValue(Blocks.stone_button, 2);
		EPCDatabase.setEPCValue(Blocks.stone_pressure_plate, 2);
		EPCDatabase.setEPCValue(Blocks.gravel, 4);
		EPCDatabase.setEPCValue(Blocks.nether_brick, 4);
		EPCDatabase.setEPCValue(Blocks.sandstone, 4);
		EPCDatabase.setEPCValue(Blocks.lever, 5);
		EPCDatabase.setEPCValue(Blocks.cactus, 8);
		EPCDatabase.setEPCValue(Blocks.furnace, 8);
		EPCDatabase.setEPCValue(Blocks.vine, 8);
		setBlockMetaEPCValue(Blocks.planks, 8, 5);
		setBlockMetaEPCValue(Blocks.wooden_slab, 8, 5);
		EPCDatabase.setEPCValue(Blocks.torch, 9);
		EPCDatabase.setEPCValue(Blocks.web, 12);
		EPCDatabase.setEPCValue(Blocks.fence, 12);
		EPCDatabase.setEPCValue(Blocks.acacia_stairs, 12);
		EPCDatabase.setEPCValue(Blocks.birch_stairs, 12);
		EPCDatabase.setEPCValue(Blocks.dark_oak_stairs, 12);
		EPCDatabase.setEPCValue(Blocks.jungle_stairs, 12);
		EPCDatabase.setEPCValue(Blocks.oak_stairs, 12);
		EPCDatabase.setEPCValue(Blocks.spruce_stairs, 12);
		EPCDatabase.setEPCValue(Blocks.ladder, 14);
		EPCDatabase.setEPCValue(Blocks.red_flower, 16);
		EPCDatabase.setEPCValue(Blocks.yellow_flower, 16);
		EPCDatabase.setEPCValue(Blocks.waterlily, 16);
		EPCDatabase.setEPCValue(Blocks.wooden_pressure_plate, 16);
		EPCDatabase.setEPCValue(Blocks.trapdoor, 24);
		EPCDatabase.setEPCValue(Blocks.crafting_table, 32);
		EPCDatabase.setEPCValue(Blocks.fence_gate, 32);
		EPCDatabase.setEPCValue(Blocks.brown_mushroom, 32);
		EPCDatabase.setEPCValue(Blocks.red_mushroom, 32);
		setBlockMetaEPCValue(Blocks.sapling, 32, 5);
		setBlockMetaEPCValue(Blocks.log, 32, 3);
		setBlockMetaEPCValue(Blocks.log2, 32, 1);
		EPCDatabase.setEPCValue(Blocks.reeds, 32);
		setBlockMetaEPCValue(Blocks.wool, 48, 15);
		EPCDatabase.setEPCValue(Blocks.soul_sand, 49);
		EPCDatabase.setEPCValue(Blocks.chest, 64);
		EPCDatabase.setEPCValue(Blocks.obsidian, 64);
		EPCDatabase.setEPCValue(Blocks.redstone_torch, 68);
		EPCDatabase.setEPCValue(Blocks.iron_bars, 48);
		EPCDatabase.setEPCValue(Blocks.rail, 96);
		EPCDatabase.setEPCValue(Blocks.dispenser, 119);
		EPCDatabase.setEPCValue(Blocks.noteblock, 128);
		EPCDatabase.setEPCValue(Blocks.lit_pumpkin, 144);
		EPCDatabase.setEPCValue(Blocks.pumpkin, 144);
		EPCDatabase.setEPCValue(Blocks.melon_block, 144);
		EPCDatabase.setEPCValue(Blocks.bed, 144);
		EPCDatabase.setEPCValue(Blocks.mossy_cobblestone, 145);
		EPCDatabase.setEPCValue(Blocks.brick_block, 256);
		EPCDatabase.setEPCValue(Blocks.clay, 256);
		EPCDatabase.setEPCValue(Blocks.detector_rail, 256);
		EPCDatabase.setEPCValue(Blocks.bookshelf, 336);
		EPCDatabase.setEPCValue(Blocks.brick_stairs, 348);
		EPCDatabase.setEPCValue(Blocks.piston, 348);
		EPCDatabase.setEPCValue(Blocks.sticky_piston, 372);
		EPCDatabase.setEPCValue(Blocks.cake, 384);
		EPCDatabase.setEPCValue(Blocks.tnt, 964);
		EPCDatabase.setEPCValue(Blocks.glowstone, 1536);
		EPCDatabase.setEPCValue(Blocks.iron_door, 1536);
		EPCDatabase.setEPCValue(Blocks.brewing_stand, 1539);
		EPCDatabase.setEPCValue(Blocks.golden_rail, 2048);
		EPCDatabase.setEPCValue(Blocks.iron_block, 2304);
		EPCDatabase.setEPCValue(Blocks.lapis_block, 7776);
		EPCDatabase.setEPCValue(Blocks.jukebox, 8256);
		EPCDatabase.setEPCValue(Blocks.enchanting_table, 16736);
		EPCDatabase.setEPCValue(Blocks.gold_block, 18432);
		EPCDatabase.setEPCValue(Blocks.diamond_block, 73728);
		EPCDatabase.setEPCValue(Blocks.dragon_egg, 139264);

		// Items
		EPCDatabase.setEPCValue(Items.stick, 4);
		EPCDatabase.setEPCValue(Items.flint, 4);
		setItemMetaEPCValue(Items.dye, 8, 15);
		EPCDatabase.setEPCValue(Items.fishing_rod, 12);
		EPCDatabase.setEPCValue(Items.string, 12);
		EPCDatabase.setEPCValue(Items.arrow, 14);
		EPCDatabase.setEPCValue(Items.wheat_seeds, 16);
		EPCDatabase.setEPCValue(Items.pumpkin_seeds, 16);
		EPCDatabase.setEPCValue(Items.melon_seeds, 16);
		EPCDatabase.setEPCValue(Items.wheat, 24);
		EPCDatabase.setEPCValue(Items.nether_wart, 24);
		EPCDatabase.setEPCValue(Items.rotten_flesh, 24);
		EPCDatabase.setEPCValue(Items.slime_ball, 24);
		EPCDatabase.setEPCValue(Items.coal, 32);
		EPCDatabase.setEPCValue(Items.paper, 32);
		EPCDatabase.setEPCValue(Items.sugar, 32);
		EPCDatabase.setEPCValue(Items.egg, 32);
		EPCDatabase.setEPCValue(Items.feather, 48);
		EPCDatabase.setEPCValue(Items.redstone, 64);
		EPCDatabase.setEPCValue(Items.porkchop, 64);
		EPCDatabase.setEPCValue(Items.beef, 64);
		EPCDatabase.setEPCValue(Items.fish, 64);
		EPCDatabase.setEPCValue(Items.chicken, 64);
		EPCDatabase.setEPCValue(Items.leather, 64);
		EPCDatabase.setEPCValue(Items.clay_ball, 64);
		EPCDatabase.setEPCValue(Items.bread, 72);
		EPCDatabase.setEPCValue(Items.painting, 80);
		EPCDatabase.setEPCValue(Items.book, 96);
		EPCDatabase.setEPCValue(Items.bone, 96);
		EPCDatabase.setEPCValue(Items.apple, 128);
		EPCDatabase.setEPCValue(Items.gunpowder, 192);
		EPCDatabase.setEPCValue(Items.fermented_spider_eye, 192);
		EPCDatabase.setEPCValue(Items.saddle, 192);
		EPCDatabase.setEPCValue(Items.speckled_melon, 243);
		EPCDatabase.setEPCValue(Items.iron_ingot, 256);
		EPCDatabase.setEPCValue(Items.glowstone_dust, 384);
		EPCDatabase.setEPCValue(Items.blaze_powder, 768);
		EPCDatabase.setEPCValue(Items.bucket, 768);
		EPCDatabase.setEPCValue(Items.water_bucket, 769);
		EPCDatabase.setEPCValue(Items.magma_cream, 792);
		EPCDatabase.setEPCValue(Items.lava_bucket, 832);
		EPCDatabase.setEPCValue(Items.milk_bucket, 833);
		EPCDatabase.setEPCValue(Items.ender_pearl, 1024);
		EPCDatabase.setEPCValue(Items.emerald, 1024);
		EPCDatabase.setEPCValue(Items.compass, 1088);
		EPCDatabase.setEPCValue(Items.minecart, 1280);
		EPCDatabase.setEPCValue(Items.iron_helmet, 1280);
		EPCDatabase.setEPCValue(Items.furnace_minecart, 1288);
		EPCDatabase.setEPCValue(Items.chest_minecart, 1344);
		EPCDatabase.setEPCValue(Items.blaze_rod, 1536);
		EPCDatabase.setEPCValue(Items.ender_eye, 1792);
		EPCDatabase.setEPCValue(Items.golden_apple, 1944);
		EPCDatabase.setEPCValue(Items.gold_ingot, 2048);
		EPCDatabase.setEPCValue(Items.ghast_tear, 4096);
		EPCDatabase.setEPCValue(Items.diamond, 8192);
		EPCDatabase.setEPCValue(Items.diamond_shovel, 8200);
		EPCDatabase.setEPCValue(Items.diamond_sword, 16388);
		EPCDatabase.setEPCValue(Items.diamond_hoe, 16392);
		EPCDatabase.setEPCValue(Items.diamond_pickaxe, 24584);
		EPCDatabase.setEPCValue(Items.diamond_axe, 24584);
		EPCDatabase.setEPCValue(Items.diamond_boots, 32768);
		EPCDatabase.setEPCValue(Items.diamond_helmet, 40960);
		EPCDatabase.setEPCValue(Items.diamond_leggings, 57344);
		EPCDatabase.setEPCValue(Items.diamond_chestplate, 65536);
	}
	
	/**
	 * Loads ET's EPC values
	 */
	private static void loadEnergyTransformerEPCValues()
	{
		EPCDatabase.setEPCValue(EnergyBlockList.pixelCondenser, 42011);
	}

	private static void setBlockMetaEPCValue(Block block, int epc, int maximumMetadata)
	{
		for(int i = 0; i <= maximumMetadata; i++)
		{
			EPCDatabase.setEPCValue(block, epc, i);
		}
	}

	private static void setItemMetaEPCValue(Item item, int epc, int maximumMetadata)
	{
		for(int i = 0; i <= maximumMetadata; i++)
		{
			//Just a little check for Lapis Lazuli
			if(i == 3 && item == Items.dye)
			{
				EPCDatabase.setEPCValue(item, 128, i);
			}
			else
			{
				EPCDatabase.setEPCValue(item, epc, i);
			}
		}
	}
}