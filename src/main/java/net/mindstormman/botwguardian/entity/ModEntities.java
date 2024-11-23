package net.mindstormman.botwguardian.entity;

import net.mindstormman.botwguardian.GuardianMod;
import net.mindstormman.botwguardian.entity.custom.GuardianEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GuardianMod.MOD_ID);

    public static final RegistryObject<EntityType<GuardianEntity>> GUARDIAN =
            ENTITY_TYPES.register("guardian", () -> EntityType.Builder.of(GuardianEntity::new, MobCategory.MONSTER)
                    .sized(1.0F, 2.0F) // Set size of the entity
                    .build("guardian"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
