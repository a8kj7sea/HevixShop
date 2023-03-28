package me.sanhak.hevixshop.methods;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import me.sanhak.hevixshop.enums.ArmorEnum;

public class ArmorCreator {

	public static void giveArmor(Player p, ArmorEnum armorType) {
		PlayerInventory playerInventory = p.getInventory();
		playerInventory.addItem(createHelmetItem(armorType));
		playerInventory.addItem(createChestplateItem(armorType));
		playerInventory.addItem(createLeggingsItem(armorType));
		playerInventory.addItem(createBootsItem(armorType));
	}

	public static ItemStack createHelmetItem(ArmorEnum armorType) {
		Map<ArmorEnum, Integer> enchantments = new HashMap<ArmorEnum, Integer>();
		enchantments.put(ArmorEnum.PROTECTION_II, 2);
		enchantments.put(ArmorEnum.PROTECTION_III, 3);
		enchantments.put(ArmorEnum.PROTECTION_IV, 4);

		ItemStack itemStack = new ItemStack(Material.DIAMOND_HELMET);
		if (enchantments.containsKey(armorType)) {
			itemStack.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, enchantments.get(armorType));
		}
		return itemStack;
	}

	public static ItemStack createChestplateItem(ArmorEnum armorType) {
		Map<ArmorEnum, Integer> enchantments = new HashMap<ArmorEnum, Integer>();
		enchantments.put(ArmorEnum.PROTECTION_II, 2);
		enchantments.put(ArmorEnum.PROTECTION_III, 3);
		enchantments.put(ArmorEnum.PROTECTION_IV, 4);

		ItemStack itemStack = new ItemStack(Material.DIAMOND_CHESTPLATE);
		if (enchantments.containsKey(armorType)) {
			itemStack.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, enchantments.get(armorType));
		}
		return itemStack;
	}

	public static ItemStack createLeggingsItem(ArmorEnum armorType) {
		Map<ArmorEnum, Integer> enchantments = new HashMap<ArmorEnum, Integer>();
		enchantments.put(ArmorEnum.PROTECTION_II, 2);
		enchantments.put(ArmorEnum.PROTECTION_III, 3);
		enchantments.put(ArmorEnum.PROTECTION_IV, 4);

		ItemStack itemStack = new ItemStack(Material.DIAMOND_LEGGINGS);
		if (enchantments.containsKey(armorType)) {
			itemStack.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, enchantments.get(armorType));
		}
		return itemStack;
	}

	public static ItemStack createBootsItem(ArmorEnum armorType) {
		Map<ArmorEnum, Integer> enchantments = new HashMap<ArmorEnum, Integer>();
		enchantments.put(ArmorEnum.PROTECTION_II, 2);
		enchantments.put(ArmorEnum.PROTECTION_III, 3);
		enchantments.put(ArmorEnum.PROTECTION_IV, 4);

		ItemStack itemStack = new ItemStack(Material.DIAMOND_BOOTS);
		if (enchantments.containsKey(armorType)) {
			itemStack.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, enchantments.get(armorType));
		}
		return itemStack;
	}

}
