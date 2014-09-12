package energy.transformer.client.renders;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import energy.transformer.api.utils.CableHelper;
import energy.transformer.proxy.EnergyClientProxy;

public class RenderInputCable implements ISimpleBlockRenderingHandler
{

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer)
	{
		InventoryModels.renderInputCable(block, metadata, modelId, renderer);
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer)
	{
		Models.renderInputCable(world, x, y, z, block, renderer);
		for(ForgeDirection direction : ForgeDirection.VALID_DIRECTIONS)
		{
			if(CableHelper.canConnectWithSideCable(world, x, y, z, direction))
				Models.renderNormalSideCable(world, x, y, z, block, renderer, direction);
			if(CableHelper.canConnectWithSideEPCContainer(world, x, y, z, direction))
				Models.renderInputSideCable(world, x, y, z, block, renderer, direction);
		}
		return true;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId)
	{
		return true;
	}

	@Override
	public int getRenderId()
	{
		return EnergyClientProxy.renderInputCableID;
	}

}
