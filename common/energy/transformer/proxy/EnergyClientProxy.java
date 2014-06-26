package energy.transformer.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import energy.transformer.client.renders.RenderInputCable;
import energy.transformer.client.renders.RenderNormalCable;
import energy.transformer.client.renders.RenderOutputCable;
import energy.transformer.client.renders.TESRInventoryRenderer;
import energy.transformer.client.renders.TileEntityCableRender;
import energy.transformer.client.renders.TESRInventoryRenderer.TESRIndex;
import energy.transformer.common.blocks.EnergyBlockList;
import energy.transformer.common.cables.TileEpcInputCable;
import energy.transformer.common.cables.TileEpcOutputCable;
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
		TESRInventoryRenderer.blockByTESR.put(new TESRIndex(EnergyBlockList.epcCable, 0), new TileEntityCableRender());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEpcInputCable.class, new TileEntityCableRender());
		TESRInventoryRenderer.blockByTESR.put(new TESRIndex(EnergyBlockList.epcInputCable, 0), new TileEntityInputCableRender());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEpcOutputCable.class, new TileEntityCableRender());
		TESRInventoryRenderer.blockByTESR.put(new TESRIndex(EnergyBlockList.epcCable, 0), new TileEntityOutputCableRender());
	}
}