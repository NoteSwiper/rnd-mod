
package me.noteswiper.rmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import me.noteswiper.rmod.entity.OakDoorEntity;
import me.noteswiper.rmod.client.model.Modeloak_door;

public class OakDoorRenderer extends MobRenderer<OakDoorEntity, Modeloak_door<OakDoorEntity>> {
	public OakDoorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeloak_door(context.bakeLayer(Modeloak_door.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OakDoorEntity entity) {
		return new ResourceLocation("rmod:textures/entities/oak_door0.png");
	}
}
