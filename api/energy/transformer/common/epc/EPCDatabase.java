package energy.transformer.common.epc;

import java.util.HashMap;
import java.util.List;

import energy.transformer.common.utils.UidUtils;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Class for the EPC values and the game mechanics using EPC
 * 
 * @author utybo
 */
public class EPCDatabase
{
	private static HashMap<List, Integer> epcDatabase = new HashMap<List, Integer>();

	/**
	 * Sets the EPC value of an item stack
	 * 
	 * @param stack
	 * @param epc
	 */
	public static void setEPCValue(ItemStack stack, int epc)
	{
		epcDatabase.put(UidUtils.getUID(new ItemStack(stack.getItem(), 1, stack.getItemDamage())), epc);
	}

	/**
	 * Sets the EPC value of an item and its metadata
	 * 
	 * @param item
	 * @param epc
	 * @param metadata
	 */
	public static void setEPCValue(Item item, int epc, int metadata)
	{
		epcDatabase.put(UidUtils.getUID(new ItemStack(item, 1, metadata)), epc);
	}

	/**
	 * Sets the EPC value of an item
	 * 
	 * @param item
	 * @param epc
	 */
	public static void setEPCValue(Item item, int epc)
	{
		setEPCValue(item, epc, 0);
	}

	/**
	 * Sets the EPC value of a block and its metadata
	 * 
	 * @param block
	 * @param epc
	 * @param metadata
	 */
	public static void setEPCValue(Block block, int epc, int metadata)
	{
		epcDatabase.put(UidUtils.getUID(new ItemStack(block, 1, metadata)), epc);
	}

	/**
	 * Sets the EPC value of a block
	 * 
	 * @param block
	 * @param epc
	 */
	public static void setEPCValue(Block block, int epc)
	{
		setEPCValue(block, epc, 0);
	}

	/**
	 * Gets the EPC value from an item stack
	 * 
	 * @param stack
	 * @return EPC of the item stack or 0 if unknown item stack
	 */
	public static int getEPCValue(ItemStack stack)
	{
		Integer l = epcDatabase.get(UidUtils.getUID(new ItemStack(stack.getItem(), 1, stack.getItemDamage())));
		if(l == null || l <= 0)
		{
			return 0;
		}
		else
		{
			return l;
		}
	}

	/**
	 * Gets the EPC value from an item and its metadata
	 * 
	 * @param item
	 * @param metadata
	 * @return EPC of the item or 0 if unknown item
	 */
	public static int getEPCValue(Item item, int metadata)
	{
		Integer l = epcDatabase.get(UidUtils.getUID(new ItemStack(item, 1, metadata)));
		if(l == null || l <= 0)
		{
			return 0;
		}
		else
		{
			return l;
		}
	}

	/**
	 * Gets the EPC value from a block and and its metadata
	 * 
	 * @param block
	 * @param metadata
	 * @return EPC of the item or 0 if unknown item
	 */
	public static int getEPCValue(Block block, int metadata)
	{
		Integer l = epcDatabase.get(UidUtils.getUID(new ItemStack(Item.getItemFromBlock(block), 1, metadata)));
		if(l == null || l <= 0)
		{
			return 0;
		}
		else
		{
			return l;
		}
	}
}