package teamroots.emberroot.entity.spriteling;
//import elucent.roots.model.entity.ModelSpriteling;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import teamroots.emberroot.Const;
import teamroots.emberroot.entity.sprite.EntitySprite;
import teamroots.emberroot.entity.sprite.ModelSprite;
import teamroots.emberroot.entity.sprite.RenderSprite;

public class RenderSpriteling extends RenderLiving<EntitySpriteling> {
  public RenderSpriteling(RenderManager renderManager, ModelBase modelBase, float shadowSize) {
    super(renderManager, modelBase, shadowSize);
  }
  @Override
  protected ResourceLocation getEntityTexture(EntitySpriteling entity) {
    return new ResourceLocation(Const.MODID, "textures/entity/spriteling/spirit.png");
  }
  public static class Factory implements IRenderFactory<EntitySpriteling> {
    @Override
    public RenderSpriteling createRenderFor(RenderManager manager) {
      return new RenderSpriteling(manager, ModelSpriteling.instance, 0);
    }
  }
}