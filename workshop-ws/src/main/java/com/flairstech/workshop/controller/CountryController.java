package com.flairstech.workshop.controller;

import com.flairstech.workshop.model.dto.CountryDto;
import com.flairstech.workshop.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

	private final CountryService countryService;

	public CountryController(CountryService countryService) {
		this.countryService = countryService;
	}

	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public ResponseEntity getCountry(@PathVariable String code) {
		CountryDto ret = countryService.getCountry(code);
		return ResponseEntity.status(HttpStatus.OK).body(ret);
	}
}
