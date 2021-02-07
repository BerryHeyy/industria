package io.github.berryheyy.industria.block.workbench;

import io.github.berryheyy.industria.Logging;
import io.github.berryheyy.industria.setup.ModTileEntities;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class WorkbenchTileEntity extends TileEntity implements ITickableTileEntity {

    public WorkbenchTileEntity() {
        super(ModTileEntities.WORKBENCH.get());
    }

    @Override
    public void tick() {

    }
}
