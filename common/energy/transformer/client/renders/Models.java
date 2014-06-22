package energy.transformer.client.renders;

import energy.transformer.common.EnergyTransformer;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;

public final class Models
{
	private static final Tessellator tesselator = Tessellator.instance;

	public static void renderNormalCable(IBlockAccess world, int x, int y, int z, Block block, RenderBlocks renderer)
	{
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
		renderer.setRenderBounds(0.40F, 0.4F, 0.40F, 0.60F, 0.6F, 0.60F);
		renderer.renderStandardBlock(block, x, y, z);
		renderer.clearOverrideBlockTexture();
	}
	
	public static void renderInputCable(IBlockAccess world, int x, int y, int z, Block block, RenderBlocks renderer)
	{
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.obsidian));
		renderer.setRenderBounds(0.40F, 0.4F, 0.40F, 0.60F, 0.6F, 0.60F);
		renderer.renderStandardBlock(block, x, y, z);
		renderer.clearOverrideBlockTexture();
	}
	
	public static void renderOutputCable(IBlockAccess world, int x, int y, int z, Block block, RenderBlocks renderer)
	{
		renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.lapis_block));
		renderer.setRenderBounds(0.40F, 0.4F, 0.40F, 0.60F, 0.6F, 0.60F);
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
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.60F, 0.4F, 0.40F, 0.40F, 0F, 0.60F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case UP:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.40F, 0.6F, 0.40F, 0.60F, 1F, 0.60F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case EAST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.60F, 0.4F, 0.40F, 1F, 0.6F, 0.60F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case WEST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.40F, 0.4F, 0.60F, 0F, 0.6F, 0.40F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case NORTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.60F, 0.4F, 0.40F, 0.40F, 0.6F, 0F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case SOUTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.40F, 0.4F, 0.60F, 0.60F, 0.6F, 1F);
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
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.60F, 0.4F, 0.40F, 0.40F, 0.2F, 0.60F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.obsidian));
			renderer.setRenderBounds(0.60F, 0.2F, 0.4F, 0.40F, 0F, 0.60F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case UP:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.40F, 0.6F, 0.40F, 0.60F, 0.8F, 0.60F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.obsidian));
			renderer.setRenderBounds(0.40F, 0.8F, 0.40F, 0.60F, 1F, 0.60F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case EAST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.60F, 0.4F, 0.40F, 0.8F, 0.6F, 0.60F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.obsidian));
			renderer.setRenderBounds(0.8F, 0.4F, 0.40F, 1F, 0.6F, 0.60F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case WEST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.40F, 0.4F, 0.60F, 0.2F, 0.6F, 0.40F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.obsidian));
			renderer.setRenderBounds(0.2F, 0.4F, 0.60F, 0F, 0.6F, 0.40F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case NORTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.60F, 0.4F, 0.40F, 0.40F, 0.6F, 0.2F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.obsidian));
			renderer.setRenderBounds(0.60F, 0.4F, 0.20F, 0.40F, 0.6F, 0F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case SOUTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.40F, 0.4F, 0.60F, 0.60F, 0.6F, 0.8F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.obsidian));
			renderer.setRenderBounds(0.40F, 0.4F, 0.8F, 0.60F, 0.6F, 1F);
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
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.60F, 0.4F, 0.40F, 0.40F, 0.2F, 0.60F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.lapis_block));
			renderer.setRenderBounds(0.60F, 0.2F, 0.4F, 0.40F, 0F, 0.60F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case UP:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.40F, 0.6F, 0.40F, 0.60F, 0.8F, 0.60F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.lapis_block));
			renderer.setRenderBounds(0.40F, 0.8F, 0.40F, 0.60F, 1F, 0.60F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case EAST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.60F, 0.4F, 0.40F, 0.8F, 0.6F, 0.60F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.lapis_block));
			renderer.setRenderBounds(0.8F, 0.4F, 0.40F, 1F, 0.6F, 0.60F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case WEST:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.40F, 0.4F, 0.60F, 0.2F, 0.6F, 0.40F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.lapis_block));
			renderer.setRenderBounds(0.2F, 0.4F, 0.60F, 0F, 0.6F, 0.40F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case NORTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.60F, 0.4F, 0.40F, 0.40F, 0.6F, 0.2F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.lapis_block));
			renderer.setRenderBounds(0.60F, 0.4F, 0.20F, 0.40F, 0.6F, 0F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
		}
			break;
		case SOUTH:
		{
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.iron_block));
			renderer.setRenderBounds(0.40F, 0.4F, 0.60F, 0.60F, 0.6F, 0.8F);
			renderer.renderStandardBlock(block, x, y, z);
			renderer.setOverrideBlockTexture(renderer.getBlockIcon(Blocks.lapis_block));
			renderer.setRenderBounds(0.40F, 0.4F, 0.8F, 0.60F, 0.6F, 1F);
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
