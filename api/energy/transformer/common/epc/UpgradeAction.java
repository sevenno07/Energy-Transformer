package energy.transformer.common.epc;

/**
 * This is the class that links an upgrade with its action. An instance of this
 * class requires a type (from
 * {@link energy.transformer.common.epc.EnumActionType})
 * 
 * @author utybo
 *
 */
public class UpgradeAction
{
	/**
	 * The type of the action
	 */
	private EnumActionType type;

	/**
	 * The mutliplier and/or a value that represents the amount of Type applied.
	 * Can be 0.
	 */
	private int multiplier;

	public UpgradeAction(EnumActionType type, int multiplier)
	{
		this.setType(type);
		this.setMultiplier(multiplier);
	}

	/**
	 * Sets the type
	 * 
	 * @param type
	 */
	public void setType(EnumActionType type)
	{
		this.type = type;
	}

	/**
	 * Sets the multiplier
	 * 
	 * @param multiplier
	 */
	public void setMultiplier(int multiplier)
	{
		this.multiplier = multiplier;
	}

	/**
	 * @return The type
	 */
	public EnumActionType getType()
	{
		return this.type;
	}

	/**
	 * @return The multiplier
	 */
	public int getMultiplier()
	{
		return this.multiplier;
	}
}
