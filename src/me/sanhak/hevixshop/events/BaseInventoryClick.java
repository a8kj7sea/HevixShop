package me.sanhak.hevixshop.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.sanhak.hevixshop.inventories.ArmorInventory;
import me.sanhak.hevixshop.inventories.ConvertorInventory;
import me.sanhak.hevixshop.inventories.UtilsInventory;
import me.sanhak.hevixshop.methods.StringUtils;

public class BaseInventoryClick implements Listener {

	@EventHandler
	public void onClickonBaseInventory(InventoryClickEvent inventoryClickEvent) {
		if (!(inventoryClickEvent.getWhoClicked() instanceof Player)) {
			return;
		}
		Player player = (Player) inventoryClickEvent.getWhoClicked();
		if (inventoryClickEvent.getInventory().getTitle().equalsIgnoreCase(StringUtils.format("&cShop Menu"))) {
			inventoryClickEvent.setCancelled(true);
			if (inventoryClickEvent.getCurrentItem() != null
					&& inventoryClickEvent.getCurrentItem().getType() != Material.AIR) {
				if (inventoryClickEvent.getCurrentItem().getItemMeta() != null) {
					if (inventoryClickEvent.getCurrentItem().getItemMeta().getDisplayName() != null) {
						if (inventoryClickEvent.getCurrentItem().getItemMeta().getDisplayName()
								.equalsIgnoreCase(StringUtils.format("&b&lArmor"))) {
							inventoryClickEvent.setCancelled(true);
							player.closeInventory();
							player.openInventory(ArmorInventory.armorInventory());
							player.updateInventory();
							player.playSound(player.getLocation(), Sound.CHEST_OPEN, 0.5f, 6.0f);
						}
						if (inventoryClickEvent.getCurrentItem().getItemMeta().getDisplayName()
								.equalsIgnoreCase(StringUtils.format("&e&lConvertor"))) {
							inventoryClickEvent.setCancelled(true);
							player.closeInventory();
							player.openInventory(ConvertorInventory.convertorInventory());
							player.updateInventory();
							player.playSound(player.getLocation(), Sound.CHEST_OPEN, 0.5f, 6.0f);
						}
						if (inventoryClickEvent.getCurrentItem().getItemMeta().getDisplayName()
								.equalsIgnoreCase(StringUtils.format("&6&lUtils"))) {
							inventoryClickEvent.setCancelled(true);
							player.closeInventory();
							player.openInventory(UtilsInventory.utilsInventory());
							player.updateInventory();
							player.playSound(player.getLocation(), Sound.CHEST_OPEN, 0.5f, 6.0f);
						}
					}
				}
			}
		}
	}

}
