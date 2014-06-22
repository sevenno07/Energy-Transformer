package energy.transformer.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import energy.transformer.common.achievements.EnergyAchievementList;
import energy.transformer.common.blocks.EnergyBlockList;
import energy.transformer.common.creativetabs.EnergyCTList;
import energy.transformer.common.epc.EnergyEPCValuesList;
import energy.transformer.common.events.EnergyEventHandler;
import energy.transformer.common.gui.GuiHandler;
import energy.transformer.common.items.EnergyItemList;
import energy.transformer.common.tileentity.EnergyTEList;
import energy.transformer.proxy.EnergyCommonProxy;
import energy.transformer.proxy.network.ChannelHandler;
import energy.transformer.proxy.network.PacketHandler;

/**
 * Main class of the mod Energy Transformer
 * 
 * @author sevenno07 ]:), Superloup10, utybo
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
		LOGGER.info("Loading creative tabs");
		EnergyCTList.loadCreativeTabs();

		LOGGER.info("Loading blocks");
		EnergyBlockList.loadBlocks();

		LOGGER.info("Loading items");
		EnergyItemList.loadItems();

		LOGGER.info("Loading achievement list");
		EnergyAchievementList.load();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		LOGGER.info("Registering Event Handler");
		FMLCommonHandler.instance().bus().register(new EnergyEventHandler());

		LOGGER.info("Loading tile entities");
		EnergyTEList.loadTileEntity();

		LOGGER.info("Registering GUI Handler");
		NetworkRegistry.INSTANCE.registerGuiHandler(this.instance, new GuiHandler());
		
		LOGGER.info("Registering Packet");
		//NetworkRegistry.INSTANCE.newChannel(this.MODID, new ChannelHandler(), new PacketHandler());
		
		LOGGER.info("Registering renders");
		proxy.registerRender();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LOGGER.info("Loading EPC values");
		EnergyEPCValuesList.loadEPCValues();
	}
}