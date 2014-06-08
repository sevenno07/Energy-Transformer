package energy.transformer.common.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import energy.transformer.common.EnergyTransformer;
import energy.transformer.common.creativetabs.EnergyCTList;
import energy.transformer.common.tileentity.TileEntityPixelCondenser;

public class PixelCondenser extends BlockContainer
{
	
	private IIcon PCIconTop;
	private IIcon PCIconBot;
	private IIcon PCIconFront;
	
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
	
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {
        return side == 1 ? this.PCIconTop : (side == 0 ? this.PCIconBot : (side != metadata ? this.blockIcon : this.PCIconFront));
    }
	
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase Entity, ItemStack Item)
    {
        int l = MathHelper.floor_double((double)(Entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
        	world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        if (l == 1)
        {
        	world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }

        if (l == 2)
        {
        	world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }

        if (l == 3)
        {
        	world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register)
	{
		blockIcon = register.registerIcon("energy_transformer:pcblock_side");
		PCIconTop = register.registerIcon("energy_transformer:pcblock_top");
		PCIconBot = register.registerIcon("energy_transformer:pcblock_bot");
		PCIconFront = register.registerIcon("energy_transformer:pcblock_front");
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