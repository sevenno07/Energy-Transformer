package energy.transformer.common.items;

import net.minecraft.item.Item;

public class EnergyItemList
{
	public static Item capsule;
	public static Item upgrade;
	
	public static void loadItems()
	{
		capsule = new Capsule("epcCapsule", null);
	}
}