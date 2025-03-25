package qtpi.placesbetween;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import qtpi.placesbetween.registry.BlockRegistry;
import qtpi.placesbetween.registry.ItemRegistry;

public class PlacesBetween implements ModInitializer {
	public static final String MOD_ID = "placesbetween";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ItemRegistry.registerModItems();
		BlockRegistry.registerModBlocks();
	}
}