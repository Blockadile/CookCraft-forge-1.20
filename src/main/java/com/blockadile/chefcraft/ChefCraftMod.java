package com.blockadile.chefcraft;

import com.blockadile.chefcraft.init.ChefCraftItems;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ChefCraftMod.MODID)
public class ChefCraftMod {
    public static final String MODID = "chef_craft";

    public ChefCraftMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ChefCraftItems.ITEMS.register(bus);
    }

}
