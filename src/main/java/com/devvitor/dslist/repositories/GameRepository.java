package com.devvitor.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devvitor.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
