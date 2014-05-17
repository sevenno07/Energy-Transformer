package energy.transformer.common.blocks;

import energy.transformer.common.EnergyTransformer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class EnergyTransformerGenericBlock extends Block {

	protected EnergyTransformerGenericBlock(Material material, String blockName, String textureName) {
		super(material);
		this.setBlockName(blockName);
		this.setBlockTextureName(EnergyTransformer.MODID.toLowerCase() + ":" + textureName);
	}
	protected EnergyTransformerGenericBlock(Material material, String blockName, String textureName, float miningResistance, int lightLevel) {
		super(material);
		this.setBlockName(blockName);
		this.setBlockTextureName(EnergyTransformer.MODID.toLowerCase() + ":" + textureName);
		this.setHardness(miningResistance);
		this.setLightLevel(lightLevel);
	}

}