package place.calcium.teleportto;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportToCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) { 
            sender.sendMessage("No arguments supplied.");
            return false;
        }

        if (sender instanceof Player player) {
            Player target = Bukkit.getPlayerExact(args[0]);
            if (target == null) {
                player.sendMessage("Player not found.");
                return false;
            }

            player.sendMessage("Teleporting...");
            player.teleport(target);
            return true;
        } else {
            sender.sendMessage("You're not a player!");
            return false;
        }
    }
}