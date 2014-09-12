package energy.transformer.client.renders;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;
import static energy.transformer.common.EnergyTransformer.LOGGER;

public final class Models
{
	public static final float bottom = 0F;
	public static final float top = 1F;
	public static final float thicknessA = 0.35F;
	public static final float containerLinkSizeA = 0.15F;
	public static final float linkThicknessA = 0.3F;
	public static final float linkThicknessB = top - linkThicknessA;
	public static final float thicknessB = top - thicknessA;
	public static final float containerLinkSizeB = top - containerLinkSizeA;

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
		renderer.setRenderBounds(linkThicknessA, linkThicknessA, linkThicknessA, linkThicknessB, linkThicknessB, linkThicknessB);
		renderer.renderStandardBlock(block, x, y, z);
		renderer.clearOverrideBlockTexture();
	}

	public static void renderOutputCable(IBlockAccess world, int x, int y, int z, Block block, RenderBlocks renderer)
	{
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(outputBlock));
		renderer.setRenderBounds(linkThicknessA, linkThicknessA, linkThicknessA, linkThicknessB, linkThicknessB, linkThicknessB);
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
			LOGGER.error("Looks like a mod is trying to troll Energy Transformer's model! This is an important programming bug!");
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
			renderer.setRenderBounds(thicknessB, thicknessA, thicknessA, thicknessA, containerLinkSizeA, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(inputBlock));
			renderer.setRenderBounds(linkThicknessB, containerLinkSizeA, linkThicknessA, linkThicknessA, bottom, linkThicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case UP:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessA, thicknessB, thicknessA, thicknessB, containerLinkSizeB, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(inputBlock));
			renderer.setRenderBounds(linkThicknessA, containerLinkSizeB, linkThicknessA, linkThicknessB, top, linkThicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case EAST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessB, thicknessA, thicknessA, containerLinkSizeB, thicknessB, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(inputBlock));
			renderer.setRenderBounds(containerLinkSizeB, linkThicknessA, linkThicknessA, top, linkThicknessB, linkThicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case WEST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessA, thicknessA, thicknessB, containerLinkSizeA, thicknessB, thicknessA);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(inputBlock));
			renderer.setRenderBounds(containerLinkSizeA, linkThicknessA, linkThicknessB, bottom, linkThicknessB, linkThicknessA);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case NORTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessB, thicknessA, thicknessA, thicknessA, thicknessB, containerLinkSizeA);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(inputBlock));
			renderer.setRenderBounds(linkThicknessB, linkThicknessA, containerLinkSizeA, linkThicknessA, linkThicknessB, bottom);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case SOUTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessA, thicknessA, thicknessB, thicknessB, thicknessB, containerLinkSizeB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(inputBlock));
			renderer.setRenderBounds(linkThicknessA, linkThicknessA, containerLinkSizeB, linkThicknessB, linkThicknessB, top);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case UNKNOWN:
		{
			LOGGER.error("Looks like a mod is trying to troll Energy Transformer's model! This is an important programming bug!");
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
			renderer.setRenderBounds(thicknessB, thicknessA, thicknessA, thicknessA, containerLinkSizeA, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(outputBlock));
			renderer.setRenderBounds(linkThicknessB, containerLinkSizeA, linkThicknessA, linkThicknessA, bottom, linkThicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case UP:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessA, thicknessB, thicknessA, thicknessB, containerLinkSizeB, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(outputBlock));
			renderer.setRenderBounds(linkThicknessA, containerLinkSizeB, linkThicknessA, linkThicknessB, top, linkThicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case EAST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessB, thicknessA, thicknessA, containerLinkSizeB, thicknessB, thicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(outputBlock));
			renderer.setRenderBounds(containerLinkSizeB, linkThicknessA, linkThicknessA, top, linkThicknessB, linkThicknessB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case WEST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessA, thicknessA, thicknessB, containerLinkSizeA, thicknessB, thicknessA);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(outputBlock));
			renderer.setRenderBounds(containerLinkSizeA, linkThicknessA, linkThicknessB, bottom, linkThicknessB, linkThicknessA);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case NORTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessB, thicknessA, thicknessA, thicknessA, thicknessB, containerLinkSizeA);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(outputBlock));
			renderer.setRenderBounds(linkThicknessB, linkThicknessA, containerLinkSizeA, linkThicknessA, linkThicknessB, bottom);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case SOUTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(cableBlock));
			renderer.setRenderBounds(thicknessA, thicknessA, thicknessB, thicknessB, thicknessB, containerLinkSizeB);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(outputBlock));
			renderer.setRenderBounds(linkThicknessA, linkThicknessA, containerLinkSizeB, linkThicknessB, linkThicknessB, top);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case UNKNOWN:
			LOGGER.error("Looks like a mod is trying to troll Energy Transformer's model! This is an important programming bug!");
			break;
		}
	}

	public static void setCableLargeBaseHitbox(Block cable)
	{
		cable.setBlockBounds(linkThicknessA, linkThicknessA, linkThicknessA, linkThicknessB, linkThicknessB, linkThicknessB);
	}

	public static void setCableRegularBaseHitbox(Block cable)
	{
		cable.setBlockBounds(thicknessA, thicknessA, thicknessA, thicknessB, thicknessB, thicknessB);
	}

	public static void setCableSideRegularHitbox(Block cable, ForgeDirection direction)
	{
		switch(direction)
		{
		case DOWN:
			cable.setBlockBounds(thicknessA, bottom, thicknessB, thicknessB, thicknessA, thicknessA);
			break;
		case EAST:
			cable.setBlockBounds(thicknessB, thicknessA, thicknessA, top, thicknessB, thicknessB);
			break;
		case NORTH:
			cable.setBlockBounds(thicknessB, thicknessA, thicknessA, thicknessA, thicknessB, bottom);
			break;
		case SOUTH:
			cable.setBlockBounds(thicknessA, thicknessA, thicknessB, thicknessB, thicknessB, top);
			break;
		case UP:
			cable.setBlockBounds(thicknessA, thicknessB, thicknessA, thicknessB, top, thicknessB);
			break;
		case WEST:
			cable.setBlockBounds(thicknessA, thicknessA, thicknessB, bottom, thicknessB, thicknessA);
			break;
		default:
			break;
		}
	}

	public static void setCableSideShortHitbox(Block cable, ForgeDirection direction)
	{
		switch(direction)
		{
		case DOWN:
			cable.setBlockBounds(thicknessB, thicknessA, thicknessA, thicknessA, containerLinkSizeA, thicknessB);
			break;
		case EAST:
			cable.setBlockBounds(thicknessB, thicknessA, thicknessA, containerLinkSizeB, thicknessB, thicknessB);
			break;
		case NORTH:
			cable.setBlockBounds(thicknessB, thicknessA, thicknessA, thicknessA, thicknessB, containerLinkSizeA);
			break;
		case SOUTH:
			cable.setBlockBounds(thicknessA, thicknessA, thicknessB, thicknessB, thicknessB, containerLinkSizeB);
			break;
		case UP:
			cable.setBlockBounds(thicknessA, thicknessB, thicknessA, thicknessB, containerLinkSizeB, thicknessB);
			break;
		case WEST:
			cable.setBlockBounds(thicknessA, thicknessA, thicknessB, containerLinkSizeA, thicknessB, thicknessA);
			break;
		default:
			break;
		}
	}

	public static void setCableSidePlugHitbox(Block cable, ForgeDirection direction)
	{
		switch(direction)
		{
		case DOWN:
			cable.setBlockBounds(linkThicknessB, containerLinkSizeA, linkThicknessA, linkThicknessA, bottom, linkThicknessB);
			break;
		case EAST:
			cable.setBlockBounds(containerLinkSizeB, linkThicknessA, linkThicknessA, top, linkThicknessB, linkThicknessB);
			break;
		case NORTH:
			cable.setBlockBounds(linkThicknessB, linkThicknessA, containerLinkSizeA, linkThicknessA, linkThicknessB, bottom);
			break;
		case SOUTH:
			cable.setBlockBounds(linkThicknessB, linkThicknessB, top, linkThicknessA, linkThicknessA, containerLinkSizeB);
			break;
		case UP:
			cable.setBlockBounds(linkThicknessB, top, linkThicknessB, linkThicknessA, containerLinkSizeB, linkThicknessA);
			break;
		case WEST:
			cable.setBlockBounds(containerLinkSizeA, linkThicknessA, linkThicknessB, bottom, linkThicknessB, linkThicknessA);
			break;
		default:
			break;
		}
	}
}
