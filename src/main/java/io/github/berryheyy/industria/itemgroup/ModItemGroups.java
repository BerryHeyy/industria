package io.github.berryheyy.industria.itemgroup;

import io.github.berryheyy.industria.Reference;
import io.github.berryheyy.industria.setup.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {
    public static final ItemGroup INDUSTRIA_MATERIALS_ITEM_GROUP = new ItemGroup(Reference.MOD_ID + "_materials") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.METAL_INGOTS.get("cobalt").get());
        }
    };

    public static final ItemGroup INDUSTRIA_MACHINES_ITEM_GROUP = new ItemGroup(Reference.MOD_ID + "_machines") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.METAL_INGOTS.get("zinc").get());
        }
    };

    public static final ItemGroup INDUSTRIA_COMPONENTS_ITEM_GROUP = new ItemGroup(Reference.MOD_ID + "_components") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.METAL_INGOTS.get("copper").get());
        }
    };
}
