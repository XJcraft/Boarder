package org.xjcraft.boarder;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Boarder extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    public void move(PlayerMoveEvent event){
        Location to = event.getTo();
        if (Math.abs(to.getY())>500){
            event.setCancelled(true);
        }else if (Math.abs(to.getZ())>500){
            event.setCancelled(true);
        }
    }
}
