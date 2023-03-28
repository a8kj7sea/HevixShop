package me.sanhak.hevixshop.commands;

import org.bukkit.entity.Player;

import me.sanhak.hevixshop.inventories.BaseInventory;
import me.sanhak.hevixshop.othersystems.Cooldown;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class OpenCommand implements CommandExecutor {

	@Override
	public boolean onCommand(final CommandSender sender, final Command command, final String label,
			final String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cThis command only for players , you can't perform this command from console !");
			return false;
		}

		final Player player = (Player) sender;

		if (args.length != 0) {
			player.sendMessage("§cWrong use , please try to type /hsopen");
			return false;
		}

		Cooldown cooldown = new Cooldown(player.getUniqueId(), 5);
		if (cooldown.isOut()) {
			player.openInventory(BaseInventory.baseInventory());
			player.updateInventory();
			player.sendMessage("§aYou have been opened Shop Inventory Successfully !");
			cooldown.addPlayer();
		} else {
			player.sendMessage("§cplease wait , you are in cooldown the command will be available after §a§l"
					+ cooldown.getRemainingTime());
		}

		return false;
	}
}