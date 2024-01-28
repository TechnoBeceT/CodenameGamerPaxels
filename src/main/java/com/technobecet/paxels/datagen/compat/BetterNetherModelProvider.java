package com.technobecet.paxels.datagen.compat;

import com.technobecet.paxels.item.compat.BetterNetherItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class BetterNetherModelProvider extends FabricModelProvider {

    public BetterNetherModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(BetterNetherItems.CINCINNASITE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(BetterNetherItems.CINCINNASITE_PAXEL_DIAMOND, Models.HANDHELD);
        itemModelGenerator.register(BetterNetherItems.NETHER_RUBY_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(BetterNetherItems.FLAMING_RUBY_PAXEL, Models.HANDHELD);
    }
}
