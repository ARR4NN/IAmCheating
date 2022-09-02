package com.arr4nn.iamcheating.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class IAmCheatingCommand implements CommandExecutor {
  @Override
  public boolean onCommand(@org.jetbrains.annotations.NotNull CommandSender sender, @org.jetbrains.annotations.NotNull Command command, @org.jetbrains.annotations.NotNull String label, @org.jetbrains.annotations.NotNull String[] args) {
    if(sender instanceof Player) {
      Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "ban " + sender.getName() + " You asked for it.");
    }
    return true;
  }
}
