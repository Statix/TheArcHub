package net.thearc.hub.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	String rights;
	double version;
	
	Main plugin;
	public Main(Main plugin) {
		this.plugin = plugin;
	}
	
	public void onEnable() {
		version = 0.1;
		rights = "Created by ItzQuiver, owned by TheArc.";
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		//You dont need to worry about join or leave messages. Duh already told me what to make with some other 
		//stuff. Such as /welcome ect... ~Matt
	}

}
