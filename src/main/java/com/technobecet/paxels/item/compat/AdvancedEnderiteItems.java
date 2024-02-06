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

public class AdvancedEnderiteItems {
    public static final Item NETHERITE_ENDERITE_PAXEL = registerItem("netherite_enderite_paxel", new PaxelItem(CompatToolMaterials.NETHERITE_ENDERITE, 6.0f, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item IRON_ENDERITE__PAXEL = registerItem("iron_enderite_paxel", new PaxelItem(CompatToolMaterials.IRON_ENDERITE, 6.0f, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item GOLD_ENDERITE__PAXEL = registerItem("gold_enderite_paxel", new PaxelItem(CompatToolMaterials.GOLD_ENDERITE, 6.0f, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item EMERALD_ENDERITE__PAXEL = registerItem("emerald_enderite_paxel", new PaxelItem(CompatToolMaterials.EMERALD_ENDERITE, 6.0f, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item DIAMOND_ENDERITE__PAXEL = registerItem("diamond_enderite_paxel", new PaxelItem(CompatToolMaterials.DIAMOND_ENDERITE, 6.0f, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item AMETHYST_ENDERITE__PAXEL = registerItem("amethyst_enderite_paxel", new PaxelItem(CompatToolMaterials.AMETHYST_ENDERITE, 6.0f, -2.8f, new FabricItemSettings().fireproof()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CodenameGamerPaxelsMod.MOD_ID, name), item);
    }

    private static void itemGroupTools(FabricItemGroupEntries entries) {
        entries.add(NETHERITE_ENDERITE_PAXEL);
        entries.add(IRON_ENDERITE__PAXEL);
        entries.add(GOLD_ENDERITE__PAXEL);
        entries.add(EMERALD_ENDERITE__PAXEL);
        entries.add(DIAMOND_ENDERITE__PAXEL);
        entries.add(AMETHYST_ENDERITE__PAXEL);
    }

    public static void registerModItems() {
        CodenameGamerPaxelsMod.LOGGER.info("Registering Advanced Enderite Mod Compatibility Items for " + CodenameGamerPaxelsMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(AdvancedEnderiteItems::itemGroupTools);
    }
}
