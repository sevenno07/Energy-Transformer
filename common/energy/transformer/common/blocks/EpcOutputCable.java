package energy.transformer.common.blocks;

import energy.transformer.common.cables.TileEpcInputCable;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class EpcOutputCable extends EnergyTransformerGenericBlock
{

	protected EpcOutputCable()
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
