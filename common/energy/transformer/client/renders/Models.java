package energy.transformer.client.renders;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;
import energy.transformer.common.EnergyTransformer;

public final class Models
{
	public static final float bottom = 0F;
	public static final float top = 1F;
	public static final float thicknessA = 0.35F;
	public static final float containerLinkThicknessA = 0.2F;

	public static final float thicknessB = top - thicknessA;
	public static final float containerLinkThicknessB = top - containerLinkThicknessA;

	public static final Block cableBlock = Blocks.iron_block;
	public static final Block inputBlock = Blocks.obsidian;
	public static final Block outputBlock = Blocks.lapis_block;

	public static void renderNormalCable(IBlockAccess world, int x, int y, int z, Block block, RenderBlocks renderer)
	{
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
		renderer.setRenderBounds(thicknessA, thicknessA, thicknessA, thicknessB, thicknessB, thicknessB);
		renderer.renderStandardBlock(block, x, y, z);
		renderer.clearOverrideBlockTexture();
	}

	public static void renderInputCable(IBlockAccess world, int x, int y, int z, Block block, RenderBlocks renderer)
	{
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(inputBlock));
		renderer.setRenderBounds(thicknessA, thicknessA, thicknessA, thicknessB, thicknessB, thicknessB);
		renderer.renderStandardBlock(block, x, y, z);
		renderer.clearOverrideBlockTexture();
	}

	public static void renderOutputCable(IBlockAccess world, int x, int y, int z, Block block, RenderBlocks renderer)
	{
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(outputBlock));
		renderer.setRenderBounds(thicknessA, thicknessA, thicknessA, thicknessB, thicknessB, thicknessB);
		renderer.renderStandardBlock(block, x, y, z);
		renderer.clearOverrideBlockTexture();
	}

	// WORK IN PROGRESS
	public static void renderNormalSideCable(IBlockAccess world, int x, int y, int z, Block block, RenderBlocks renderer, ForgeDirection direction)
	{
		switch(direction)
		{
		case DOWN:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessB, thicknessA, thicknessA, thicknessA, bottom, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case UP:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessA, thicknessB, thicknessA, thicknessB, top, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case EAST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessB, thicknessA, thicknessA, top, thicknessB, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case WEST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessA, thicknessA, thicknessB, bottom, thicknessB, thicknessA);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case NORTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessB, thicknessA, thicknessA, thicknessA, thicknessB, bottom);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case SOUTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessA, thicknessA, thicknessB, thicknessB, thicknessB, top);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case UNKNOWN:
		{
			EnergyTransformer.LOGGER.error("Looks like a mod is trying to troll Energy Transformer's model! This is an important programming bug!");
		}
			break;
		}
	}

	public static void renderInputSideCable(IBlockAccess world, int x, int y, int z, Block block, RenderBlocks renderer, ForgeDirection direction)
	{
		switch(direction)
		{
		case DOWN:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessB, thicknessA, thicknessA, thicknessA, containerLinkThicknessA, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(inputBlock));
			renderer.setRenderBounds(thicknessB, containerLinkThicknessA, thicknessA, thicknessA, bottom, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case UP:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessA, thicknessB, thicknessA, thicknessB, containerLinkThicknessB, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(inputBlock));
			renderer.setRenderBounds(thicknessA, containerLinkThicknessB, thicknessA, thicknessB, top, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case EAST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessB, thicknessA, thicknessA, containerLinkThicknessB, thicknessB, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(inputBlock));
			renderer.setRenderBounds(containerLinkThicknessB, thicknessA, thicknessA, top, thicknessB, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case WEST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessA, thicknessA, thicknessB, containerLinkThicknessA, thicknessB, thicknessA);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(inputBlock));
			renderer.setRenderBounds(containerLinkThicknessA, thicknessA, thicknessB, bottom, thicknessB, thicknessA);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case NORTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessB, thicknessA, thicknessA, thicknessA, thicknessB, containerLinkThicknessA);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(inputBlock));
			renderer.setRenderBounds(thicknessB, thicknessA, containerLinkThicknessA, thicknessA, thicknessB, bottom);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case SOUTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessA, thicknessA, thicknessB, thicknessB, thicknessB, containerLinkThicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(inputBlock));
			renderer.setRenderBounds(thicknessA, thicknessA, containerLinkThicknessB, thicknessB, thicknessB, top);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case UNKNOWN:
		{
			EnergyTransformer.LOGGER.error("Looks like a mod is trying to troll Energy Transformer's model! This is an important programming bug!");
		}
			break;
		}
	}

	public static void renderOutputSideCable(IBlockAccess world, int x, int y, int z, Block block, RenderBlocks renderer, ForgeDirection direction)
	{
		switch(direction)
		{
		case DOWN:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessB, thicknessA, thicknessA, thicknessA, containerLinkThicknessA, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(outputBlock));
			renderer.setRenderBounds(thicknessB, containerLinkThicknessA, thicknessA, thicknessA, bottom, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case UP:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessA, thicknessB, thicknessA, thicknessB, containerLinkThicknessB, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(outputBlock));
			renderer.setRenderBounds(thicknessA, containerLinkThicknessB, thicknessA, thicknessB, top, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case EAST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessB, thicknessA, thicknessA, containerLinkThicknessB, thicknessB, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(outputBlock));
			renderer.setRenderBounds(containerLinkThicknessB, thicknessA, thicknessA, top, thicknessB, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case WEST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessA, thicknessA, thicknessB, containerLinkThicknessA, thicknessB, thicknessA);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(outputBlock));
			renderer.setRenderBounds(containerLinkThicknessA, thicknessA, thicknessB, bottom, thicknessB, thicknessA);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case NORTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessB, thicknessA, thicknessA, thicknessA, thicknessB, containerLinkThicknessA);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(outputBlock));
			renderer.setRenderBounds(thicknessB, thicknessA, containerLinkThicknessA, thicknessA, thicknessB, bottom);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case SOUTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessA, thicknessA, thicknessB, thicknessB, thicknessB, containerLinkThicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(outputBlock));
			renderer.setRenderBounds(thicknessA, thicknessA, containerLinkThicknessB, thicknessB, thicknessB, top);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case UNKNOWN:
		{
			EnergyTransformer.LOGGER.error("Looks like a mod is trying to troll Energy Transformer's model! This is an important programming bug!");
		}
			break;
		}
	}
}
