package qtpi.placesbetween.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import qtpi.placesbetween.PlacesBetween;

public class BlockRegistry {

    public static final Block GENERIC_YELLOW_WALLPAPER = registerBlock("generic_yellow_wallpaper",
            new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).sound(SoundType.WOOD).strength(-1.0F, 3600000.0F)
                    .noLootTable().isValidSpawn(Blocks::never)));
    public static final Block PLAIN_YELLOW_WALLPAPER = registerBlock("plain_yellow_wallpaper",
            new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).sound(SoundType.WOOD).strength(-1.0F, 3600000.0F)
                    .noLootTable().isValidSpawn(Blocks::never)));
    public static final Block STRIPED_YELLOW_WALLPAPER = registerBlock("striped_yellow_wallpaper",
            new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).sound(SoundType.WOOD).strength(-1.0F, 3600000.0F)
                    .noLootTable().isValidSpawn(Blocks::never)));
    public static final Block DOTTED_YELLOW_WALLPAPER = registerBlock("dotted_yellow_wallpaper",
            new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).sound(SoundType.WOOD).strength(-1.0F, 3600000.0F)
                    .noLootTable().isValidSpawn(Blocks::never)));

    public static final Block STAINED_PANEL = registerBlock("stained_panel",
            new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).sound(SoundType.WOOD).strength(-1.0F, 3600000.0F)
                    .noLootTable().isValidSpawn(Blocks::never)));

    public static final Block MOIST_CARPET = registerBlock("moist_carpet",
            new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).sound(SoundType.WOOL).strength(-1.0F, 3600000.0F)
                    .noLootTable().isValidSpawn(Blocks::never)));

    public static final Block FLUORESCENT_LIGHT = registerBlock("fluorescent_light",
            new Block(BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).sound(SoundType.GLASS).strength(-1.0F, 3600000.0F)
                    .lightLevel(blockState -> 15).noLootTable().isValidSpawn(Blocks::never)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(PlacesBetween.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(PlacesBetween.MOD_ID, name),
                new BlockItem(block, new Item.Properties()));
    }

    public static void registerModBlocks() {
        PlacesBetween.LOGGER.info("Registering Mod Blocks for " + PlacesBetween.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
            entries.accept(GENERIC_YELLOW_WALLPAPER);
            entries.accept(PLAIN_YELLOW_WALLPAPER);
            entries.accept(STRIPED_YELLOW_WALLPAPER);
            entries.accept(DOTTED_YELLOW_WALLPAPER);
            entries.accept(STAINED_PANEL);
            entries.accept(MOIST_CARPET);
            entries.accept(FLUORESCENT_LIGHT);
        });
    }
}
