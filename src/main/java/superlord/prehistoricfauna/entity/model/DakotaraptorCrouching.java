package superlord.prehistoricfauna.entity.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import superlord.prehistoricfauna.entity.DakotaraptorEntity;

/**
 * Dakotaraptor - Undefined
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class DakotaraptorCrouching extends EntityModel<DakotaraptorEntity> {
    public ModelRenderer Body;
    public ModelRenderer LeftLeg1;
    public ModelRenderer RightLeg1;
    public ModelRenderer Neck;
    public ModelRenderer LeftWing;
    public ModelRenderer RightWing;
    public ModelRenderer Tail1;
    public ModelRenderer Head1;
    public ModelRenderer Snout;
    public ModelRenderer Tail2;
    public ModelRenderer Feathers;
    public ModelRenderer LeftLeg2;
    public ModelRenderer RightLeg2;

    public DakotaraptorCrouching() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Body = new ModelRenderer(this, 3, 2);
        this.Body.setRotationPoint(0.0F, 3.9F, 1.0F);
        this.Body.addBox(-5.0F, -7.0F, -16.0F, 10.0F, 14.0F, 22.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.39269908169872414F, 0.0F, 0.0F);
        this.RightWing = new ModelRenderer(this, 0, 0);
        this.RightWing.mirror = true;
        this.RightWing.setRotationPoint(-5.0F, 1.0F, -14.0F);
        this.RightWing.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 11.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 0, 42);
        this.Tail1.setRotationPoint(0.0F, -4.0F, 5.0F);
        this.Tail1.addBox(-3.0F, -2.0F, 0.0F, 6.0F, 8.0F, 24.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, -0.04555309164612875F, 0.0F, 0.0F);
        this.Feathers = new ModelRenderer(this, 55, 30);
        this.Feathers.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Feathers.addBox(-5.0F, 0.0F, 0.0F, 10.0F, 7.0F, 26.0F, 0.0F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 0, 86);
        this.Neck.setRotationPoint(0.0F, -4.0F, -16.0F);
        this.Neck.addBox(-3.0F, -2.0F, -6.0F, 6.0F, 5.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.26755897299915016F, 0.0F, 0.0F);
        this.RightLeg1 = new ModelRenderer(this, 94, 71);
        this.RightLeg1.setRotationPoint(-5.0F, 3.9F, 1.0F);
        this.RightLeg1.addBox(-2.0F, -3.0F, -4.0F, 5.0F, 12.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.LeftLeg2 = new ModelRenderer(this, 70, 71);
        this.LeftLeg2.setRotationPoint(-1.0F, 9.0F, 5.0F);
        this.LeftLeg2.addBox(-2.0F, 0.0F, -6.0F, 5.0F, 11.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.LeftLeg1 = new ModelRenderer(this, 94, 71);
        this.LeftLeg1.setRotationPoint(5.0F, 3.9F, 1.0F);
        this.LeftLeg1.addBox(-3.0F, -3.0F, -4.0F, 5.0F, 12.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.Head1 = new ModelRenderer(this, 30, 77);
        this.Head1.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Head1.addBox(-3.0F, -3.0F, -9.0F, 6.0F, 9.0F, 11.0F, 0.0F, 0.0F, 0.0F);
        this.Snout = new ModelRenderer(this, 0, 102);
        this.Snout.setRotationPoint(0.0F, -2.0F, -9.0F);
        this.Snout.addBox(-2.0F, 0.0F, -10.0F, 4.0F, 7.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 73, 0);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 23.0F);
        this.Tail2.addBox(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 23.0F, 0.0F, 0.0F, 0.0F);
        this.LeftWing = new ModelRenderer(this, 0, 0);
        this.LeftWing.setRotationPoint(5.0F, 1.0F, -14.0F);
        this.LeftWing.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 11.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.RightLeg2 = new ModelRenderer(this, 70, 71);
        this.RightLeg2.mirror = true;
        this.RightLeg2.setRotationPoint(1.0F, 9.0F, 5.0F);
        this.RightLeg2.addBox(-3.0F, 0.0F, -6.0F, 5.0F, 11.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.Body.addChild(this.RightWing);
        this.Body.addChild(this.Tail1);
        this.Tail2.addChild(this.Feathers);
        this.Body.addChild(this.Neck);
        this.LeftLeg1.addChild(this.LeftLeg2);
        this.Neck.addChild(this.Head1);
        this.Head1.addChild(this.Snout);
        this.Tail1.addChild(this.Tail2);
        this.Body.addChild(this.LeftWing);
        this.RightLeg1.addChild(this.RightLeg2);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) { 
        ImmutableList.of(this.Body, this.RightLeg1, this.LeftLeg1).forEach((modelRenderer) -> { 
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setRotationAngles(DakotaraptorEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    	this.Neck.rotateAngleX = headPitch * ((float)Math.PI / 180F);
    	this.Neck.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
    	this.RightLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.LeftLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;	
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
