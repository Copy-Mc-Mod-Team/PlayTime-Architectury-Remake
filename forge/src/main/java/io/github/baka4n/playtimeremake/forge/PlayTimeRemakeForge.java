package io.github.baka4n.playtimeremake.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.baka4n.playtimeremake.PlayTimeRemake;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PlayTimeRemake.MOD_ID)
public class PlayTimeRemakeForge {
    public PlayTimeRemakeForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(PlayTimeRemake.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        PlayTimeRemake.init();
    }
}