package com.company.M4Summative.controller;


import com.company.M4Summative.model.Games;
import com.company.M4Summative.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value = "/games")
public class GamesController {
    @Autowired
    private GamesRepository gamesRepository;

//
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Games> gettinAllGames() {
        return gamesRepository.findAll();
    }
//
    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Games getGameByID(@PathVariable("id") int id) {
     Optional<Games> game = gamesRepository.findById(id);
        if (!game.isPresent()) {
            return null;
        }
        return game.get();
    }
//
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Games createGame(@RequestBody Games game) {
        gamesRepository.save(game);
        return game;
    }
    @PutMapping(value = "/id")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Games updateById(){
        return game;
    }
}