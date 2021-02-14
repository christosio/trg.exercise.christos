package com.trg.invoicing.customer;

import java.util.Objects;

public class Address {
	// here i create an abject with starand value for addresss and creates an object.
	private String street;
	private String zipCode;
	private String county;
	private String city;
	private String country;
	
	public Address(String street, String zipCode, String county, String city, String country) {
		super();
		this.street = street;
		this.zipCode = zipCode;
		this.county = county;
		this.city = city;
		this.country = country;
	}
	
	
	public String getStreet() {
		return street;
	}
	public String getZipCode() {
		return zipCode;
	}
	public String getCounty() {
		return county;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}


	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public int hashCode() {
		return Objects.hash(city, country, county, street, zipCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Address))
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(country, other.country)
				&& Objects.equals(county, other.county) && Objects.equals(street, other.street)
				&& Objects.equals(zipCode, other.zipCode);
	}
	
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", zipCode=" + zipCode + ", county=" + county + ", city=" + city
				+ ", country=" + country + "]";
	}
}
