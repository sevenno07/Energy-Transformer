package energy.transformer.common.woldgenerator.dimensions;

import energy.transformer.common.configs.EnergyProperties;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class EnergyWorldProvider extends WorldProvider
{
	@Override
	public String getDimensionName()
	{
		return "PERD";
	}
	
	@Override
	protected void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.desert, 0.0F);
		this.dimensionId = EnergyProperties.dimensionID;
	}
	
	@Override
	public IChunkProvider createChunkGenerator()
	{
		return new ChunkProvider();
	}
}