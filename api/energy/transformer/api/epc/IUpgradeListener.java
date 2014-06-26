package energy.transformer.common.epc;

/**
 * This interface is quite special. Anything that is upgradable implements this.
 * The other components such as the cables will use the method
 * {@link #hasUpgrade(EnumActionType)} to check if they can connect to the tile
 * entity, and  other stuff like that. Using
 * {@link net.minecraft.inventory.IInventory#getStackInSlot(int)} is
 * recommended, but not required.
 * 
 * @author utybo
 *
 */
public interface IUpgradeListener
{
	public boolean hasUpgrade(EnumActionType type);
}
