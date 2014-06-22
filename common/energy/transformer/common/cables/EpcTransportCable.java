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

public class EpcTransportCable extends EnergyTransformerGenericBlock
{
	public EpcTransportCable()
	{
		super(Material.rock, "epcCable", "epc_cable");
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata)
	{
		return new TileEpcTransportCable();
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

	@SideOnly(Side.CLIENT)
	@Override
	public int getRenderType()
	{
		return EnergyClientProxy.renderCableID;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side)
	{
		return true;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int metadata)
	{
		return Blocks.iron_block.getIcon(0, 0);
	}
}