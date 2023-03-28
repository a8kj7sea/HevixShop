package me.sanhak.hevixshop.methods;

import net.md_5.bungee.api.ChatColor;

public class StringUtils {

	public static String format(String anyString) { //colorize 
		return ChatColor.translateAlternateColorCodes('&', anyString);
	}

}
