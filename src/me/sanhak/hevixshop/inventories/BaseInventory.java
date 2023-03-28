package me.sanhak.hevixshop.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import me.sanhak.hevixshop.methods.ItemCreator;
import me.sanhak.hevixshop.methods.StringUtils;

public class BaseInventory {

	public static Inventory baseInventory() {
		Inventory inventory = Bukkit.createInventory(null, 27, StringUtils.format("&cShop Menu"));
		inventory.setItem(11, ItemCreator.createCustomItemWithDisplayName(Material.DIAMOND_CHESTPLATE, "&b&lArmor"));
		inventory.setItem(13, ItemCreator.createCustomItemWithDisplayName(Material.REDSTONE_BLOCK, "&e&lConvertor"));
		inventory.setItem(15, ItemCreator.createCustomItemWithDisplayName(Material.APPLE, "&6&lUtils"));
		return inventory;
	}

	

}
