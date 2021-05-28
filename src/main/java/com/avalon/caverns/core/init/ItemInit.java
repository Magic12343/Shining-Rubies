package com.avalon.caverns.core.init;

import com.avalon.caverns.Caverns;

import net.minecraft.block.Blocks;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TridentItem;
import net.minecraft.item.WallOrFloorItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			Caverns.MOD_ID);
	
	//Items
    public static final RegistryObject<Item> RUBY_ITEM = ITEMS.register("ruby", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> RUBY_POWDER = ITEMS.register("ruby_powder", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> TITANIUM_PIECE = ITEMS.register("titanium_piece", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> MITHRIL_CHUNK = ITEMS.register("mithril_chunk", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> ENDIA_POWDER = ITEMS.register("endia_powder", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	//Weapons
	//public static final RegistryObject<Item> TITANIUM_TRIDENT = ITEMS.register("titanium_trident", () -> new TridentItem((new Item.Properties()).maxDamage(350).group(ItemGroup.COMBAT).isImmuneToFire()));

	// Block Items
	public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore",
			() -> new BlockItem(BlockInit.RUBY_ORE.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> TITANIUM_ORE = ITEMS.register("titanium_ore",
			() -> new BlockItem(BlockInit.TITANIUM_ORE.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block",
			() -> new BlockItem(BlockInit.RUBY_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> TITANIUM_BLOCK = ITEMS.register("titanium_block",
			() -> new BlockItem(BlockInit.TITANIUM_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<WallOrFloorItem> RUBY_TORCH = ITEMS.register("ruby_torch",
			() -> new WallOrFloorItem(BlockInit.RUBY_TORCH.get(), BlockInit.RUBY_WALL_TORCH.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> RUBY_LANTERN = ITEMS.register("ruby_lantern",
			() -> new BlockItem(BlockInit.RUBY_LANTERN.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> TITANIUM_LANTERN = ITEMS.register("titanium_lantern",
			() -> new BlockItem(BlockInit.TITANIUM_LANTERN.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> TITANIUM_CHAIN = ITEMS.register("titanium_chain",
			() -> new BlockItem(BlockInit.TITANIUM_CHAIN.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> TITANIUM_BARS = ITEMS.register("titanium_bars",
			() -> new BlockItem(BlockInit.TITANIUM_BARS.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> TITANIUM_DOOR = ITEMS.register("titanium_door",
			() -> new BlockItem(BlockInit.TITANIUM_DOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> TITANIUM_TRAPDOOR = ITEMS.register("titanium_trapdoor",
			() -> new BlockItem(BlockInit.TITANIUM_TRAPDOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	
	public static final RegistryObject<BlockItem> RUBY_O_LANTERN = ITEMS.register("ruby_o_lantern",
			() -> new BlockItem(BlockInit.RUBY_O_LANTERN.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> CAVE_LANTERN = ITEMS.register("cave_lantern",
			() -> new BlockItem(BlockInit.CAVE_LANTERN.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> DIATOMITE = ITEMS.register("diatomite",
			() -> new BlockItem(BlockInit.DIATOMITE.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIATOMITE_SLAB = ITEMS.register("diatomite_slab",
			() -> new BlockItem(BlockInit.DIATOMITE_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DIATOMITE_STAIRS = ITEMS.register("diatomite_stairs",
			() -> new BlockItem(BlockInit.DIATOMITE_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> POLISHED_DIATOMITE = ITEMS.register("polished_diatomite",
			() -> new BlockItem(BlockInit.POLISHED_DIATOMITE.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> POLISHED_DIATOMITE_SLAB = ITEMS.register("polished_diatomite_slab",
			() -> new BlockItem(BlockInit.POLISHED_DIATOMITE_SLAB.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> POLISHED_DIATOMITE_STAIRS = ITEMS.register("polished_diatomite_stairs",
			() -> new BlockItem(BlockInit.POLISHED_DIATOMITE_STAIRS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> FOSSIL_DIATOMITE = ITEMS.register("fossil_diatomite",
			() -> new BlockItem(BlockInit.FOSSIL_DIATOMITE.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> CAVE_MUSHROOM = ITEMS.register("cave_mushroom",
			() -> new BlockItem(BlockInit.CAVE_MUSHROOM.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	/*
	public static final RegistryObject<BlockItem> DIATOMITE_SPIKE = ITEMS.register("diatomite_spike",
			() -> new BlockItem(BlockInit.DIATOMITE_SPIKE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> DIATOMITE_SPIKE_UPPER = ITEMS.register("diatomite_spike_upper",
			() -> new BlockItem(BlockInit.DIATOMITE_SPIKE_UPPER.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> DIATOMITE_SPIKE_DOWN = ITEMS.register("diatomite_spike_down",
			() -> new BlockItem(BlockInit.DIATOMITE_SPIKE_DOWN.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> DIATOMITE_SPIKE_BASE = ITEMS.register("diatomite_spike_base",
			() -> new BlockItem(BlockInit.DIATOMITE_SPIKE_BASE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> DIATOMITE_SPIKE_TOP = ITEMS.register("diatomite_spike_top",
			() -> new BlockItem(BlockInit.DIATOMITE_SPIKE_TOP.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	*/
	
	public static final RegistryObject<BlockItem> MITHRIL_ORE = ITEMS.register("mithril_ore",
			() -> new BlockItem(BlockInit.MITHRIL_ORE.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> ENDIA_ORE = ITEMS.register("endia_ore",
			() -> new BlockItem(BlockInit.ENDIA_ORE.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

	


}