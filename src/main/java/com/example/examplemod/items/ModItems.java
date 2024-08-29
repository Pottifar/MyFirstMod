package com.example.examplemod.items;

import com.example.examplemod.MyFirstMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MyFirstMod.MOD_ID);

    // New Ore Item
    public static final RegistryObject<Item>  NewOre = ITEMS.register("newore",
            () -> new Item(new Item.Properties()));

    // Other new item
    public static final RegistryObject<Item>  ItemTwo = ITEMS.register("itemtwo",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register((eventBus));
    }


}
