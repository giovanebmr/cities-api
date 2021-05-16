package com.giovanebmr.citiesapi.repository;

import com.giovanebmr.citiesapi.countrie.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
