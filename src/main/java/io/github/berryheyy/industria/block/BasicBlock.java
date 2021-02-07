package io.github.berryheyy.industria.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;

public class BasicBlock extends Block {
    public ItemGroup itemGroup;

    public BasicBlock(Properties properties, ItemGroup itemGroup) {
        super(properties);

        this.itemGroup = itemGroup;
    }
}
