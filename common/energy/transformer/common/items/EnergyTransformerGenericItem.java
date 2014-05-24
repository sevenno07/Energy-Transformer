package energy.transformer.common.items;

import net.minecraft.item.Item;
/**
 * Generic item class. Any item class from Energy Transformer extends this class
 * @author matthieu
 *
 */
public class EnergyTransformerGenericItem extends Item
{

	protected EnergyTransformerGenericItem(String itemName, String textureName)
	{
		super();
		this.setUnlocalizedName(itemName);
		this.setTextureName(textureName);
	}

	public EnergyTransformerGenericItem()
	{
		super();
	}

}
