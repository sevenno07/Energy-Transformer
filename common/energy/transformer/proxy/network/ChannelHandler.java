package energy.transformer.proxy.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import cpw.mods.fml.common.network.FMLIndexedMessageToMessageCodec;

@Sharable
public class ChannelHandler extends FMLIndexedMessageToMessageCodec<EnergyPacket>
{
	@Override
	public void encodeInto(ChannelHandlerContext ctx, EnergyPacket packet, ByteBuf target) throws Exception
	{
		packet.writeData(target);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf source, EnergyPacket packet)
	{
		packet.readData(source);
	}
}