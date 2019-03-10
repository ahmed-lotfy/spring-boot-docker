package com.flairstech.workshop.repository;

import com.flairstech.workshop.model.entity.country.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}
