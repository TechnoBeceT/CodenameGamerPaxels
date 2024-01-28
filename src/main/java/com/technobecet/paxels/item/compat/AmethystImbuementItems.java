package com.technobecet.paxels.item.compat;

import com.technobecet.paxels.CodenameGamerPaxelsMod;
import com.technobecet.paxels.item.custom.PaxelItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AmethystImbuementItems {
    public static final Item GARNET_PAXEL = registerItem("garnet_paxel", new PaxelItem(AIToolMaterials.GARNET, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item GLOWING_PAXEL = registerItem("glowing_paxel", new PaxelItem(AIToolMaterials.GLOWING, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item AI_STEEL_PAXEL = registerItem("ai_steel_paxel", new PaxelItem(AIToolMaterials.STEEL, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item AMETRINE_PAXEL = registerItem("ametrine_paxel", new PaxelItem(AIToolMaterials.AMETRINE, 6.0f, -2.8f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CodenameGamerPaxelsMod.MOD_ID, name), item);
    }

    private static void itemGroupTools(FabricItemGroupEntries entries) {
        entries.add(GARNET_PAXEL);
        entries.add(GLOWING_PAXEL);
        entries.add(AI_STEEL_PAXEL);
        entries.add(AMETRINE_PAXEL);
    }

    public static void registerModItems() {
        CodenameGamerPaxelsMod.LOGGER.info("Registering Mythic Metals Mod Compatibility Items for " + CodenameGamerPaxelsMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(AmethystImbuementItems::itemGroupTools);
    }
}
