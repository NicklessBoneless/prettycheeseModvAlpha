package nickless.prettycheese.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build();
    public static final FoodComponent CHEESEWHEEL = new FoodComponent.Builder().hunger(14).saturationModifier(2f).build();
}
