package com.avalon.shiningrubies;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.avalon.shiningrubies.core.init.BlockInit;
import com.avalon.shiningrubies.core.init.EntityTypeInit;
import com.avalon.shiningrubies.core.init.ItemInit;
import com.avalon.shiningrubies.world.OreGeneration;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ShiningRubies.MOD_ID)
public class ShiningRubies {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "shiningrubies";
	public static final ItemGroup TUTORIAL_GROUP = new TutorialGroup("unused_rubies");

	public ShiningRubies() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
		
	}

	private void setup(final FMLCommonSetupEvent event) {

	}

	public static class TutorialGroup extends ItemGroup {

		public TutorialGroup(String label) {
			super(label);
		}

		@Override
		public ItemStack createIcon() {
			return ItemInit.CAVE_LANTERN.get().getDefaultInstance();
		}
	}
}
