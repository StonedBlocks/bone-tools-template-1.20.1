package net.thenameislinus.bonetools.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.thenameislinus.bonetools.BoneTools;

public class ModTags {

    public static class Items {

        public static final TagKey<Item> SHARPENER_FLINT = createTag("sharpener_flint");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(BoneTools.MOD_ID, name));
        }

    }
}