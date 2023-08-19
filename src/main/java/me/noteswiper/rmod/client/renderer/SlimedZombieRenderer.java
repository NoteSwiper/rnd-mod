
package me.noteswiper.rmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import me.noteswiper.rmod.entity.SlimedZombieEntity;
import me.noteswiper.rmod.client.model.Modelzombie;

public class SlimedZombieRenderer extends MobRenderer<SlimedZombieEntity, Modelzombie<SlimedZombieEntity>> {
	public SlimedZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzombie(context.bakeLayer(Modelzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SlimedZombieEntity entity) {
		return new ResourceLocation("rmod:textures/entities/slimedzombie.png");
	}
}
