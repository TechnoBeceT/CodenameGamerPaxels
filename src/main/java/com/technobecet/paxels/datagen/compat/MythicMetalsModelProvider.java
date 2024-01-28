package com.technobecet.paxels.datagen.compat;

import com.technobecet.paxels.item.compat.MythicMetalsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class MythicMetalsModelProvider extends FabricModelProvider {

    public MythicMetalsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(MythicMetalsItems.ADAMANTITE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.AQUARIUM_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.BANGLUM_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.BRONZE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.CARMOT_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.CELESTIUM_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.COPPER_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.DURASTEEL_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.HALLOWED_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.KYBER_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.METALLURGIUM_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.ORICHALCUM_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.OSMIUM_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.PALLADIUM_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.PROMETHEUM_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.QUADRILLUM_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.RUNITE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.STAR_PLATINUM_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.STEEL_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.STORMYX_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(MythicMetalsItems.TIDESINGER_PAXEL, Models.HANDHELD);

    }
}
