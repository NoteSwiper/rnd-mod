
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.noteswiper.rmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import me.noteswiper.rmod.client.renderer.SlimedZombieRenderer;
import me.noteswiper.rmod.client.renderer.OakDoorRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RmodModEntities.OAK_DOOR.get(), OakDoorRenderer::new);
		event.registerEntityRenderer(RmodModEntities.SLIMED_ZOMBIE.get(), SlimedZombieRenderer::new);
	}
}
