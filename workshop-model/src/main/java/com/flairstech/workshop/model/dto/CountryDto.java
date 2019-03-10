package com.flairstech.workshop.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flairstech.workshop.model.Country;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryDto implements Serializable {

	private static final long serialVersionUID = -4339036498123768822L;

	private String name;
	private String continent;
	private Integer population;

	@JsonProperty("life_expectancy")
	private float lifeExpectancy;

	@JsonProperty("country_language")
	private String countryLanguage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public float getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(float lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public String getCountryLanguage() {
		return countryLanguage;
	}

	public void setCountryLanguage(String countryLanguage) {
		this.countryLanguage = countryLanguage;
	}

	public CountryDto initFromJpaEntity(Country country){
		this.name = country.getName();
		this.continent = country.getContinent();
		this.population = country.getPopulation();
		this.lifeExpectancy = country.getLifeExpectancy();
		this.countryLanguage = country.getCountryLanguages().stream().filter(x -> x.getIsOfficial().equals(true)).findAny().get().getId().getLanguage();
		return this;
	}
}
