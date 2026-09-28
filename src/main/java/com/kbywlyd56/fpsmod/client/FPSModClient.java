package com.kbywlyd56.fpsmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public
class FPSModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HudRenderCallback.EVENT.register((drawContext, tickDelta) -> {
            MinecraftClient client = MinecraftClient.getInstance();
            int fps = client.getCurrentFps();
            Text fpsText = Text.literal("FPS: " + fps);
            drawContext.drawText(client.textRenderer, fpsText, 10, 10, 0xFFFFFF, true);
        });
    }
}
