package com.giovanebmr.citiesapi.staties;


import com.giovanebmr.citiesapi.staties.repository.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staties")
public class StateResource {

    private final StateRepository stateRepository;

    public StateResource(final StateRepository stateRepository){
        this.stateRepository = stateRepository;
    }

    @GetMapping
    public List<State> staties(){
        return stateRepository.findAll();
    }










}
