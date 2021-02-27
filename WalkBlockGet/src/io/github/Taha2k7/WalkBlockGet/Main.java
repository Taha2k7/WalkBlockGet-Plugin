package io.github.Taha2k7.WalkBlockGet;

import org.bukkit.plugin.java.JavaPlugin;

import io.github.Taha2k7.WalkBlockGet.Events.EventsClass;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nPlugin Has Been Enabled\n\n");
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
		
		
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nPlugin has been disabled\n\n");
		
	}
}
