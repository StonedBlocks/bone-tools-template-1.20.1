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

 public static final Item BONE_BIT = registerItem("bone_bit",
         new Item(new FabricItemSettings()));
 public static final Item BONE_CRYSTAL = registerItem("bone_crystal",
         new Item(new FabricItemSettings()));
 public static final Item BONE_POWDER = registerItem("bone_powder",
         new Item(new FabricItemSettings()));
 public static final Item GLASS_POWDER = registerItem("glass_powder",
         new Item(new FabricItemSettings()));

 public static final Item BONE_STICK = registerItem("bone_stick",
            new Item(new FabricItemSettings()));
 public static final Item THICK_BONE_STICK = registerItem("thick_bone_stick",
         new Item(new FabricItemSettings()));
 public static final Item SHARPENED_BONE_STICK = registerItem("sharpened_bone_stick",
         new Item(new FabricItemSettings()));
 public static final Item SHORT_SHARPENED_BONE_STICK = registerItem("short_sharpened_bone_stick",
         new Item(new FabricItemSettings()));
 public static final Item THICK_SHARPENED_BONE_STICK = registerItem("thick_sharpened_bone_stick",
         new Item(new FabricItemSettings()));

 public static final Item FLINT_0 = registerItem("flint_0",
            new Item(new FabricItemSettings()));
 public static final Item FLINT_1 = registerItem("flint_1",
            new Item(new FabricItemSettings().maxCount(1).recipeRemainder(ModItems.FLINT_0)));
 public static final Item FLINT_2 = registerItem("flint_2",
            new Item(new FabricItemSettings().maxCount(1).recipeRemainder(ModItems.FLINT_1)));
 public static final Item FLINT_3 = registerItem("flint_3",
            new Item(new FabricItemSettings().maxCount(1).recipeRemainder(ModItems.FLINT_2)));
 public static final Item FLINT_4 = registerItem("flint_4",
            new Item(new FabricItemSettings().maxCount(1).recipeRemainder(ModItems.FLINT_3)));



 public static final Item BONE_SWORD = registerItem("bone_sword",
         new BoneSwordItem(ModToolMaterial.BONE, 3, -2.4f, new FabricItemSettings().maxDamage(250)));
 public static final Item BONE_DAGGER = registerItem("bone_dagger",
         new BoneDaggerItem(ModToolMaterial.BONE, 2, 6, new FabricItemSettings().maxDamage(150)));
 public static final Item BONE_PICK = registerItem("bone_pick",
         new PickaxeItem(ModToolMaterial.BONE, 1, 4, new FabricItemSettings().maxDamage(200)));
 public static final Item BONE_HATCHET = registerItem("bone_hatchet",
         new BoneAxeItem(ModToolMaterial.BONE, 4, -3.2f, new FabricItemSettings().maxDamage(200)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BoneTools.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.addAfter(Items.PHANTOM_MEMBRANE, ModItems.BONE_CRYSTAL);
        entries.addAfter(ModItems.BONE_CRYSTAL, ModItems.BONE_BIT);
        entries.addAfter(ModItems.BONE_BIT, ModItems.BONE_STICK);
        entries.addAfter(ModItems.BONE_STICK, ModItems.THICK_BONE_STICK);
        entries.addAfter(ModItems.THICK_BONE_STICK, ModItems.SHARPENED_BONE_STICK);
        entries.addAfter(ModItems.SHARPENED_BONE_STICK, ModItems.SHORT_SHARPENED_BONE_STICK);
        entries.addAfter(ModItems.SHORT_SHARPENED_BONE_STICK, ModItems.THICK_SHARPENED_BONE_STICK);
        entries.addAfter(ModItems.THICK_SHARPENED_BONE_STICK, ModItems.BONE_POWDER);
        entries.addAfter(ModItems.BONE_POWDER, ModItems.GLASS_POWDER);


        entries.addAfter(Items.FLINT, ModItems.FLINT_4);
        entries.addAfter(ModItems.FLINT_4, ModItems.FLINT_3);
        entries.addAfter(ModItems.FLINT_3, ModItems.FLINT_2);
        entries.addAfter(ModItems.FLINT_2, ModItems.FLINT_1);
        entries.addAfter(ModItems.FLINT_1, ModItems.FLINT_0);


    }

    private static void itemGroupCombat(FabricItemGroupEntries entries) {
        entries.addAfter(Items.NETHERITE_SWORD, ModItems.BONE_SWORD);
        entries.addAfter(ModItems.BONE_SWORD, ModItems.BONE_DAGGER);
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
