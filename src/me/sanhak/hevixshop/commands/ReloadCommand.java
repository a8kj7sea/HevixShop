package me.sanhak.hevixshop.commands;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

import me.sanhak.hevixshop.configurations.Configuration;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class ReloadCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(final CommandSender sender, final Command command, final String label,
			final String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cThis command only for players , you can't perform this command from console !");
			return false;
		}
		final Player player = (Player) sender;
		if (player.hasPermission("hevixshop.admin")) {
			if (args.length != 0) {
				player.sendMessage("§cWrong use , please try to type /hsreload");
				return false;
			}
			Configuration.reload();
			player.sendMessage("§aYou have been reloaded the configuration file successfully !");
			player.playSound(player.getLocation(), Sound.ORB_PICKUP, 0.5f, 5.0f);
		} else {
			player.sendMessage("§cYou don't have enough permissions to perform this command !");
			player.playSound(player.getLocation(), Sound.ITEM_BREAK, 0.5f, 5.0f);
		}
		return false;
	}
}