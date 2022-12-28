package tk.lwgame;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class LWKill extends JavaPlugin {

    public static Logger logger;
    public static JavaPlugin instance;

    @Override
    public void onEnable() {
        logger = Bukkit.getLogger();
        instance = this;
        logger.info("===============================");
        logger.info("欢迎使用LWKill！作者Anschluss_zeit");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
