package net.thenameislinus.bonetools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.thenameislinus.bonetools.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BONE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BONE_BIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BONE_CRYSTAL, Models.GENERATED);

        itemModelGenerator.register(ModItems.BONED_WOODEN_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.BONED_WOODEN_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.BONED_WOODEN_AXE,Models.HANDHELD);

        itemModelGenerator.register(ModItems.BONED_STONE_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.BONED_STONE_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.BONED_STONE_AXE,Models.HANDHELD);

        itemModelGenerator.register(ModItems.BONED_IRON_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.BONED_IRON_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.BONED_IRON_AXE,Models.HANDHELD);

        itemModelGenerator.register(ModItems.BONED_GOLDEN_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.BONED_GOLDEN_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.BONED_GOLDEN_AXE,Models.HANDHELD);

        itemModelGenerator.register(ModItems.BONED_DIAMOND_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.BONED_DIAMOND_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.BONED_DIAMOND_AXE,Models.HANDHELD);

        itemModelGenerator.register(ModItems.BONED_NETHERITE_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.BONED_NETHERITE_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.BONED_NETHERITE_AXE,Models.HANDHELD);

    }
}
