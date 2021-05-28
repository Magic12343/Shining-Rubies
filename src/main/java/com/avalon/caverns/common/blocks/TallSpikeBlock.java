package com.avalon.caverns.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TallSpikeBlock extends TallCeilingBlock {

    private static final VoxelShape SHAPE_LOWER = VoxelShapes.or(
            Block.makeCuboidShape(6, 7, 6, 10, 16, 10)
    );
    private static final VoxelShape SHAPE_UPPER = VoxelShapes.or(
            Block.makeCuboidShape(5, 0, 5, 11, 16, 11)
    );

    public TallSpikeBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return getVoxelShape(state);
    }

    public static VoxelShape getVoxelShape(BlockState blockstate) {
        if (blockstate.get(HALF) == DoubleBlockHalf.LOWER) {
            return SHAPE_LOWER;
        } else {
            return SHAPE_UPPER;
        }
    }

}