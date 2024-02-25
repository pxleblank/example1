package com.example1.item;

import com.example1.ExampleMod;
import com.example1.item.custom.CustomItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import java.util.List;

public class ExampleItem {
    public static final Item CUSTOM_ITEM = registerItem("custom_item", new CustomItem(new FabricItemSettings().maxCount(63)));
    public static final Item CUSTOM_ITEM2 = registerItem("custom_item2", new Item(new FabricItemSettings()));

//    public static final Item CUSTOM_ITEM0 = registerItem("custom_item0",
//            new Item(new FabricItemSettings()),
//            RegistryKey.of(Registries.ITEM_GROUP.getKey(), new Identifier(ExampleMod.MOD_ID, "item_group")));

    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(CUSTOM_ITEM);
        entries.add(CUSTOM_ITEM2);
    }

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ExampleMod.MOD_ID, id), item);
    }

//    public static Item registerItem(String id, Item item, RegistryKey<ItemGroup> group) {
//        Item registeredItem = registerItem(id, item);
//        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(registeredItem));
//        return registeredItem;
//    }

    public static void register() {
        ExampleMod.LOGGER.debug("Registering items for: " + ExampleMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ExampleItem::addItemsToIngredientItemGroup);
    }
}
