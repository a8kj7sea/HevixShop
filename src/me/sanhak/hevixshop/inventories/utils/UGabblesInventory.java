package me.sanhak.hevixshop.inventories.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import me.sanhak.hevixshop.methods.ItemCreator;

public class UGabblesInventory {

	public static Inventory gabblesInventory() {
		Inventory inventory = Bukkit.createInventory(null, 27, "&eGabbles Menu");
		inventory.setItem(26, ItemCreator.createCustomItemWithDisplayName(Material.BARRIER, "&c&lBack"));
		return inventory;
	}

}
