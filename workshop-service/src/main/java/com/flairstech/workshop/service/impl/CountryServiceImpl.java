package com.flairstech.workshop.service.impl;

import com.flairstech.workshop.model.entity.country.Country;
import com.flairstech.workshop.model.dto.CountryDto;
import com.flairstech.workshop.model.exception.WorkshopException;
import com.flairstech.workshop.model.exception.WorkshopExceptionConstant;
import com.flairstech.workshop.repository.CountryRepository;
import com.flairstech.workshop.service.CountryService;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

	private CountryRepository countryRepository;

	public CountryServiceImpl(final CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@Override
	public CountryDto getCountry(String code) {

		Optional<Country> country = countryRepository.findById(code);
		if (country.isPresent()) {
			return new CountryDto().initFromJpaEntity(country.get());
		} else {
			throw new WorkshopException(
					WorkshopExceptionConstant.INVALID_COUNTRY_CODE.getCode(),
					HttpStatus.INTERNAL_SERVER_ERROR.value(),
					"Invalid country code"
			);
		}

	}
}
