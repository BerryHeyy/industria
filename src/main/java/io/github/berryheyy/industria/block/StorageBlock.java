package io.github.berryheyy.industria.block;

import io.github.berryheyy.industria.itemgroup.ModItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StorageBlock extends BasicBlock {
    public StorageBlock() {
        super(AbstractBlock.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).hardnessAndResistance(4, 15), ModItemGroups.INDUSTRIA_MATERIALS_ITEM_GROUP);
    }
}
