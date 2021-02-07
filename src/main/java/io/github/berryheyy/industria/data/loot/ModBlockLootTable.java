package io.github.berryheyy.industria.data.loot;

import io.github.berryheyy.industria.Reference;
import io.github.berryheyy.industria.block.BasicBlock;
import io.github.berryheyy.industria.setup.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.stream.Collectors;

public class ModBlockLootTable extends BlockLootTables {

    @Override
    protected void addTables() {
        // Metal Enum
        for (RegistryObject<BasicBlock> block : ModBlocks.METAL_BLOCKS.values()) {
            registerDropSelfLootTable(block.get());
        }
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getValues().stream()
                .filter(block -> Reference.MOD_ID.equals(block.getRegistryName().getNamespace()))
                .collect(Collectors.toSet());
    }
}
