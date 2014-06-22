package energy.transformer.client.renders;

import energy.transformer.client.utils.ModelHelper;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.init.Blocks;

public final class InventoryModels
{

	public static void renderInputCable(Block block, int metadata, int modelId, RenderBlocks renderer)
	{
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.obsidian));
		renderer.setRenderBounds(0.40F, 0.4F, 0.40F, 0.60F, 0.6F, 0.60F);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.clearOverrideBlockTexture();
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
		renderer.setRenderBounds(0.60F, 0.4F, 0.40F, 0.40F, 0.6F, 0.2F);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.obsidian));
		renderer.setRenderBounds(0.60F, 0.4F, 0.20F, 0.40F, 0.6F, 0F);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.clearOverrideBlockTexture();
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
		renderer.setRenderBounds(0.40F, 0.4F, 0.60F, 0.60F, 0.6F, 1F);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.clearOverrideBlockTexture();
	}

	public static void renderOutputCable(Block block, int metadata, int modelId, RenderBlocks renderer)
	{
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.lapis_block));
		renderer.setRenderBounds(0.40F, 0.4F, 0.40F, 0.60F, 0.6F, 0.60F);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.clearOverrideBlockTexture();
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
		renderer.setRenderBounds(0.60F, 0.4F, 0.40F, 0.40F, 0.6F, 0.2F);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.lapis_block));
		renderer.setRenderBounds(0.60F, 0.4F, 0.20F, 0.40F, 0.6F, 0F);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.clearOverrideBlockTexture();
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
		renderer.setRenderBounds(0.40F, 0.4F, 0.60F, 0.60F, 0.6F, 1F);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.clearOverrideBlockTexture();
	}

	public static void renderNormalCable(Block block, int metadata, int modelId, RenderBlocks renderer)
	{
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
		renderer.setRenderBounds(0.40F, 0.4F, 0.40F, 0.60F, 0.6F, 0.60F);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.setRenderBounds(0.60F, 0.4F, 0.40F, 0.40F, 0.6F, 0F);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.setRenderBounds(0.40F, 0.4F, 0.60F, 0.60F, 0.6F, 1F);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.clearOverrideBlockTexture();
	}

}
