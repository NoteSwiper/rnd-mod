
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.noteswiper.rmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import me.noteswiper.rmod.entity.SlimedZombieEntity;
import me.noteswiper.rmod.entity.OakDoorEntity;
import me.noteswiper.rmod.RmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RmodMod.MODID);
	public static final RegistryObject<EntityType<OakDoorEntity>> OAK_DOOR = register("oak_door",
			EntityType.Builder.<OakDoorEntity>of(OakDoorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OakDoorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SlimedZombieEntity>> SLIMED_ZOMBIE = register("slimed_zombie",
			EntityType.Builder.<SlimedZombieEntity>of(SlimedZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SlimedZombieEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			OakDoorEntity.init();
			SlimedZombieEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(OAK_DOOR.get(), OakDoorEntity.createAttributes().build());
		event.put(SLIMED_ZOMBIE.get(), SlimedZombieEntity.createAttributes().build());
	}
}
