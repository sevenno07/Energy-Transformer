package energy.transformer.api.utils;

import net.minecraftforge.common.util.ForgeDirection;

/**
 * ForgeDirection <===> int<br/>
 * It's as simple as that
 * 
 * @author utybo
 * 
 */
public class DirectionHelper
{
	/**
	 * Tranforms an int into a ForgeDirection
	 * 
	 * @param i
	 *            The int
	 * @return cast result
	 */
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

	/**
	 * @see #castDirectionFromInt(int)
	 * @param d
	 * @return the ForgeDirection
	 * @throws Exception
	 *             if the ForgeDirection is unknown
	 */
	public static int castIntFromDirection(ForgeDirection d) throws Exception
	{
		switch(d)
		{
		case EAST:
			return 0;
		case WEST:
			return 1;
		case SOUTH:
			return 2;
		case NORTH:
			return 3;
		case UP:
			return 4;
		case DOWN:
			return 5;
		default:
			throw new Exception();
		}
	}
}