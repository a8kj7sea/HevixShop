package me.sanhak.hevixshop.inventories.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import me.sanhak.hevixshop.methods.ItemCreator;

public class UPotionsInventory {

	public static Inventory potionsInventory() {
		Inventory inventory = Bukkit.createInventory(null, 27, "&2Potions Menu");
		inventory.setItem(26, ItemCreator.createCustomItemWithDisplayName(Material.BARRIER, "&c&lBack"));
		return inventory;
	}
}
