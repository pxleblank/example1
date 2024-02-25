package com.example1;

import com.example1.item.ExampleItemGroup;
import com.example1.item.FuelR;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example1.item.ExampleItem;

public class ExampleMod implements ModInitializer {
	public static  final String MOD_ID = "example1";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ExampleItem.register();
		FuelR.register();
		ExampleItemGroup.registerItemGroups();
	}
}