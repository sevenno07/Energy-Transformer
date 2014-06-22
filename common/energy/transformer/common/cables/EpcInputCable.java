package energy.transformer.common.cables;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import energy.transformer.common.blocks.EnergyTransformerGenericBlock;
import energy.transformer.proxy.EnergyClientProxy;

public class EpcInputCable extends EnergyTransformerGenericBlock
{
	public EpcInputCable()
	{
		super(Material.rock, "inputCable", "input_cable");
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata)
	{
		return new TileEpcInputCable();
	}

	@Override
	public boolean hasTileEntity(int metadata)
	{
		return true;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getRenderType()
	{
		return EnergyClientProxy.renderInputCableID;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side)
	{
		return true;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata)
	{
		return Blocks.iron_block.getIcon(0, 0);
	}

}