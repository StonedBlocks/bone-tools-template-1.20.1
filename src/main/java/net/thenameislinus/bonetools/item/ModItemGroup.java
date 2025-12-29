package net.thenameislinus.bonetools.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.thenameislinus.bonetools.BoneTools;

public class ModItemGroup {
    public static final ItemGroup BONE_TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BoneTools.MOD_ID, "bone_tools_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bone_tools_group"))
                    .icon(() -> new ItemStack(ModItems.BONE_DAGGER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BONE_DAGGER);
                        entries.add(ModItems.BONE_SWORD);
                        entries.add(ModItems.BONE_HATCHET);
                        entries.add(ModItems.BONE_PICK);

                        entries.add(ModItems.FLINT_4);
                        entries.add(ModItems.FLINT_3);
                        entries.add(ModItems.FLINT_2);
                        entries.add(ModItems.FLINT_1);
                        entries.add(ModItems.FLINT_0);

                        entries.add(ModItems.BONE_POWDER);
                        entries.add(ModItems.GLASS_POWDER);
                        entries.add(ModItems.BONE_CRYSTAL);
                        entries.add(ModItems.BONE_BIT);
                        entries.add(ModItems.BONE_STICK);
                        entries.add(ModItems.SHARPENED_BONE_STICK);
                        entries.add(ModItems.THICK_SHARPENED_BONE_STICK);
                        entries.add(ModItems.SHORT_SHARPENED_BONE_STICK);
                        entries.add(ModItems.THICK_BONE_STICK);

                    }).build());


    public static void registerItemGroups() {

    }
}
