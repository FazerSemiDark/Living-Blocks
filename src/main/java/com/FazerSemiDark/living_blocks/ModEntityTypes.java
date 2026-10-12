package com.FazerSemiDark.living_blocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
    DeferredRegister.create(Registries.ENTITY_TYPE, LivingBlocksMod.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<LivingBlock>> LIVING_BLOCK =
            ENTITY_TYPES.register(
                    "living_block",
                    () -> EntityType.Builder.of(LivingBlock::new, MobCategory.CREATURE)
                            .sized(0.6f, 0.85f) // размеры волка
                            .build("living_block")

            );
}
