
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.noteswiper.rmod.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RmodModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> SHOW_WELCOME_MESSAGE = GameRules.register("showWelcomeMessage", GameRules.Category.CHAT, GameRules.BooleanValue.create(false));
}
