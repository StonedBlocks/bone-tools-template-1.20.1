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

 public static final Item BONED_WOODEN_SWORD = registerItem("boned_wooden_sword",
         new SwordItem(ModToolMaterial.BONED_WOOD, 4, 4, new FabricItemSettings()));
 public static final Item BONED_WOODEN_PICKAXE = registerItem("boned_wooden_pickaxe",
         new PickaxeItem(ModToolMaterial.BONED_WOOD, 1, 4, new FabricItemSettings()));
 public static final Item BONED_WOODEN_AXE = registerItem("boned_wooden_axe",
         new AxeItem(ModToolMaterial.BONED_WOOD, 7, 4, new FabricItemSettings()));

 public static final Item BONED_STONE_SWORD = registerItem("boned_stone_sword",
         new SwordItem(ModToolMaterial.BONED_STONE, 4, 4, new FabricItemSettings()));
 public static final Item BONED_STONE_PICKAXE = registerItem("boned_stone_pickaxe",
         new PickaxeItem(ModToolMaterial.BONED_STONE, 1, 4, new FabricItemSettings()));
 public static final Item BONED_STONE_AXE = registerItem("boned_stone_axe",
         new AxeItem(ModToolMaterial.BONED_STONE, 8, 4, new FabricItemSettings()));

 public static final Item BONED_IRON_SWORD = registerItem("boned_iron_sword",
         new SwordItem(ModToolMaterial.BONED_IRON, 4, 4, new FabricItemSettings()));
 public static final Item BONED_IRON_PICKAXE = registerItem("boned_iron_pickaxe",
         new PickaxeItem(ModToolMaterial.BONED_IRON, 1, 4, new FabricItemSettings()));
 public static final Item BONED_IRON_AXE = registerItem("boned_iron_axe",
         new AxeItem(ModToolMaterial.BONED_IRON, 7, 4, new FabricItemSettings()));

 public static final Item BONED_GOLDEN_SWORD = registerItem("boned_golden_sword",
         new SwordItem(ModToolMaterial.BONED_GOLD, 4, 4, new FabricItemSettings()));
 public static final Item BONED_GOLDEN_PICKAXE = registerItem("boned_golden_pickaxe",
         new PickaxeItem(ModToolMaterial.BONED_GOLD, 1, 4, new FabricItemSettings()));
 public static final Item BONED_GOLDEN_AXE = registerItem("boned_golden_axe",
         new AxeItem(ModToolMaterial.BONED_GOLD, 7, 4, new FabricItemSettings()));

 public static final Item BONED_DIAMOND_SWORD = registerItem("boned_diamond_sword",
         new SwordItem(ModToolMaterial.BONED_DIAMOND, 4, 4, new FabricItemSettings()));
 public static final Item BONED_DIAMOND_PICKAXE = registerItem("boned_diamond_pickaxe",
         new PickaxeItem(ModToolMaterial.BONED_DIAMOND, 1, 4, new FabricItemSettings()));
 public static final Item BONED_DIAMOND_AXE = registerItem("boned_diamond_axe",
         new AxeItem(ModToolMaterial.BONED_DIAMOND, 6, 4, new FabricItemSettings()));

 public static final Item BONED_NETHERITE_SWORD = registerItem("boned_netherite_sword",
         new SwordItem(ModToolMaterial.BONED_NETHERITE, 4, 4, new FabricItemSettings()));
 public static final Item BONED_NETHERITE_PICKAXE = registerItem("boned_netherite_pickaxe",
         new PickaxeItem(ModToolMaterial.BONED_NETHERITE, 1, 4, new FabricItemSettings()));
 public static final Item BONED_NETHERITE_AXE = registerItem("boned_netherite_axe",
         new AxeItem(ModToolMaterial.BONED_NETHERITE, 6, 4, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BoneTools.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(BONE_STICK);
        entries.add(BONE_BIT);
        entries.add(BONE_CRYSTAL);

    }

    private static void itemGroupCombat(FabricItemGroupEntries entries) {
        entries.add(BONED_WOODEN_SWORD);
        entries.add(BONED_WOODEN_AXE);

        entries.add(BONED_STONE_SWORD);
        entries.add(BONED_STONE_AXE);

        entries.add(BONED_IRON_SWORD);
        entries.add(BONED_IRON_AXE);

        entries.add(BONED_GOLDEN_SWORD);
        entries.add(BONED_GOLDEN_AXE);

        entries.add(BONED_DIAMOND_SWORD);
        entries.add(BONED_DIAMOND_AXE);

        entries.add(BONED_NETHERITE_SWORD);
        entries.add(BONED_NETHERITE_AXE);

    }

    private static void itemGroupTools(FabricItemGroupEntries entries) {
        entries.add(BONED_WOODEN_PICKAXE);
        entries.add(BONED_WOODEN_AXE);

        entries.add(BONED_STONE_PICKAXE);
        entries.add(BONED_STONE_AXE);

        entries.add(BONED_IRON_PICKAXE);
        entries.add(BONED_IRON_AXE);

        entries.add(BONED_GOLDEN_PICKAXE);
        entries.add(BONED_GOLDEN_AXE);

        entries.add(BONED_DIAMOND_PICKAXE);
        entries.add(BONED_DIAMOND_AXE);

        entries.add(BONED_NETHERITE_PICKAXE);
        entries.add(BONED_NETHERITE_AXE);

    }

    public static void registerModItems() {
        BoneTools.LOGGER.info("Registering Mod Items for " + BoneTools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::itemGroupCombat);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::itemGroupTools);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
