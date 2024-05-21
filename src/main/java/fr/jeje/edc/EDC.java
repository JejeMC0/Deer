package fr.jeje.edc;

import com.mojang.logging.LogUtils;
import fr.jeje.edc.entity.ModEntities;
import fr.jeje.edc.entity.client.DeerRenderer;
import fr.jeje.edc.item.ModCreativeModTabs;
import fr.jeje.edc.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EDC.MOD_ID)
public class EDC {
    public static final String MOD_ID = "edc";
    public static final Logger LOGGER = LogUtils.getLogger();

    public EDC() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);
        String ok= """  
                3D          https://sketchfab.com/3d-models/abyss-deer-e594db88e6634388a7526ebd1786e0b1
                Recipies    https://youtu.be/NppdgWsSVec?si=5nDVC5P8cahYFz-8
                Block       https://youtu.be/C_VO6tD6Y1g?si=thboqAJMC98C6GBB
                LootTable   https://youtu.be/kSXP_GXdNGg?si=N1fDsRfvg7owqsyO
                CustomTools https://youtu.be/pduo0ZHy7zA?si=UMPp5RF8yAsNWBzo
                CustomArmor https://youtu.be/-2Z9gpD9EmA?si=UxdvxFX_mbAVKucP
                
                """;
        ModItems.register(modEventBus);

        ModEntities.register(modEventBus);


        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.DEER_ANTLERS);
        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.DEER.get(), DeerRenderer::new);

        }
    }
}
