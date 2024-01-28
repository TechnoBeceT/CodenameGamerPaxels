package com.technobecet.paxels.item.compat;

import com.technobecet.paxels.item.custom.PaxelItem;
import net.minecraft.item.ToolMaterial;
import nourl.mythicmetals.item.tools.AutoRepairable;

public class PrometheumPaxelItem extends PaxelItem implements AutoRepairable {
    public PrometheumPaxelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
