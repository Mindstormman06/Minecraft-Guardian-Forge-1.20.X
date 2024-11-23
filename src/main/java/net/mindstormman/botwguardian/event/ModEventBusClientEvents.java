package net.mindstormman.botwguardian.event;

import net.mindstormman.botwguardian.GuardianMod;
import net.mindstormman.botwguardian.entity.client.ModModelLayers;
import net.minecraft.client.model.GuardianModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GuardianMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.GUARDIAN_LAYER, GuardianModel::createBodyLayer);
    }

}
