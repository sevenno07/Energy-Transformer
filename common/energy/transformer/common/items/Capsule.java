package energy.transformer.common.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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

public class Capsule extends EnergyTransformerGenericItem
{
	private String[] type = new String[] {"epcCapsule1k", "epcCapsule2k", "epcCapsule5k", "epcCapsule10k", "epcCapsule20k", "epcCapsule50k", "epcCapsule100k", "epcCapsule200k", "epcCapsule500k", "epcCapsule1m", "epcCapsule2m", "epcCapsule5m", "epcCapsule10m", "epcCapsule20m", "epcCapsule50m", "epcCapsule100m"};

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
			IconArray[i] = iconregister.registerIcon("modtutoriel:" + type[i]);

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

	public void onCreated(ItemStack stack, World world, EntityPlayer player)
	{
		stack.stackTagCompound = new NBTTagCompound();
		stack.stackTagCompound.setInteger(NAME_NBT_CURRENT_EPC, 0);
		stack.stackTagCompound.setInteger(NAME_NBT_MAX_EPC, getMaximumEPCFromStack(stack));
	}

	public void onUpdate(ItemStack stack, World world, Entity entity, int par4int, boolean par5boolean)
	{
		if(stack.stackTagCompound != null)
		{
			if(getNBTCurrentEPC(stack) > getNBTCurrentEPC(stack))
			{
				stack.stackTagCompound.setInteger(NAME_NBT_CURRENT_EPC, getNBTMaximumEPC(stack));
			}
		}
	}

	/**
	 * Get the maximum amount of EPC from a metadata
	 * 
	 * @param metadata
	 * @return The maximum amount of EPC that can be stored in the capsule
	 */
	public int getMaximumEPC(int metadata)
	{
		return epc[metadata];
	}

	/**
	 * Gets the maximum epc from NBT
	 * 
	 * @param metadata
	 */
	public int getNBTMaximumEPC(ItemStack stack)
	{
		return stack.stackTagCompound.getInteger(NAME_NBT_MAX_EPC);
	}

	/**
	 * Get the maximum amount of EPC from an item stack
	 * 
	 * @param stack
	 * @return The maximum amount of EPC that can be stored in the capsule
	 */
	public int getMaximumEPCFromStack(ItemStack stack)
	{
		return epc[stack.getItemDamage()];
	}

	/**
	 * Gets the current epc from NBT
	 * 
	 * @param metadata
	 */
	public int getNBTCurrentEPC(ItemStack stack)
	{
		return stack.stackTagCompound.getInteger(NAME_NBT_CURRENT_EPC);
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		list.add(StatCollector.translateToLocal("energytransformer.maximumEPC") + " : " + getMaximumEPCFromStack(stack));
	}
}
