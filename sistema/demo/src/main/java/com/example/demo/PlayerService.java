package com.example.demo;

import org.springframework.stereotype.Service;

import org.springframework.lang.NonNull;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @NonNull
    public Player savePlayer(@NonNull Player player) {
        return playerRepository.save(player);
    }
}
