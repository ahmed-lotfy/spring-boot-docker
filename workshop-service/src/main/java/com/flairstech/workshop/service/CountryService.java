package com.flairstech.workshop.service;

import com.flairstech.workshop.model.Country;
import com.flairstech.workshop.model.dto.CountryDto;
import java.util.Optional;

public interface CountryService {
	CountryDto getCountry(String code);
}
