package net.thenameislinus.bonetools.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    BONED_WOOD(1, 100, 3.0F, 1.0F, 10, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    BONED_STONE(2, 400, 5.0F, 2.0F, 4, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    BONED_IRON(3, 700, 7.0F, 3.0F, 10, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    BONED_DIAMOND(4, 2000, 9.0F, 4.0F, 9, () -> Ingredient.ofItems(Items.DIAMOND)),
    BONED_GOLD(1, 60, 14.0F, 1.0F, 10, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    BONED_NETHERITE(5, 3000, 10.0F, 5.0F, 10, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
