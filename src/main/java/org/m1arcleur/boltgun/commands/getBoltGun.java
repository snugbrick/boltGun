package org.m1arcleur.boltgun.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.m1arcleur.boltgun.Items.boltGun;

import java.util.List;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.11.18 21:33
 * <p>
 * 使用指令获得武器
 */
public class getBoltGun implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        try {
            if (s.equalsIgnoreCase("needGuns")) {
                switch (strings[0]) {
                    case "boltGun":
                        player.getInventory().addItem(boltGun.aBoltGun);
                        break;
                    case "":
                        break;
                }
            }
        } catch (Exception e) {
            commandSender.sendMessage("ERROR! It could be that your instructions are wrong or that your backpack is full!");
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return null;
    }
}
