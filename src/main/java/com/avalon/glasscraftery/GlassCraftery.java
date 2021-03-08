package com.avalon.glasscraftery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.avalon.glasscraftery.core.init.BlockInit;
import com.avalon.glasscraftery.core.init.ItemInit;
import com.avalon.glasscraftery.world.OreGeneration;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GlassCraftery.MOD_ID)
public class GlassCraftery {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "glasscraftery";
	public static final ItemGroup TUTORIAL_GROUP = new TutorialGroup("tutorialtab");

	public GlassCraftery() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
		
	}

	private void setup(final FMLCommonSetupEvent event) {

	}

	public static class TutorialGroup extends ItemGroup {

		public TutorialGroup(String label) {
			super(label);
		}

		@Override
		public ItemStack createIcon() {
			return ItemInit.GLASS_CHAIN.get().getDefaultInstance();
		}
	}
}
