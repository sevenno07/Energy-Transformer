package energy.transformer.common.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import energy.transformer.common.EnergyTransformer;
import energy.transformer.common.creativetabs.EnergyCTList;
import energy.transformer.common.tileentity.TileEntityPixelCondenser;

public class PixelCondenser extends BlockContainer
{
	protected PixelCondenser()
	{
		super(Material.rock);
		this.setCreativeTab(EnergyCTList.block);
	}

	@Override
	public Item getItemDropped(int item, Random rand, int metadata)
	{
		return Item.getItemFromBlock(this);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register)
	{
		blockIcon = register.registerIcon(EnergyTransformer.MODID.toLowerCase() + ":pixel_condenser");
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
	{
		if(world.isRemote)
		{
			return true;
		}
		else
		{
			player.openGui(EnergyTransformer.instance, 0, world, x, y, z);
			return true;
		}
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata)
	{
		return new TileEntityPixelCondenser();
	}
}