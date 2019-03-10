package com.flairstech.workshop.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the country_language database table.
 * 
 */
@Entity
@Table(name="country_language")
public class CountryLanguage implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CountryLanguagePK id;

	@Column(name="is_official")
	private Boolean isOfficial;

	private float percentage;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	@JsonBackReference
	private Country country;

	public CountryLanguage() {
	}

	public CountryLanguagePK getId() {
		return this.id;
	}

	public void setId(CountryLanguagePK id) {
		this.id = id;
	}

	public Boolean getIsOfficial() {
		return this.isOfficial;
	}

	public void setIsOfficial(Boolean isOfficial) {
		this.isOfficial = isOfficial;
	}

	public float getPercentage() {
		return this.percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}