package io.github.baka4n.playtimeremake.fabric;

import io.github.baka4n.playtimeremake.PlayTimeRemake;
import net.fabricmc.api.ModInitializer;

public class PlayTimeRemakeFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        PlayTimeRemake.init();
    }
}