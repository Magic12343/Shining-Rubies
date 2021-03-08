package com.avalon.shiningrubies.client.util;

import com.avalon.shiningrubies.ShiningRubies;
import com.avalon.shiningrubies.core.init.BlockInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ShiningRubies.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {

		RenderTypeLookup.setRenderLayer(BlockInit.RUBY_TORCH.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.RUBY_WALL_TORCH.get(), RenderType.getCutoutMipped());
		
		RenderTypeLookup.setRenderLayer(BlockInit.RUBY_LANTERN.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.TITANIUM_LANTERN.get(), RenderType.getCutoutMipped());


;
		
	}
}