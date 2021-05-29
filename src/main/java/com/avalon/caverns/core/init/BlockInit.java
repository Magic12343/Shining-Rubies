package com.avalon.caverns.core.init;

import java.util.function.ToIntFunction;

import com.avalon.caverns.Caverns;
import com.avalon.caverns.common.blocks.CaveMushroomBlock;
import com.avalon.caverns.common.blocks.ElectricFenceBlock;
import com.avalon.caverns.common.blocks.RubyTorchBlock;
import com.avalon.caverns.common.blocks.RubyWallTorchBlock;
import com.avalon.caverns.common.blocks.SpikeBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.MushroomBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.TrapDoorBlock;
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
			Caverns.MOD_ID);

	//Ruby
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", 
			() -> new Block(Block.Properties.from(Blocks.DIAMOND_ORE).harvestLevel(2).harvestTool(ToolType.PICKAXE).hardnessAndResistance(3.0f, 3.0f)));
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", 
			() -> new Block(Block.Properties.from(Blocks.DIAMOND_BLOCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).hardnessAndResistance(6.0f, 5.0f)));
	public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", 
			() -> new Block(Block.Properties.from(Blocks.NETHERITE_BLOCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).hardnessAndResistance(6.0f, 5.0f)));
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
			() -> new Block(Block.Properties.from(Blocks.ANCIENT_DEBRIS).harvestLevel(3).harvestTool(ToolType.PICKAXE).hardnessAndResistance(3.0f, 3.0f)));
	
	public static final RegistryObject<Block> TITANIUM_LANTERN = BLOCKS.register("titanium_lantern", 
			() -> new LanternBlock(AbstractBlock.Properties.create(Material.IRON).setRequiresTool().hardnessAndResistance(3.5F).sound(SoundType.LANTERN).setLightLevel((state) -> {
			      return 15;
			   }).notSolid()));
	public static final RegistryObject<Block> TITANIUM_DOOR = BLOCKS.register("titanium_door", 
			() -> new DoorBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON).setRequiresTool().hardnessAndResistance(5.0F).sound(SoundType.METAL).notSolid()));
	public static final RegistryObject<Block> TITANIUM_BARS = BLOCKS.register("titanium_bars", 
			() -> new PaneBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.AIR).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).notSolid()));
	public static final RegistryObject<Block> TITANIUM_CHAIN = BLOCKS.register("titanium_chain", 
			() -> new ChainBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.AIR).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.CHAIN).notSolid()));
	public static final RegistryObject<Block> TITANIUM_TRAPDOOR = BLOCKS.register("titanium_trapdoor", 
			() -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.IRON).setRequiresTool().hardnessAndResistance(5.0F).sound(SoundType.METAL).notSolid()));
	
	//Diatomite
	public static final RegistryObject<Block> DIATOMITE = BLOCKS.register("diatomite", 
			() -> new Block(Block.Properties.from(Blocks.DIORITE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F)));
	public static final RegistryObject<Block> DIATOMITE_SLAB = BLOCKS.register("diatomite_slab", 
			() -> new SlabBlock(Block.Properties.from(Blocks.DIORITE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F)));
	public static final RegistryObject<Block> DIATOMITE_STAIRS = BLOCKS.register("diatomite_stairs", 
			() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.DIORITE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	
	
	public static final RegistryObject<Block> POLISHED_DIATOMITE = BLOCKS.register("polished_diatomite", 
			() -> new Block(Block.Properties.from(Blocks.DIORITE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F)));
	public static final RegistryObject<Block> POLISHED_DIATOMITE_SLAB = BLOCKS.register("polished_diatomite_slab", 
			() -> new SlabBlock(Block.Properties.from(Blocks.DIORITE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F)));
	public static final RegistryObject<Block> POLISHED_DIATOMITE_STAIRS = BLOCKS.register("polished_diatomite_stairs", 
			() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.DIORITE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	
	public static final RegistryObject<Block> FOSSIL_DIATOMITE = BLOCKS.register("fossil_diatomite", 
			() -> new Block(Block.Properties.from(Blocks.DIORITE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F)));
	
	public static final RegistryObject<Block> CAVE_MUSHROOM = BLOCKS.register("cave_mushroom", 
			() -> new CaveMushroomBlock(Block.Properties.from(Blocks.RED_MUSHROOM).harvestLevel(0).doesNotBlockMovement().tickRandomly().zeroHardnessAndResistance().sound(SoundType.PLANT)));
	
	/*Diatomite Spikes NO FUNCIONA POR AHORA :)
	public static final RegistryObject<Block> DIATOMITE_SPIKE = BLOCKS.register("diatomite_spike", 
			() -> new SpikeBlock(Block.Properties.from(Blocks.DIORITE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F)));
	
	public static final RegistryObject<Block> DIATOMITE_SPIKE_UPPER = BLOCKS.register("diatomite_spike_upper", 
			() -> new SpikeBlock(Block.Properties.from(Blocks.DIORITE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F)));
	public static final RegistryObject<Block> DIATOMITE_SPIKE_DOWN = BLOCKS.register("diatomite_spike_down", 
			() -> new SpikeBlock(Block.Properties.from(Blocks.DIORITE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F)));
	
	public static final RegistryObject<Block> DIATOMITE_SPIKE_BASE = BLOCKS.register("diatomite_spike_base", 
			() -> new SpikeBlock(Block.Properties.from(Blocks.DIORITE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F)));
	public static final RegistryObject<Block> DIATOMITE_SPIKE_TOP = BLOCKS.register("diatomite_spike_top", 
			() -> new SpikeBlock(Block.Properties.from(Blocks.DIORITE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F)));
	*/
	
	//Mithril
	public static final RegistryObject<Block> MITHRIL_ORE = BLOCKS.register("mithril_ore", 
			() -> new Block(Block.Properties.from(Blocks.DIAMOND_ORE).harvestLevel(3).harvestTool(ToolType.PICKAXE).hardnessAndResistance(3.0f, 3.0f)));
	
	public static final RegistryObject<Block> MITHRIL_BLOCK = BLOCKS.register("mithril_block", 
			() -> new Block(Block.Properties.from(Blocks.DIAMOND_ORE).harvestLevel(3).harvestTool(ToolType.PICKAXE).hardnessAndResistance(3.0f, 3.0f)));
	public static final RegistryObject<Block> MITHRIL_LANTERN = BLOCKS.register("mithril_lantern", 
			() -> new LanternBlock(AbstractBlock.Properties.create(Material.IRON).setRequiresTool().hardnessAndResistance(3.5F).sound(SoundType.LANTERN).setLightLevel((state) -> {
			      return 15;
			   }).notSolid()));
	public static final RegistryObject<Block> MITHRIL_DOOR = BLOCKS.register("mithril_door", 
			() -> new DoorBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON).setRequiresTool().hardnessAndResistance(3.0F).sound(SoundType.METAL).notSolid()));
	public static final RegistryObject<Block> MITHRIL_BARS = BLOCKS.register("mithril_bars", 
			() -> new PaneBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.AIR).setRequiresTool().hardnessAndResistance(3.0f, 3.0f).sound(SoundType.METAL).notSolid()));
	public static final RegistryObject<Block> MITHRIL_CHAIN = BLOCKS.register("mithril_chain", 
			() -> new ChainBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.AIR).setRequiresTool().hardnessAndResistance(3.0f, 3.0f).sound(SoundType.CHAIN).notSolid()));
	public static final RegistryObject<Block> MITHRIL_TRAPDOOR = BLOCKS.register("mithril_trapdoor", 
			() -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.IRON).setRequiresTool().hardnessAndResistance(5.0F).sound(SoundType.METAL).notSolid()));
	public static final RegistryObject<Block> ELECTRIC_FENCE = BLOCKS.register("electric_fence", 
			() -> new ElectricFenceBlock(Block.Properties.from(Blocks.DIAMOND_ORE).harvestLevel(3).harvestTool(ToolType.PICKAXE).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.METAL)));
	//Endia
	public static final RegistryObject<Block> ENDIA_ORE = BLOCKS.register("endia_ore", 
			() -> new Block(Block.Properties.from(Blocks.DIAMOND_ORE).harvestLevel(4).harvestTool(ToolType.PICKAXE).hardnessAndResistance(3.0f, 3.0f)));
	
	//Constructores
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
