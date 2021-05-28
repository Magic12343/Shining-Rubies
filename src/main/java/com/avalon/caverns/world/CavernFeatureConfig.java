package com.avalon.caverns.world;

import com.avalon.caverns.core.init.BlockInit;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.TagMatchRuleTest;

public class CavernFeatureConfig extends OreFeatureConfig{

	public CavernFeatureConfig(RuleTest p_i241989_1_, BlockState state, int size) {
		super(p_i241989_1_, state, size);
	}
	
	public static final class FillerBlockType {
	      public static final RuleTest ENDSTONE = new BlockMatchRuleTest(Blocks.END_STONE);
	      public static final RuleTest BLACKSTONEGEN = new BlockMatchRuleTest(Blocks.BLACKSTONE);
	      public static final RuleTest NETHERGEN = new BlockMatchRuleTest(Blocks.NETHERRACK);
	      
	      
	   }

}
