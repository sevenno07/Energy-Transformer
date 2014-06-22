package energy.transformer.common.woldgenerator.biomes.structures;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class PERD extends WorldGenerator
{
	@Override
	public boolean generate(World world, Random random, int x, int y, int z)
	{
		for(int i = 0; i < 12; i++)
		{
			for(int j = 0; j < 12; j++)
			{
				for(int k = 0; k < 12; k++)
				{
					/*world.setBlock(x, y + k, z, Blocks.stone);
					world.setBlock(x + i, y + k, z, Blocks.stone);
					world.setBlock(x, y + k, z + j, Blocks.stone);*/
					world.setBlock(x + i, y + k, z + j, Blocks.stone);
				}
			}
		}

		for(int i = 1; i < 11; i++)
		{
			for(int j = 1; j < 11; j++)
			{
				for(int k = 1; k < 11; k++)
				{
					/*world.setBlock(x + 1, y + k, z + 1, Blocks.air);
					world.setBlock(x + 1 + i, y + k, z + 1, Blocks.air);
					world.setBlock(x + 1, y + k, z + 1 + j, Blocks.air);*/
					world.setBlock(x + 1 + i, y + k, z + 1 + j, Blocks.air);
				}
			}
		}
		return true;
	}
}