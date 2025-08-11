package com.hexaware.cricketmanagementsystem.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


//changelog: Regex was not implemented, now implemented for data validation.
public class PlayerDTO {

    @NotNull(message="playerID is required")
    private int playerID;
    @NotBlank(message="playerName is Required")
    @Pattern(regexp= "^[A-Za-z ] {2,75}$")
    private String playerName;
    @NotNull 
    private int jerseyNumber;
    @NotBlank
    @Pattern(regexp="^(Batsman|Bowler|Allrounder|WicketKeeper)$")
    private String role;
    @NotNull @Min(0)
    private int totalMatches;
    @Pattern(regexp= "^[A-Za-z ] {2,75}$")
    private String teamName;
    @Pattern(regexp="^(England|India|Australia|New Zealand)$")
    private String countryStateName;

    public PlayerDTO() {
    }

    public PlayerDTO(int playerID, String playerName, int jerseyNumber, String role, int totalMatches, String teamName,
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

    public void setpPayerName(String playerName) {
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
