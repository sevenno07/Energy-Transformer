package energy.transformer.common.items;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Item list
 * 
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
		GameRegistry.registerItem(capsule, "capsule");
	}
}