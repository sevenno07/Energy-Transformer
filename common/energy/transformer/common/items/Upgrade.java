package energy.transformer.common.items;

import energy.transformer.api.epc.EnumActionType;
import energy.transformer.api.epc.IUpgrade;
import energy.transformer.api.epc.UpgradeAction;

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