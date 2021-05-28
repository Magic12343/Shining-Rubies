package com.avalon.caverns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.avalon.caverns.core.init.BlockInit;
import com.avalon.caverns.core.init.EntityTypeInit;
import com.avalon.caverns.core.init.ItemInit;
import com.avalon.caverns.world.OreGeneration;

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

@Mod(Caverns.MOD_ID)
public class Caverns {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "caverns";
	public static final ItemGroup TUTORIAL_GROUP = new TutorialGroup("unused_rubies");

	public Caverns() {
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
