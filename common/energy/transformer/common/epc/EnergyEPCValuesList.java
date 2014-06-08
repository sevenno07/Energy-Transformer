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
		EPCDatabase.setEPCValue(EnergyBlockList.pixelCondenser, 42011);
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
		// TODO Aller sur http://tekkitclassic.wikia.com/wiki/EMC
		/*EPCDatabase.setEPCValue(Items.iron_shovel, 130);
		EPCDatabase.setEPCValue(Items.iron_pickaxe, 388);
		EPCDatabase.setEPCValue(Items.iron_axe, 388);
		EPCDatabase.setEPCValue(Items.flint_and_steel, 144);
		EPCDatabase.setEPCValue(Items.apple, 32);
		EPCDatabase.setEPCValue(Items.bow, 51);
		EPCDatabase.setEPCValue(Items.arrow, 25);
		EPCDatabase.setEPCValue(Items.coal, 16);
		EPCDatabase.setEPCValue(Items.diamond, 2048);
		EPCDatabase.setEPCValue(Items.iron_ingot, 128);
		EPCDatabase.setEPCValue(Items.gold_ingot, 512);
		EPCDatabase.setEPCValue(Items.iron_sword, 258);
		EPCDatabase.setEPCValue(Items.wooden_sword, 3);
		EPCDatabase.setEPCValue(Items.wooden_shovel, 3);
		EPCDatabase.setEPCValue(Items.wooden_pickaxe, 5);
		EPCDatabase.setEPCValue(Items.wooden_axe, 5);
		EPCDatabase.setEPCValue(Items.stone_sword, 5);
		EPCDatabase.setEPCValue(Items.stone_shovel, 4);
		EPCDatabase.setEPCValue(Items.stone_pickaxe, 8);
		EPCDatabase.setEPCValue(Items.stone_axe, 8);
		EPCDatabase.setEPCValue(Items.diamond_sword, 4097);
		EPCDatabase.setEPCValue(Items.diamond_shovel, 2050);
		EPCDatabase.setEPCValue(Items.diamond_pickaxe, 6146);
		EPCDatabase.setEPCValue(Items.diamond_axe, 6146);
		EPCDatabase.setEPCValue(Items.stick, 1);
		EPCDatabase.setEPCValue(Items.bowl, 3);
		EPCDatabase.setEPCValue(Items.mushroom_stew, 35);
		EPCDatabase.setEPCValue(Items.golden_sword, 1025);
		EPCDatabase.setEPCValue(Items.golden_shovel, 514);
		EPCDatabase.setEPCValue(Items.golden_pickaxe, 1538);
		EPCDatabase.setEPCValue(Items.golden_axe, 1538);
		EPCDatabase.setEPCValue(Items.string, 16);
		EPCDatabase.setEPCValue(Items.feather, 8);
		EPCDatabase.setEPCValue(Items.gunpowder, 32);
		EPCDatabase.setEPCValue(Items.wooden_hoe, 4);
		EPCDatabase.setEPCValue(Items.stone_hoe, 6);
		EPCDatabase.setEPCValue(Items.iron_hoe, 518);
		EPCDatabase.setEPCValue(Items.diamond_hoe, 4098);
		EPCDatabase.setEPCValue(Items.golden_hoe, 1026);
		EPCDatabase.setEPCValue(Items.wheat_seeds, 4);
		EPCDatabase.setEPCValue(Items.wheat, 16);
		EPCDatabase.setEPCValue(Items.bread, 48);
		EPCDatabase.setEPCValue(Items.leather_helmet, 40);
		EPCDatabase.setEPCValue(Items.leather_chestplate, 64);
		EPCDatabase.setEPCValue(Items.leather_leggings, 56);
		EPCDatabase.setEPCValue(Items.leather_boots, 32);
		EPCDatabase.setEPCValue(Items.iron_helmet, 640);
		EPCDatabase.setEPCValue(Items.iron_chestplate, 1024);
		EPCDatabase.setEPCValue(Items.iron_leggings, 896);
		EPCDatabase.setEPCValue(Items.iron_boots, 512);
		EPCDatabase.setEPCValue(Items.diamond_helmet, 10240);
		EPCDatabase.setEPCValue(Items.diamond_chestplate, 16384);
		EPCDatabase.setEPCValue(Items.diamond_leggings, 14336);
		EPCDatabase.setEPCValue(Items.diamond_boots, 8192);
		EPCDatabase.setEPCValue(Items.golden_helmet, 2560);
		EPCDatabase.setEPCValue(Items.golden_chestplate, 4096);
		EPCDatabase.setEPCValue(Items.golden_leggings, 3584);
		EPCDatabase.setEPCValue(Items.golden_boots, 2048);
		EPCDatabase.setEPCValue(Items.flint, 8);
		EPCDatabase.setEPCValue(Items.porkchop, 16);
		EPCDatabase.setEPCValue(Items.cooked_porkchop, 32);
		EPCDatabase.setEPCValue(Items.painting, 16);
		EPCDatabase.setEPCValue(Items.golden_apple, 488, 0);
		EPCDatabase.setEPCValue(Items.golden_apple, 36864, 1);
		EPCDatabase.setEPCValue(Items.sign, 3);
		EPCDatabase.setEPCValue(Items.wooden_door, 6);
		EPCDatabase.setEPCValue(Items.bucket, 384);
		EPCDatabase.setEPCValue(Items.water_bucket, 400);
		EPCDatabase.setEPCValue(Items.lava_bucket, 416);
		EPCDatabase.setEPCValue(Items.minecart, 640);
		EPCDatabase.setEPCValue(Items.saddle, 384);
		EPCDatabase.setEPCValue(Items.iron_door, 768);
		EPCDatabase.setEPCValue(Items.redstone, 8);
		EPCDatabase.setEPCValue(Items.snowball, 4);
		EPCDatabase.setEPCValue(Items.boat, 5);
		EPCDatabase.setEPCValue(Items.leather, 8);
		EPCDatabase.setEPCValue(Items.milk_bucket, 416);
		EPCDatabase.setEPCValue(Items.brick, 8);
		EPCDatabase.setEPCValue(Items.clay_ball, 4);
		EPCDatabase.setEPCValue(Items.reeds, 8);
		EPCDatabase.setEPCValue(Items.paper, 16);
		EPCDatabase.setEPCValue(Items.book, 56);
		EPCDatabase.setEPCValue(Items.slime_ball, 8);
		EPCDatabase.setEPCValue(Items.egg, 4);
		EPCDatabase.setEPCValue(Items.compass, 512);
		EPCDatabase.setEPCValue(Items.fishing_rod, 35);
		EPCDatabase.setEPCValue(Items.clock, 520);
		EPCDatabase.setEPCValue(Items.glowstone_dust, 64);
		EPCDatabase.setEPCValue(Items.fish, 32);
		EPCDatabase.setEPCValue(Items.cooked_fished, 48);
		setItemMetaEPCValue(Items.dye, 16, 15);
		EPCDatabase.setEPCValue(Items.bone, 8);
		EPCDatabase.setEPCValue(Items.sugar, 4);
		EPCDatabase.setEPCValue(Items.cake, 128);
		EPCDatabase.setEPCValue(Items.bed, 51);
		EPCDatabase.setEPCValue(Items.cookie, 48);
		EPCDatabase.setEPCValue(Items.shears, 256);
		EPCDatabase.setEPCValue(Items.melon, 16);
		EPCDatabase.setEPCValue(Items.pumpkin_seeds, 32);
		EPCDatabase.setEPCValue(Items.melon_seeds, 32);
		EPCDatabase.setEPCValue(Items.beef, 16);
		EPCDatabase.setEPCValue(Items.cooked_beef, 32);
		EPCDatabase.setEPCValue(Items.chicken, 16);
		EPCDatabase.setEPCValue(Items.cooked_chicken, 32);
		EPCDatabase.setEPCValue(Items.rotten_flesh, 8);
		EPCDatabase.setEPCValue(Items.ender_pearl, 64);
		EPCDatabase.setEPCValue(Items.blaze_rod, 32);
		EPCDatabase.setEPCValue(Items.ghast_tear, 64);
		EPCDatabase.setEPCValue(Items.gold_nugget, 57);
		EPCDatabase.setEPCValue(Items.nether_wart, 32);
		EPCDatabase.setEPCValue(Items.glass_bottle, 24);
		EPCDatabase.setEPCValue(Items.spider_eye, 8);
		EPCDatabase.setEPCValue(Items.fermented_spider_eye, 16);
		EPCDatabase.setEPCValue(Items.blaze_powder, 16);
		EPCDatabase.setEPCValue(Items.magma_cream, 32);
		EPCDatabase.setEPCValue(Items.brewing_stand, 44);
		EPCDatabase.setEPCValue(Items.cauldron, 896);
		EPCDatabase.setEPCValue(Items.ender_eye, 48);
		EPCDatabase.setEPCValue(Items.speckled_melon, 73);
		EPCDatabase.setEPCValue(Items.fire_charge, 32);
		EPCDatabase.setEPCValue(Items.emerald, 4096);
		EPCDatabase.setEPCValue(Items.item_frame, 16);
		EPCDatabase.setEPCValue(Items.flower_pot, 32);
		EPCDatabase.setEPCValue(Items.carrot, 64);
		EPCDatabase.setEPCValue(Items.potato, 64);
		EPCDatabase.setEPCValue(Items.baked_potato, 128);
		EPCDatabase.setEPCValue(Items.poisonous_potato, 256);
		EPCDatabase.setEPCValue(Items.golden_carrot, 4160);
		EPCDatabase.setEPCValue(Items.carrot_on_a_stick, 83);
		EPCDatabase.setEPCValue(Items.nether_star, 150000);
		EPCDatabase.setEPCValue(Items.pumpkin_pie, 48);
		EPCDatabase.setEPCValue(Items.netherbrick, 16);
		EPCDatabase.setEPCValue(Items.quartz, 128);
		EPCDatabase.setEPCValue(Items.lead, 72);
		EPCDatabase.setEPCValue(Items.name_tag, 128);
		EPCDatabase.setEPCValue(Items.iron_horse_armor, 640);
		EPCDatabase.setEPCValue(Items.golden_horse_armor, 2560);
		EPCDatabase.setEPCValue(Items.diamond_horse_armor, 10240);*/

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