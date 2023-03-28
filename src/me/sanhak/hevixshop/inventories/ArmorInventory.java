package me.sanhak.hevixshop.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import me.sanhak.hevixshop.configurations.Configuration;
import me.sanhak.hevixshop.methods.ItemCreator;
import me.sanhak.hevixshop.methods.StringUtils;

public class ArmorInventory {

	public static Inventory armorInventory() {
		Inventory inventory = Bukkit.createInventory(null, 27, StringUtils.format("&bArmor Shop Menu"));
		inventory.setItem(11,
				ItemCreator.createCustomItemWithDisplayName(Material.DIAMOND,
						"&bFull Diamond &7(&c%armorII_cost%&7)".replace("%armorII_cost%",
								Configuration.getConfiguration().getString("Inventories.Shop-Inventory.ArmorII.cost")),
						2));
		inventory.setItem(13,
				ItemCreator.createCustomItemWithDisplayName(Material.DIAMOND,
						"&bFull Diamond &7(&c%armorIII_cost%&7)".replace("%armorIII_cost%",
								Configuration.getConfiguration().getString("Inventories.Shop-Inventory.ArmorIII.cost")),
						3));
		inventory.setItem(15,
				ItemCreator.createCustomItemWithDisplayName(Material.DIAMOND,
						"&bFull Diamond &7(&c%armorIV_cost%&7)".replace("%armorIV_cost%",
								Configuration.getConfiguration().getString("Inventories.Shop-Inventory.ArmorIV.cost")),
						4));
		inventory.setItem(26, ItemCreator.createCustomItemWithDisplayName(Material.BARRIER, "&c&lBack"));
		return inventory;
	}

	
	
	
}
