package qtpi.placesbetween.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import qtpi.placesbetween.PlacesBetween;

public class ItemRegistry {

    public static final Item ALMOND_WATER = registerItem("almond_water", new Item(new Item.Properties()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(PlacesBetween.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PlacesBetween.LOGGER.info("Registering Mod Items for " + PlacesBetween.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(entries -> {
            entries.accept(ALMOND_WATER);
        });
    }
}
