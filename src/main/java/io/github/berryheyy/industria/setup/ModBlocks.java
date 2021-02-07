package io.github.berryheyy.industria.setup;

import io.github.berryheyy.industria.block.BasicBlock;
import io.github.berryheyy.industria.block.StorageBlock;
import io.github.berryheyy.industria.block.workbench.WorkbenchBlock;
import io.github.berryheyy.industria.enumm.MetalEnum;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;


import java.util.Hashtable;
import java.util.Map;
import java.util.function.Supplier;

public class ModBlocks {
    public static Map<String, RegistryObject<BasicBlock>> METAL_BLOCKS = new Hashtable<>();

    public static final RegistryObject<BasicBlock> WORKBENCH_BLOCK = register("workbench", WorkbenchBlock::new);

    public static void register() {
        registerMetals();
    }

    private static void registerMetals() {
        for (MetalEnum metal : MetalEnum.values()) {
            if (metal != MetalEnum.IRON) METAL_BLOCKS.put(metal.getItemName(), register(metal.getItemName("_block"), StorageBlock::new));
        }
    }

    private static <T extends BasicBlock> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return RegistrationHandler.BLOCKS.register(name, block);
    }

    private static <T extends BasicBlock> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        RegistrationHandler.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(block.get().itemGroup)));

        return ret;
    }
}
