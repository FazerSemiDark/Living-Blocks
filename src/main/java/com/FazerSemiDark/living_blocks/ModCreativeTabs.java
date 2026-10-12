package com.FazerSemiDark.living_blocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LivingBlocksMod.MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LIVING_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("living_blocks_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.living_blocks_tab"))
                    .icon(() -> new ItemStack(MiraculousButter.MIRACULOUS_BUTTER.get()))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .displayItems((parameters, output) -> {
                        output.accept(MiraculousButter.MIRACULOUS_BUTTER.get());
                    })
                    .build()
            );

}
