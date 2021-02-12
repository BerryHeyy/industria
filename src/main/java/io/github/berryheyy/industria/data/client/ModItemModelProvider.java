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
            buildItemBlock(metal.getItemName("_block"));

            // Gears
            builder(itemGenerated, metal.getItemName("_gear"));
            // Ingots (Except iron)
            if (metal != MetalEnum.IRON) builder(itemGenerated, metal.getItemName("_ingot"));
            // Plates
            builder(itemGenerated, metal.getItemName("_plate"));
            // Rods
            builder(itemGenerated, metal.getItemName("_rod"));
            // Coils
            getBuilder(metal.getItemName("_coil")).parent(itemGenerated).texture("layer0", "item/coil_base").texture("layer1", "item/" + metal.getItemName("_coil"));
        }

    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }

    private ItemModelBuilder buildItemBlock(String name) {
        return getBuilder(name).parent(new ModelFile(modLoc("block/" + name)) {
            @Override
            protected boolean exists() {
                return true;
            }
        });
    }
}
