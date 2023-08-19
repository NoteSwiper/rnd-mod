
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.noteswiper.rmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import me.noteswiper.rmod.RmodMod;

public class RmodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RmodMod.MODID);
	public static final RegistryObject<SoundEvent> SLIMEDZOMBIE_AMBIENT = REGISTRY.register("slimedzombie.ambient", () -> new SoundEvent(new ResourceLocation("rmod", "slimedzombie.ambient")));
	public static final RegistryObject<SoundEvent> SLIMEDZOMBIE_HURT = REGISTRY.register("slimedzombie.hurt", () -> new SoundEvent(new ResourceLocation("rmod", "slimedzombie.hurt")));
	public static final RegistryObject<SoundEvent> SLIMEDZOMBIE_DEATH = REGISTRY.register("slimedzombie.death", () -> new SoundEvent(new ResourceLocation("rmod", "slimedzombie.death")));
}
