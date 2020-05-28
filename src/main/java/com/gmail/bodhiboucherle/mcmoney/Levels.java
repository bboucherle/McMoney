package com.gmail.bodhiboucherle.mcmoney;

import com.gmail.nossr50.events.experience.McMMOPlayerLevelUpEvent;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class Levels implements Listener {

    @EventHandler
    public void onPlayerLevelUp(McMMOPlayerLevelUpEvent event) {
        Player player = event.getPlayer();
        Economy economy = McMoney.getEconomy();
        double amount = event.getLevelsGained();
        int i = 0;

        if (event.getLevelsGained() > i) {
            EconomyResponse response = economy.depositPlayer(player, amount);
            }
        }
    }

