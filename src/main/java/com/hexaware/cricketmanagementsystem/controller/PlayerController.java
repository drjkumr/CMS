package com.hexaware.cricketmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.cricketmanagementsystem.dto.PlayerDTO;
import com.hexaware.cricketmanagementsystem.entity.Player;
import com.hexaware.cricketmanagementsystem.service.IPlayerService;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    @Autowired
    private IPlayerService playerService;

    @PostMapping("/add")// Here we create an object for creating new entries
    public Player createPlayer(@RequestBody PlayerDTO playerDTO) {

        Player player = new Player(
                playerDTO.getPlayerID(),
                playerDTO.getPlayerName(),
                playerDTO.getJerseyNumber(),
                playerDTO.getRole(),
                playerDTO.getTotalMatches(),
                playerDTO.getTeamName(),
                playerDTO.getCountryStateName());

        return playerService.createPlayer(player);
    }

    @GetMapping("/getall")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/get/{id}")
    public Player getPlayerById(@PathVariable int id) {
        return playerService.getPlayerById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePlayer(@PathVariable int id) {
        playerService.deletePlayer(id);
        return "Player number" + id + "is deleted successfully";
    }

    @PutMapping("/update/{id}") // Here we create an object for updating all fields
    public Player updatePlayer(@PathVariable int id, @RequestBody PlayerDTO playerDTO) {
    
        Player updatedPlayer = new Player(
            playerDTO.getPlayerID(),
            playerDTO.getPlayerName(),
            playerDTO.getJerseyNumber(),
            playerDTO.getRole(),
            playerDTO.getTotalMatches(),
            playerDTO.getTeamName(),
            playerDTO.getCountryStateName());

    return playerService.updatePlayer(id, updatedPlayer);
}


}
