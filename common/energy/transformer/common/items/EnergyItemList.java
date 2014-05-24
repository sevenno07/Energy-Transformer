package energy.transformer.common.items;

import net.minecraft.item.Item;

/**
 * Item list
 * @author Superloup10
 *
 */
public class EnergyItemList
{
	public static Item capsule;
	public static Item upgrade;
	
	/**
	 * Loads items and registers them
	 */
	public static void loadItems()
	{
		capsule = new Capsule();
	}
}