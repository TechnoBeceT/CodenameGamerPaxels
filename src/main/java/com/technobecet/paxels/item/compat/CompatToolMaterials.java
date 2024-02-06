package com.technobecet.paxels.item.compat;

import com.google.common.base.Suppliers;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public enum CompatToolMaterials implements ToolMaterial {
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
    }),
    //Deeper and Darker
    WARDEN(5, 2519, 10, 5, 18, () -> {
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            return Ingredient.ofItems(Registries.ITEM.get(new Identifier("deeperdarker", "reinforced_echo_shard")));
        } else {
            return Ingredient.ofItems(Items.DIAMOND);
        }
    }),
    //Enderite
    ENDERITE(4, 4096, 15.0F, 2.0F, 17, () -> {
        if (FabricLoader.getInstance().isModLoaded("enderitemod")) {
            return Ingredient.ofItems(Registries.ITEM.get(new Identifier("enderitemod", "enderite_ingot")));
        } else {
            return Ingredient.ofItems(Items.DIAMOND);
        }
    }),
    //Advanced Enderite
    NETHERITE_ENDERITE(6, 4500, 15.5F, 5.5F, 21, () -> {
        if (FabricLoader.getInstance().isModLoaded("advancedenderite")) {
            return Ingredient.ofItems(Registries.ITEM.get(new Identifier("advancedenderite", "netherite_enderite_ingot")));
        } else {
            return Ingredient.ofItems(Items.DIAMOND);
        }
    }),
    IRON_ENDERITE(6, 5000, 16.0F, 6.0F, 22, () -> {
        if (FabricLoader.getInstance().isModLoaded("advancedenderite")) {
            return Ingredient.ofItems(Registries.ITEM.get(new Identifier("advancedenderite", "iron_enderite_ingot")));
        } else {
            return Ingredient.ofItems(Items.DIAMOND);
        }
    }),
    GOLD_ENDERITE(6, 5500, 16.5F, 6.5F, 23, () -> {
        if (FabricLoader.getInstance().isModLoaded("advancedenderite")) {
            return Ingredient.ofItems(Registries.ITEM.get(new Identifier("advancedenderite", "gold_enderite_ingot")));
        } else {
            return Ingredient.ofItems(Items.DIAMOND);
        }
    }),
    EMERALD_ENDERITE(6, 6000, 17.0F, 7.0F, 24, () -> {
        if (FabricLoader.getInstance().isModLoaded("advancedenderite")) {
            return Ingredient.ofItems(Registries.ITEM.get(new Identifier("advancedenderite", "emerald_enderite_ingot")));
        } else {
            return Ingredient.ofItems(Items.DIAMOND);
        }
    }),
    DIAMOND_ENDERITE(6, 7000, 18.0F, 8.0F, 25, () -> {
        if (FabricLoader.getInstance().isModLoaded("advancedenderite")) {
            return Ingredient.ofItems(Registries.ITEM.get(new Identifier("advancedenderite", "diamond_enderite_ingot")));
        } else {
            return Ingredient.ofItems(Items.DIAMOND);
        }
    }),
    AMETHYST_ENDERITE(6, 8000, 19.0F, 9.0F, 26, () -> {
        if (FabricLoader.getInstance().isModLoaded("advancedenderite")) {
            return Ingredient.ofItems(Registries.ITEM.get(new Identifier("advancedenderite", "amethyst_enderite_pickaxe")));
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

    CompatToolMaterials(int miningLevel, int itemDurability, float miningSpeedMultiplier, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
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
