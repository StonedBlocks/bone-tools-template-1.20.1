package net.thenameislinus.bonetools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.thenameislinus.bonetools.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BONED_WOODEN_SWORD)
                .pattern(" W ")
                .pattern(" C ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('W', Ingredient.fromTag(ItemTags.PLANKS))
                .input('C', ModItems.BONE_CRYSTAL)
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BONED_WOODEN_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BONED_STONE_SWORD)
                .pattern(" W ")
                .pattern(" C ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('W', Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS))
                .input('C', ModItems.BONE_CRYSTAL)
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BONED_STONE_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BONED_IRON_SWORD)
                .pattern(" W ")
                .pattern(" C ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('W', Ingredient.ofItems(Items.IRON_INGOT))
                .input('C', ModItems.BONE_CRYSTAL)
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BONED_IRON_SWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BONE_CRYSTAL)
                .input(Items.REDSTONE)
                .input(Items.NETHERITE_SCRAP)
                .input(Items.DIAMOND)
                .input(Items.EMERALD)
                .input(Items.GOLD_INGOT)
                .input(ModItems.BONE_BIT, 4)
                .criterion(hasItem(ModItems.BONE_BIT), conditionsFromItem(ModItems.BONE_BIT))
                .offerTo(exporter);
    }
}
