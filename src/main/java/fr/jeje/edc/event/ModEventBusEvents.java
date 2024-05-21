package fr.jeje.edc.event;

import fr.jeje.edc.EDC;

import fr.jeje.edc.entity.ModEntities;
import fr.jeje.edc.entity.client.Deer;
import fr.jeje.edc.entity.client.ModModelLayers;
import fr.jeje.edc.entity.custom.DeerEntity;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EDC.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.DEER.get(), DeerEntity.createAttributes().build());
    }
}
