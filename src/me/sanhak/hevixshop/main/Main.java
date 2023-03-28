package me.sanhak.hevixshop.main;

import org.bukkit.plugin.java.JavaPlugin;

import me.sanhak.hevixshop.api.ShopAPI;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		// Register API
		ShopAPI.initialize(this);
	}

}
