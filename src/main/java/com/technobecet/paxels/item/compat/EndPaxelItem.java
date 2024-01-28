package com.technobecet.paxels.item.compat;

import com.technobecet.paxels.item.custom.PaxelItem;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class EndPaxelItem extends PaxelItem {
    public EndPaxelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        if (state.getBlock().equals(Blocks.END_STONE) && this.getMaterial().getMiningLevel() > 2) {
            return this.miningSpeed * 3;
        }
        return super.getMiningSpeedMultiplier(stack, state);
    }
}
