package energy.transformer.common.items;

import net.minecraft.item.ItemStack;
import energy.transformer.api.epc.EnumActionType;
import energy.transformer.api.epc.IUpgrade;
import energy.transformer.api.epc.UpgradeAction;

public class Upgrade extends EnergyTransformerGenericItem implements IUpgrade
{
	public Upgrade()
	{
		super("upgrade", "upgrade");
	}

	@Override
	public UpgradeAction getPassiveAction(ItemStack stack)
	{
		return new UpgradeAction(EnumActionType.MODIFYCOSTMUTLIPLIER, 0);
	}
}