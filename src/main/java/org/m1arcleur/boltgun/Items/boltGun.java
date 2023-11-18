package org.m1arcleur.boltgun.Items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.11.19 01:25
 *
 * 注册武器
 */
public class boltGun {
    private static ArrayList<String> lore = new ArrayList<>();

    static {
        lore.add("§7§l§oBolt Gun");
    }

    public static ItemStack aBoltGun = customItem.addItemNBT(Material.DIAMOND_HORSE_ARMOR, lore);
}
