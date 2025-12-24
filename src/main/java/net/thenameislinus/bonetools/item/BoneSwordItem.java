package net.thenameislinus.bonetools.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import net.minecraft.entity.mob.SkeletonHorseEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class BoneSwordItem extends SwordItem {

    public BoneSwordItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        // bonus vs skeletons
        if (target instanceof AbstractSkeletonEntity
                || target instanceof SkeletonHorseEntity) {

            // deal extra damage directly
            target.damage(
                    target.getDamageSources().mobAttack(attacker),
                    9.0F // 2 hearts bonus
            );
            stack.damage(4, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }

        // normal durability loss
        stack.damage(1, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return true;
    }
}