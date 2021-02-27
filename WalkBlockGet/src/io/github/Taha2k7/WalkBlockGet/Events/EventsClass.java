package io.github.Taha2k7.WalkBlockGet.Events;


import org.bukkit.Material;
import org.bukkit.block.Block;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

public class EventsClass implements Listener {
	
	@EventHandler
	public void onMove(PlayerMoveEvent event) {
	    if (event.getTo().getBlockX() == event.getFrom().getBlockX() && event.getTo().getBlockY() == event.getFrom().getBlockY() && event.getTo().getBlockZ() == event.getFrom().getBlockZ()) {
	    	return; //The player hasn't moved
	    }
	    Player player = event.getPlayer();
	    Block blockBelowPlayer = player.getLocation().subtract(0, 1, 0).getBlock();
	    
	    Material material = blockBelowPlayer.getType();
	    ItemStack item = new ItemStack(material, 1);
	    	
	     player.getInventory().addItem(item);
	     return;
	    }
	}
