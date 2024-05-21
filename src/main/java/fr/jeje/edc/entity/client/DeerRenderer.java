package fr.jeje.edc.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import fr.jeje.edc.EDC;
import fr.jeje.edc.entity.custom.DeerEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DeerRenderer extends MobRenderer<DeerEntity, Deer<DeerEntity>> {
    public DeerRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new Deer<>(pContext.bakeLayer(ModModelLayers.DEER_LAYER)), 0.4f);
    }

    @Override
    public ResourceLocation getTextureLocation(DeerEntity pEntity) {
        return new ResourceLocation(EDC.MOD_ID, "textures/entity/deer.png");
    }

    @Override
    public void render(DeerEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(1f, 1f, 1f);
        }
        else {
            pMatrixStack.scale(3f, 3f, 3f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}