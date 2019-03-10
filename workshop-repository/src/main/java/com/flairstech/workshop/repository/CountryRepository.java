package com.flairstech.workshop.repository;

import com.flairstech.workshop.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}
