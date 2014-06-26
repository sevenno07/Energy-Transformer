package energy.transformer.api.epc;

import net.minecraft.item.ItemStack;

/**
 * Any upgrade must implement this
 * 
 * @author utybo
 *
 */
public interface IUpgrade
{
	/**
	 * Gets an instance of the class {@link energy.transformer.common.epc.UpgradeAction}
	 * @param stack
	 */
	public UpgradeAction getPassiveAction(ItemStack stack);
}
