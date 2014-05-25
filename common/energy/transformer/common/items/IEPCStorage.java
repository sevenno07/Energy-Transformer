package energy.transformer.common.items;

import net.minecraft.item.ItemStack;

/**
 * Anything that can store EPC needs to implement this<br/>
 * Please note that <strong>implementing this interface does not set <i>any</i>
 * EPC value</strong>
 * 
 * @author utybo
 * 
 */
public interface IEPCStorage
{
	/**
	 * Get the maximum amount of EPC that can be stored
	 * 
	 * @param metadata
	 * @return The maximum amount of EPC that can be stored in the capsule (or 0
	 *         in case of unknown metadata, not needed if the item does not have
	 *         metadatas)
	 */
	public int getMaximumEPC(int metadata);

	/**
	 * Gets the maximum amount of EPC that can be stored (from an item stack)
	 * 
	 * @param stack
	 * @return The maximum amount of EPC that can be stored in the capsule.
	 */
	public int getMaximumEPC(ItemStack stack);

	/**
	 * Gets the current amount of EPC stored
	 * 
	 * @param stack
	 */
	public int getCurrentEPC(ItemStack stack);

	/**
	 * Specifies if the storage is able to store an amount of epc
	 * 
	 * @param stack
	 * @param amountOfEPC
	 */
	public boolean canAddEPC(ItemStack stack, int amountOfEPC);

	/**
	 * Adds the specified amount of epc to the storage. Should be used with
	 * {@link #canAddEPC(int)}
	 * 
	 * @param stack
	 * @param amountOfEPC
	 */
	public void addToCurrentEPC(ItemStack stack, int amountOfEPC);

	/**
	 * Sets the current epc value to the specified amount of epc
	 * 
	 * @param stack
	 * @param amountOfEPC
	 */
	public void setCurrentEPC(ItemStack stack, int amountOfEPC);
}
