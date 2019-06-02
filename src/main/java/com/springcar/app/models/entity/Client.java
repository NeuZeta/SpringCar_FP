package com.springcar.app.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name = "clients")
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long idClient;

	@NotEmpty(message = "El campo no es opcional")
	private String name;
	
	@NotEmpty(message = "El campo no es opcional")
	private String surname;
	
	@NotEmpty(message = "El campo no es opcional")
	@Column(name = "id_number")
	private String idNumber;
	
	@NotEmpty(message = "El campo no es opcional")
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@NotEmpty(message = "El campo no es opcional")
	@Email(message = "formato incorrecto")
	private String email;
	
	private String address;
	private String postCode;
	private String city;
	private String country;
	
	
	@NotEmpty(message = "El campo no es opcional")
	@Column(name = "user_name")
	private String userName;
	
	@NotEmpty(message = "El campo no es opcional")
	private String password;

	public Client() {

	}

	public Client(@NotEmpty(message = "El campo no es opcional") String name,
			@NotEmpty(message = "El campo no es opcional") String surname,
			@NotEmpty(message = "El campo no es opcional") String idNumber,
			@NotEmpty(message = "El campo no es opcional") String phoneNumber,
			@NotEmpty(message = "El campo no es opcional") @Email(message = "formato incorrecto") String email,
			String address, String postCode, String city, String country,
			@NotEmpty(message = "El campo no es opcional") String userName,
			@NotEmpty(message = "El campo no es opcional") String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.idNumber = idNumber;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.postCode = postCode;
		this.city = city;
		this.country = country;
		this.userName = userName;
		this.password = password;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String user) {
		this.userName = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
