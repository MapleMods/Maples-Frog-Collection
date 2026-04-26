package io.github.maplemods.maplesfrogcollection;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplesfrogcollection.data.Constants;
import net.minecraft.world.entity.EntityType;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FROG, "autumn", "flannel_frog", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FROG, "autumn", "pumpkin_frog", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FROG, "spring", "cherry_blossom_frog", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FROG, "spring", "flower_frog", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FROG, "summer", "midsommar_frog", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FROG, "summer", "watermelon_frog", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FROG, "winter", "frozen_frog", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FROG, "winter", "snow_covered_frog", 1);
    }
}
