package place.calcium.teleportto;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class TeleportTo extends JavaPlugin {
    @Override
    public void onEnable() {
        Objects.requireNonNull(this.getCommand("teleportto")).setExecutor(new TeleportToCommand());
    }
}