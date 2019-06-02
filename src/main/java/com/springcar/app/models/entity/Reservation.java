package com.springcar.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_reservation", unique = true)
	private Long idReservation;

	@Column(name = "actual_date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date actualDate;

	@Column(name = "init_date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date initDate;

	@Column(name = "final_date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date finalDate;

	@Column(name = "pick_up_time")
	@Temporal(TemporalType.TIME)
	@DateTimeFormat(pattern = "HH:MM")
	private Date pickUpTime;

	@Column(name = "drop_off_type")
	@Temporal(TemporalType.TIME)
	@DateTimeFormat(pattern = "HH:MM")
	private Date dropOffTime;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "client_id")
	private Client client;

	@Column(name = "office_code")
	private String officeCode;
	
	@Column(name = "office_return_code")
	private String officeReturnCode;
	
	@Column(name = "car_category")
	private String carCategory;

	@Column(name = "top_insurance")
	private Boolean topInsurance;
	
	@Column(name = "tire_and_glass_protection")
	private Boolean tireAndGlassProtection;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "extras_add", 
			  joinColumns = @JoinColumn(name = "reservation_id"), 
			  inverseJoinColumns = @JoinColumn(name = "extra_id"))
	public List<CommonExtra> extras;
	
	
	
	@PostConstruct
	public void setActualDate() {
		this.actualDate = new Date();
	}
	
	
	
	public Reservation(Long idReservation, Date initDate, Date finalDate, Date pickUpTime, Date dropOffTime,
			Client client, String officeCode, String officeReturnCode, String carCategory, Boolean topInsurance,
			Boolean tireAndGlassProtection) {
		this.idReservation = idReservation;
		this.initDate = initDate;
		this.finalDate = finalDate;
		this.pickUpTime = pickUpTime;
		this.dropOffTime = dropOffTime;
		this.client = client;
		this.officeCode = officeCode;
		this.officeReturnCode = officeReturnCode;
		this.carCategory = carCategory;
		this.topInsurance = topInsurance;
		this.tireAndGlassProtection = tireAndGlassProtection;
	}



	public Reservation(Long idReservation, Date initDate, Date finalDate, Date pickUpTime,
			Date dropOffTime, Client client, String officeCode, String carCategory) {
		this.idReservation = idReservation;
		this.initDate = initDate;
		this.finalDate = finalDate;
		this.pickUpTime = pickUpTime;
		this.dropOffTime = dropOffTime;
		this.client = client;
		this.officeCode = officeCode;
		this.carCategory = carCategory;
	}

	public Reservation() {

	}
	public void addExtra(CommonExtra extra) {
		this.extras.add(extra);
	}
	
	
	public String getOfficeReturnCode() {
		return officeReturnCode;
	}



	public void setOfficeReturnCode(String officeReturnCode) {
		this.officeReturnCode = officeReturnCode;
	}



	public Boolean getTopInsurance() {
		return topInsurance;
	}


	public void setTopInsurance(Boolean topInsurance) {
		this.topInsurance = topInsurance;
	}



	public Boolean getTireAndGlassProtection() {
		return tireAndGlassProtection;
	}



	public void setTireAndGlassProtection(Boolean tireAndGlassProtection) {
		this.tireAndGlassProtection = tireAndGlassProtection;
	}



	public String getCarCategory() {
		return carCategory;
	}


	public void setCarCategory(String carCategory) {
		this.carCategory = carCategory;
	}


	public List<CommonExtra> getExtras() {
		return extras;
	}


	public void setExtras(List<CommonExtra> extras) {
		this.extras = extras;
	}


	public Date getPickUpTime() {
		return pickUpTime;
	}

	public void setPickUpTime(Date pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public Date getDropOffTime() {
		return dropOffTime;
	}

	public void setDropOffTime(Date dropOffTime) {
		this.dropOffTime = dropOffTime;
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getInitDate() {
		return initDate;
	}

	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getActualDate() {
		return actualDate;
	}

	public void setActualDate(Date actualDate) {
		this.actualDate = actualDate;
	}

}
