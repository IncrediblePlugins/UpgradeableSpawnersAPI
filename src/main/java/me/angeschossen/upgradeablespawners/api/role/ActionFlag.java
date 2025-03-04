package me.angeschossen.upgradeablespawners.api.role;

import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

/**
 * Used for restricting editing spawners.
 */
public class ActionFlag extends com.github.angeschossen.pluginframework.api.flags.roles.ActionFlag {

    public final boolean regionMembers;

    public ActionFlag(@NotNull Plugin plugin, @NotNull String name, boolean regionMembers) {
        super(plugin, name);
        this.regionMembers = regionMembers;
    }

    /**
     * Get the bypass permission.
     *
     * @return Bypass permission
     */
    @Override
    public @NotNull String getBypassPermission() {
        return "uspawners.bypass." + toString();
    }

    /**
     * Get permission needed to toggle this flag.
     *
     * @return permission to toggle this flag
     */
    @Override
    public @NotNull String getTogglePermission() {
        return "uspawners.setting." + toString();
    }

    /**
     * Get the message key of this flag.
     *
     * @return message key
     */
    @Override
    public String getMessageKey() {
        return "noaccess.edit";
    }
}
