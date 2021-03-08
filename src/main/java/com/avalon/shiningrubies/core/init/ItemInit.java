package com.avalon.shiningrubies.core.init;

import com.avalon.shiningrubies.ShiningRubies;

import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			ShiningRubies.MOD_ID);
	
	//Items
    public static final RegistryObject<Item> RUBY_ITEM = ITEMS.register("ruby", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> RUBY_POWDER = ITEMS.register("ruby_powder", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

	// Block Items
	public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore",
			() -> new BlockItem(BlockInit.RUBY_ORE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block",
			() -> new BlockItem(BlockInit.RUBY_BLOCK.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> RUBY_TORCH = ITEMS.register("ruby_torch",
			() -> new BlockItem(BlockInit.RUBY_TORCH.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> RUBY_LANTERN = ITEMS.register("ruby_lantern",
			() -> new BlockItem(BlockInit.RUBY_LANTERN.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> RUBY_O_LANTERN = ITEMS.register("ruby_o_lantern",
			() -> new BlockItem(BlockInit.RUBY_O_LANTERN.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> CAVE_LANTERN = ITEMS.register("cave_lantern",
			() -> new BlockItem(BlockInit.CAVE_LANTERN.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));


}
