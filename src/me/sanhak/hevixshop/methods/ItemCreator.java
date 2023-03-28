package me.sanhak.hevixshop.methods;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public class ItemCreator {

	public static ItemStack createCustomItem(final Material itemType) {
		ItemStack itemStack = new ItemStack(itemType);
		return itemStack;
	}

	public static ItemStack createCustomItemWithDisplayName(final Material itemType, final String displayName) {
		ItemStack itemStack = new ItemStack(itemType);
		ItemMeta itemMeta = itemStack.getItemMeta();
		itemMeta.setDisplayName(StringUtils.format(displayName));
		itemStack.setItemMeta(itemMeta);
		return itemStack;
	}

	public static ItemStack createCustomItemWithDisplayName(final Material itemType, final String displayName,
			int amount) {
		ItemStack itemStack = new ItemStack(itemType, amount);
		ItemMeta itemMeta = itemStack.getItemMeta();
		itemMeta.setDisplayName(StringUtils.format(displayName));
		itemStack.setItemMeta(itemMeta);
		return itemStack;
	}

	public static ItemStack createEnchantItem(final Material itemType, final Enchantment enchanment,
			final int enchantmentLevel) {
		ItemStack itemStack = new ItemStack(itemType);
		itemStack.addEnchantment(enchanment, enchantmentLevel);
		return itemStack;
	}

	public static ItemStack createEnchantItemWithDisplayName(final Material itemType, final Enchantment enchantment,
			final int enchantmentLevel, final String displayName) {
		ItemStack itemStack = new ItemStack(itemType);
		itemStack.addEnchantment(enchantment, enchantmentLevel);
		ItemMeta itemMeta = itemStack.getItemMeta();
		itemMeta.setDisplayName(StringUtils.format(displayName));
		itemStack.setItemMeta(itemMeta);
		return itemStack;
	}

	public ItemStack createCustomPotion(final PotionType potionType, final int duration, final int amplifier,
			final boolean ambient) {
		ItemStack potion = new ItemStack(Material.POTION);
		PotionMeta potionMeta = (PotionMeta) potion.getItemMeta();
		potionMeta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, duration, amplifier, ambient), true);
		potion.setItemMeta(potionMeta);
		return potion;
	}

	public static ItemStack createNotchApple(final int amount) {
		ItemStack itemStack = new ItemStack(Material.GOLDEN_APPLE, amount, (short) 1);
		return itemStack;
	}

	public static ItemStack createNotchAppleWithDisplayName(final int amount, final String displayName) {
		ItemStack itemStack = new ItemStack(Material.GOLDEN_APPLE, amount, (short) 1);
		ItemMeta itemMeta = itemStack.getItemMeta();
		itemMeta.setDisplayName(StringUtils.format(displayName));
		itemStack.setItemMeta(itemMeta);
		return itemStack;
	}
}
