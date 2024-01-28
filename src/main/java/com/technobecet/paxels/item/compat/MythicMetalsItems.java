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
import nourl.mythicmetals.item.tools.MythicToolMaterials;

public class MythicMetalsItems {
    public static final Item ADAMANTITE_PAXEL = registerItem("adamantite_paxel", new PaxelItem(MythicToolMaterials.ADAMANTITE, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item AQUARIUM_PAXEL = registerItem("aquarium_paxel", new PaxelItem(MythicToolMaterials.AQUARIUM, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item BANGLUM_PAXEL = registerItem("banglum_paxel", new PaxelItem(MythicToolMaterials.BANGLUM, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item BRONZE_PAXEL = registerItem("bronze_paxel", new PaxelItem(MythicToolMaterials.BRONZE, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item CARMOT_PAXEL = registerItem("carmot_paxel", new PaxelItem(MythicToolMaterials.CARMOT, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item CELESTIUM_PAXEL = registerItem("celestium_paxel", new PaxelItem(MythicToolMaterials.CELESTIUM, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_PAXEL = registerItem("copper_paxel", new PaxelItem(MythicToolMaterials.COPPER, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item DURASTEEL_PAXEL = registerItem("durasteel_paxel", new PaxelItem(MythicToolMaterials.DURASTEEL, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item HALLOWED_PAXEL = registerItem("hallowed_paxel", new PaxelItem(MythicToolMaterials.HALLOWED, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item KYBER_PAXEL = registerItem("kyber_paxel", new PaxelItem(MythicToolMaterials.KYBER, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item METALLURGIUM_PAXEL = registerItem("metallurgium_paxel", new PaxelItem(MythicToolMaterials.METALLURGIUM, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item ORICHALCUM_PAXEL = registerItem("orichalcum_paxel", new PaxelItem(MythicToolMaterials.ORICHALCUM, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item OSMIUM_PAXEL = registerItem("osmium_paxel", new PaxelItem(MythicToolMaterials.OSMIUM, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item PALLADIUM_PAXEL = registerItem("palladium_paxel", new PaxelItem(MythicToolMaterials.PALLADIUM, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item PROMETHEUM_PAXEL = registerItem("prometheum_paxel", new PrometheumPaxelItem(MythicToolMaterials.PROMETHEUM, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item QUADRILLUM_PAXEL = registerItem("quadrillum_paxel", new PaxelItem(MythicToolMaterials.QUADRILLUM, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item RUNITE_PAXEL = registerItem("runite_paxel", new PaxelItem(MythicToolMaterials.RUNITE, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item STAR_PLATINUM_PAXEL = registerItem("star_platinum_paxel", new PaxelItem(MythicToolMaterials.STAR_PLATINUM, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item STEEL_PAXEL = registerItem("steel_paxel", new PaxelItem(MythicToolMaterials.STEEL, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item STORMYX_PAXEL = registerItem("stormyx_paxel", new PaxelItem(MythicToolMaterials.STORMYX, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item TIDESINGER_PAXEL = registerItem("tidesinger_paxel", new PaxelItem(MythicToolMaterials.AQUARIUM, 6.0f, -2.8f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CodenameGamerPaxelsMod.MOD_ID, name), item);
    }

    private static void itemGroupTools(FabricItemGroupEntries entries) {
        entries.add(ADAMANTITE_PAXEL);
        entries.add(AQUARIUM_PAXEL);
        entries.add(BANGLUM_PAXEL);
        entries.add(BRONZE_PAXEL);
        entries.add(CARMOT_PAXEL);
        entries.add(CELESTIUM_PAXEL);
        entries.add(COPPER_PAXEL);
        entries.add(DURASTEEL_PAXEL);
        entries.add(HALLOWED_PAXEL);
        entries.add(KYBER_PAXEL);
        entries.add(METALLURGIUM_PAXEL);
        entries.add(ORICHALCUM_PAXEL);
        entries.add(OSMIUM_PAXEL);
        entries.add(PALLADIUM_PAXEL);
        entries.add(PROMETHEUM_PAXEL);
        entries.add(QUADRILLUM_PAXEL);
        entries.add(RUNITE_PAXEL);
        entries.add(STAR_PLATINUM_PAXEL);
        entries.add(STEEL_PAXEL);
        entries.add(STORMYX_PAXEL);
        entries.add(TIDESINGER_PAXEL);
    }

    public static void registerModItems() {
        CodenameGamerPaxelsMod.LOGGER.info("Registering Mythic Metals Mod Compatibility Items for " + CodenameGamerPaxelsMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(MythicMetalsItems::itemGroupTools);
    }
}
