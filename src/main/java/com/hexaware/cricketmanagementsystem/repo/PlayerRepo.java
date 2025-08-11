package com.hexaware.cricketmanagementsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.cricketmanagementsystem.entity.Player;

public interface PlayerRepo extends JpaRepository<Player, Integer> {

}
