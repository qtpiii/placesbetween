package qtpi.placesbetween.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.world.level.block.Block;
import qtpi.placesbetween.registry.BlockRegistry;
import qtpi.placesbetween.registry.ItemRegistry;

import static net.minecraft.data.models.model.TextureMapping.getBlockTexture;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialBlock(BlockRegistry.PLAIN_YELLOW_WALLPAPER, TexturedModel.COLUMN_WITH_WALL);
        blockModelGenerators.createTrivialBlock(BlockRegistry.DOTTED_YELLOW_WALLPAPER, TexturedModel.COLUMN_WITH_WALL);
        blockModelGenerators.createTrivialCube(BlockRegistry.STAINED_PANEL);
        blockModelGenerators.createTrivialCube(BlockRegistry.FLUORESCENT_LIGHT);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ItemRegistry.ALMOND_WATER, ModelTemplates.FLAT_ITEM);
    }
}
