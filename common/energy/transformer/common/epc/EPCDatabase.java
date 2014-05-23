package energy.transformer.common.epc;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EPCDatabase
{
	private static HashMap epcDatabase;

	/**
	 * Sets the EPC value from an item stack
	 * 
	 * @param stack
	 * @param epc
	 */
	public static void setEPCValue(ItemStack stack, int epc)
	{
		epcDatabase.put(new ItemStack(stack.getItem(), 1, stack.getItemDamage()), epc);
	}

	/**
	 * Sets the EPC value from an item and its metadata
	 * 
	 * @param item
	 * @param epc
	 * @param metadata
	 */
	public static void setEPCValue(Item item, int epc, int metadata)
	{
		epcDatabase.put(new ItemStack(item, 1, metadata), epc);
	}

	/**
	 * Sets the EPC value from a block and its metadata
	 * 
	 * @param block
	 * @param epc
	 * @param metadata
	 */
	public static void setEPCValue(Block block, int epc, int metadata)
	{
		epcDatabase.put(new ItemStack(Item.getItemFromBlock(block), 1, metadata), epc);
	}

	/**
	 * Gets the EPC value from an item stack
	 * 
	 * @param stack
	 * @return EPC of the item stack or 0 if unknown item stack
	 */
	public static int getEPCValue(ItemStack stack)
	{
		Object l = epcDatabase.get(new ItemStack(stack.getItem(), 1, stack.getItemDamage()));
		if(l == null || (Integer)l < 0)
		{
			return 0;
		}
		else
		{
			return (Integer)l;
		}
	}

	/**
	 * Gets the EPC value from an item and its metadata
	 * @param item
	 * @param metadata
	 * @return EPC of the item or 0 if unknown item
	 */
	public static int getEPCValue(Item item, int metadata)
	{
		Object l = epcDatabase.get(new ItemStack(item, 1, metadata));
		if(l == null || (Integer)l < 0)
		{
			return 0;
		}
		else
		{
			return (Integer)l;
		}
	}

	/**
	 * Gets the EPC value from a block and and its metadata
	 * @param block
	 * @param metadata
	 * @return EPC of the item or 0 if unknown item
	 */
	public static int getEPCValue(Block block, int metadata)
	{
		Object l = epcDatabase.get(new ItemStack(Item.getItemFromBlock(block), 1, metadata));
		if(l == null || (Integer)l < 0)
		{
			return 0;
		}
		else
		{
			return (Integer)l;
		}
	}

}
