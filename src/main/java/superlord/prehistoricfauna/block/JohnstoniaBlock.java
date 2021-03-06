package superlord.prehistoricfauna.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class JohnstoniaBlock extends BushBlock implements IGrowable {

    public static final IntegerProperty LAYER = IntegerProperty.create("layer", 0, 2);

    public JohnstoniaBlock(Block.Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        if (state.getBlock() == this && state.get(LAYER) == 0) {
            BlockState soil = worldIn.getBlockState(pos.down());
            return soil.getBlock().canSustainPlant(soil, worldIn, pos.down(), net.minecraft.util.Direction.UP, this);
        } else {
        	if (state.getBlock() == this && state.get(LAYER) != 0) {
        		BlockState below = worldIn.getBlockState(pos.down());
                return below.getBlock() == this;
        	}
        }
        BlockState blockstate = worldIn.getBlockState(pos.down());
        if (state.getBlock() != this) return super.isValidPosition(state, worldIn, pos); 
        return blockstate.getBlock() == this && blockstate.get(LAYER) == 0;
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
        spawnAsEntity(worldIn, pos, new ItemStack(this));
    }

    public void placeAt(IWorld worldIn, BlockPos pos, int flags) {
        worldIn.setBlockState(pos, this.getDefaultState().with(LAYER, 0), flags);
        worldIn.setBlockState(pos.up(), this.getDefaultState().with(LAYER, 1), flags);
        worldIn.setBlockState(pos.up(), this.getDefaultState().with(LAYER, 2), flags);
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
        worldIn.setBlockState(pos, this.getDefaultState().with(LAYER, 0), 2);
        worldIn.setBlockState(pos.up(), this.getDefaultState().with(LAYER, 1), 2);
        worldIn.setBlockState(pos.up(2), this.getDefaultState().with(LAYER, 2), 2);
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        if (state.get(LAYER) == 0) {
            worldIn.destroyBlock(pos, true);
            for (int i = 1; i < 3; i++) {
                if (worldIn.getBlockState(pos.up(i)).getBlock() == this) {
                    worldIn.destroyBlock(pos.up(i), false);
                }
            }
        } else {
            worldIn.destroyBlock(pos, false);
        }
        super.onBlockHarvested(worldIn, pos, state, player);
    }
    
    public BlockState getStateFromMeta(int meta) {
        return this.getDefaultState().with(LAYER, meta);
    }

    public int getMetaFromState(BlockState state) {
        return state.get(LAYER);
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(LAYER);
    }

}
