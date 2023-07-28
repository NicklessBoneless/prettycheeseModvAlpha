package nickless.prettycheese.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nickless.prettycheese.block.ModBlocks;
import nickless.prettycheese.prettycheese;

public class ModItemGroups {
    public static final ItemGroup CHEESE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(prettycheese.MOD_ID,"cheese"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cheese"))
                    .icon( () -> new ItemStack(ModItems.CHEESE)).entries((displayContext, entries) -> {

                        //ITEMS
                        entries.add(ModItems.CHEESE);
                        entries.add(ModItems.CHEESEWHEEL);
                        entries.add(ModItems.SALT);

                        //BLOCKS
                        entries.add(ModBlocks.SALT_BLOCK);
                        entries.add(ModBlocks.CHEESE_WHEEL);

                    }).build());

    public static void registerItemGroups(){
        prettycheese.LOGGER.info("Registering Item Groups for "+prettycheese.MOD_ID);
    }
}
