package energy.transformer.common.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import energy.transformer.common.blocks.container.ContainerPixelCondenser;
import energy.transformer.common.tileentity.TileEntityPixelCondenser;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity te = world.getTileEntity(x, y, z);
		switch(ID)
		{
		case 0: return new ContainerPixelCondenser(player.inventory, (TileEntityPixelCondenser)te);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity te = world.getTileEntity(x, y, z);
		switch(ID)
		{
		case 0: return new GuiPixelCondenser(player.inventory, (TileEntityPixelCondenser)te);
		}
		return null;
	}
}