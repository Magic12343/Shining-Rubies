package com.avalon.glasscraftery.core.init;

import com.avalon.glasscraftery.GlassCraftery;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			GlassCraftery.MOD_ID);

	public static final RegistryObject<Block> GLASS_CHAIN = BLOCKS
			.register("glass_chain",
					() -> new ChainBlock(AbstractBlock.Properties.create(Material.GLASS, MaterialColor.AIR).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.GLASS).notSolid()));	
	public static final RegistryObject<Block> GLASS_LANTERN = BLOCKS
			.register("glass_lantern",
					() -> new LanternBlock(AbstractBlock.Properties.create(Material.IRON).setRequiresTool().hardnessAndResistance(3.5F).sound(SoundType.LANTERN).setLightLevel((state) -> {
					      return 15;
					   }).notSolid()));
	public static final RegistryObject<Block> RETRO_GLASS = BLOCKS
			.register("retro_glass",
					() -> new GlassBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> RETRO_GLASS_PANE = BLOCKS
			.register("retro_glass_pane",
					() -> new  PaneBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> SOUL_GLASS_CHAIN = BLOCKS
			.register("soul_glass_chain",
					() -> new ChainBlock(AbstractBlock.Properties.create(Material.GLASS, MaterialColor.AIR).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.GLASS).notSolid()));	
	public static final RegistryObject<Block> SOUL_GLASS_LANTERN = BLOCKS
			.register("soul_glass_lantern",
					() -> new LanternBlock(AbstractBlock.Properties.create(Material.IRON).setRequiresTool().hardnessAndResistance(3.5F).sound(SoundType.LANTERN).setLightLevel((state) -> {
					      return 15;
					   }).notSolid()));
	public static final RegistryObject<Block> SOUL_GLASS = BLOCKS
			.register("soul_glass",
					() -> new GlassBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> SOUL_GLASS_PANE = BLOCKS
			.register("soul_glass_pane",
					() -> new  PaneBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));

	//Windows
	
	public static final RegistryObject<Block> OAK_WINDOW = BLOCKS
			.register("oak_window",
					() -> new GlassBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> SPRUCE_WINDOW = BLOCKS
			.register("spruce_window",
					() -> new GlassBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> BIRCH_WINDOW = BLOCKS
			.register("birch_window",
					() -> new GlassBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> JUNGLE_WINDOW = BLOCKS
			.register("jungle_window",
					() -> new GlassBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> ACACIA_WINDOW = BLOCKS
			.register("acacia_window",
					() -> new GlassBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> DARK_OAK_WINDOW = BLOCKS
			.register("dark_oak_window",
					() -> new GlassBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	
	public static final RegistryObject<Block> OAK_WINDOW_PANE = BLOCKS
			.register("oak_window_pane",
					() -> new  PaneBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> SPRUCE_WINDOW_PANE = BLOCKS
			.register("spruce_window_pane",
					() -> new  PaneBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> BIRCH_WINDOW_PANE = BLOCKS
			.register("birch_window_pane",
					() -> new  PaneBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> JUNGLE_WINDOW_PANE = BLOCKS
			.register("jungle_window_pane",
					() -> new  PaneBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> ACACIA_WINDOW_PANE = BLOCKS
			.register("acacia_window_pane",
					() -> new  PaneBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
	public static final RegistryObject<Block> DARK_OAK_WINDOW_PANE = BLOCKS
			.register("dark_oak_window_pane",
					() -> new  PaneBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));

}
