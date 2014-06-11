package energy.transformer.common.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import energy.transformer.common.items.EnergyItemList;

public class CreativeTabsItems extends CreativeTabs
{
	public CreativeTabsItems(String name)
	{
		super(name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		return EnergyItemList.capsule;
	}
}