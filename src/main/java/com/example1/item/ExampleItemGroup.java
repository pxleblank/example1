package com.example1.item;

import com.example1.ExampleMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ExampleItemGroup {

    public static final ItemGroup EXAMPLE_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ExampleMod.MOD_ID, "example_item_group"),
            FabricItemGroup.builder()
            .icon(() -> new ItemStack(ExampleItem.CUSTOM_ITEM))
            .displayName(Text.translatable("itemGroup.example1.item_group"))
            .entries((DisplayContext, entries) -> {
                entries.add(ExampleItem.CUSTOM_ITEM);
                entries.add(ExampleItem.CUSTOM_ITEM2);

                entries.add(Items.DIAMOND);

            })
            .build());

    public static void registerItemGroups() {
        ExampleMod.LOGGER.debug("Registering item groups for: " + ExampleMod.MOD_ID);
    }
}
