package energy.transformer.common.items;

import net.minecraft.item.ItemStack;
import energy.transformer.common.epc.EnumActionType;
import energy.transformer.common.epc.IUpgrade;
import energy.transformer.common.epc.UpgradeAction;

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