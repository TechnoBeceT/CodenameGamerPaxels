package com.technobecet.paxels.datagen.compat;

import com.technobecet.paxels.item.compat.MythicMetalsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import nourl.mythicmetals.item.tools.MythicTools;

import java.util.function.Consumer;

public class MythicMetalsRecipeGenerator extends FabricRecipeProvider {
    public MythicMetalsRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MythicMetalsItems.ADAMANTITE_PAXEL)
                .pattern("ASP")
                .pattern(" W ")
                .pattern(" W ")
                .input('W', Items.STICK)
                .input('A', MythicTools.ADAMANTITE.getAxe())
                .input('S', MythicTools.ADAMANTITE.getShovel())
                .input('P', MythicTools.ADAMANTITE.getPickaxe())
                .criterion(hasItem(MythicTools.ADAMANTITE.getAxe()), conditionsFromItem(MythicTools.ADAMANTITE.getAxe()))
                .criterion(hasItem(MythicTools.ADAMANTITE.getShovel()), conditionsFromItem(MythicTools.ADAMANTITE.getShovel()))
                .criterion(hasItem(MythicTools.ADAMANTITE.getPickaxe()), conditionsFromItem(MythicTools.ADAMANTITE.getPickaxe()))
                .offerTo(exporter, new Identifier(getRecipeName(MythicMetalsItems.ADAMANTITE_PAXEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MythicMetalsItems.AQUARIUM_PAXEL)
                .pattern("ASP")
                .pattern(" W ")
                .pattern(" W ")
                .input('W', Items.STICK)
                .input('A', MythicTools.AQUARIUM.getAxe())
                .input('S', MythicTools.AQUARIUM.getShovel())
                .input('P', MythicTools.AQUARIUM.getPickaxe())
                .criterion(hasItem(MythicTools.AQUARIUM.getAxe()), conditionsFromItem(MythicTools.AQUARIUM.getAxe()))
                .criterion(hasItem(MythicTools.AQUARIUM.getShovel()), conditionsFromItem(MythicTools.AQUARIUM.getShovel()))
                .criterion(hasItem(MythicTools.AQUARIUM.getPickaxe()), conditionsFromItem(MythicTools.AQUARIUM.getPickaxe()))
                .offerTo(exporter, new Identifier(getRecipeName(MythicMetalsItems.AQUARIUM_PAXEL)));
    }
}
