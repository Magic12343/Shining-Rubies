package com.avalon.glasscraftery.client.event;

import com.avalon.glasscraftery.GlassCraftery;
import com.avalon.glasscraftery.core.init.ItemInit;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = GlassCraftery.MOD_ID, bus = Bus.FORGE, value = Dist.CLIENT)
public class ClientEvents {

	@SubscribeEvent
	public static void renderHand(final RenderHandEvent event) {

		}
	}

