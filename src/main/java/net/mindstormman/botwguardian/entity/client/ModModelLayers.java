package net.mindstormman.botwguardian.entity.client;

import net.mindstormman.botwguardian.GuardianMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

public class ModModelLayers {
    public static final ModelLayerLocation GUARDIAN_LAYER = new ModelLayerLocation(
            new ResourceLocation(GuardianMod.MOD_ID, "guardian_layer"), "main");
}
