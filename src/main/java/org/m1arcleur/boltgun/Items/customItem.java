package org.m1arcleur.boltgun.Items;

import net.minecraft.nbt.NBTTagCompound;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.11.18 23:17
 */
public class customItem {
    public static ItemStack addItemNBT(@NonNull Material item, @NonNull List<String> lore) {
        ItemStack itemStack = new ItemStack(item);
        ItemMeta meta = itemStack.getItemMeta();

        if (meta != null) {
            meta.setLore(lore);
        }

        NBTTagCompound nbtTagCompound=new NBTTagCompound();
        //nbtTagCompound. | nms without decompilation???

        itemStack.setItemMeta(meta);
        return itemStack;
    }
}
