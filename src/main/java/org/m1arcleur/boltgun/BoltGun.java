package org.m1arcleur.boltgun;

import org.bukkit.plugin.java.JavaPlugin;

public final class BoltGun extends JavaPlugin {
    @Override
    public void onEnable() {
        if(getServer().getPluginManager().getPlugin("BoltGun")!=null){
            getLogger().info("BoltGun is already onEnable");
        }else{
            getLogger().info("BoltGun is not installed");
        }
    }

    @Override
    public void onDisable() {
    }
}
