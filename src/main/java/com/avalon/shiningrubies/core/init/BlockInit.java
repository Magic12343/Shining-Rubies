package com.avalon.shiningrubies.core.init;

import java.util.function.ToIntFunction;

import com.avalon.shiningrubies.ShiningRubies;
import com.avalon.shiningrubies.common.blocks.RubyTorchBlock;
import com.avalon.shiningrubies.common.blocks.RubyWallTorchBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			ShiningRubies.MOD_ID);

	//Ruby
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", 
			() -> new Block(Block.Properties.from(Blocks.DIAMOND_ORE).harvestLevel(3).harvestTool(ToolType.PICKAXE).hardnessAndResistance(3.0f, 3.0f)));
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", 
			() -> new Block(Block.Properties.from(Blocks.DIAMOND_BLOCK).harvestLevel(3).harvestTool(ToolType.PICKAXE).hardnessAndResistance(6.0f, 5.0f)));
	public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", 
			() -> new Block(Block.Properties.from(Blocks.NETHERITE_BLOCK).harvestLevel(3).harvestTool(ToolType.PICKAXE).hardnessAndResistance(6.0f, 5.0f)));
	public static final RegistryObject<Block> RUBY_TORCH = BLOCKS.register("ruby_torch", 
			() -> new RubyTorchBlock(getProperties(Blocks.TORCH)));
	public static final RegistryObject<Block> RUBY_WALL_TORCH = BLOCKS.register("ruby_wall_torch", 
			() -> new RubyWallTorchBlock(getProperties(BlockInit.RUBY_TORCH.get()).lootFrom(RUBY_TORCH.get())));
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
	
	//Titanium
	public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore", 
			() -> new Block(Block.Properties.from(Blocks.ANCIENT_DEBRIS).harvestLevel(4).harvestTool(ToolType.PICKAXE).hardnessAndResistance(3.0f, 3.0f)));
	
	public static final RegistryObject<Block> TITANIUM_LANTERN = BLOCKS.register("titanium_lantern", 
			() -> new LanternBlock(AbstractBlock.Properties.create(Material.IRON).setRequiresTool().hardnessAndResistance(3.5F).sound(SoundType.LANTERN).setLightLevel((state) -> {
			      return 15;
			   }).notSolid()));
	public static final RegistryObject<Block> TITANIUM_DOOR = BLOCKS.register("titanium_door", 
			() -> new DoorBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON).setRequiresTool().hardnessAndResistance(5.0F).sound(SoundType.METAL).notSolid()));
	public static final RegistryObject<Block> TITANIUM_BARS = BLOCKS.register("titanium_bars", 
			() -> new PaneBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.AIR).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).notSolid()));
	public static final RegistryObject<Block> TITANIUM_CHAIN = BLOCKS.register("titanium_bars", 
			() -> new ChainBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.AIR).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.CHAIN).notSolid()));
	
	public static AbstractBlock.Properties getProperties(Material materialIn, float hardnessAndResistanceIn) {
        return getProperties(materialIn, hardnessAndResistanceIn, hardnessAndResistanceIn);
    }

    public static AbstractBlock.Properties getProperties(Material materialIn, float hardnessIn, float resistanceIn) {
        return AbstractBlock.Properties.create(materialIn).hardnessAndResistance(hardnessIn, resistanceIn);
    }
    public static AbstractBlock.Properties getProperties(Material materialIn) {
        return AbstractBlock.Properties.create(materialIn).zeroHardnessAndResistance();
    }

    public static AbstractBlock.Properties getProperties(Block block) {
        return AbstractBlock.Properties.from(block);
    }

    private static ToIntFunction<BlockState> getLightValueLit(int lightValue) {
        return (state) -> state.get(BlockStateProperties.LIT) ? lightValue : 0;
    }

}
