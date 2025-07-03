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
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BONED_WOODEN_SWORD)
                .pattern(" W ")
                .pattern(" C ")
                .pattern(" S ")
                .input('S', ModItems.BONE_STICK)
                .input('W', Ingredient.fromTag(ItemTags.PLANKS))
                .input('C', ModItems.BONE_CRYSTAL)
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BONED_WOODEN_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BONED_STONE_SWORD)
                .pattern(" W ")
                .pattern(" C ")
                .pattern(" S ")
                .input('S', ModItems.BONE_STICK)
                .input('W', Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS))
                .input('C', ModItems.BONE_CRYSTAL)
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BONED_STONE_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BONED_IRON_SWORD)
                .pattern(" W ")
                .pattern(" C ")
                .pattern(" S ")
                .input('S', ModItems.BONE_STICK)
                .input('W', Ingredient.ofItems(Items.IRON_INGOT))
                .input('C', ModItems.BONE_CRYSTAL)
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BONED_IRON_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BONED_GOLDEN_SWORD)
                .pattern(" W ")
                .pattern(" C ")
                .pattern(" S ")
                .input('S', ModItems.BONE_STICK)
                .input('W', Ingredient.ofItems(Items.GOLD_INGOT))
                .input('C', ModItems.BONE_CRYSTAL)
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BONED_GOLDEN_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BONED_DIAMOND_SWORD)
                .pattern(" W ")
                .pattern(" C ")
                .pattern(" S ")
                .input('S', ModItems.BONE_STICK)
                .input('W', Ingredient.ofItems(Items.DIAMOND))
                .input('C', ModItems.BONE_CRYSTAL)
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BONED_DIAMOND_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BONED_WOODEN_AXE)
                .input('#', Items.STICK)
                .input('X', Ingredient.fromTag(ItemTags.PLANKS))
                .input('C', ModItems.BONE_CRYSTAL)
                .pattern("CX")
                .pattern("X#")
                .pattern(" #")
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BONED_STONE_AXE)
                .input('#', Items.STICK)
                .input('X', Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS))
                .input('C', ModItems.BONE_CRYSTAL)
                .pattern("CX")
                .pattern("X#")
                .pattern(" #")
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BONED_IRON_AXE)
                .input('#', Items.STICK)
                .input('X', Items.IRON_INGOT)
                .input('C', ModItems.BONE_CRYSTAL)
                .pattern("CX")
                .pattern("X#")
                .pattern(" #")
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BONED_GOLDEN_AXE)
                .input('#', Items.STICK)
                .input('X', Items.GOLD_INGOT)
                .input('C', ModItems.BONE_CRYSTAL)
                .pattern("CX")
                .pattern("X#")
                .pattern(" #")
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BONED_DIAMOND_AXE)
                .input('#', Items.STICK)
                .input('X', Items.DIAMOND)
                .input('C', ModItems.BONE_CRYSTAL)
                .pattern("CX")
                .pattern("X#")
                .pattern(" #")
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BONED_WOODEN_PICKAXE)
                .input('#', Items.STICK)
                .input('X', Ingredient.fromTag(ItemTags.PLANKS))
                .input('C', ModItems.BONE_CRYSTAL)
                .pattern("XCX")
                .pattern(" # ")
                .pattern(" # ")
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BONED_STONE_PICKAXE)
                .input('#', Items.STICK)
                .input('X', Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS))
                .input('C', ModItems.BONE_CRYSTAL)
                .pattern("XCX")
                .pattern(" # ")
                .pattern(" # ")
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BONED_IRON_PICKAXE)
                .input('#', Items.STICK)
                .input('X', Items.IRON_INGOT)
                .input('C', ModItems.BONE_CRYSTAL)
                .pattern("XCX")
                .pattern(" # ")
                .pattern(" # ")
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BONED_GOLDEN_PICKAXE)
                .input('#', Items.STICK)
                .input('X', Items.GOLD_INGOT)
                .input('C', ModItems.BONE_CRYSTAL)
                .pattern("XCX")
                .pattern(" # ")
                .pattern(" # ")
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BONED_DIAMOND_PICKAXE)
                .input('#', Items.STICK)
                .input('X', Items.DIAMOND)
                .input('C', ModItems.BONE_CRYSTAL)
                .pattern("XCX")
                .pattern(" # ")
                .pattern(" # ")
                .criterion(hasItem(ModItems.BONE_CRYSTAL), conditionsFromItem(ModItems.BONE_CRYSTAL))
                .offerTo(exporter);

        offerNetheriteUpgradeRecipe(exporter, ModItems.BONED_DIAMOND_SWORD, RecipeCategory.COMBAT, ModItems.BONED_NETHERITE_SWORD);

        offerNetheriteUpgradeRecipe(exporter, ModItems.BONED_DIAMOND_AXE, RecipeCategory.COMBAT, ModItems.BONED_NETHERITE_AXE);

        offerNetheriteUpgradeRecipe(exporter, ModItems.BONED_DIAMOND_PICKAXE, RecipeCategory.TOOLS, ModItems.BONED_NETHERITE_PICKAXE);


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BONE_CRYSTAL)
                .input(Items.REDSTONE)
                .input(Items.NETHERITE_SCRAP)
                .input(Items.DIAMOND)
                .input(Items.EMERALD)
                .input(Items.GOLD_INGOT)
                .input(ModItems.BONE_BIT, 4)
                .criterion(hasItem(ModItems.BONE_BIT), conditionsFromItem(ModItems.BONE_BIT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BONE_STICK)
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
    }
}
