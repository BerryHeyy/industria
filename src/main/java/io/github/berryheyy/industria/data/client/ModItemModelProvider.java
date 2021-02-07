package io.github.berryheyy.industria.data.client;

import io.github.berryheyy.industria.Logging;
import io.github.berryheyy.industria.Reference;
import io.github.berryheyy.industria.enumm.MetalEnum;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        Logging.LOGGER.warn("Heyheyheyhey");
        // Metals
        for (MetalEnum metal : MetalEnum.values()) {       
            // Storage Block
            buildItemBlock(metal.getItemName("_block"), "metal_block");

            // Gears
            builder(itemGenerated, metal.getItemName("_block"), "metal_gear");
            // Ingots (Except iron)
            if (metal != MetalEnum.IRON) builder(itemGenerated, metal.getItemName("_block"), "_ingot");
            // Plates
            builder(itemGenerated, metal.getItemName("_block"), "metal_plate");
            // Rods
            builder(itemGenerated, metal.getItemName("_block"), "metal_rod");
        }

    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name, String textureName) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + textureName);
    }

    private ItemModelBuilder buildItemBlock(String name, String textureName) {
        return getBuilder(name).parent(new ModelFile(modLoc("block/" + textureName)) {
            @Override
            protected boolean exists() {
                return true;
            }
        });
    }
}
