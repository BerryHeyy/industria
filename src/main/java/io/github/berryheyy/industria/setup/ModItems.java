package io.github.berryheyy.industria.setup;

import io.github.berryheyy.industria.enumm.MetalEnum;
import io.github.berryheyy.industria.item.BasicItem;
import io.github.berryheyy.industria.itemgroup.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.Dictionary;
import java.util.Hashtable;

public class ModItems {
    public static Dictionary<String, RegistryObject<Item>> METAL_GEARS = new Hashtable<>();
    public static Dictionary<String, RegistryObject<Item>> METAL_INGOTS = new Hashtable<>();
    public static Dictionary<String, RegistryObject<Item>> METAL_PLATES = new Hashtable<>();
    public static Dictionary<String, RegistryObject<Item>> METAL_RODS = new Hashtable<>();
    public static Dictionary<String, RegistryObject<Item>> METAL_COILS = new Hashtable<>();

    // Motors
    public static final RegistryObject<Item> TINY_MOTOR = RegistrationHandler.ITEMS.register("tiny_motor", () -> new BasicItem(ModItemGroups.INDUSTRIA_COMPONENTS_ITEM_GROUP));
    public static final RegistryObject<Item> ADVANCED_MOTOR = RegistrationHandler.ITEMS.register("advanced_motor", () -> new BasicItem(ModItemGroups.INDUSTRIA_COMPONENTS_ITEM_GROUP));

    static void register() {
        registerMetals();
    }

    static void registerMetals() {
        for (MetalEnum metal : MetalEnum.values()) {
            // Gears
            METAL_GEARS.put(metal.getItemName(), RegistrationHandler.ITEMS.register(metal.getItemName("_gear"),
                    () -> new BasicItem(ModItemGroups.INDUSTRIA_MATERIALS_ITEM_GROUP)));

            // Ingots (Except iron)
            if (metal != MetalEnum.IRON) METAL_INGOTS.put(metal.getItemName(), RegistrationHandler.ITEMS.register(metal.getItemName("_ingot"),
                    () -> new BasicItem(ModItemGroups.INDUSTRIA_MATERIALS_ITEM_GROUP)));

            // Plates
            METAL_PLATES.put(metal.getItemName(), RegistrationHandler.ITEMS.register(metal.getItemName("_plate"),
                    () -> new BasicItem(ModItemGroups.INDUSTRIA_MATERIALS_ITEM_GROUP)));

            // Rods
            METAL_RODS.put(metal.getItemName(), RegistrationHandler.ITEMS.register(metal.getItemName("_rod"),
                    () -> new BasicItem(ModItemGroups.INDUSTRIA_MATERIALS_ITEM_GROUP)));

            // Coils
            METAL_COILS.put(metal.getItemName(), RegistrationHandler.ITEMS.register(metal.getItemName("_coil"),
                    () -> new BasicItem(ModItemGroups.INDUSTRIA_MATERIALS_ITEM_GROUP)));
        }
    }
}
