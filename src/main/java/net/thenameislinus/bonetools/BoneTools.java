package net.thenameislinus.bonetools;

import net.fabricmc.api.ModInitializer;

import net.thenameislinus.bonetools.item.ModItemGroup;
import net.thenameislinus.bonetools.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoneTools implements ModInitializer {
	public static final String MOD_ID = "bonetools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
	}
}