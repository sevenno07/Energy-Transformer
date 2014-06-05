package energy.transformer.common.events;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
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
}
