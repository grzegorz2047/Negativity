package com.elikill58.negativity.spigot.nms;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_10_R1.CraftServer;
import org.bukkit.craftbukkit.v1_10_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import com.elikill58.negativity.api.packets.packet.playin.NPacketPlayInBlockDig;
import com.elikill58.negativity.api.packets.packet.playin.NPacketPlayInBlockDig.DigAction;
import com.elikill58.negativity.api.packets.packet.playin.NPacketPlayInBlockDig.DigFace;

import net.minecraft.server.v1_10_R1.BlockPosition;
import net.minecraft.server.v1_10_R1.PacketPlayInBlockDig;
import net.minecraft.server.v1_10_R1.MathHelper;

public class Spigot_1_10_R1 extends SpigotVersionAdapter {

	public Spigot_1_10_R1() {
		super("v1_10_R1");
		packetsPlayIn.put("PacketPlayInBlockDig", (player, packet) -> {
			PacketPlayInBlockDig blockDig = (PacketPlayInBlockDig) packet;
			BlockPosition pos = blockDig.a();
			return new NPacketPlayInBlockDig(pos.getX(), pos.getY(), pos.getZ(), DigAction.getById(blockDig.c().ordinal()), DigFace.getById(blockDig.b().a()));
		});
		/*packetsPlayIn.put("PacketPlayInBlockPlace", (packet) -> {
			PacketPlayInBlockPlace place = (PacketPlayInBlockPlace) packet;
			BlockPosition pos = place.a();
			ItemStack item = new SpigotItemStack(CraftItemStack.asBukkitCopy(place.getItemStack()));
			Vector vector = new Vector(place.d(), place.e(), place.f());
			return new NPacketPlayInBlockPlace(pos.getX(), pos.getY(), pos.getZ(), item, place.getFace(), vector);
		});*/
	}
	
	@Override
	protected String getOnGroundFieldName() {
		return "f";
	}
	
	@Override
	public double getAverageTps() {
		return MathHelper.a(((CraftServer) Bukkit.getServer()).getServer().h);
	}
	
	@Override
	public int getPlayerPing(Player player) {
		return ((CraftPlayer) player).getHandle().ping;
	}
	
	@Override
	public float cos(float f) {
		return MathHelper.cos(f);
	}
	
	@Override
	public float sin(float f) {
		return MathHelper.sin(f);
	}
}