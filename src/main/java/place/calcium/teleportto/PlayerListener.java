package place.calcium.teleportto;

import org.bukkit.GameRule;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        player.setMetadata("donotdisturb", new FixedMetadataValue(JavaPlugin.getPlugin(TeleportTo.class), false));
        player.sendMessage("Warning, you can be teleported to by other people! Do /toggleteleporting to disable it. (/tt)");
    }
}