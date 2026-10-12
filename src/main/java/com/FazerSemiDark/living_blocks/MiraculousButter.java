package com.FazerSemiDark.living_blocks;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MiraculousButter {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LivingBlocksMod.MODID);

    public static final DeferredItem<Item> MIRACULOUS_BUTTER = ITEMS.registerSimpleItem(
            "miraculous_butter",
            new Item.Properties()
    );
}
