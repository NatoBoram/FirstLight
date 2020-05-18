package com.natoboram.spigot.firstlight;

import org.bukkit.plugin.java.JavaPlugin;

public class FirstLight extends JavaPlugin {

	@Override
	public void onEnable() {

		// Enable Listeners
		getServer().getPluginManager().registerEvents(new Shutdown(), this);
	}
}
