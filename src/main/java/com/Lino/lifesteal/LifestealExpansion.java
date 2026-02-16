package com.Lino.lifesteal;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class LifestealExpansion extends PlaceholderExpansion {

    private final Lifesteal plugin;

    public LifestealExpansion(Lifesteal plugin) {
        this.plugin = plugin;
    }

    @Override
    public @NotNull String getIdentifier() {
        return "lifesteal";
    }

    @Override
    public @NotNull String getAuthor() {
        return "Lino";
    }

    @Override
    public @NotNull String getVersion() {
        return plugin.getDescription().getVersion();
    }

    @Override
    public boolean persist() {
        return true;
    }

    @Override
    public @Nullable String onRequest(OfflinePlayer player, @NotNull String params) {
        if (player == null) return "";

        DatabaseManager db = plugin.getDatabaseManager();
        UUID uuid = player.getUniqueId();

        switch (params.toLowerCase()) {
            case "hearts":
                int hearts = db.getHearts(uuid);
                return hearts == -1 ? String.valueOf(plugin.getStartingHearts()) : String.valueOf(hearts);

            case "maxhearts":
                return String.valueOf(plugin.getMaxHearts());

            case "health":
                int h = db.getHearts(uuid);
                if (h == -1) h = plugin.getStartingHearts();
                return String.valueOf(h * 2);

            case "banned":
                return String.valueOf(db.isBanned(uuid));

            case "status":
                return db.isBanned(uuid) ? "Eliminated" : "Alive";

            case "hearts_bar":
                int current = db.getHearts(uuid);
                if (current == -1) current = plugin.getStartingHearts();
                int max = plugin.getMaxHearts();
                StringBuilder bar = new StringBuilder();
                for (int i = 0; i < max; i++) {
                    bar.append(i < current ? "&c❤" : "&7❤");
                }
                return bar.toString();

            case "hearts_percent":
                int cur = db.getHearts(uuid);
                if (cur == -1) cur = plugin.getStartingHearts();
                int percentage = (int) ((cur / (double) plugin.getMaxHearts()) * 100);
                return String.valueOf(percentage);

            default:
                return null;
        }
    }
}