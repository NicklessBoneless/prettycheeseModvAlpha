package nickless.prettycheese;

import net.fabricmc.api.ModInitializer;

import nickless.prettycheese.item.ModItemGroups;
import nickless.prettycheese.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class prettycheese implements ModInitializer {
	public static final String MOD_ID = "prettycheese";
    public static final Logger LOGGER = LoggerFactory.getLogger("prettycheese");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}