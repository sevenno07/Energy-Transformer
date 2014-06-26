package energy.transformer.common.events;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import energy.transformer.api.epc.EPCDatabase;
import energy.transformer.api.epc.IEPCStorage;
import energy.transformer.common.achievements.EnergyAchievementList;
import energy.transformer.common.items.EnergyItemList;

public class EnergyEventHandler
{
	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event)
	{
		if(event.crafting == new ItemStack(EnergyItemList.capsule, 1, 0))
		{
			event.player.triggerAchievement(EnergyAchievementList.craftCapsule);
		}
	}

	@SubscribeEvent
	public void onTooltip(ItemTooltipEvent event)
	{
		ItemStack stack = event.itemStack;
		Item item = stack.getItem();
		if(stack != null)
		{
			if(item instanceof IEPCStorage)
			{
				IEPCStorage capsule = (IEPCStorage)item;
				if(capsule.usesEnergyTransformerTootltipModel(event.itemStack))
				{
					event.toolTip.add(EnumChatFormatting.RESET.toString() + EnumChatFormatting.GRAY.toString() + "Current EPC : " + EnumChatFormatting.WHITE.toString() + capsule.getCurrentEPC(stack) + " EPC" + EnumChatFormatting.RESET.toString());
					event.toolTip.add(EnumChatFormatting.RESET.toString() + EnumChatFormatting.GRAY.toString() + "Maximum EPC : " + EnumChatFormatting.WHITE.toString() + capsule.getMaximumEPC(stack) + " EPC" + EnumChatFormatting.RESET.toString());
				}
			}
		}
		event.toolTip.add("");
		event.toolTip.add(EnumChatFormatting.RESET.toString() + EnumChatFormatting.GRAY.toString() + "Raw EPC value : " + EnumChatFormatting.WHITE.toString() + EPCDatabase.getEPCValue(stack) + EnumChatFormatting.RESET.toString());
	}

}