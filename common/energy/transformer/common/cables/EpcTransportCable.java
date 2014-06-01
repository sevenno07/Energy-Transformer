package energy.transformer.common.cables;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import energy.transformer.common.blocks.EnergyTransformerGenericBlock;

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
}
