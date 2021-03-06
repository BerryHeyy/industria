package io.github.berryheyy.industria.logistics.item.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class AbstractContainer extends Container {
    public final PlayerEntity player;
    public final World world;

    protected AbstractContainer(@Nullable ContainerType<?> type, int id, PlayerInventory inventory) {
        super(type, id);
        this.player = inventory.player;
        this.world = this.player.world;
    }

    protected void addPlayerInventory(PlayerInventory playerInventory, int x, int y, int yDif) {
        for (int l = 0; l < 3; ++l) {
            for (int k = 0; k < 9; ++k) {
                addSlot(new Slot(playerInventory, k + l * 9 + 9, x + k * 18, l * 18 + y));
            }
        }
        for (int i1 = 0; i1 < 9; ++i1) {
            addSlot(new Slot(playerInventory, i1, x + i1 * 18, y + 54 + yDif));
        }
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return true;
    }
}
