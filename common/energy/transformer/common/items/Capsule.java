package energy.transformer.common.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import energy.transformer.common.EnergyTransformer;
import energy.transformer.common.epc.IEPCStorage;

/**
 * Capsule class. Does not allow the creation of custom capsules though.<br/>
 * 
 * @see {@link IEPCStorage} (interface for the creation of custom capsules and
 *      EPC storages)
 * @author utybo
 */
public class Capsule extends EnergyTransformerGenericItem implements IEPCStorage
{
	private String[] type = new String[] {"epcCapsule1k", "epcCapsule2k", "epcCapsule5k", "epcCapsule10k", "epcCapsule20k", "epcCapsule50k", "epcCapsule100k", "epcCapsule200k", "epcCapsule500k", "epcCapsule1m", "epcCapsule2m", "epcCapsule5m", "epcCapsule10m", "epcCapsule20m", "epcCapsule50m", "epcCapsule100m"};

	/**
	 * The amount of EPC that can be stored in the capsule. Relative to the
	 * metadata of the capsule item
	 */
	private int[] epc = new int[] {1000, 2000, 5000, 10000, 20000, 50000, 100000, 200000, 500000, 1000000, 2000000, 5000000, 10000000, 20000000, 50000000, 100000000};

	private IIcon[] iconArray;
	private static final String NAME_NBT_MAX_EPC = "maximumEPC";
	private static final String NAME_NBT_CURRENT_EPC = "currentEPC";

	protected Capsule()
	{
		super("capsule", "capsule");
		this.setHasSubtypes(true);
		this.maxStackSize = 1;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs creativeTabs, List list)
	{
		for(int i = 0; i < 16; ++i)
		{
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int icon)
	{
		int j = MathHelper.clamp_int(icon, 0, 15);
		return this.iconArray[j];
	}
	
	@Override
	public void registerIcons(IIconRegister iconregister)
	{
		iconArray = new IIcon[type.length];
		for(int i = 0; i < type.length; i++)
		{
			iconArray[i] = iconregister.registerIcon(EnergyTransformer.MODID + ":" + type[i]);
		}
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		int i = MathHelper.clamp_int(stack.getItemDamage(), 0, 15);
		return super.getUnlocalizedName() + "." + type[i];
	}

	@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player)
	{
		this.fixNullNBT(stack);
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4int, boolean par5boolean)
	{
		if(stack.stackTagCompound != null)
		{
			// Make sure the current EPC amount is correct
			if(getCurrentEPC(stack) > getCurrentEPC(stack))
			{
				stack.stackTagCompound.setInteger("currentEPC", this.getMaximumEPC(stack));
			}
			if(getCurrentEPC(stack) < 0)
			{
				stack.stackTagCompound.setInteger("currentEPC", 0);
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
		if(stack.stackTagCompound == null)this.fixNullNBT(stack);
		return stack.stackTagCompound.getInteger("currentEPC");
	}

	private void fixNullNBT(ItemStack stack)
	{
		stack.stackTagCompound = new NBTTagCompound();
		stack.stackTagCompound.setInteger("currentEPC", 0);
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
		stack.stackTagCompound.setInteger("currentEPC", amountOfEPC);
	}

	@Override
	public boolean canRemoveEPC(ItemStack stack, int amountOfEPC)
	{
		return this.getCurrentEPC(stack) > 0;
	}

	@Override
	public void removeToCurrentEPC(ItemStack stack, int amountOfEPC)
	{
		setCurrentEPC(stack, getCurrentEPC(stack) - amountOfEPC);
	}

	@Override
	public boolean usesEnergyTransformerTootltipModel(ItemStack s)
	{
		return true;
	}
}