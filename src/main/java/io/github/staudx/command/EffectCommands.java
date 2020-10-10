package io.github.staudx.command;

import io.github.staudx.CorePlugin;
import io.github.staudx.util.CC;
import io.github.staudx.util.command.Command;
import io.github.staudx.util.command.CommandArgs;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EffectCommands {

    /**
     *
     * @implNote Code Written on 10/10/2020
     */

    @Command(name = "fireresistance", aliases = { "fireres" }, permission = "core.effect.fire", playerOnly = true)
    public void execute(CommandArgs args) {
        Player player = args.getPlayer();

        player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 999999, 1));
        player.sendMessage(CC.translate(CorePlugin.get().getConfig().getString("potion.fireresistance")));
    }

    @Command(name = "speed", aliases = { "sp" }, permission = "core.effect.speed", playerOnly = true)
    public void execute2(CommandArgs args) {
        Player player = args.getPlayer();

        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 1));
        player.sendMessage(CC.translate(CorePlugin.get().getConfig().getString("potion.speed")));
    }

    @Command(name = "nightvision", aliases = { "nv" }, permission = "core.effect.nightvision", playerOnly = true)
    public void execute3(CommandArgs args) {
        Player player = args.getPlayer();

        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 999999, 2));
        player.sendMessage(CC.translate(CorePlugin.get().getConfig().getString("potion.nightvision")));
    }
}