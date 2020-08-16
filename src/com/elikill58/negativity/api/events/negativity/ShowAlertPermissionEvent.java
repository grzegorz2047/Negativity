package com.elikill58.negativity.api.events.negativity;

import com.elikill58.negativity.api.NegativityPlayer;
import com.elikill58.negativity.api.entity.Player;
import com.elikill58.negativity.api.events.Event;

public class ShowAlertPermissionEvent implements Event {

	private final boolean basicPerm;
	private final Player p;
	private final NegativityPlayer np;
	private boolean cancel = false;
	
	public ShowAlertPermissionEvent(Player p, NegativityPlayer np, boolean hasBasicPerm) {
		this.p = p;
		this.np = np;
		this.basicPerm = hasBasicPerm;
	}
	
	public Player getPlayer() {
		return p;
	}
	
	public NegativityPlayer getNegativityPlayer() {
		return np;
	}
	
	public boolean hasBasicPerm() {
		return basicPerm;
	}
	
	public boolean hasPerm() {
		return !isCancelled() && basicPerm;
	}
	
	public boolean isCancelled() {
		return cancel;
	}

	public void setCancelled(boolean c) {
		cancel = c;
	}
}