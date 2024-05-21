package fr.jeje.edc.item;

import fr.jeje.edc.EDC;
import fr.jeje.edc.entity.ModEntities;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EDC.MOD_ID);

    public static final RegistryObject<Item> DEER_ANTLERS = ITEMS.register("deer_antlers",
            () -> new Item(new Item.Properties()));

    //netherite tools


    public static final RegistryObject<Item> NETHERITE_DEER_ANTLERS_PICKAXE = ITEMS.register("deer_antlers_netherite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NETHERITE_DEER_ANTLERS, 0, 5, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_DEER_ANTLERS_SWORD = ITEMS.register("deer_antlers_netherite_sword",
            () -> new PickaxeItem(ModToolTiers.NETHERITE_DEER_ANTLERS, 5, 5, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_DEER_ANTLERS_AXE = ITEMS.register("deer_antlers_netherite_axe",
            () -> new PickaxeItem(ModToolTiers.NETHERITE_DEER_ANTLERS, 3, 5, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_DEER_ANTLERS_HOE = ITEMS.register("deer_antlers_netherite_hoe",
            () -> new PickaxeItem(ModToolTiers.NETHERITE_DEER_ANTLERS, 0, 5, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_DEER_ANTLERS_SHOVEL = ITEMS.register("deer_antlers_netherite_shovel",
            () -> new PickaxeItem(ModToolTiers.NETHERITE_DEER_ANTLERS, 0, 5, new Item.Properties()));


    public static final RegistryObject<Item> DEER_SPAWN_EGG = ITEMS.register("deer_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.DEER, 0x7e9680, 0xc5d1c5, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
