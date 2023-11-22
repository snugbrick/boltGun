package org.m1arcleur.boltgun.Items;

import net.querz.nbt.tag.CompoundTag;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.11.18 23:17
 */
public class customItem {
    public static ItemStack addItemNBT(@NonNull Material item, @NonNull String key, @NonNull String value) {
        ItemStack itemStack = new ItemStack(item);
        ItemMeta meta = itemStack.getItemMeta();
/*
        NBT.modify(itemStack, nbt -> {
            nbt.setString("Stringtest", "Teststring");
            nbt.setInteger("Inttest", 42);
            nbt.setDouble("Doubletest", 1.5d);
            nbt.setBoolean("Booleantest", true);
            //More are available! Ask your IDE/Javadocs for suggestions!
        }); it s hard to be a mussel this api is dead 难蚌，API死了，<-这个翻译也难蚌，哈哈哈哈
 */

        itemStack.setItemMeta(meta);
        return itemStack;
    }
}
