package com.company.M4Summative.controller;

import com.company.M4Summative.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


public class ProcessingFeeController {
    @RestController
    @RequestMapping(value = "/games")
    public class GamesController {
        @Autowired
        private GamesRepository gamesRepository;

        // all the standard gets

    }
}
