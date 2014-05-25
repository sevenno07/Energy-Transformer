package energy.transformer.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import energy.transformer.common.blocks.EnergyBlockList;
import energy.transformer.common.creativetabs.EnergyCTList;
import energy.transformer.common.epc.EnergyEPCValuesList;
import energy.transformer.common.items.EnergyItemList;
import energy.transformer.proxy.EnergyCommonProxy;

/**
 * Main class of the mod Energy Transformer
 * 
 * @author Superloup10, sevenno07, utybo
 * 
 */
@Mod(modid = EnergyTransformer.MODID, name = "Energy-Transformer", version = "@VERSION@")
public class EnergyTransformer
{
	/**
	 * Energy Transformer's Logger (log4j)
	 */
	public static final Logger LOGGER = LogManager.getLogger("Energy-Transformer");

	/**
	 * The modid of Energy Transformer
	 */
	public static final String MODID = "Energy_Transformer";
	/**
	 * Proxy
	 */
	@SidedProxy(clientSide = "energy.transformer.proxy.EnergyClientProxy", serverSide = "energy.transformer.proxy.EnergyCommonProxy")
	public static EnergyCommonProxy proxy;

	@Instance("Energy_Transformer")
	public static EnergyTransformer instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		LOGGER.info("Loading blocks");
		EnergyBlockList.loadBlocks();
		LOGGER.info("Loading items");
		EnergyItemList.loadItems();
		
		EnergyCTList.loadCreativeTabs();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LOGGER.info("Loading EPC values");
		EnergyEPCValuesList.loadEPCValues();
	}
}