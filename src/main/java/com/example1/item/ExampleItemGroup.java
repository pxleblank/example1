package com.example1.item;

import com.example1.ExampleMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ExampleItemGroup {

    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ExampleMod.MOD_ID, "item_group"),
            FabricItemGroup.builder()
            .icon(() -> new ItemStack(ExampleItem.CUSTOM_ITEM))
            .displayName(Text.translatable("itemGroup.example1.item_group"))
            .entries((context, entries) -> {
                entries.add(ExampleItem.CUSTOM_ITEM);
            })
            .build());

    public static void register() {
        ExampleMod.LOGGER.debug("Registering items for: " + ExampleMod.MOD_ID);
    }
}
