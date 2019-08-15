package com.elikill58.negativity.spigot.reflection.cache;

import java.util.UUID;

import com.elikill58.negativity.universal.NegativityAccount;
import com.elikill58.negativity.universal.Version;

public abstract class CacheManager {
	
	public abstract void invalidate(UUID playerId);
	public abstract NegativityAccount get(UUID playerId);
	
	public static CacheManager getCacheManagerFor(String version) {
		Version v = Version.getVersion(version);
		if (v.equals(Version.V1_7))
			return new CacheManager1_7();
		else
			return new CacheManager1_8();
	}
}
