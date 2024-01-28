package com.technobecet.paxels.datagen.compat;

import com.technobecet.paxels.item.compat.AdvancedNetheriteItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class AdvancedNetheriteModelProvider extends FabricModelProvider {

    public AdvancedNetheriteModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(AdvancedNetheriteItems.NETHERITE_IRON_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedNetheriteItems.NETHERITE_GOLD_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedNetheriteItems.NETHERITE_EMERALD_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedNetheriteItems.NETHERITE_DIAMOND_PAXEL, Models.HANDHELD);

    }
}
