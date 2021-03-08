package com.avalon.shiningrubies.core.init;

import com.avalon.shiningrubies.ShiningRubies;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.particles.ParticleTypes;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			ShiningRubies.MOD_ID);

	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", 
			() -> new Block(Block.Properties.from(Blocks.DIAMOND_ORE).harvestLevel(3).harvestTool(ToolType.PICKAXE).hardnessAndResistance(3.0f, 3.0f)));
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", 
			() -> new Block(Block.Properties.from(Blocks.DIAMOND_BLOCK).harvestLevel(3).harvestTool(ToolType.PICKAXE).hardnessAndResistance(6.0f, 5.0f)));
	public static final RegistryObject<Block> RUBY_TORCH = BLOCKS.register("ruby_torch", 
			() -> new TorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> {
			      return 14;
			   }).sound(SoundType.WOOD), ParticleTypes.FLAME));	
	public static final RegistryObject<Block> RUBY_LANTERN = BLOCKS.register("ruby_lantern", 
			() -> new LanternBlock(AbstractBlock.Properties.create(Material.IRON).setRequiresTool().hardnessAndResistance(3.5F).sound(SoundType.LANTERN).setLightLevel((state) -> {
			      return 15;
			   }).notSolid()));
	public static final RegistryObject<Block> RUBY_O_LANTERN = BLOCKS.register("ruby_o_lantern", 
			() -> new CarvedPumpkinBlock(AbstractBlock.Properties.create(Material.GOURD, MaterialColor.ADOBE).hardnessAndResistance(1.0F).sound(SoundType.WOOD).setLightLevel((state) -> {
			      return 15;
			   })));
	public static final RegistryObject<Block> CAVE_LANTERN = BLOCKS.register("cave_lantern", 
			() -> new Block(AbstractBlock.Properties.create(Material.GLASS, MaterialColor.QUARTZ).hardnessAndResistance(0.3F).sound(SoundType.GLASS).setLightLevel((state) -> {
			      return 15;
			   })));

}
