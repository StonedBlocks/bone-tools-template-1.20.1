package net.thenameislinus.bonetools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.thenameislinus.bonetools.item.ModItems;
import net.thenameislinus.bonetools.util.ModTags;

import javax.swing.text.html.HTML;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BONE_CRYSTAL)
                .input(ModItems.BONE_POWDER, 4)
                .input(ModItems.GLASS_POWDER, 4)
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
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.BONE_POWDER, Items.BONE, 4);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.FLINT_4, Items.FLINT, 1);


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BONE_DAGGER, 1)
                .input('B', ModItems.BONE_CRYSTAL)
                .input('S', Items.STICK)
                .input('b', ModItems.SHORT_SHARPENED_BONE_STICK)
                .pattern("  b")
                .pattern(" S ")
                .pattern("B  ")
                .criterion(hasItem(ModItems.SHORT_SHARPENED_BONE_STICK), conditionsFromItem(ModItems.SHORT_SHARPENED_BONE_STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BONE_SWORD, 1)
                .input('B', ModItems.SHARPENED_BONE_STICK)
                .input('S', Items.STICK)
                .input('C', ModItems.BONE_CRYSTAL)
                .pattern("B")
                .pattern("S")
                .pattern("C")
                .criterion(hasItem(ModItems.SHARPENED_BONE_STICK), conditionsFromItem(ModItems.SHARPENED_BONE_STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BONE_HATCHET, 1)
                .input('B', ModItems.THICK_SHARPENED_BONE_STICK)
                .input('S', Items.STICK)
                .input('G', ModItems.BONE_CRYSTAL)
                .pattern("B")
                .pattern("S")
                .pattern("G")
                .criterion(hasItem(ModItems.THICK_SHARPENED_BONE_STICK), conditionsFromItem(ModItems.THICK_SHARPENED_BONE_STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BONE_PICK, 1)
                .input('B', ModItems.THICK_BONE_STICK)
                .input('S', Items.STICK)
                .input('G', ModItems.BONE_CRYSTAL)
                .pattern(" B ")
                .pattern(" SB")
                .pattern("G  ")
                .criterion(hasItem(ModItems.THICK_BONE_STICK), conditionsFromItem(ModItems.THICK_BONE_STICK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SHARPENED_BONE_STICK, 1)
                .input(ModItems.THICK_BONE_STICK)
                .input(ModTags.Items.SHARPENER_FLINT)
                .criterion(hasItem(ModItems.BONE_STICK), conditionsFromItem(ModItems.BONE_STICK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SHORT_SHARPENED_BONE_STICK, 2)
                .input(ModItems.SHARPENED_BONE_STICK)
                .input(ModTags.Items.SHARPENER_FLINT)
                .criterion(hasItem(ModItems.SHARPENED_BONE_STICK), conditionsFromItem(ModItems.SHARPENED_BONE_STICK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THICK_SHARPENED_BONE_STICK, 1)
                .input(ModItems.SHORT_SHARPENED_BONE_STICK, 2)
                .criterion(hasItem(ModItems.SHORT_SHARPENED_BONE_STICK), conditionsFromItem(ModItems.SHORT_SHARPENED_BONE_STICK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THICK_BONE_STICK, 1)
                .input(ModItems.BONE_STICK, 2)
                .criterion(hasItem(ModItems.BONE_STICK), conditionsFromItem(ModItems.BONE_STICK))
                .offerTo(exporter);
    }
}