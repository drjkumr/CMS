package com.hexaware.cricketmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping
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

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/{id}")
    public Player getPlayerById(int id) {
        return playerService.getPlayerById(id);
    }

    @GetMapping("/{id}")
    public String deletePlayer(int id) {
        playerService.deletePlayer(id);
        return "Player number" + id + "is deleted successfully";
    }

}
