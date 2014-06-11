package energy.transformer.common.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class EnergyCTList
{
	public static CreativeTabs block;
	public static CreativeTabs items;

	public static void loadCreativeTabs()
	{
		block = new CreativeTabsBlock("Blocks");
		items = new CreativeTabsItems("Items");
	}
}