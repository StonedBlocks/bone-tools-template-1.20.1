package net.thenameislinus.bonetools.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
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
 public static final Item BONE_POWDER = registerItem("bone_powder",
         new Item(new FabricItemSettings()));
 public static final Item GLASS_POWDER = registerItem("glass_powder",
         new Item(new FabricItemSettings()));

 public static final Item BONE_DAGGER = registerItem("bone_dagger",
         new SwordItem(ModToolMaterial.BONE, 4, 4, new FabricItemSettings()));
 public static final Item BONE_PICK = registerItem("bone_pick",
         new PickaxeItem(ModToolMaterial.BONE, 1, 4, new FabricItemSettings()));
 public static final Item BONE_HATCHET = registerItem("bone_hatchet",
         new AxeItem(ModToolMaterial.BONE, 7, 4, new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BoneTools.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.addAfter(Items.PHANTOM_MEMBRANE, ModItems.BONE_CRYSTAL);
        entries.addAfter(ModItems.BONE_CRYSTAL, ModItems.BONE_BIT);
        entries.addAfter(ModItems.BONE_BIT, ModItems.BONE_STICK);
        entries.addAfter(ModItems.BONE_STICK, ModItems.BONE_POWDER);
        entries.addAfter(ModItems.BONE_STICK, ModItems.GLASS_POWDER);

    }

    private static void itemGroupCombat(FabricItemGroupEntries entries) {
        entries.addAfter(Items.NETHERITE_SWORD, ModItems.BONE_DAGGER);
        entries.addAfter(Items.NETHERITE_AXE, ModItems.BONE_HATCHET);



    }

    private static void itemGroupTools(FabricItemGroupEntries entries) {
        entries.addAfter(Items.NETHERITE_HOE, ModItems.BONE_PICK);
        entries.addAfter(ModItems.BONE_PICK, ModItems.BONE_HATCHET);



    }

    public static void registerModItems() {
        BoneTools.LOGGER.info("Registering Mod Items for " + BoneTools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::itemGroupCombat);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::itemGroupTools);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
