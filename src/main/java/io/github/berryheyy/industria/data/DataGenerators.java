package io.github.berryheyy.industria.data;

import io.github.berryheyy.industria.Logging;
import io.github.berryheyy.industria.Reference;
import io.github.berryheyy.industria.data.client.ModBlockStateProvider;
import io.github.berryheyy.industria.data.client.ModItemModelProvider;
import io.github.berryheyy.industria.data.loot.ModLootTableProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {

    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
    	Logging.LOGGER.warn("Heyheyheyhey1");
    	
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        //gen.addProvider(new ModLootTableProvider(gen));
        
        gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));
    }

}
