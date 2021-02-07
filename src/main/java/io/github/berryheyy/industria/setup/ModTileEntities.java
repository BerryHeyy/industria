package io.github.berryheyy.industria.setup;

import io.github.berryheyy.industria.block.workbench.WorkbenchTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

public class ModTileEntities {
    public static final RegistryObject<TileEntityType<WorkbenchTileEntity>> WORKBENCH = RegistrationHandler.TILE_ENTITIES.register("workbench",
            () -> TileEntityType.Builder.create(WorkbenchTileEntity::new, ModBlocks.WORKBENCH_BLOCK.get()).build(null));


    public static void register() {

    }

}
