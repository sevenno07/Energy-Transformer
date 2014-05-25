package energy.transformer.common.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import energy.transformer.common.EnergyTransformer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import net.minecraft.util.StringUtils;
import net.minecraft.world.World;

/**
 * Capsule class. Does not allow the creation of custom capsules though.
 * 
 * @author utybo
 * 
 */
public class Capsule extends EnergyTransformerGenericItem implements IEPCStorage
{
	private String[] type = new String[] {"epcCapsule1k", "epcCapsule2k", "epcCapsule5k", "epcCapsule10k", "epcCapsule20k", "epcCapsule50k", "epcCapsule100k", "epcCapsule200k", "epcCapsule500k", "epcCapsule1m", "epcCapsule2m", "epcCapsule5m", "epcCapsule10m", "epcCapsule20m", "epcCapsule50m", "epcCapsule100m"};

	/**
	 * The amount of epc that can be held by the capsule. Relative to the
	 * metadata of the capsule item
	 */
	private int[] epc = new int[] {1000, 2000, 5000, 10000, 20000, 50000, 100000, 200000, 500000, 1000000, 2000000, 5000000, 10000000, 20000000, 50000000, 100000000};

	private IIcon[] IconArray;
	private static final String NAME_NBT_MAX_EPC = "maximumEPC";
	private static final String NAME_NBT_CURRENT_EPC = "currentEPC";

	protected Capsule()
	{
		super();
		this.setHasSubtypes(true);
		this.maxStackSize = 1;
	}

	public int getMetadata(int metadata)
	{
		return metadata;
	}

	public void registerIcons(IIconRegister iconregister)
	{
		IconArray = new IIcon[type.length];
		for(int i = 0; i < type.length; i++)
		{
			IconArray[i] = iconregister.registerIcon(EnergyTransformer.MODID + ":" + type[i]);

		}

	}

	public String getUnlocalizedName(ItemStack stack)
	{
		int metadata = stack.getItemDamage();
		if(metadata > type.length || metadata < 0)
		{
			metadata = 0;
		}
		return super.getUnlocalizedName() + "." + type[metadata];
	}

	@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player)
	{
		stack.stackTagCompound = new NBTTagCompound();
		stack.stackTagCompound.setInteger(NAME_NBT_CURRENT_EPC, 0);
		stack.stackTagCompound.setInteger(NAME_NBT_MAX_EPC, getMaximumEPC(stack));
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4int, boolean par5boolean)
	{
		if(stack.stackTagCompound != null)
		{
			// Make sure the current EPC amount is correct
			if(getCurrentEPC(stack) > getCurrentEPC(stack))
			{
				stack.stackTagCompound.setInteger(NAME_NBT_CURRENT_EPC, this.getMaximumEPC(stack));
			}
			if(getCurrentEPC(stack) < 0)
			{
				stack.stackTagCompound.setInteger(NAME_NBT_CURRENT_EPC, 0);
			}
		}
	}

	@Override
	public int getMaximumEPC(int metadata)
	{
		if(metadata > epc.length)
		{
			return epc[metadata];
		}
		else
		{
			return 0;
		}

	}

	@Override
	public int getMaximumEPC(ItemStack stack)
	{
		return epc[stack.getItemDamage()];
	}

	@Override
	public int getCurrentEPC(ItemStack stack)
	{
		return stack.stackTagCompound.getInteger(NAME_NBT_CURRENT_EPC);
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		// Example :[ Current EPC : ??? EPC out of ??? EPC ] (will be displayed without [])
		list.clear();
		list.add(EnumChatFormatting.RESET + "" + EnumChatFormatting.GRAY + StatCollector.translateToLocal("energytransformer.currentEPC") + " : " + EnumChatFormatting.WHITE + getCurrentEPC(stack) + " " + StatCollector.translateToLocal("energytransformer.EPC") + EnumChatFormatting.GRAY + StatCollector.translateToLocal("energytransformer.outOfEPC") + " " + EnumChatFormatting.WHITE + getMaximumEPC(stack) + StatCollector.translateToLocal("energytransformer.maximumEPC") + EnumChatFormatting.RESET);
	}

	@Override
	public boolean canAddEPC(ItemStack stack, int amountOfEPC)
	{
		return amountOfEPC + getCurrentEPC(stack) > getMaximumEPC(stack) ? true : false;
	}

	@Override
	public void addToCurrentEPC(ItemStack stack, int amountOfEPC)
	{
		setCurrentEPC(stack, getCurrentEPC(stack) + amountOfEPC);
	}

	@Override
	public void setCurrentEPC(ItemStack stack, int amountOfEPC)
	{
		stack.stackTagCompound.setInteger(NAME_NBT_CURRENT_EPC, amountOfEPC);

	}

}
