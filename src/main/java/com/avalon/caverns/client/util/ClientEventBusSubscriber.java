package com.avalon.caverns.client.util;

import com.avalon.caverns.Caverns;
import com.avalon.caverns.core.init.BlockInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Caverns.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {

		RenderTypeLookup.setRenderLayer(BlockInit.RUBY_TORCH.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.RUBY_WALL_TORCH.get(), RenderType.getCutoutMipped());
		
		RenderTypeLookup.setRenderLayer(BlockInit.RUBY_LANTERN.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.TITANIUM_LANTERN.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.TITANIUM_CHAIN.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.TITANIUM_BARS.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.TITANIUM_DOOR.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.TITANIUM_TRAPDOOR.get(), RenderType.getCutoutMipped());
		
		RenderTypeLookup.setRenderLayer(BlockInit.CAVE_MUSHROOM.get(), RenderType.getCutoutMipped());
		
		RenderTypeLookup.setRenderLayer(BlockInit.MITHRIL_LANTERN.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.MITHRIL_CHAIN.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.MITHRIL_BARS.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.MITHRIL_DOOR.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.MITHRIL_TRAPDOOR.get(), RenderType.getCutoutMipped());
		


;
		
	}
}