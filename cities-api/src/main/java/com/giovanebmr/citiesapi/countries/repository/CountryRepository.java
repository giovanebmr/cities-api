package com.giovanebmr.citiesapi.countries.repository;

import com.giovanebmr.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
