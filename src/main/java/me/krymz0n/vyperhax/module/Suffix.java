package me.krymz0n.vyperhax.module;

import com.google.common.eventbus.Subscribe;
import com.lukflug.panelstudio.setting.IModule;
import net.minecraft.client.gui.ClientChatListener;

import java.util.Arrays;

public class Suffix extends Module {

    public Suffix() {
        super("Suffix", "Adds a cool suffix to your messages!", () -> true, true);
    }

}

