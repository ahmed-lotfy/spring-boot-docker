package com.flairstech.workshop.service.impl;

import com.flairstech.workshop.model.Country;
import com.flairstech.workshop.model.dto.CountryDto;
import com.flairstech.workshop.repository.CountryRepository;
import com.flairstech.workshop.service.CountryService;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

	private CountryRepository countryRepository;

	public CountryServiceImpl(final CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@Override
	public CountryDto getCountry(String code) {
		Country country = countryRepository.findById(code).get();
		return  new CountryDto().initFromJpaEntity(country);

	}
}
