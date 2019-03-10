package com.flairstech.workshop.controller;

import com.flairstech.workshop.model.exception.WorkshopException;
import com.flairstech.workshop.repository.CountryRepository;
import com.flairstech.workshop.service.CountryService;
import com.flairstech.workshop.service.impl.CountryServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;

public class CountryControllerTest {

	@Mock
	private CountryRepository countryRepository;

	private CountryService countryService;

	private CountryController countryController;

	private MockMvc mockMvc;

	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		countryService = new CountryServiceImpl(countryRepository);
		countryController = new CountryController(countryService);
	}

	@Test(expected = WorkshopException.class)
	public void getCountryWithNonExistenceCode() {
		countryController.getCountry("xyz");
	}
}