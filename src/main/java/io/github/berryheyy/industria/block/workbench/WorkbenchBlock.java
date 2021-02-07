package io.github.berryheyy.industria.block.workbench;

import io.github.berryheyy.industria.block.BasicBlock;
import io.github.berryheyy.industria.itemgroup.ModItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class WorkbenchBlock extends BasicBlock {
    public static final VoxelShape SEMI_FULL_SHAPE = makeCuboidShape(0.01D, 0.01D, 0.01D, 15.99D, 15.99D, 15.99D);
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    public WorkbenchBlock() {
        super(AbstractBlock.Properties.create(Material.IRON).
                        harvestTool(ToolType.PICKAXE).
                        sound(SoundType.METAL).
                        hardnessAndResistance(3, 6),
                ModItemGroups.INDUSTRIA_MACHINES_ITEM_GROUP);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SEMI_FULL_SHAPE;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        PlayerEntity placer = context.getPlayer();
        Direction face = placer.getHorizontalFacing().getOpposite();
        return getDefaultState().with(FACING, face);
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState rotate(BlockState state, IWorld world, BlockPos pos, Rotation direction) {
        return state.with(FACING, direction.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.with(FACING, mirrorIn.mirror(state.get(FACING)));
    }

    // TileEntity

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new WorkbenchTileEntity();
    }

    // Activation


}
