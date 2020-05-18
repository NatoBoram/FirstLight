package com.natoboram.spigot.firstlight;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

class Shutdown implements Listener {

	@EventHandler
	public void onPlayerJoin(final PlayerJoinEvent event) {

		// Set Time 0
		if (Bukkit.getOnlinePlayers().size() <= 1) {
			event.getPlayer().getWorld().setTime(0);
		}
	}

	@EventHandler
	public void onPlayerQuit(final PlayerQuitEvent event) {

		// Shutdown
		if (Bukkit.getOnlinePlayers().size() <= 1) {
			Bukkit.shutdown();
		}
	}

}
