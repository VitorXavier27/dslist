package com.devvitor.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devvitor.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
