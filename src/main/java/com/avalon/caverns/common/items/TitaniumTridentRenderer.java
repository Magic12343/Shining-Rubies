package com.avalon.caverns.common.items;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.TridentRenderer;
import net.minecraft.client.renderer.entity.model.TridentModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class TitaniumTridentRenderer extends TridentRenderer{
	   public static final ResourceLocation TITANIUM_TRIDENT = new ResourceLocation("textures/entity/titanium_trident.png");
	   private final TridentModel tridentModel = new TridentModel();

	   public TitaniumTridentRenderer(EntityRendererManager renderManagerIn) {
	      super(renderManagerIn);
	   }

	   public void render(TridentEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
	      matrixStackIn.push();
	      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90.0F));
	      matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch) + 90.0F));
	      IVertexBuilder ivertexbuilder = net.minecraft.client.renderer.ItemRenderer.getEntityGlintVertexBuilder(bufferIn, this.tridentModel.getRenderType(this.getEntityTexture(entityIn)), false, entityIn.func_226572_w_());
	      this.tridentModel.render(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
	      matrixStackIn.pop();
	      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
	   }

	   /**
	    * Returns the location of an entity's texture.
	    */
	   public ResourceLocation getEntityTexture(TridentEntity entity) {
	      return TITANIUM_TRIDENT;
	   }
	}
