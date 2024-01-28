package com.technobecet.paxels.item.compat;

import com.google.common.base.Suppliers;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public enum AIToolMaterials implements ToolMaterial {
    GARNET(3, 3151, 7.5F, 3F, 12, () -> {
        if (FabricLoader.getInstance().isModLoaded("amethyst_imbuement")) {
            return Ingredient.ofItems(Registries.ITEM.get(new Identifier("amethyst_imbuement", "garnet")));
        } else {
            return Ingredient.ofItems(Items.DIAMOND);
        }
    }),
    GLOWING(4, 333, 11.5F, 4.5F, 12, () -> {
        if (FabricLoader.getInstance().isModLoaded("amethyst_imbuement")) {
            return Ingredient.ofItems(Registries.ITEM.get(new Identifier("amethyst_imbuement", "garnet")));
        } else {
            return Ingredient.ofItems(Items.DIAMOND);
        }
    }),
    STEEL(2, 400, 6.5F, 2.5F, 15, () -> {
        if (FabricLoader.getInstance().isModLoaded("amethyst_imbuement")) {
            return Ingredient.ofItems(Registries.ITEM.get(new Identifier("amethyst_imbuement", "steel_ingot")));
        } else {
            return Ingredient.ofItems(Items.DIAMOND);
        }
    }),
    AMETRINE(4, 2550, 9.5F, 5F, 18, () -> {
        if (FabricLoader.getInstance().isModLoaded("amethyst_imbuement")) {
            return Ingredient.ofItems(Registries.ITEM.get(new Identifier("amethyst_imbuement", "ametrine")));
        } else {
            return Ingredient.ofItems(Items.DIAMOND);
        }
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeedMultiplier;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    AIToolMaterials(int miningLevel, int itemDurability, float miningSpeedMultiplier, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
