package energy.transformer.api.utils;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * This code is from iconmaster's mod AetherCraft. Modified a little bit by
 * utybo
 * 
 * @author iconmaster (and utybo)
 *
 */
public final class UidUtils
{
	/**
	 * Gets the List you can use to put a ItemStack in a hash.
	 * 
	 * @param item
	 * @return
	 */
	public static List getUID(ItemStack stack)
	{
		if(stack == null || stack.getItem() == null)
		{
			return null;
		}
		if(stack.getHasSubtypes() && stack.getItemDamage() != 32767)
		{
			return Arrays.asList(Item.itemRegistry.getIDForObject(stack.getItem()), stack.getItemDamage());
		}
		else
		{
			return Arrays.asList(Item.itemRegistry.getIDForObject(stack.getItem()), 0);
		}
	}

	/**
	 * Gets the ItemStack that a uid encodes for.
	 * 
	 * @param uid
	 * @return
	 */
	public static ItemStack getStackFromUid(List uid)
	{
		if(uid == null)
		{
			return null;
		}
		return new ItemStack((Item)Item.itemRegistry.getObjectById((Integer)uid.get(0)), 1, (Integer)uid.get(1));
	}
}
