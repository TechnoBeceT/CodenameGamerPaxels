package com.technobecet.paxels.datagen.compat;

import com.technobecet.paxels.item.compat.BetterEndItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class BetterEndModelProvider extends FabricModelProvider {

    public BetterEndModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(BetterEndItems.THALLASIUM_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(BetterEndItems.TERMINITE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(BetterEndItems.AETERNIUM_PAXEL, Models.HANDHELD);
    }
}
