package energy.transformer.common.blocks.container.slot;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import energy.transformer.common.epc.IUpgrade;

public class SlotUpgrade extends Slot
{
	public SlotUpgrade(IInventory inventory, int id, int x, int y)
	{
		super(inventory, id, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return stack.getItem() != null && stack.getItem() instanceof IUpgrade;
	}
	
	@Override
	public int getSlotStackLimit()
	{
		return 1;
	}
}