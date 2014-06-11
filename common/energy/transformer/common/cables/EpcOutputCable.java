package energy.transformer.common.cables;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import energy.transformer.common.blocks.EnergyTransformerGenericBlock;

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
}