package com.example1.item;

import com.example1.ExampleMod;
import net.fabricmc.fabric.api.registry.FuelRegistry;

import static com.example1.item.ExampleItem.CUSTOM_ITEM;

public class FuelR {
    public static void register() {
        FuelRegistry.INSTANCE.add(CUSTOM_ITEM, 300);
    }
}
