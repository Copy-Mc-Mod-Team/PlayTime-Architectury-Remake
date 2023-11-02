package io.github.baka4n.playtimeremake.mixin.forge;

import io.github.baka4n.playtimeremake.PlayTimeRemake;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.time.Duration;
import java.time.LocalDateTime;

@Mixin(GameMenuScreen.class)
public class MenuScreenMixin extends Screen {
    protected MenuScreenMixin(Text title) {
        super(title);
    }

    @Inject(method = "render", at = @At("TAIL"))
    private void render(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        LocalDateTime time = LocalDateTime.now();
        Duration diff = Duration.between(PlayTimeRemake.date_started, time);
        String draw = DurationFormatUtils.formatDuration(diff.toMillis(),  "H:mm:ss", true);
        context.drawTextWithShadow(textRenderer, draw, 8, 8, 16777215);
    }
}
