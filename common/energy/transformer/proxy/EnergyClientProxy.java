package energy.transformer.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import energy.transformer.client.renders.RenderInputCable;
import energy.transformer.client.renders.RenderNormalCable;
import energy.transformer.client.renders.RenderOutputCable;

public class EnergyClientProxy extends EnergyCommonProxy
{
	public static int renderInputCableID, renderOutputCableID, renderCableID;
	@Override
	public void registerRender()
	{
		renderInputCableID = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(renderInputCableID, new RenderInputCable());
		
		renderOutputCableID = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(renderOutputCableID, new RenderOutputCable());
		
		renderCableID = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(renderCableID, new RenderNormalCable());
	}
}