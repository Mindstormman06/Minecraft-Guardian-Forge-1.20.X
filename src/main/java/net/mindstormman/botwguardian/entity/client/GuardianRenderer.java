package net.mindstormman.botwguardian.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.mindstormman.botwguardian.GuardianMod;
import net.mindstormman.botwguardian.entity.custom.GuardianEntity;
import net.minecraft.client.model.GuardianModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GuardianRenderer extends MobRenderer<GuardianEntity, BOTWGuardianModel<GuardianEntity>> {


    public GuardianRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new BOTWGuardianModel<>(pContext.bakeLayer(ModModelLayers.GUARDIAN_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(GuardianEntity guardianEntity) {
        return new ResourceLocation(GuardianMod.MOD_ID, "textures/entity/guardian.png");
    }


}
