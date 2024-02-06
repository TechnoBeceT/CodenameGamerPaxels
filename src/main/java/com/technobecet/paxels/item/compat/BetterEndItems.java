package com.technobecet.paxels.item.compat;

import com.technobecet.paxels.CodenameGamerPaxelsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.betterx.betterend.item.material.EndToolMaterial;

public class BetterEndItems {
    public static final Item THALLASIUM_PAXEL = registerItem("thallasium_paxel", new EndPaxelItem(EndToolMaterial.THALLASIUM, 7.0f, -2.8f, new FabricItemSettings()));
    public static final Item TERMINITE_PAXEL = registerItem("terminite_paxel", new EndPaxelItem(EndToolMaterial.TERMINITE, 7.0f, -2.8f, new FabricItemSettings()));
    public static final Item AETERNIUM_PAXEL = registerItem("aeternium_paxel", new EndPaxelItem(EndToolMaterial.AETERNIUM, 6.0f, -2.8f, new FabricItemSettings().fireproof()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CodenameGamerPaxelsMod.MOD_ID, name), item);
    }

    private static void itemGroupTools(FabricItemGroupEntries entries) {
        entries.add(THALLASIUM_PAXEL);
        entries.add(TERMINITE_PAXEL);
        entries.add(AETERNIUM_PAXEL);
    }

    public static void registerModItems() {
        CodenameGamerPaxelsMod.LOGGER.info("Registering Better End Mod Compatibility Items for " + CodenameGamerPaxelsMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(BetterEndItems::itemGroupTools);
    }
}
