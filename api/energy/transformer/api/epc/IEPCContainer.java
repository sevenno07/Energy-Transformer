package energy.transformer.api.epc;

/**
 * Tile entities must implement this if they have an EPC Storage
 * 
 * @author utybo
 * 
 */
public interface IEPCContainer
{
	/**
	 * Gets the amount of EPC stored in the block
	 * 
	 * @return The amount of EPC stored in the block
	 */
	public int getContainerEPC();

	/**
	 * Sets the amount of EPC stored in the block
	 * 
	 * @param epc
	 *            The amount of EPC
	 */
	public void setContainerEPC(int epc);

	/**
	 * Checks if the block has EPC in it
	 * 
	 * @return true if it has EPC, false if it doesn't
	 */
	public boolean hasEPC();
}