package energy.transformer.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import energy.transformer.client.renders.RenderInputCable;
import energy.transformer.client.renders.RenderNormalCable;
import energy.transformer.client.renders.RenderOutputCable;
import energy.transformer.common.cables.TileEpcTransportCable;

public class EnergyClientProxy extends EnergyCommonProxy
{
	public static int renderInputCableID, renderOutputCableID, renderCableID;
	public static int tesrrender;
	@Override
	public void registerRender()
	{
		/*
		renderInputCableID = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(renderInputCableID, new RenderInputCable());
		
		renderOutputCableID = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(renderOutputCableID, new RenderOutputCable());
		
		renderCableID = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(renderCableID, new RenderNormalCable());*/
		
		tesrrender = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(new TESRInventoryRenderer());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEpcTransportCable.class, new TileEntityCableRender());
	}
}