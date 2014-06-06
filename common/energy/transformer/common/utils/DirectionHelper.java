package energy.transformer.common.utils;

import net.minecraftforge.common.util.ForgeDirection;

public class DirectionHelper
{
	public static ForgeDirection castDirectionFromInt(int i)
	{
		switch(i)
		{
		case 0:
			return ForgeDirection.EAST;
		case 1:
			return ForgeDirection.WEST;
		case 2:
			return ForgeDirection.SOUTH;
		case 3:
			return ForgeDirection.NORTH;
		case 4:
			return ForgeDirection.UP;
		case 5:
			return ForgeDirection.DOWN;
		default:
			return ForgeDirection.UNKNOWN;
		}
	}
}
