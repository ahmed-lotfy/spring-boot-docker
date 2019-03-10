package com.flairstech.workshop.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "country")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String code;

	private String code2;

	private String continent;

	private BigDecimal gnp;

	@Column(name = "gnp_old")
	private BigDecimal gnpOld;

	@Column(name = "government_form")
	private String governmentForm;

	@Column(name = "head_of_state")
	private String headOfState;

	@Column(name = "indep_year")
	private Integer indepYear;

	@Column(name = "life_expectancy")
	private float lifeExpectancy;

	@Column(name = "local_name")
	private String localName;

	private String name;

	private Integer population;

	private String region;

	@Column(name = "surface_area")
	private float surfaceArea;

	public Country() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode2() {
		return this.code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public String getContinent() {
		return this.continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public BigDecimal getGnp() {
		return this.gnp;
	}

	public void setGnp(BigDecimal gnp) {
		this.gnp = gnp;
	}

	public BigDecimal getGnpOld() {
		return this.gnpOld;
	}

	public void setGnpOld(BigDecimal gnpOld) {
		this.gnpOld = gnpOld;
	}

	public String getGovernmentForm() {
		return this.governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	public String getHeadOfState() {
		return this.headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public Integer getIndepYear() {
		return this.indepYear;
	}

	public void setIndepYear(Integer indepYear) {
		this.indepYear = indepYear;
	}

	public float getLifeExpectancy() {
		return this.lifeExpectancy;
	}

	public void setLifeExpectancy(float lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public String getLocalName() {
		return this.localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPopulation() {
		return this.population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public float getSurfaceArea() {
		return this.surfaceArea;
	}

	public void setSurfaceArea(float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	//bi-directional many-to-one association to CountryLanguage
	@OneToMany(mappedBy = "country")
	@JsonManagedReference
	private List<CountryLanguage> countryLanguages;

	public List<CountryLanguage> getCountryLanguages() {
		return countryLanguages;
	}

	public void setCountryLanguages(List<CountryLanguage> countryLanguages) {
		this.countryLanguages = countryLanguages;
	}
}