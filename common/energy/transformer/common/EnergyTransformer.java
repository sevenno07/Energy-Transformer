package energy.transformer.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import energy.transformer.common.blocks.EnergyBlockList;
import energy.transformer.proxy.EnergyCommonProxy;

@Mod(modid = EnergyTransformer.MODID, name = "Energy-Transformer", version = "@VERSION@")
public class EnergyTransformer
{
	public static final String MODID = "Energy-Transformer";
	@SidedProxy(clientSide = "energy.transformer.proxy.EnergyClientProxy", serverSide = "energy.transformer.proxy.EnergyCommonProxy")
	public static EnergyCommonProxy proxy;
	
	@Instance("Energy_Transformer")
	public static EnergyTransformer instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		EnergyBlockList.loadBlocks();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}