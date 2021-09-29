// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelamongus extends EntityModel<Entity> {
	private final ModelRenderer Feet;
	private final ModelRenderer Hands;
	private final ModelRenderer Torso;
	private final ModelRenderer Head;

	public Modelamongus() {
		textureWidth = 32;
		textureHeight = 32;

		Feet = new ModelRenderer(this);
		Feet.setRotationPoint(0.0F, 24.0F, 0.0F);
		Feet.setTextureOffset(6, 18).addBox(1.0F, -8.0F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);
		Feet.setTextureOffset(18, 19).addBox(-4.0F, -8.0F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);

		Hands = new ModelRenderer(this);
		Hands.setRotationPoint(0.0F, 24.0F, 0.0F);
		Hands.setTextureOffset(2, 1).addBox(6.0F, -15.0F, -2.0F, 2.0F, 10.0F, 4.0F, 0.0F, false);
		Hands.setTextureOffset(5, 5).addBox(-8.0F, -15.0F, -2.0F, 2.0F, 10.0F, 4.0F, 0.0F, false);

		Torso = new ModelRenderer(this);
		Torso.setRotationPoint(0.0F, 24.0F, 0.0F);
		Torso.setTextureOffset(1, 22).addBox(-5.0F, -11.0F, -3.0F, 10.0F, 3.0F, 5.0F, 0.0F, false);
		Torso.setTextureOffset(6, 9).addBox(0.0F, -17.0F, -4.0F, 6.0F, 6.0F, 7.0F, 0.0F, false);
		Torso.setTextureOffset(2, 14).addBox(-6.0F, -17.0F, -4.0F, 6.0F, 6.0F, 7.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 24.0F, 0.0F);
		Head.setTextureOffset(2, 1).addBox(-2.0F, -13.0F, -7.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(7, 3).addBox(-3.0F, -16.0F, -7.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(8, 8).addBox(-1.0F, -13.0F, -8.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Feet.render(matrixStack, buffer, packedLight, packedOverlay);
		Hands.render(matrixStack, buffer, packedLight, packedOverlay);
		Torso.render(matrixStack, buffer, packedLight, packedOverlay);
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Hands.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Feet.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}