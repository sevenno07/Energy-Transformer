package energy.transformer.common.cables;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import energy.transformer.common.blocks.EnergyTransformerGenericBlock;

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
}
