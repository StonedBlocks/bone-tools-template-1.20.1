package net.thenameislinus.bonetools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.thenameislinus.bonetools.item.ModItems;
import net.thenameislinus.bonetools.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);


    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.SHARPENER_FLINT)
                .add(ModItems.FLINT_4)
                .add(ModItems.FLINT_3)
                .add(ModItems.FLINT_2)
                .add(ModItems.FLINT_1);

    }
}
