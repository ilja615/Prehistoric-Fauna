package superlord.prehistoricfauna.entity.model;

import java.util.function.Function;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class PrehistoricModel<T extends Entity> extends Model {
   public float swingProgress;
   public boolean isSitting;
   public boolean isChild = true;
   public boolean isBaby = true;

   protected PrehistoricModel() {
      this(RenderType::getEntityCutoutNoCull);
   }

   protected PrehistoricModel(Function<ResourceLocation, RenderType> p_i225945_1_) {
      super(p_i225945_1_);
   }

   /**
    * Sets this entity's model rotation angles
    */
   public abstract void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch);

   public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
   }

   public void copyModelAttributesTo(PrehistoricModel<T> p_217111_1_) {
      p_217111_1_.swingProgress = this.swingProgress;
      p_217111_1_.isSitting = this.isSitting;
      p_217111_1_.isChild = this.isChild;
      p_217111_1_.isBaby = this.isBaby;
   }
}