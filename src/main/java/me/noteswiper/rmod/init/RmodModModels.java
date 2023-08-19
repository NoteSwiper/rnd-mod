
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.noteswiper.rmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import me.noteswiper.rmod.client.model.Modelzombie;
import me.noteswiper.rmod.client.model.Modeloak_door;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RmodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelzombie.LAYER_LOCATION, Modelzombie::createBodyLayer);
		event.registerLayerDefinition(Modeloak_door.LAYER_LOCATION, Modeloak_door::createBodyLayer);
	}
}
