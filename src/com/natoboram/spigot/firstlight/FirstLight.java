package com.natoboram.spigot.firstlight;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public class FirstLight extends JavaPlugin {

	@Override
	public void onEnable() {
		new Metrics(this, 7722);

		// Enable Listeners
		getServer().getPluginManager().registerEvents(new Shutdown(), this);
	}
}
