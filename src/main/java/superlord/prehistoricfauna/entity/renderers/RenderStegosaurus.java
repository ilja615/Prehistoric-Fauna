package superlord.prehistoricfauna.entity.renderers;

import superlord.prehistoricfauna.entity.EntityCamarasaurus;
import superlord.prehistoricfauna.entity.EntityGallimimus;
import superlord.prehistoricfauna.entity.EntityStegosaurus;
import superlord.prehistoricfauna.entity.EntityTriceratops;
import superlord.prehistoricfauna.entity.models.Camarasaurus;
import superlord.prehistoricfauna.entity.models.Gallimimus;
import superlord.prehistoricfauna.entity.models.Stegosaurus;
import superlord.prehistoricfauna.entity.models.Triceratops;
import superlord.prehistoricfauna.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderStegosaurus extends RenderLiving<EntityStegosaurus> {
	public static final Factory FACTORY = new Factory();

	public RenderStegosaurus(RenderManager manager) {
		super(manager, new Stegosaurus(), 0.2F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityStegosaurus entity) {
		if(entity.isChild()) {
			return new ResourceLocation(Reference.MOD_ID, "textures/entities/stegosauruschild.png");
		} else {
		return new ResourceLocation(Reference.MOD_ID, "textures/entities/stegosaurus.png");
		}
	}

	public static class Factory implements IRenderFactory<EntityStegosaurus> {

        @Override
        public Render<? super EntityStegosaurus> createRenderFor(RenderManager manager) {
            return new RenderStegosaurus(manager);
        }
    }
}