package com.avalon.shiningrubies.common.items;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.TridentModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TridentItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.world.World;

public class TitaniumTridentItem extends TridentItem{
	   private final Multimap<Attribute, AttributeModifier> tridentAttributes;

	   public TitaniumTridentItem(Item.Properties builderIn) {
	      super(builderIn);
	      Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
	      builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 10.0D, AttributeModifier.Operation.ADDITION));
	      builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", (double)-2.9F, AttributeModifier.Operation.ADDITION));
	      this.tridentAttributes = builder.build();
	   }
	   public int getUseDuration(ItemStack stack) {
		      return 100000;
		   }

	   
	   public void onPlayerStoppedUsing(ItemStack stack, World worldIn, LivingEntity entityLiving, int timeLeft) {
		      if (entityLiving instanceof PlayerEntity) {
		         PlayerEntity playerentity = (PlayerEntity)entityLiving;
		         int i = this.getUseDuration(stack) - timeLeft;
		         if (i >= 10) {
		            int j = EnchantmentHelper.getRiptideModifier(stack);
		            if (j <= 0 || playerentity.isWet()) {
		               if (!worldIn.isRemote) {
		                  stack.damageItem(1, playerentity, (player) -> {
		                     player.sendBreakAnimation(entityLiving.getActiveHand());
		                  });
		                  if (j == 0) {
		                     TridentEntity tridententity = new TridentEntity(worldIn, playerentity, stack);
		                     tridententity.func_234612_a_(playerentity, playerentity.rotationPitch, playerentity.rotationYaw, 0.0F, 2.5F + (float)j * 0.5F, 1.0F);
		                     if (playerentity.abilities.isCreativeMode) {
		                        tridententity.pickupStatus = AbstractArrowEntity.PickupStatus.CREATIVE_ONLY;
		                     }

		                     worldIn.addEntity(tridententity);
		                     worldIn.playMovingSound((PlayerEntity)null, tridententity, SoundEvents.ITEM_TRIDENT_THROW, SoundCategory.PLAYERS, 1.0F, 1.0F);
		                     if (!playerentity.abilities.isCreativeMode) {
		                        playerentity.inventory.deleteStack(stack);
		                     }
		                  }
		               }
      }
   }
  }	
 }
}