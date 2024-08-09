package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin("*")
@RequestMapping("/demo")
public class DataController {

    private final PlayerService playerService;

    public DataController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping("/saveData")
    public String saveData(@RequestBody Model model) {
        Player player = new Player();
        player.setNomePlayer(model.getName());
        player.setFonePlayer(model.getPhone());
        player.setNumero1(model.getSelectedNumbers().get(0));
        player.setNumero2(model.getSelectedNumbers().get(1));
        player.setNumero3(model.getSelectedNumbers().get(2));
        player.setNumero4(model.getSelectedNumbers().get(3));
        player.setNumero5(model.getSelectedNumbers().get(4));
        playerService.savePlayer(player);
        return "Dados salvos com sucesso!";

    }
}
