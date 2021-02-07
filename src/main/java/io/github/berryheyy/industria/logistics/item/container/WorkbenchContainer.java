package io.github.berryheyy.industria.logistics.item.container;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;

import javax.annotation.Nullable;

public class WorkbenchContainer extends AbstractContainer {

    protected WorkbenchContainer(@Nullable ContainerType<?> type, int id, PlayerInventory inventory) {
        super(type, id, inventory);
    }
}
