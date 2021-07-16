package com.maniakapps.mexicanspeak;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

import static org.bukkit.Bukkit.getLogger;


public class MexicanSpeakCommandExecutor implements CommandExecutor {
    private ArrayList<Frase> mexicanPhrases = new FraseHandler().getFrases();

    MexicanSpeakCommandExecutor() {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length > 2) {
            sender.sendMessage("Too many arguments");
            return false;
        } else if (args.length < 1) {
            sender.sendMessage("Too few arguments");
            return false;
        } else if (sender instanceof Player && command.getName().equalsIgnoreCase("mxs") && sender.hasPermission("msx.*")) {
            Player p = (Player) sender;
            if (args[0].equalsIgnoreCase("what")) {
                p.sendMessage(mexicanPhrases.get(0).getFrase());
                Bukkit.broadcastMessage("[MXS]" + p.getName() + " says " + mexicanPhrases.get(0).getFrase());
                return true;
            } else if (args[0].equalsIgnoreCase("wow")) {
                p.sendMessage(mexicanPhrases.get(1).getFrase());
                Bukkit.broadcastMessage("[MXS]" + p.getName() + " says " + mexicanPhrases.get(1).getFrase());
                return true;
            } else if (args[0].equalsIgnoreCase("whatsup")) {
                p.sendMessage(mexicanPhrases.get(2).getFrase());
                Bukkit.broadcastMessage("[MXS]" + p.getName() + " says " + mexicanPhrases.get(2).getFrase());
                return true;
            } else if (args[0].equalsIgnoreCase("trip")) {
                p.sendMessage(mexicanPhrases.get(3).getFrase());
                Bukkit.broadcastMessage("[MXS]" + p.getName() + " says " + mexicanPhrases.get(3).getFrase());
                return true;
            } else if (args[0].equalsIgnoreCase("comehere")) {
                p.sendMessage(mexicanPhrases.get(4).getFrase());
                Bukkit.broadcastMessage("[MXS]" + p.getName() + " says " + mexicanPhrases.get(4).getFrase());
                return true;
            }

        } else {
            getLogger().info("Only payers can run this command");
            return false;
        }
        return false;
    }
}
