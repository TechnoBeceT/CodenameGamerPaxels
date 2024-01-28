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
import org.betterx.betternether.items.materials.BNToolMaterial;

public class BetterNetherItems {
    public static final Item CINCINNASITE_PAXEL = registerItem("cincinnasite_paxel", new NetherPaxelItem(BNToolMaterial.CINCINNASITE, 7.0f, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item CINCINNASITE_PAXEL_DIAMOND = registerItem("cincinnasite_paxel_diamond", new NetherPaxelItem(BNToolMaterial.CINCINNASITE_DIAMOND, 6.0f, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item NETHER_RUBY_PAXEL = registerItem("nether_ruby_paxel", new NetherPaxelItem(BNToolMaterial.NETHER_RUBY, 6.0f, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item FLAMING_RUBY_PAXEL = registerItem("flaming_ruby_paxel", new NetherPaxelItem(BNToolMaterial.FLAMING_RUBY, 6.0f, -2.8f, new FabricItemSettings().fireproof()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CodenameGamerPaxelsMod.MOD_ID, name), item);
    }

    private static void itemGroupTools(FabricItemGroupEntries entries) {
        entries.add(CINCINNASITE_PAXEL);
        entries.add(CINCINNASITE_PAXEL_DIAMOND);
        entries.add(NETHER_RUBY_PAXEL);
        entries.add(FLAMING_RUBY_PAXEL);
    }

    public static void registerModItems() {
        CodenameGamerPaxelsMod.LOGGER.info("Registering Mythic Metals Mod Compatibility Items for " + CodenameGamerPaxelsMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(BetterNetherItems::itemGroupTools);
    }
}
