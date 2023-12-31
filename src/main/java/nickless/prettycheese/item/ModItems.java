package nickless.prettycheese.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nickless.prettycheese.prettycheese;
import org.jetbrains.annotations.NotNull;

public class ModItems {

    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE)));
    public static final Item CHEESEWHEEL = registerItem("cheesewheel", new Item(new FabricItemSettings().food(ModFoodComponents.CHEESEWHEEL)));
    public static final Item SALT = registerItem("salt", new Item(new FabricItemSettings()));

    private static void addItemsToFoodDrinkItemGroup(@NotNull FabricItemGroupEntries entries){
        entries.add(CHEESE);
        entries.add(CHEESEWHEEL);
    }
    public static void addItemsToIngredientsItemGroup(@NotNull FabricItemGroupEntries entries){
        entries.add(SALT);
    }
    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, new Identifier(prettycheese.MOD_ID, name), item);
    }

    public static void registerModItems(){
        prettycheese.LOGGER.info("Registering Mod items for" + prettycheese.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodDrinkItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
    }
}