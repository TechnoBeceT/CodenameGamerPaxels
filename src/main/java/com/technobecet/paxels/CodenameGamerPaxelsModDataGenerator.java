package com.technobecet.paxels;

import com.technobecet.paxels.datagen.ModBlockTagProvider;
import com.technobecet.paxels.datagen.ModModelProvider;
import com.technobecet.paxels.datagen.ModRecipeGenerator;
import com.technobecet.paxels.datagen.compat.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.loader.api.FabricLoader;

public class CodenameGamerPaxelsModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModRecipeGenerator::new);
        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
            pack.addProvider(MythicMetalsModelProvider::new);
        }
        if (FabricLoader.getInstance().isModLoaded("advancednetherite")) {
            pack.addProvider(AdvancedNetheriteModelProvider::new);
        }
        if (FabricLoader.getInstance().isModLoaded("amethyst_imbuement")) {
            pack.addProvider(AmethystImbuementModelProvider::new);
        }
        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            pack.addProvider(BetterEndModelProvider::new);
        }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            pack.addProvider(BetterNetherModelProvider::new);
        }
        if (FabricLoader.getInstance().isModLoaded("dragonloot")) {
            pack.addProvider(DragonLootModelProvider::new);
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            pack.addProvider(DeeperDarkerModelProvider::new);
        }

    }
}
