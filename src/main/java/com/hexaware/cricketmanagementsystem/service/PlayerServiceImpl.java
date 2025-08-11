package com.hexaware.cricketmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cricketmanagementsystem.entity.Player;
import com.hexaware.cricketmanagementsystem.repo.PlayerRepo;

@Service
public class PlayerServiceImpl implements IPlayerService {

    @Autowired
    private PlayerRepo playerRepo;

    @Override
    public Player createPlayer(Player player) {
        return playerRepo.save(player);
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepo.findAll();
    }

    @Override
    public Player getPlayerById(int id) {
        return playerRepo.findById(id).orElse(null);
    }

    @Override
    public void deletePlayer(int id) {
        playerRepo.deleteById(id);
    }

}
