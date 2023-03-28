package me.sanhak.hevixshop.methods;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class PayMethod {

	public static boolean payWithMaterials(Player player, Material type, int amount) {
		int unpaidAmount;
		PlayerInventory inv = player.getInventory();
		int available = 0;
		HashMap<Integer, ItemStack> items = new HashMap<Integer, ItemStack>();
		for (unpaidAmount = 0; unpaidAmount < inv.getSize(); ++unpaidAmount) {
			ItemStack stack = inv.getItem(unpaidAmount);
			if (stack == null || stack.getType() != type)
				continue;
			items.put(unpaidAmount, stack);
			available += stack.getAmount();
		}
		if (available < amount) {
			return false;
		}
		unpaidAmount = amount;
		for (@SuppressWarnings("rawtypes")
		Map.Entry stackEntry : items.entrySet()) {
			int invSlot = (Integer) stackEntry.getKey();
			ItemStack stack = (ItemStack) stackEntry.getValue();

			if (stack.getAmount() >= unpaidAmount) {
				if (stack.getAmount() == unpaidAmount) {
					inv.setItem(invSlot, null); 
					break;
				}
				stack.setAmount(stack.getAmount() - unpaidAmount);
				break;
			}
			unpaidAmount -= stack.getAmount();
			inv.setItem(invSlot, null); 
		}
		player.updateInventory();
		return true;
	}
}
