package com.flairstech.workshop.service;

import com.flairstech.workshop.model.dto.CountryDto;

public interface CountryService {
	CountryDto getCountry(String code);
}
