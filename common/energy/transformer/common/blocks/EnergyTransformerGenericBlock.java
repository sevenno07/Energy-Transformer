package energy.transformer.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import energy.transformer.common.EnergyTransformer;

/**
 * Generic block class. Any block class from Energy Transformer extends this
 * class
 * 
 * @author utybo
 * 
 */
public class EnergyTransformerGenericBlock extends Block
{

	protected EnergyTransformerGenericBlock(Material material, String blockName, String textureName)
	{
		super(material);
		this.setBlockName(blockName);
		this.setBlockTextureName(EnergyTransformer.MODID.toLowerCase() + ":" + textureName);
	}

}