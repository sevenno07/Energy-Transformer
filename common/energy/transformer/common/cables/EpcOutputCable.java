package energy.transformer.common.cables;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import energy.transformer.api.utils.CableHelper;
import energy.transformer.client.renders.Models;
import energy.transformer.common.blocks.EnergyTransformerGenericBlock;
import energy.transformer.proxy.EnergyClientProxy;

public class EpcOutputCable extends EnergyTransformerGenericBlock
{
	public EpcOutputCable()
	{
		super(Material.rock, "epcOutputCable", "epc_output_cable");
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata)
	{
		return new TileEpcOutputCable();
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
		return EnergyClientProxy.renderOutputCableID;
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
	
	@Override
	public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB axisalignedBB, List list, Entity entity)
	{
		Models.setCableLargeBaseHitbox(this);
		super.addCollisionBoxesToList(world, x, y, z, axisalignedBB, list, entity);
		for(ForgeDirection direction : ForgeDirection.VALID_DIRECTIONS)
		{
			if(CableHelper.canConnectWithSideCable(world, x, y, z, direction))
			{
				Models.setCableSideRegularHitbox(this, direction);
				super.addCollisionBoxesToList(world, x, y, z, axisalignedBB, list, entity);
			}
			if(CableHelper.canConnectWithSideEPCContainer(world, x, y, z, direction))
			{
				Models.setCableSideShortHitbox(this, direction);
				super.addCollisionBoxesToList(world, x, y, z, axisalignedBB, list, entity);
				Models.setCableSidePlugHitbox(this, direction);
				super.addCollisionBoxesToList(world, x, y, z, axisalignedBB, list, entity);
			}
		}
		this.setBlockBounds(0F, 0F, 0F, 1F, 1F, 1F);
	}
}