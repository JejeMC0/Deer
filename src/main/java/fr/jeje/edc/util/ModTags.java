package fr.jeje.edc.util;

import fr.jeje.edc.EDC;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NETHERITE_DEER_ANTLERS_TOOL = tag("netherite_deer_antlers_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(EDC.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(EDC.MOD_ID, name));
        }
    }
}

