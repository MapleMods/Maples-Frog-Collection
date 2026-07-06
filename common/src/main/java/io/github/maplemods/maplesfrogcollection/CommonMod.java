package io.github.maplemods.maplesfrogcollection;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplesfrogcollection.data.Constants;
import net.minecraft.world.entity.EntityTypes;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "autumn", "flannel_frog", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "autumn", "pumpkin_frog", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "spring", "cherry_blossom_frog", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "spring", "flower_frog", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "summer", "midsommar_frog", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "summer", "watermelon_frog", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "winter", "frozen_frog", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "winter", "snow_covered_frog", 1);
    }
}
