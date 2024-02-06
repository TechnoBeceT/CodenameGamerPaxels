package com.technobecet.paxels.item;

import com.technobecet.paxels.CodenameGamerPaxelsMod;
import com.technobecet.paxels.item.compat.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CODENAMEGAMER_PAXELS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CodenameGamerPaxelsMod.MOD_ID, "codenamegamer_paxels_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.codenamegamer_paxels_group"))
                    .icon(() -> new ItemStack(ModItems.DIAMOND_PAXEL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WOODEN_PAXEL);
                        entries.add(ModItems.STONE_PAXEL);
                        entries.add(ModItems.IRON_PAXEL);
                        entries.add(ModItems.GOLDEN_PAXEL);
                        entries.add(ModItems.DIAMOND_PAXEL);
                        entries.add(ModItems.NETHERITE_PAXEL);
                        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
                            entries.add(MythicMetalsItems.ADAMANTITE_PAXEL);
                            entries.add(MythicMetalsItems.AQUARIUM_PAXEL);
                            entries.add(MythicMetalsItems.BANGLUM_PAXEL);
                            entries.add(MythicMetalsItems.BRONZE_PAXEL);
                            entries.add(MythicMetalsItems.CARMOT_PAXEL);
                            entries.add(MythicMetalsItems.CELESTIUM_PAXEL);
                            entries.add(MythicMetalsItems.COPPER_PAXEL);
                            entries.add(MythicMetalsItems.DURASTEEL_PAXEL);
                            entries.add(MythicMetalsItems.HALLOWED_PAXEL);
                            entries.add(MythicMetalsItems.KYBER_PAXEL);
                            entries.add(MythicMetalsItems.METALLURGIUM_PAXEL);
                            entries.add(MythicMetalsItems.ORICHALCUM_PAXEL);
                            entries.add(MythicMetalsItems.OSMIUM_PAXEL);
                            entries.add(MythicMetalsItems.PALLADIUM_PAXEL);
                            entries.add(MythicMetalsItems.PROMETHEUM_PAXEL);
                            entries.add(MythicMetalsItems.QUADRILLUM_PAXEL);
                            entries.add(MythicMetalsItems.RUNITE_PAXEL);
                            entries.add(MythicMetalsItems.STAR_PLATINUM_PAXEL);
                            entries.add(MythicMetalsItems.STEEL_PAXEL);
                            entries.add(MythicMetalsItems.STORMYX_PAXEL);
                            entries.add(MythicMetalsItems.TIDESINGER_PAXEL);
                        }
                        if (FabricLoader.getInstance().isModLoaded("advancednetherite")) {
                            entries.add(AdvancedNetheriteItems.NETHERITE_IRON_PAXEL);
                            entries.add(AdvancedNetheriteItems.NETHERITE_GOLD_PAXEL);
                            entries.add(AdvancedNetheriteItems.NETHERITE_EMERALD_PAXEL);
                            entries.add(AdvancedNetheriteItems.NETHERITE_DIAMOND_PAXEL);
                        }
                        if (FabricLoader.getInstance().isModLoaded("amethyst_imbuement")) {
                            entries.add(AmethystImbuementItems.GARNET_PAXEL);
                            entries.add(AmethystImbuementItems.GLOWING_PAXEL);
                            entries.add(AmethystImbuementItems.AI_STEEL_PAXEL);
                            entries.add(AmethystImbuementItems.AMETRINE_PAXEL);
                        }
                        if (FabricLoader.getInstance().isModLoaded("betterend")) {
                            entries.add(BetterEndItems.AETERNIUM_PAXEL);
                            entries.add(BetterEndItems.TERMINITE_PAXEL);
                            entries.add(BetterEndItems.THALLASIUM_PAXEL);
                        }
                        if (FabricLoader.getInstance().isModLoaded("betternether")) {
                            entries.add(BetterNetherItems.CINCINNASITE_PAXEL);
                            entries.add(BetterNetherItems.CINCINNASITE_PAXEL_DIAMOND);
                            entries.add(BetterNetherItems.NETHER_RUBY_PAXEL);
                            entries.add(BetterNetherItems.FLAMING_RUBY_PAXEL);
                        }
                        if (FabricLoader.getInstance().isModLoaded("dragonloot")) {
                            entries.add(DragonLootItems.DRAGON_PAXEL);
                        }
                        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
                            entries.add(DeeperDarkerItems.WARDEN_PAXEL);
                        }
                    }).build());

    public static void registerItemGroups() {

    }
}
