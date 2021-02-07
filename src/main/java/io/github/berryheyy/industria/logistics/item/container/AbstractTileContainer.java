package io.github.berryheyy.industria.logistics.item.container;

import io.github.berryheyy.industria.logistics.item.IInventoryHolder;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntity;

import javax.annotation.Nullable;

public class AbstractTileContainer<T extends TileEntity & IInventoryHolder> extends AbstractContainer {

    protected AbstractTileContainer(@Nullable ContainerType<?> type, int id, PlayerInventory inventory) {
        super(type, id, inventory);
    }
}
