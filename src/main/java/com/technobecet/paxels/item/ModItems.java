package com.technobecet.paxels.item;

import com.technobecet.paxels.CodenameGamerPaxelsMod;
import com.technobecet.paxels.item.custom.PaxelItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WOODEN_PAXEL = registerItem("wooden_paxel", new PaxelItem(ToolMaterials.WOOD, 7.0f, -2.8f, new FabricItemSettings()));
    public static final Item STONE_PAXEL = registerItem("stone_paxel", new PaxelItem(ToolMaterials.STONE, 8.0f, -2.8f, new FabricItemSettings()));
    public static final Item IRON_PAXEL = registerItem("iron_paxel", new PaxelItem(ToolMaterials.IRON, 7.0f, -2.8f, new FabricItemSettings()));
    public static final Item GOLDEN_PAXEL = registerItem("golden_paxel", new PaxelItem(ToolMaterials.GOLD, 7.0f, -2.8f, new FabricItemSettings()));
    public static final Item DIAMOND_PAXEL = registerItem("diamond_paxel", new PaxelItem(ToolMaterials.DIAMOND, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item NETHERITE_PAXEL = registerItem("netherite_paxel", new PaxelItem(ToolMaterials.NETHERITE, 6.0f, -2.8f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CodenameGamerPaxelsMod.MOD_ID, name), item);
    }

    private static void itemGroupTools(FabricItemGroupEntries entries) {
        entries.add(WOODEN_PAXEL);
        entries.add(STONE_PAXEL);
        entries.add(IRON_PAXEL);
        entries.add(GOLDEN_PAXEL);
        entries.add(DIAMOND_PAXEL);
        entries.add(NETHERITE_PAXEL);
    }

    public static void registerModItems() {
        CodenameGamerPaxelsMod.LOGGER.info("Registering Mod Items for " + CodenameGamerPaxelsMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::itemGroupTools);
    }
}
