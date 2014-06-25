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
		renderer.setRenderBounds(Models.linkThicknessA, Models.linkThicknessA, Models.linkThicknessA, Models.linkThicknessB, Models.linkThicknessB, Models.linkThicknessB);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.clearOverrideBlockTexture();
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
		renderer.setRenderBounds(Models.thicknessB, Models.thicknessA, Models.thicknessA, Models.thicknessA, Models.thicknessB, Models.containerLinkSizeA);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.obsidian));
		renderer.setRenderBounds(Models.linkThicknessB, Models.linkThicknessA, Models.containerLinkSizeA, Models.linkThicknessA, Models.linkThicknessB, Models.bottom);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.clearOverrideBlockTexture();
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
		renderer.setRenderBounds(Models.thicknessA, Models.thicknessA, Models.thicknessB, Models.thicknessB, Models.thicknessB, Models.top);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.clearOverrideBlockTexture();
	}

	public static void renderOutputCable(Block block, int metadata, int modelId, RenderBlocks renderer)
	{
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.lapis_block));
		renderer.setRenderBounds(Models.linkThicknessA, Models.linkThicknessA, Models.linkThicknessA, Models.linkThicknessB, Models.linkThicknessB, Models.linkThicknessB);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.clearOverrideBlockTexture();
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
		renderer.setRenderBounds(Models.thicknessB, Models.thicknessA, Models.thicknessA, Models.thicknessA, Models.thicknessB, Models.containerLinkSizeA);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.lapis_block));
		renderer.setRenderBounds(Models.linkThicknessB, Models.linkThicknessA, Models.containerLinkSizeA, Models.linkThicknessA, Models.linkThicknessB, Models.bottom);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.clearOverrideBlockTexture();
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
		renderer.setRenderBounds(Models.thicknessA, Models.thicknessA, Models.thicknessB, Models.thicknessB, Models.thicknessB, Models.top);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.clearOverrideBlockTexture();
	}

	public static void renderNormalCable(Block block, int metadata, int modelId, RenderBlocks renderer)
	{
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
		renderer.setRenderBounds(Models.thicknessA, Models.thicknessA, Models.thicknessA, Models.thicknessB, Models.thicknessB, Models.thicknessB);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.setRenderBounds(Models.thicknessB, Models.thicknessA, Models.thicknessA, Models.thicknessA, Models.thicknessB, Models.bottom);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.setRenderBounds(Models.thicknessA, Models.thicknessA, Models.thicknessB, Models.thicknessB, Models.thicknessB, Models.top);
		ModelHelper.renderNormalInventory(renderer, block, metadata);
		renderer.clearOverrideBlockTexture();
	}

}
