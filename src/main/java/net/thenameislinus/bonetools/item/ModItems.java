package net.thenameislinus.bonetools.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thenameislinus.bonetools.BoneTools;

public class ModItems {
 public static final Item BONE_STICK = registerItem("bone_stick",
         new Item(new FabricItemSettings()));
 public static final Item BONE_BIT = registerItem("bone_bit",
         new Item(new FabricItemSettings()));
 public static final Item BONE_CRYSTAL = registerItem("bone_crystal",
         new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BoneTools.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(BONE_STICK);
        entries.add(BONE_BIT);
        entries.add(BONE_CRYSTAL);
    }

    public static void registerModItems() {
        BoneTools.LOGGER.info("Registering Mod Items for " + BoneTools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
