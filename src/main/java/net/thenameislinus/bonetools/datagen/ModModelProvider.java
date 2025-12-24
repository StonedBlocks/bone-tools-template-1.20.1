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

        itemModelGenerator.register(ModItems.BONE_BIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BONE_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BONE_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLASS_POWDER, Models.GENERATED);

        itemModelGenerator.register(ModItems.BONE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.THICK_BONE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHARPENED_BONE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHORT_SHARPENED_BONE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.THICK_SHARPENED_BONE_STICK, Models.GENERATED);


        itemModelGenerator.register(ModItems.FLINT_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLINT_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLINT_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLINT_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLINT_0, Models.GENERATED);

        itemModelGenerator.register(ModItems.BONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BONE_PICK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BONE_HATCHET, Models.HANDHELD);
    }
}
