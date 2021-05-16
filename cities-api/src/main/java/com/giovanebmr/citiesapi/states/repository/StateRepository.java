package com.giovanebmr.citiesapi.states.repository;

import com.giovanebmr.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State,Long> {
}
