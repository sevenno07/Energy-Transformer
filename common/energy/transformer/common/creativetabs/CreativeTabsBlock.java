package energy.transformer.common.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import energy.transformer.common.blocks.EnergyBlockList;

public class CreativeTabsBlock extends CreativeTabs
{
	public CreativeTabsBlock(String name)
	{
		super(name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(EnergyBlockList.pixelCondenser);
	}
}