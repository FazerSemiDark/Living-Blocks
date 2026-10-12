package com.FazerSemiDark.living_blocks;

import net.minecraft.client.model.SlimeModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class LivingMobRender extends MobRenderer<LivingBlock, SlimeModel<LivingBlock>> {

    public LivingMobRender(EntityRendererProvider.Context context) {
        super(context, new SlimeModel<>(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull LivingBlock livingBlock) {
        return ResourceLocation.withDefaultNamespace("textures/entity/slime/slime.png");
    }
}
