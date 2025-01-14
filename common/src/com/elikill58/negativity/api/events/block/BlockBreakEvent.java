package com.elikill58.negativity.api.events.block;

import com.elikill58.negativity.api.block.Block;
import com.elikill58.negativity.api.entity.Player;
import com.elikill58.negativity.api.events.CancellableEvent;
import com.elikill58.negativity.api.events.PlayerEvent;

public class BlockBreakEvent extends PlayerEvent implements CancellableEvent {

	private final Block b;
	private boolean cancel;
	
	public BlockBreakEvent(Player p, Block b) {
		super(p);
		this.b = b;
	}
	
	public Block getBlock() {
		return b;
	}

	@Override
	public boolean isCancelled() {
		return cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}
}
