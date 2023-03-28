package me.sanhak.hevixshop.api;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import me.sanhak.hevixshop.inventories.BaseInventory;

public class ShopAPI {

	private static ShopAPI instance;
	private final Plugin plugin;

	private ShopAPI(Plugin plugin) {
		this.plugin = plugin;
	}

	public static void initialize(Plugin plugin) {
		if (instance != null) {
			throw new IllegalStateException("ShopAPI already initialized");
		}
		instance = new ShopAPI(plugin);
	}

	public static ShopAPI getInstance() {
		if (instance == null) {
			throw new IllegalStateException("ShopAPI not initialized");
		}
		return instance;
	}

	public void openShopInventory(Player player) {
		player.openInventory(BaseInventory.baseInventory());
		player.updateInventory();
	}

	public Plugin getPlugin() {
		return plugin;
	}

}
