package me.sanhak.hevixshop.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import me.sanhak.hevixshop.methods.ItemCreator;
import me.sanhak.hevixshop.methods.StringUtils;

public class ConvertorInventory {

	public static Inventory convertorInventory() {
		Inventory inventory = Bukkit.createInventory(null, 27, StringUtils.format("&bConvertor Menu"));
		inventory.setItem(11,
				ItemCreator.createCustomItemWithDisplayName(Material.GOLD_BLOCK, "&6Gold Convertor &7(&c64&7)"));
		inventory.setItem(15,
				ItemCreator.createCustomItemWithDisplayName(Material.EMERALD_BLOCK, "&6Emerald Convertor &7(&c16&7)"));
		inventory.setItem(26, ItemCreator.createCustomItemWithDisplayName(Material.BARRIER, "&c&lBack"));
		return inventory;
	}

}
