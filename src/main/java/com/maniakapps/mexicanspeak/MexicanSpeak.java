package com.maniakapps.mexicanspeak;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;


public final class MexicanSpeak extends JavaPlugin {
    private MexicanSpeakCommandExecutor mx;

    @Override
    public void onEnable() {
        // Plugin startup logic
        mx = new MexicanSpeakCommandExecutor();
        getLogger().info("MexicanSpeak activado wey!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("MexicanSpeak has been disabled (no more mexican words :c )");
    }

    @Override
    public void onLoad() {
        getLogger().info("MexicanSpeak is loading...");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return mx.onCommand(sender, command, label, args);
    }

}
