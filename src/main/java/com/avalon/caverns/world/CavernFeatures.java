package com.avalon.caverns.world;

import java.util.function.Supplier;

import com.avalon.caverns.Caverns;
import com.avalon.caverns.world.features.FeatureRandomPatch;

import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CavernFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Caverns.MOD_ID);

    // features
    public static final RegistryObject<Feature<BlockClusterFeatureConfig>> PATCH_GROUND = register("patch_ground", () -> new FeatureRandomPatch(false, BlockClusterFeatureConfig.field_236587_a_));
    public static final RegistryObject<Feature<BlockClusterFeatureConfig>> PATCH_CEILING = register("patch_ceiling", () -> new FeatureRandomPatch(true, BlockClusterFeatureConfig.field_236587_a_));

 static <T extends IFeatureConfig> RegistryObject<Feature<T>> register(String name, Supplier<? extends Feature<T>> feature) {
        return FEATURES.register(name, feature);
    }
}