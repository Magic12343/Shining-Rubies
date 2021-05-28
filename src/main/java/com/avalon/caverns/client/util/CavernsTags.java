package com.avalon.caverns.client.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;

public class CavernsTags {
	
	public static class Items {
		@SuppressWarnings("unused")
		private static ITag.INamedTag<Item> createTag(String name) {
			return ItemTags.makeWrapperTag("shiningrubies:" + name);
		}
	}

	public static class Blocks {
		public static final ITag.INamedTag<Block> DIATOMITE_TOP = createTag("diatomite_top");

		private static ITag.INamedTag<Block> createTag(String name) {
			return BlockTags.makeWrapperTag("shiningrubies:" + name);
		}
	
	
	}

}
