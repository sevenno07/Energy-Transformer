package energy.transformer.common.epc;

/**
 * Action types that can be used by an upgrade
 * 
 * @author utybo
 *
 */
public enum EnumActionType
{
	/**
	 * Modifies the cost multiplier of the Pixel Condenser. The default value is
	 * 3. A cobblestone's raw value is 1. Without any modification to the
	 * multiplier, the conversion cost from EPC to cobblestone will be 3 EPCs.
	 */
	MODIFYCOSTMUTLIPLIER,

	/**
	 * If an {@link energy.transformer.epc.IEPCContainer} contains an upgrade
	 * with this type, EPC cables will not be able to connect to the container.
	 */
	UNPLUGGABLECABLES;
}
