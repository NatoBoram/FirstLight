package com.natoboram.westerntea;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Shutdown implements Listener {
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		// Shutdown
		if (Bukkit.getOnlinePlayers().size() <= 1) {
			Bukkit.shutdown();
		}
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		// Set Time 0
		if (Bukkit.getOnlinePlayers().size() <= 1) {
			event.getPlayer().getWorld().setTime(0);
		}
	}
	
}