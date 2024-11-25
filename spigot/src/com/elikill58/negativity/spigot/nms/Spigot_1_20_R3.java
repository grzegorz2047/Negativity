package com.elikill58.negativity.spigot.nms;

import com.elikill58.negativity.spigot.SubPlatform;
import com.elikill58.negativity.spigot.utils.PacketUtils;

public class Spigot_1_20_R3 extends SpigotVersionAdapter {

	public Spigot_1_20_R3() {
		super(PacketUtils.getProtocolVersion());
	}

	@Override
	public String getTpsFieldName() {
		return SubPlatform.getSubPlatform().equals(SubPlatform.FOLIA) ? "tickTimesNanos" : "ac";
	}
}