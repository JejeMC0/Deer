package fr.jeje.edc.item;

import fr.jeje.edc.EDC;
import fr.jeje.edc.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier NETHERITE_DEER_ANTLERS = TierSortingRegistry.registerTier(
            new ForgeTier(5, 5000, 4f, 2f, 25,
                    ModTags.Blocks.NETHERITE_DEER_ANTLERS_TOOL, () -> Ingredient.of(ModItems.DEER_ANTLERS.get())),
            new ResourceLocation(EDC.MOD_ID, "deer_antlers"), List.of(Tiers.NETHERITE), List.of());


}

