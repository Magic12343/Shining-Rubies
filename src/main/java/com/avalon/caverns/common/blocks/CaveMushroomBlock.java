package com.avalon.caverns.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MushroomBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class CaveMushroomBlock extends MushroomBlock{
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);

	   public CaveMushroomBlock(AbstractBlock.Properties properties) {
	      super(properties);
	   }
	   
	   protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
		      return state.isOpaqueCube(worldIn, pos);
		   }

}
