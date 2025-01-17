package com.hackthedoc.blastrepair;

import org.bukkit.plugin.java.JavaPlugin;

import com.hackthedoc.blastrepair.commands.BlastrepairCommand;
import com.hackthedoc.blastrepair.listeners.ExplosionListener;
import com.hackthedoc.blastrepair.managers.ConfigManager;
import com.hackthedoc.blastrepair.utils.MessageUtils;

public class Plugin extends JavaPlugin {
  private static Plugin instance;
  private ConfigManager configManager;

  public void onEnable() {
    instance = this;

    configManager = new ConfigManager();
    configManager.loadConfig();

    getServer().getPluginManager().registerEvents(new ExplosionListener(), this);

    getCommand("blastrepair").setExecutor(new BlastrepairCommand());

    MessageUtils.log("template enabled");
  }

  public void onDisable() {
    MessageUtils.log("template disabled");
  }

  public static Plugin getInstance() {
    return instance;
  }

  public ConfigManager getConfigManager() {
    return configManager;
  }
}
