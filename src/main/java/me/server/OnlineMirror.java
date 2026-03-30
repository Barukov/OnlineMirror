package me.server;

import com.destroystokyo.paper.event.server.PaperServerListPingEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class OnlineMirror extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPing(PaperServerListPingEvent event) {
        int realOnline = Bukkit.getOnlinePlayers().size();
        int boost = 14000 + (int)(Math.random() * 1000);
        int shownOnline = realOnline + boost;

        event.setNumPlayers(shownOnline);
        event.setMaxPlayers(20000);
    }
}
