package org.m1arcleur.boltgun.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.m1arcleur.boltgun.Items.boltGun;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.11.19 18:16
 *
 * 射击监听器
 */
public class shoot implements Listener {
    @EventHandler
    public void playerShootListener(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            Player player = event.getPlayer();
            //player.getEquipment().getItemInMainHand()
            if (player.getInventory().getItemInMainHand().equals(boltGun.aBoltGun)) {
                player.setHealth(0.00);//记得把这个删除了 remember to delete this
            }
        }
    }
}
