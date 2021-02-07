package io.github.berryheyy.industria.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BasicItem extends Item {
    public BasicItem(ItemGroup itemGroup) {
        super(new Properties().group(itemGroup));
    }
}
