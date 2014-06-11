package energy.transformer.common.items;

import net.minecraft.item.Item;
import energy.transformer.common.EnergyTransformer;
import energy.transformer.common.creativetabs.EnergyCTList;

/**
 * Generic item class. Any item class from Energy Transformer extends this class
 * 
 * @author matthieu
 * 
 */
public class EnergyTransformerGenericItem extends Item
{
	protected EnergyTransformerGenericItem(String itemName, String textureName)
	{
		super();
		this.setUnlocalizedName(itemName);
		this.setTextureName(EnergyTransformer.MODID.toLowerCase() + ":" + textureName);
		this.setCreativeTab(EnergyCTList.items);
	}

	public EnergyTransformerGenericItem()
	{
		super();
	}
}