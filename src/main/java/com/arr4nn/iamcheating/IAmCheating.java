package com.arr4nn.iamcheating;

import com.arr4nn.iamcheating.commands.IAmCheatingCommand;
import com.arr4nn.iamcheating.events.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class IAmCheating extends JavaPlugin {

  @Override
  public void onEnable() {
    // Plugin startup logic
    getCommand("IAmCheating").setExecutor(new IAmCheatingCommand());
    getServer().getPluginManager().registerEvents(new PlayerJoinEvent(),this);
    getLogger().info("Mate im ready bro");
  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
    getLogger().info("Mate why did you stop me.");

  }
}
