package net.thenameislinus.bonetools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.SmithingRecipe;
import net.minecraft.recipe.StonecuttingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.carver.RavineCarverConfig;
import net.thenameislinus.bonetools.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BONE_CRYSTAL)
                .input('G', ModItems.GLASS_POWDER)
                .input('B', Items.BONE)
                .pattern("BGB")
                .pattern("GBG")
                .pattern("BGB")
                .criterion(hasItem(ModItems.GLASS_POWDER), conditionsFromItem(ModItems.GLASS_POWDER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BONE_STICK, 2)
                .input('#', ModItems.BONE_BIT)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(ModItems.BONE_BIT), conditionsFromItem(ModItems.BONE_BIT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BONE_BIT, 8)
                .input('B', Items.BONE)
                .pattern("BB")
                .pattern("BB")
                .criterion(hasItem(Items.BONE), conditionsFromItem(Items.BONE))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.GLASS_POWDER, Items.GLASS_PANE, 4);
    }
}