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
 * @author sevenno07 ]:), Superloup10, utybo
 * 
 */
@Mod(modid = EnergyTransformer.MODID, name = "Energy-Transformer", version = "@VERSION@")
//sevenno07: Dite moi svp pour quoi le mod ID a des majuscule svp :s, je croyai qu'il dever étre que en minuscule, je fais la remarque car en faite je créer le dossier resource pour les textures x).
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