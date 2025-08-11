package com.hexaware.cricketmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cricketmanagementsystem.entity.Player;
import com.hexaware.cricketmanagementsystem.exceptions.InvalidJerseyNumberException;
import com.hexaware.cricketmanagementsystem.exceptions.PlayerNotFoundException;
import com.hexaware.cricketmanagementsystem.repo.PlayerRepo;

@Service
public class PlayerServiceImpl implements IPlayerService {

    @Autowired
    private PlayerRepo playerRepo;

    @Override
    public Player createPlayer(Player player) {
        validateJerseyNumber(player.getJerseyNumber());
        return playerRepo.save(player);

    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepo.findAll();
    }

    @Override
    public Player getPlayerById(int id) {
        return playerRepo.findById(id).orElseThrow(() -> new PlayerNotFoundException("Player with requested id is not found."));
    }

    @Override
    public void deletePlayer(int id) {
        playerRepo.deleteById(id);
    }


    @Override
        public Player updatePlayer(int id, Player updatedPlayer) {
            Player existingPlayer = playerRepo.findById(id).orElseThrow(() -> new PlayerNotFoundException("Player with requested id is not found."));  //We have to validate the Player if they exist or not.
            validateJerseyNumber(updatedPlayer.getJerseyNumber()); 
            existingPlayer.setPlayerName(updatedPlayer.getPlayerName());
            existingPlayer.setJerseyNumber(updatedPlayer.getJerseyNumber());
            existingPlayer.setRole(updatedPlayer.getRole());
            existingPlayer.setTotalMatches(updatedPlayer.getTotalMatches());
            existingPlayer.setTeamName(updatedPlayer.getTeamName());
            existingPlayer.setCountryStateName(updatedPlayer.getCountryStateName());

    return playerRepo.save(existingPlayer);
}


    private void validateJerseyNumber(int jerseyNumber) {
        if (jerseyNumber < 1 || jerseyNumber > 22) {
            throw new InvalidJerseyNumberException("Jersey number : " + jerseyNumber + " is invalid must be between 1 and 22.");
        }
    }

    
}
