package energy.transformer.common.creativetabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import energy.transformer.common.blocks.EnergyBlockList;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EnergyCTList
{
	public static CreativeTabs block;
	
	public static void loadCreativeTabs()
	{
		block = new CreativeTabsBlock("Blocks");
	}
}