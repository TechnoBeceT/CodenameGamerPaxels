package com.technobecet.paxels.item.compat;

import com.technobecet.paxels.item.custom.PaxelItem;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import org.betterx.betternether.interfaces.InitialStackStateProvider;
import org.betterx.betternether.items.materials.BNToolMaterial;
import org.betterx.betternether.registry.NetherEnchantments;

import java.util.Map;

public class NetherPaxelItem extends PaxelItem implements InitialStackStateProvider {
    public NetherPaxelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void putEnchantments(ItemStack stack, Map<Enchantment, Integer> defaultEnchants) {
        int obsidianLevel = 0;
        if (this.getMaterial() == BNToolMaterial.CINCINNASITE_DIAMOND) obsidianLevel = 2;
        else if (this.getMaterial() == BNToolMaterial.NETHER_RUBY) {
            obsidianLevel = 1;
        } else if (this.getMaterial() == BNToolMaterial.FLAMING_RUBY) {
            obsidianLevel = 3;
            defaultEnchants.put(NetherEnchantments.RUBY_FIRE, 1);
            defaultEnchants.put(Enchantments.MENDING, 1);
        }

        if (obsidianLevel > 0) {
            defaultEnchants.put(NetherEnchantments.OBSIDIAN_BREAKER, obsidianLevel);
            EnchantmentHelper.set(defaultEnchants, stack);
        }
    }
}
