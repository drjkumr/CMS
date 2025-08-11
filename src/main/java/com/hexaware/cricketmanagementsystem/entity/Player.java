package com.hexaware.cricketmanagementsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.ToString;

@ToString
@Entity
public class Player {

    @Id
    @Column(name = "player_id")
    private int playerID;
    @Column(name = "player_name")
    private String playerName;
    @Column(name = "jersey_number")
    private int jerseyNumber;
    @Column(name = "role")
    private String role;
    @Column(name = "total_matches")
    private int totalMatches;
    @Column(name = "team_name")
    private String teamName;
    @Column(name = "country_state_name")
    private String countryStateName;

    public Player() {
    }

    public Player(int playerID, String playerName, int jerseyNumber, String role, int totalMatches, String teamName,
            String countryStateName) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
        this.totalMatches = totalMatches;
        this.teamName = teamName;
        this.countryStateName = countryStateName;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCountryStateName() {
        return countryStateName;
    }

    public void setCountryStateName(String countryStateName) {
        this.countryStateName = countryStateName;
    }

}
