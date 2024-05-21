package fr.jeje.edc.entity.client;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import fr.jeje.edc.EDC;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class Deer<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart deer;


	public Deer(ModelPart root) {
		this.deer = root.getChild("deer");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition deer = partdefinition.addOrReplaceChild("deer", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition body = deer.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.5F, -2.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg1 = deer.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(4, 11).addBox(2.8F, -5.0F, 0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg2 = deer.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 11).addBox(2.8F, -5.0F, -2.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg3 = deer.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(7, 16).addBox(-3.3F, -5.0F, 0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 17).addBox(-3.2F, -3.0F, 0.4F, 1.0F, 3.0F, 0.8F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg4 = deer.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(15, 6).addBox(-3.3F, -5.0F, 0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 16).addBox(-3.2F, -3.0F, 0.8F, 1.0F, 3.0F, 0.8F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition tail = deer.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(16, 9).addBox(-1.35F, -0.35F, -0.35F, 2.7F, 0.7F, 0.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7146F, -5.1854F, -0.65F, 0.0F, 0.0F, -0.7418F));

		PartDefinition neck = deer.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(10, 9).addBox(-0.7F, -4.5F, -1.5F, 1.5F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition head = deer.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 6).addBox(-1.888F, -1.3F, -1.35F, 3.0F, 1.8F, 2.7F, new CubeDeformation(0.0F))
				.texOffs(9, 6).addBox(0.7F, -0.7844F, -0.7F, 2.3F, 1.0F, 1.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.388F, -9.1156F, -0.55F, 0.0F, 0.0F, 0.48F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3813F, -0.2329F, -0.9212F, 0.3F, 1.1F, 0.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4067F, -1.8515F, -1.3288F, 0.9163F, 0.0F, -0.2182F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 1).addBox(-0.538F, 0.2156F, -1.25F, 0.3F, 1.1F, 0.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.15F, -1.1F, 2.6F, -0.9163F, 0.0F, -0.2182F));

		PartDefinition deer_antlers = deer.addOrReplaceChild("deer_antlers", CubeListBuilder.create().texOffs(16, 19).addBox(0.05F, -2.5F, 0.35F, 0.6F, 3.0F, 0.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.65F, -10.5F, -0.65F, -0.2182F, -0.1309F, 0.4363F));

		PartDefinition cube_r3 = deer_antlers.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 18).addBox(-0.85F, -1.05F, -0.3F, 0.6F, 1.7F, 0.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -5.85F, 1.3F, -1.8326F, 0.48F, 0.1309F));

		PartDefinition cube_r4 = deer_antlers.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 21).addBox(-0.05F, -1.45F, 0.25F, 0.6F, 1.7F, 0.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -3.75F, 2.3F, 1.8326F, 0.48F, 0.1309F));

		PartDefinition cube_r5 = deer_antlers.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(4, 18).addBox(-0.6416F, -1.0F, -0.3F, 0.6F, 3.0F, 0.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0916F, -5.46F, 2.3868F, -0.1745F, 0.48F, -0.2618F));

		PartDefinition cube_r6 = deer_antlers.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 0).addBox(-0.3F, -0.7459F, 1.1073F, 0.6F, 3.0F, 0.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5961F, -4.5541F, 1.3427F, -0.9599F, 0.48F, -0.0873F));

		PartDefinition deer_antlers2 = deer.addOrReplaceChild("deer_antlers2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.65F, -10.5F, -0.65F, -0.2618F, 3.1416F, 0.0436F));

		PartDefinition cube_r7 = deer_antlers2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(20, 4).addBox(-0.4289F, -0.1756F, 0.2321F, 0.6F, 1.7F, 0.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0211F, -6.0244F, 2.4179F, -2.0071F, 0.48F, 0.1309F));

		PartDefinition cube_r8 = deer_antlers2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 20).addBox(-0.8055F, -1.6543F, -0.3F, 0.6F, 1.7F, 0.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9445F, -4.3457F, 2.3754F, 1.6144F, 0.0873F, 0.1309F));

		PartDefinition cube_r9 = deer_antlers2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(17, 15).addBox(-0.8354F, -1.5F, -0.3F, 0.6F, 3.0F, 0.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9146F, -4.8936F, 2.4142F, 0.0873F, 0.0873F, 0.0873F));

		PartDefinition cube_r10 = deer_antlers2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(18, 11).addBox(-1.0424F, -1.1716F, -0.3F, 0.6F, 3.0F, 0.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6076F, -3.1284F, 1.8889F, -0.9599F, -0.1745F, -0.1745F));

		PartDefinition cube_r11 = deer_antlers2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(8, 19).addBox(-0.55F, -2.5F, 0.35F, 0.6F, 3.0F, 0.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {


	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		deer.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return deer;
	}

}