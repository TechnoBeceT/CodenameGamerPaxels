package com.technobecet.paxels.util;

import com.technobecet.paxels.CodenameGamerPaxelsMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> PAXEL_MINEABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(CodenameGamerPaxelsMod.MOD_ID, "mineable/paxel"));
    }
}
