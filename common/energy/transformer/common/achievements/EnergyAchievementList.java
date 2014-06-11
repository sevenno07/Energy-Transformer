package energy.transformer.common.achievements;

import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import energy.transformer.common.items.EnergyItemList;

public class EnergyAchievementList
{
	public static Achievement craftCapsule;
	public static AchievementPage energyTransformerPage;

	public static void load()
	{
		loadAchievements();
		loadAchievementsPage();
	}

	private static void loadAchievementsPage()
	{
		energyTransformerPage = new AchievementPage("Energy Transformer", craftCapsule);
	}

	private static void loadAchievements()
	{
		craftCapsule = new Achievement("EnergyTransformerCraftCapsule", "craftCapsule", 0, 0, new ItemStack(EnergyItemList.capsule, 1, 0), null).registerStat();
	}
}