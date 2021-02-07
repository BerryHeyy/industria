package io.github.berryheyy.industria.logistics.item;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nullable;

public class Inventory extends ItemStackHandler {
    private IInventoryHolder tile;

    public Inventory(int size) {
        this (size, null);
    }

    public Inventory(Stacks stacks) {
        this(stacks, null);
    }

    public Inventory(Stacks stacks, @Nullable IInventoryHolder tile) {
        super(stacks);
        this.tile = tile;
    }

    Inventory(int size, @Nullable IInventoryHolder tile) {
        super(size);
        this.tile = tile;
    }

    public static Inventory createBlank() {
        return new Inventory(0, null);
    }



}
