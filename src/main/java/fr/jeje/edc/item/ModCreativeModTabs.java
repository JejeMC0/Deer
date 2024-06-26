package fr.jeje.edc.item;

import fr.jeje.edc.EDC;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EDC.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ECHEQUIER = CREATIVE_MODE_TABS.register("data/edc",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DEER_ANTLERS.get()))
                    .title(Component.translatable("creativetab.edc"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DEER_ANTLERS.get());
                        pOutput.accept(ModItems.NETHERITE_DEER_ANTLERS_PICKAXE.get());
                        pOutput.accept(ModItems.NETHERITE_DEER_ANTLERS_SHOVEL.get());
                        pOutput.accept(ModItems.NETHERITE_DEER_ANTLERS_SWORD.get());
                        pOutput.accept(ModItems.NETHERITE_DEER_ANTLERS_AXE.get());
                        pOutput.accept(ModItems.NETHERITE_DEER_ANTLERS_HOE.get());

                        pOutput.accept(ModItems.DEER_SPAWN_EGG.get());





                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
