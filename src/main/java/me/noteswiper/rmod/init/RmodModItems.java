
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.noteswiper.rmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import me.noteswiper.rmod.RmodMod;

public class RmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RmodMod.MODID);
	public static final RegistryObject<Item> OAK_DOOR_SPAWN_EGG = REGISTRY.register("oak_door_spawn_egg", () -> new ForgeSpawnEggItem(RmodModEntities.OAK_DOOR, -6391210, -8955302, new Item.Properties().tab(RmodModTabs.TAB_CREATIVE_ITEM_TAB)));
	public static final RegistryObject<Item> SLIMED_ZOMBIE_SPAWN_EGG = REGISTRY.register("slimed_zombie_spawn_egg",
			() -> new ForgeSpawnEggItem(RmodModEntities.SLIMED_ZOMBIE, -16737895, -6711040, new Item.Properties().tab(RmodModTabs.TAB_CREATIVE_ITEM_TAB)));
}
