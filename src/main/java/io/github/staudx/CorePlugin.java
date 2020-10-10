package io.github.staudx;

import io.github.staudx.command.EffectCommands;
import io.github.staudx.util.command.CommandFramework;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Arrays;

@Getter
public class CorePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        Arrays.asList(
                new EffectCommands()
        ).forEach(new CommandFramework(this)::registerCommands);
    }

    /**
     * Main Instance.
     *
     * @return the main class.
     */

    public static CorePlugin get() {
        return getPlugin(CorePlugin.class);
    }
}
