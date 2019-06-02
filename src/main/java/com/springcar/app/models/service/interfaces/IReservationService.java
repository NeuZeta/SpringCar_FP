package com.springcar.app.models.service.interfaces;

import com.springcar.app.models.entity.Reservation;

public interface IReservationService {
	
	public void save(Reservation reserv);
	public Reservation findByNumReservation(Long reservation);
	public Reservation findByIdNumber(String idNumber);
}
