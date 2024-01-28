package com.technobecet.paxels.datagen;

import com.technobecet.paxels.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WOODEN_PAXEL)
                .pattern("ASP")
                .pattern(" W ")
                .pattern(" W ")
                .input('W', Items.STICK)
                .input('A', Items.WOODEN_AXE)
                .input('S', Items.WOODEN_SHOVEL)
                .input('P', Items.WOODEN_PICKAXE)
                .criterion(hasItem(Items.WOODEN_AXE), conditionsFromItem(Items.WOODEN_AXE))
                .criterion(hasItem(Items.WOODEN_SHOVEL), conditionsFromItem(Items.WOODEN_SHOVEL))
                .criterion(hasItem(Items.WOODEN_PICKAXE), conditionsFromItem(Items.WOODEN_PICKAXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_PAXEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STONE_PAXEL)
                .pattern("ASP")
                .pattern(" W ")
                .pattern(" W ")
                .input('W', Items.STICK)
                .input('A', Items.STONE_AXE)
                .input('S', Items.STONE_SHOVEL)
                .input('P', Items.STONE_PICKAXE)
                .criterion(hasItem(Items.WOODEN_AXE), conditionsFromItem(Items.STONE_AXE))
                .criterion(hasItem(Items.WOODEN_SHOVEL), conditionsFromItem(Items.STONE_SHOVEL))
                .criterion(hasItem(Items.WOODEN_PICKAXE), conditionsFromItem(Items.STONE_PICKAXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_PAXEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_PAXEL)
                .pattern("ASP")
                .pattern(" W ")
                .pattern(" W ")
                .input('W', Items.STICK)
                .input('A', Items.IRON_AXE)
                .input('S', Items.IRON_SHOVEL)
                .input('P', Items.IRON_PICKAXE)
                .criterion(hasItem(Items.WOODEN_AXE), conditionsFromItem(Items.IRON_AXE))
                .criterion(hasItem(Items.WOODEN_SHOVEL), conditionsFromItem(Items.IRON_SHOVEL))
                .criterion(hasItem(Items.WOODEN_PICKAXE), conditionsFromItem(Items.IRON_PICKAXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_PAXEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOLDEN_PAXEL)
                .pattern("ASP")
                .pattern(" W ")
                .pattern(" W ")
                .input('W', Items.STICK)
                .input('A', Items.GOLDEN_AXE)
                .input('S', Items.GOLDEN_SHOVEL)
                .input('P', Items.GOLDEN_PICKAXE)
                .criterion(hasItem(Items.WOODEN_AXE), conditionsFromItem(Items.GOLDEN_AXE))
                .criterion(hasItem(Items.WOODEN_SHOVEL), conditionsFromItem(Items.GOLDEN_SHOVEL))
                .criterion(hasItem(Items.WOODEN_PICKAXE), conditionsFromItem(Items.GOLDEN_PICKAXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_PAXEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_PAXEL)
                .pattern("ASP")
                .pattern(" W ")
                .pattern(" W ")
                .input('W', Items.STICK)
                .input('A', Items.DIAMOND_AXE)
                .input('S', Items.DIAMOND_SHOVEL)
                .input('P', Items.DIAMOND_PICKAXE)
                .criterion(hasItem(Items.WOODEN_AXE), conditionsFromItem(Items.DIAMOND_AXE))
                .criterion(hasItem(Items.WOODEN_SHOVEL), conditionsFromItem(Items.DIAMOND_SHOVEL))
                .criterion(hasItem(Items.WOODEN_PICKAXE), conditionsFromItem(Items.DIAMOND_PICKAXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_PAXEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHERITE_PAXEL)
                .pattern("ASP")
                .pattern(" W ")
                .pattern(" W ")
                .input('W', Items.STICK)
                .input('A', Items.NETHERITE_AXE)
                .input('S', Items.NETHERITE_SHOVEL)
                .input('P', Items.NETHERITE_PICKAXE)
                .criterion(hasItem(Items.WOODEN_AXE), conditionsFromItem(Items.NETHERITE_AXE))
                .criterion(hasItem(Items.WOODEN_SHOVEL), conditionsFromItem(Items.NETHERITE_SHOVEL))
                .criterion(hasItem(Items.WOODEN_PICKAXE), conditionsFromItem(Items.NETHERITE_PICKAXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_PAXEL)));
    }
}
