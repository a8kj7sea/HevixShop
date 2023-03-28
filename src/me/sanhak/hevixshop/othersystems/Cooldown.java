package me.sanhak.hevixshop.othersystems;

import java.util.HashMap;
import java.util.UUID;

public class Cooldown {

	public UUID playerId;
	public long time;

	public HashMap<UUID, Long> cooldown = new HashMap<UUID, Long>();

	public Cooldown(UUID playerId, int time) {
		this.playerId = playerId;
		this.time = time;

	}

	public boolean isOut() {
		if (!(cooldown.containsKey(playerId)) || cooldown.get(playerId) <= System.currentTimeMillis()) {
			return true;
		}
		return false;
	}

	public void addPlayer() {
		cooldown.put(playerId, System.currentTimeMillis() + (time * 1000));
	}

	public void remove() {
		cooldown.put(playerId, time);
	}

	public int getRemainingTime() {
		return Math.toIntExact(Math.round((cooldown.get(playerId) - System.currentTimeMillis()) / 1000));
	}

}
