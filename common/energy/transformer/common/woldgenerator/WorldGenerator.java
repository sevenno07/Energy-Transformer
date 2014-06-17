package energy.transformer.common.woldgenerator;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import energy.transformer.common.woldgenerator.biomes.structures.PERD;

public class WorldGenerator implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId)
		{
		case 0: this.generateSurface(world, chunkX * 16, chunkZ * 16, random);
		}
	}

	private void generateSurface(World world, int x, int z, Random random)
	{
		new PERD().generate(world, random, 0, 4, 0);
	}
}