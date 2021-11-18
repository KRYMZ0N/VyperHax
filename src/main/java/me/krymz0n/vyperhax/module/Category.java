package me.krymz0n.vyperhax.module;

import com.lukflug.panelstudio.setting.ICategory;
import com.lukflug.panelstudio.setting.IClient;
import com.lukflug.panelstudio.setting.IModule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public enum Category implements ICategory {
    COMBAT("Combat"),EXPLOITS("Exploits"),HUD("HUD"),MISCELLANEOUS("Miscellaneous"),MOVEMENT("Movement"),OTHER("Other"),RENDER("Render"),WORLD("World");
    public final String displayName;
    public final List<Module> modules=new ArrayList<Module>();
    public static Random random=new Random();

    private Category (String displayName) {
        this.displayName=displayName;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public Stream<IModule> getModules() {
        return modules.stream().map(module->module);
    }

    public static IClient getClient() {
        return new IClient() {
            @Override
            public Stream<ICategory> getCategories() {
                return Arrays.stream(Category.values());
            }
        };
    }
}
