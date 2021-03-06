package energy.transformer.api.epc;

import net.minecraft.item.ItemStack;

/**
 * Anything that can store EPC needs to implement this<br/>
 * Please note that <strong>implementing this interface does not set <i>any</i>
 * EPC value</strong>
 * 
 * Another thing : The game may crash thanks to weird NBT issues. See the Capsule from ET to see how to fix it.
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
	 *         any metadata)
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
	 * Specifies if the storage is able to remove an amount of epc
	 * 
	 * @param stack
	 * @param amountOfEPC
	 */
	public boolean canRemoveEPC(ItemStack stack, int amountOfEPC);

	/**
	 * Adds the specified amount of epc to the storage. Should be used with
	 * {@link #canAddEPC(int)}
	 * 
	 * @param stack
	 * @param amountOfEPC
	 */
	public void addToCurrentEPC(ItemStack stack, int amountOfEPC);

	/**
	 * Removes the specified amount of epc to the storage. Must be used with
	 * {@link #canAddEPC(int)}
	 * 
	 * @param stack
	 * @param amountOfEPC
	 */
	public void removeToCurrentEPC(ItemStack stack, int amountOfEPC);

	/**
	 * Sets the current epc value to the specified amount of epc
	 * 
	 * @param stack
	 * @param amountOfEPC
	 */
	public void setCurrentEPC(ItemStack stack, int amountOfEPC);

	/**
	 * This method is used by ET to define whether the capsule uses ET's default
	 * Capsule Tootltip or not
	 */
	public boolean usesEnergyTransformerTootltipModel(ItemStack stack);
}