package com.technobecet.paxels.datagen.compat;

import com.technobecet.paxels.item.compat.AdvancedEnderiteItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class AdvancedEnderiteModelProvider extends FabricModelProvider {

    public AdvancedEnderiteModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(AdvancedEnderiteItems.NETHERITE_ENDERITE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedEnderiteItems.IRON_ENDERITE__PAXEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedEnderiteItems.GOLD_ENDERITE__PAXEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedEnderiteItems.EMERALD_ENDERITE__PAXEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedEnderiteItems.DIAMOND_ENDERITE__PAXEL, Models.HANDHELD);
        itemModelGenerator.register(AdvancedEnderiteItems.AMETHYST_ENDERITE__PAXEL, Models.HANDHELD);
    }
}
