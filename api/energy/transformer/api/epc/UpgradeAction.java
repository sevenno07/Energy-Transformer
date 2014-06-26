package energy.transformer.api.epc;


public class UpgradeAction
{
	private EnumActionType type;
	private int multiplier;

	public UpgradeAction(EnumActionType type, int multiplier)
	{
		this.setType(type);
		this.setMultiplier(multiplier);
	}

	public void setType(EnumActionType type)
	{
		this.type = type;
	}

	public void setMultiplier(int multiplier)
	{
		this.multiplier = multiplier;
	}
	
	public EnumActionType getType()
	{
		return this.type;
	}
	
	public int getMultiplier()
	{
		return this.multiplier;
	}
}
