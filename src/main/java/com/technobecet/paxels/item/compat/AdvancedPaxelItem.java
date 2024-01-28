package com.technobecet.paxels.item.compat;

import com.autovw.advancednetherite.AdvancedNetherite;
import com.autovw.advancednetherite.common.AdvancedUtil;
import com.autovw.advancednetherite.config.ConfigHelper;
import com.autovw.advancednetherite.core.util.ModToolTiers;
import com.autovw.advancednetherite.core.util.ModTooltips;
import com.technobecet.paxels.item.custom.PaxelItem;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class AdvancedPaxelItem extends PaxelItem {
    private final ToolMaterial material;

    public AdvancedPaxelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.material = material;
    }

    @Override
    public boolean isFireproof() {
        return true;
    }


    /**
     * {@link Override} this method if you want to add your own custom tooltips.
     *
     * @param stack    The item stack
     * @param world    The world/level
     * @param tooltips List of tooltips
     * @param context  Used to determine if a tooltip is only visible when debug mode (F3 + H) is enabled
     */
    public void addTooltips(ItemStack stack, @Nullable World world, List<Text> tooltips, TooltipContext context) {
    }


    /**
     * {@link Override} this method if you want to give your item a custom durability bar color.
     * Feature is disabled by default, can be enabled in Advanced Netherite's Client config.
     *
     * @param stack The item stack
     * @return The custom durability bar color
     */
    public Formatting customDurabilityBarColor(ItemStack stack) {
        return null;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext flag) {
        if (ConfigHelper.get().getClient().showTooltips()) {
            if (AdvancedNetherite.getRegistryHelper().getItemById(stack.getItem()).getNamespace().equals("codenamegamer-paxels") && ConfigHelper.get().getCommon().getAdditionalDrops().enableAdditionalOreDrops()) {
                if (Screen.hasShiftDown()) {
                    if (this.material == ModToolTiers.NETHERITE_IRON) {
                        tooltip.add(ModTooltips.IRON_ORE_DROP_TOOLTIP);
                    }

                    if (this.material == ModToolTiers.NETHERITE_GOLD) {
                        tooltip.add(ModTooltips.GOLD_ORE_DROP_TOOLTIP);
                    }

                    if (this.material == ModToolTiers.NETHERITE_EMERALD) {
                        tooltip.add(ModTooltips.EMERALD_ORE_DROP_TOOLTIP);
                    }

                    if (this.material == ModToolTiers.NETHERITE_DIAMOND) {
                        tooltip.add(ModTooltips.DIAMOND_ORE_DROP_TOOLTIP);
                    }
                } else {
                    tooltip.add(ModTooltips.SHIFT_KEY_TOOLTIP);
                }
            }

            addTooltips(stack, world, tooltip, flag);
        }

    }

    @Override
    public int getItemBarColor(ItemStack stack) {
        int originalColor = super.getItemBarColor(stack);

        if (customDurabilityBarColor(stack) != null && ConfigHelper.get().getClient().matchingDurabilityBars()) {
            return Objects.requireNonNull(customDurabilityBarColor(stack).getColorValue());
        }

        return AdvancedUtil.getDurabilityBarColor(originalColor, stack);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        float originalSpeed = super.getMiningSpeedMultiplier(stack, state);
        return AdvancedUtil.getDestroySpeed(originalSpeed, stack, state);
    }
}
