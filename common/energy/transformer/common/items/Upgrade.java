package energy.transformer.common.items;

import energy.transformer.common.epc.EnumActionType;
import energy.transformer.common.epc.IUpgrade;
import energy.transformer.common.epc.UpgradeAction;

public class Upgrade extends EnergyTransformerGenericItem implements IUpgrade
{
	private UpgradeAction u = new UpgradeAction(EnumActionType.MODIFYCOSTMUTLIPLIER, 0);
	public Upgrade()
	{
		super("upgrade", "upgrade");
	}

	@Override
	public UpgradeAction getPassiveAction()
	{
		return u;
	}
}