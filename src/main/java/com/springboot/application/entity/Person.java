package com.springboot.application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Person {

	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String LastName;
	private String age;
	private String favoriteColour;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the favoriteColour
	 */
	public String getFavoriteColour() {
		return favoriteColour;
	}
	/**
	 * @param favoriteColour the favoriteColour to set
	 */
	public void setFavoriteColour(String favoriteColour) {
		this.favoriteColour = favoriteColour;
	}
	
	
	
		
}
