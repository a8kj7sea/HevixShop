package me.sanhak.hevixshop.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.sanhak.hevixshop.configurations.Configuration;
import me.sanhak.hevixshop.enums.ArmorEnum;
import me.sanhak.hevixshop.inventories.BaseInventory;
import me.sanhak.hevixshop.methods.ArmorCreator;
import me.sanhak.hevixshop.methods.IntegerUtils;
import me.sanhak.hevixshop.methods.PayMethod;
import me.sanhak.hevixshop.methods.StringUtils;

public class ArmorInventoryClick {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClickonArmorInventory(InventoryClickEvent inventoryClickEvent) {
		if (!(inventoryClickEvent.getWhoClicked() instanceof Player)) {
			return;
		}
		Player player = (Player) inventoryClickEvent.getWhoClicked();
		if (inventoryClickEvent.getInventory().getTitle().equalsIgnoreCase(StringUtils.format("&bArmor Shop Menu"))) {
			inventoryClickEvent.setCancelled(true);
			if (inventoryClickEvent.getCurrentItem() != null
					&& inventoryClickEvent.getCurrentItem().getType() != Material.AIR) {
				if (inventoryClickEvent.getCurrentItem().getItemMeta() != null) {
					if (inventoryClickEvent.getCurrentItem().getItemMeta().getDisplayName() != null) {
						if (inventoryClickEvent.getCurrentItem().getItemMeta().getDisplayName()
								.equalsIgnoreCase(StringUtils.format("&bFull Diamond &7(&c%armorII_cost%&7)"
										.replace("%armorII_cost%", Configuration.getConfiguration()
												.getString("Inventories.Shop-Inventory.ArmorII.cost"))))) {
							if (PayMethod.payWithMaterials(player,
									Material.getMaterial(Configuration.getConfiguration()
											.getInt("Inventories.Shop-Inventory.Trade-Material")),
									IntegerUtils.getCost(Configuration.getConfiguration()
											.getString("Inventories.Shop-Inventory.ArmorII.cost")))) {
								ArmorCreator.giveArmor(player, ArmorEnum.PROTECTION_II);
								player.sendMessage(StringUtils
										.format("&aYou have been buy full diamond armors with protection II !"));
								player.playSound(player.getLocation(), Sound.LEVEL_UP, 0.6f, 7.0f);
								player.closeInventory();
								player.updateInventory();

							} else {
								player.sendMessage(StringUtils.format("&cYou don't have enough coins to buy that !"));
								player.playSound(player.getLocation(), Sound.ITEM_BREAK, 0.6f, 7.0f);
								player.closeInventory();
								player.updateInventory();
							}
						}
						if (inventoryClickEvent.getCurrentItem().getItemMeta().getDisplayName()
								.equalsIgnoreCase(StringUtils.format("&bFull Diamond &7(&c%armorIII_cost%&7)"
										.replace("%armorIII_cost%", Configuration.getConfiguration()
												.getString("Inventories.Shop-Inventory.ArmorIII.cost"))))) {
							if (PayMethod.payWithMaterials(player,
									Material.getMaterial(Configuration.getConfiguration()
											.getInt("Inventories.Shop-Inventory.Trade-Material")),
									IntegerUtils.getCost(Configuration.getConfiguration()
											.getString("Inventories.Shop-Inventory.ArmorIII.cost")))) {
								ArmorCreator.giveArmor(player, ArmorEnum.PROTECTION_III);
								player.sendMessage(StringUtils
										.format("&aYou have been buy full diamond armors with protection III !"));
								player.playSound(player.getLocation(), Sound.LEVEL_UP, 0.6f, 7.0f);
								player.closeInventory();
								player.updateInventory();

							} else {
								player.sendMessage(StringUtils.format("&cYou don't have enough coins to buy that !"));
								player.playSound(player.getLocation(), Sound.ITEM_BREAK, 0.6f, 7.0f);
								player.closeInventory();
								player.updateInventory();
							}
						}
						if (inventoryClickEvent.getCurrentItem().getItemMeta().getDisplayName()
								.equalsIgnoreCase(StringUtils.format("&bFull Diamond &7(&c%armorIV_cost%&7)"
										.replace("%armorIV_cost%", Configuration.getConfiguration()
												.getString("Inventories.Shop-Inventory.ArmorIV.cost"))))) {
							inventoryClickEvent.setCancelled(true);
							if (PayMethod.payWithMaterials(player,
									Material.getMaterial(Configuration.getConfiguration()
											.getInt("Inventories.Shop-Inventory.Trade-Material")),
									IntegerUtils.getCost(Configuration.getConfiguration()
											.getString("Inventories.Shop-Inventory.ArmorIV.cost")))) {
								ArmorCreator.giveArmor(player, ArmorEnum.PROTECTION_III);
								player.sendMessage(StringUtils
										.format("&aYou have been buy full diamond armors with protection IV !"));
								player.playSound(player.getLocation(), Sound.LEVEL_UP, 0.6f, 7.0f);
								player.closeInventory();
								player.updateInventory();

							} else {
								player.sendMessage(StringUtils.format("&cYou don't have enough coins to buy that !"));
								player.playSound(player.getLocation(), Sound.ITEM_BREAK, 0.6f, 7.0f);
								player.closeInventory();
								player.updateInventory();
							}

						}
						if (inventoryClickEvent.getCurrentItem().getItemMeta().getDisplayName()
								.equalsIgnoreCase(StringUtils.format("&c&lBack"))) {
							inventoryClickEvent.setCancelled(true);
							player.playSound(player.getLocation(), Sound.CHEST_CLOSE, 0.5f, 6.0f);
							player.closeInventory();
							player.openInventory(BaseInventory.baseInventory());
							player.updateInventory();
						}
					}
				}
			}
		}
	}
}
