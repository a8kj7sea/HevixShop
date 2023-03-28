package me.sanhak.hevixshop.configurations;

import org.bukkit.configuration.file.YamlConfiguration;
import java.io.IOException;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import java.io.File;

public class Configuration {
	private static File file;
	private static FileConfiguration fileConfiguration;

	public Configuration(final JavaPlugin plugin, final String configurationName, final boolean saveDefault) {
		Configuration.file = new File(plugin.getDataFolder(), configurationName);
		Configuration.file.getParentFile().mkdirs();
		if (!Configuration.file.exists()) {
			if (saveDefault) {
				plugin.saveResource(configurationName, true);
			} else {
				try {
					Configuration.file.createNewFile();
				} catch (IOException var5) {
					var5.printStackTrace();
				}
			}
		}
		Configuration.fileConfiguration = (FileConfiguration) YamlConfiguration.loadConfiguration(Configuration.file);
	}

	public static FileConfiguration getConfiguration() {
		return Configuration.fileConfiguration;
	}

	public static void reload() {
		Configuration.fileConfiguration = (FileConfiguration) YamlConfiguration.loadConfiguration(Configuration.file);
	}

	public static void save() {
		try {
			Configuration.fileConfiguration.save(Configuration.file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
