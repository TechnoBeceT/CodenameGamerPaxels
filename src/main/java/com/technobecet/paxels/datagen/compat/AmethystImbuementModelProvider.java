package com.technobecet.paxels.datagen.compat;

import com.technobecet.paxels.item.compat.AmethystImbuementItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class AmethystImbuementModelProvider extends FabricModelProvider {

    public AmethystImbuementModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(AmethystImbuementItems.GARNET_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(AmethystImbuementItems.GLOWING_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(AmethystImbuementItems.AI_STEEL_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(AmethystImbuementItems.AMETRINE_PAXEL, Models.HANDHELD);
    }
}
