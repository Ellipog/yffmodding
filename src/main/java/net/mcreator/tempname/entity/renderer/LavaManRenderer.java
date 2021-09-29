package net.mcreator.tempname.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.Minecraft;

import net.mcreator.tempname.entity.LavaManEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class LavaManRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(LavaManEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("temp_name:textures/magma.png");
					}
				};
			});
			RenderingRegistry.registerEntityRenderingHandler(LavaManEntity.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("temp_name:textures/magma.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		private final ModelRenderer Legs;
		private final ModelRenderer Leftleg;
		private final ModelRenderer rightarm;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer leftarm;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		public Modelcustom_model() {
			textureWidth = 16;
			textureHeight = 16;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(5.0F, -8.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-5.0F, -5.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 2).addBox(-6.0F, -10.0F, -4.0F, 12.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 4).addBox(-6.0F, -8.0F, -4.0F, 11.0F, 1.0F, 7.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, -2.0F, 9.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 5).addBox(2.0F, -11.0F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 5).addBox(-3.0F, -17.0F, -3.0F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 5).addBox(3.0F, -12.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 5).addBox(-6.0F, -12.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 5).addBox(-6.0F, -11.0F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-6.0F, -13.0F, -1.0F, 12.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-6.0F, -13.0F, -3.0F, 12.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-6.0F, -14.0F, -2.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 3.1416F, 0.0F);
			cube_r1.setTextureOffset(0, 1).addBox(-3.0F, -7.0F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 0).addBox(-3.0F, -8.0F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -15.0F, -1.0F, 10.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -14.0F, -2.0F, 11.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 5).addBox(-6.0F, -12.0F, -4.0F, 12.0F, 2.0F, 7.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 2).addBox(-6.0F, -10.0F, -4.0F, 12.0F, 2.0F, 7.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(-1.0F, -1.0F, 1.0F);
			body.addChild(bone);
			bone.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, -4.0F, 10.0F, 1.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-3.0F, -5.0F, -4.0F, 8.0F, 1.0F, 6.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, -1.0F, 0.0F);
			bone.addChild(bone2);
			bone2.setTextureOffset(0, 3).addBox(-4.0F, -5.0F, -4.0F, 10.0F, 1.0F, 5.0F, 0.0F, false);
			bone2.setTextureOffset(0, 5).addBox(-3.0F, -5.0F, -4.0F, 8.0F, 1.0F, 6.0F, 0.0F, false);
			Legs = new ModelRenderer(this);
			Legs.setRotationPoint(-3.0F, 20.0F, 0.0F);
			Legs.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			Legs.setTextureOffset(0, 0).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Leftleg = new ModelRenderer(this);
			Leftleg.setRotationPoint(3.0F, 20.0F, 0.0F);
			Leftleg.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			Leftleg.setTextureOffset(0, 0).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-6.0F, 12.0F, 1.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(6.0F, 12.0F, -1.0F);
			rightarm.addChild(cube_r2);
			setRotationAngle(cube_r2, -1.789F, 0.0F, -2.0944F);
			cube_r2.setTextureOffset(0, 0).addBox(11.0F, 4.2F, -4.6F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r2.setTextureOffset(0, 0).addBox(12.0F, 0.2F, -3.6F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(6.0F, 12.0F, -1.0F);
			rightarm.addChild(cube_r3);
			setRotationAngle(cube_r3, -2.7053F, 0.0F, -2.0944F);
			cube_r3.setTextureOffset(0, 0).addBox(12.0F, -2.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(6.0F, 12.0F, 1.0F);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-6.0F, 12.0F, -1.0F);
			leftarm.addChild(cube_r4);
			setRotationAngle(cube_r4, -1.309F, 0.0F, -1.1781F);
			cube_r4.setTextureOffset(0, 0).addBox(10.8F, 5.0F, 2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r4.setTextureOffset(0, 0).addBox(11.8F, 1.0F, 3.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-6.0F, 12.0F, -1.0F);
			leftarm.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.3927F, 0.0F, -1.1345F);
			cube_r5.setTextureOffset(0, 0).addBox(12.0F, -1.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			Legs.render(matrixStack, buffer, packedLight, packedOverlay);
			Leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Legs.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
