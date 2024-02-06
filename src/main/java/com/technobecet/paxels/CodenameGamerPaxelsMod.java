package com.technobecet.paxels;

import com.technobecet.paxels.item.ModItemGroup;
import com.technobecet.paxels.item.ModItems;
import com.technobecet.paxels.item.compat.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.text.Style;
import net.minecraft.text.TextColor;
import net.minecraft.util.Formatting;
import nourl.mythicmetals.abilities.Abilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CodenameGamerPaxelsMod implements ModInitializer {
    public static final String MOD_ID = "codenamegamer-paxels";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroups();
        ModItems.registerModItems();
        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
            MythicMetalsItems.registerModItems();
            Abilities.BONUS_FORTUNE.addItem(MythicMetalsItems.CARMOT_PAXEL, Style.EMPTY.withColor(TextColor.fromRgb(0xE63E73)));
            Abilities.AQUA_AFFINITY.addItem(MythicMetalsItems.AQUARIUM_PAXEL, Style.EMPTY.withColor(Formatting.AQUA));
            Abilities.HOT.addItem(MythicMetalsItems.PALLADIUM_PAXEL, Style.EMPTY.withColor(TextColor.fromRgb(0xDF7323)));
            Abilities.MENDING.addItem(MythicMetalsItems.PROMETHEUM_PAXEL, Style.EMPTY.withColor(TextColor.fromRgb(0x3A6A56)));
            Abilities.AQUA_AFFINITY.addItem(MythicMetalsItems.TIDESINGER_PAXEL, Style.EMPTY.withColor(0x2F88FB));
            Abilities.RIPTIDE.addItem(MythicMetalsItems.TIDESINGER_PAXEL, Style.EMPTY.withColor(0x2F88FB));
        }
        if (FabricLoader.getInstance().isModLoaded("advancednetherite")) {
            AdvancedNetheriteItems.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("amethyst_imbuement")) {
            AmethystImbuementItems.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            BetterEndItems.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            BetterNetherItems.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("dragonloot")) {
            DragonLootItems.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            DeeperDarkerItems.registerModItems();
        }
    }
}
