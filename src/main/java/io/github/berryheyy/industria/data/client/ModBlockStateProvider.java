package io.github.berryheyy.industria.data.client;

import io.github.berryheyy.industria.Logging;
import io.github.berryheyy.industria.Reference;
import io.github.berryheyy.industria.enumm.MetalEnum;
import io.github.berryheyy.industria.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Reference.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Metal Storage Blocks (except iron)
        for (MetalEnum metal : MetalEnum.values()) {
            if (metal != MetalEnum.IRON) simpleBlock(ModBlocks.METAL_BLOCKS.get(metal.getItemName()).get());
        }
    }
}
