package com.blockadile.chefcraft.init;

import com.blockadile.chefcraft.ChefCraftMod;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ChefCraftItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChefCraftMod.MODID);
    public static final RegistryObject<Item> ONION = ITEMS.register("onion", () -> new Item(new Item.Properties()
            .stacksTo(64)
            .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())
            .rarity(Rarity.COMMON)
    ));
}
