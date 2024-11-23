package net.mindstormman.botwguardian.event;

import net.mindstormman.botwguardian.GuardianMod;
import net.mindstormman.botwguardian.entity.custom.GuardianEntity;
import net.mindstormman.botwguardian.entity.ModEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GuardianMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GUARDIAN.get(), GuardianEntity.createAttributes().build());
    }

}
