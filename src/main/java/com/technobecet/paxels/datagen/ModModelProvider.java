package com.technobecet.paxels.datagen;

import com.technobecet.paxels.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.WOODEN_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_PAXEL, Models.HANDHELD);
    }
}
