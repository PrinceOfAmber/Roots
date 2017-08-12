package teamroots.emberroot.entity.timberwolf;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import teamroots.emberroot.Const;

public class RenderTimberWolf extends RenderLiving<EntityTimberWolf> {

	public RenderTimberWolf(RenderManager renderManager, ModelBase modelBase, float shadowSize) {
		super(renderManager, modelBase, shadowSize);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityTimberWolf entity) {
		return new ResourceLocation(Const.MODID,"textures/entity/timberwolf.png");
	}
	
	
	 public static class Factory implements IRenderFactory<EntityTimberWolf> {
	    @Override
	    public RenderTimberWolf createRenderFor(RenderManager manager) {
	      return new RenderTimberWolf(manager, ModelTimberWolf.instance, 0);
	    }
	  }
}