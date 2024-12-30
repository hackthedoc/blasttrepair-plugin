package com.hackthedoc.blastrepair.managers;

import org.bukkit.configuration.file.FileConfiguration;

import com.hackthedoc.blastrepair.Plugin;

public class ConfigManager {
    private FileConfiguration config;

    public void loadConfig() {
        Plugin.getInstance().saveDefaultConfig();
        config = Plugin.getInstance().getConfig();
    }

    public void reloadConfig() {
        Plugin.getInstance().reloadConfig();
        config = Plugin.getInstance().getConfig();
    }
}