package place.calcium.teleportto;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.plugin.java.JavaPlugin;

public class ToggleTeleportingCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            if (player.getMetadata("donotdisturb").get(0).asBoolean()) {
                player.setMetadata("donotdisturb", new FixedMetadataValue(JavaPlugin.getPlugin(TeleportTo.class), false));
                player.sendMessage("You can now be teleported to!");
            } else {
                player.setMetadata("donotdisturb", new FixedMetadataValue(JavaPlugin.getPlugin(TeleportTo.class), true));
                player.sendMessage("You can no longer be teleported to!");
            }
        } else {
            sender.sendMessage("You're not a player!");
        }

        return true;
    }

}
