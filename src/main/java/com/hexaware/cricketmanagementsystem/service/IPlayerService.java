package com.hexaware.cricketmanagementsystem.service;

import java.util.List;

import com.hexaware.cricketmanagementsystem.entity.Player;

public interface IPlayerService {

    Player createPlayer(Player player);

    List<Player> getAllPlayers();

    Player getPlayerById(int id);

    void deletePlayer(int id);

    Player updatePlayer(int id, Player updatedPlayer);


}
