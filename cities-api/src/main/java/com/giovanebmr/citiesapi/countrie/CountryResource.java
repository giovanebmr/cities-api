package com.giovanebmr.citiesapi.countrie;

import com.giovanebmr.citiesapi.countrie.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private final CountryRepository countryRepository;

    public CountryResource(final CountryRepository repository) {
        this.countryRepository = repository;
    }

    //Pageable provê recursos de paginação no banco
    @GetMapping
    public Page<Country> countries(Pageable page){
        return countryRepository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Optional<Country> country = countryRepository.findById(id);
        if( country.isPresent()){
            return ResponseEntity.ok().body(country.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

}
