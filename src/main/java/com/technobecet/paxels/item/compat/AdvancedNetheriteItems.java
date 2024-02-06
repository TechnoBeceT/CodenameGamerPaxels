package com.technobecet.paxels.item.compat;

import com.autovw.advancednetherite.core.util.ModToolTiers;
import com.technobecet.paxels.CodenameGamerPaxelsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AdvancedNetheriteItems {
    public static final Item NETHERITE_IRON_PAXEL = registerItem("netherite_iron_paxel", new AdvancedPaxelItem(ModToolTiers.NETHERITE_IRON, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item NETHERITE_GOLD_PAXEL = registerItem("netherite_gold_paxel", new AdvancedPaxelItem(ModToolTiers.NETHERITE_GOLD, 7.0f, -2.8f, new FabricItemSettings()));
    public static final Item NETHERITE_EMERALD_PAXEL = registerItem("netherite_emerald_paxel", new AdvancedPaxelItem(ModToolTiers.NETHERITE_EMERALD, 7.0f, -2.8f, new FabricItemSettings()));
    public static final Item NETHERITE_DIAMOND_PAXEL = registerItem("netherite_diamond_paxel", new AdvancedPaxelItem(ModToolTiers.NETHERITE_DIAMOND, 8.0f, -2.8f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CodenameGamerPaxelsMod.MOD_ID, name), item);
    }

    private static void itemGroupTools(FabricItemGroupEntries entries) {
        entries.add(NETHERITE_IRON_PAXEL);
        entries.add(NETHERITE_GOLD_PAXEL);
        entries.add(NETHERITE_EMERALD_PAXEL);
        entries.add(NETHERITE_DIAMOND_PAXEL);
    }

    public static void registerModItems() {
        CodenameGamerPaxelsMod.LOGGER.info("Registering Advanced Netherite Mod Compatibility Items for " + CodenameGamerPaxelsMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(AdvancedNetheriteItems::itemGroupTools);
    }
}
