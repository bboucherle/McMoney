package com.gmail.bodhiboucherle.mcmoney;

import org.bukkit.event.Listener;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.RegisteredServiceProvider;

public final class McMoney extends JavaPlugin implements Listener {

    private static Economy econ = null;

    @Override
    public void onEnable() {
        System.out.println("[McMoney] Enabling...");
        getServer().getPluginManager().registerEvents(new Levels(), this);
        if (!setupEconomy()) {
            getServer().getPluginManager().disablePlugin(this);
            System.err.println("[McMoney] This plugin requires Vault to work.");
        }

    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;

    }

        public static Economy getEconomy() {
        return econ;
    }
}








