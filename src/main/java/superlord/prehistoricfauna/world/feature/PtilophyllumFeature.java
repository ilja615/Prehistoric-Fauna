package superlord.prehistoricfauna.world.feature;

import com.mojang.datafixers.Dynamic;
import java.util.Random;
import java.util.function.Function;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import superlord.prehistoricfauna.block.PtilophyllumBaseBlock;
import superlord.prehistoricfauna.init.BlockInit;

public class PtilophyllumFeature extends Feature<NoFeatureConfig> {
   public PtilophyllumFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn) {
      super(configFactoryIn);
   }

   public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, NoFeatureConfig config) {
      if (worldIn.isAirBlock(pos.up()) && worldIn.getBlockState(pos).getBlock() == BlockInit.LOAM) {
         PtilophyllumBaseBlock.generatePlant(worldIn, pos.up(), rand, 8);
         return true;
      } else {
         return false;
      }
   }
}