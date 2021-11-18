package me.krymz0n.vyperhax.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;

public class Utils {
    public static boolean canUpdate() {
        MinecraftClient mc = MinecraftClient.getInstance();
        return mc != null && mc.world != null && mc.player != null;
    }

    public static boolean isWrongScreen() {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (canUpdate()) {
            return mc.currentScreen == null;
        }

        assert mc != null;
        return mc.currentScreen instanceof TitleScreen || mc.currentScreen instanceof MultiplayerScreen || mc.currentScreen instanceof SelectWorldScreen || mc.currentScreen instanceof ChatScreen;
    }
}
