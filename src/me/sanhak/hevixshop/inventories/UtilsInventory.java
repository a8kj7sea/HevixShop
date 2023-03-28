package me.sanhak.hevixshop.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import me.sanhak.hevixshop.methods.ItemCreator;

public class UtilsInventory {

	public static Inventory utilsInventory() {
		Inventory inventory = Bukkit.createInventory(null, 27, "&cUtils Menu");
		inventory.setItem(11, ItemCreator.createCustomItemWithDisplayName(Material.GOLDEN_APPLE, "&eGabbles"));
		inventory.setItem(15, ItemCreator.createCustomItemWithDisplayName(Material.POTION, "&2Potions"));
		inventory.setItem(26, ItemCreator.createCustomItemWithDisplayName(Material.BARRIER, "&c&lBack"));
		return inventory;
	}

}
