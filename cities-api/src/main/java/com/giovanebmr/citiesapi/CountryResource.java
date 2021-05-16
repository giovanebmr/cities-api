package com.giovanebmr.citiesapi;

import com.giovanebmr.citiesapi.countrie.Country;
import com.giovanebmr.citiesapi.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Countries")
public class CountryResource {

    private final CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    //Pageable provê recursos de paginação no banco
    @GetMapping
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);
    }
}
