package com.springcar.app.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcar.app.models.dao.IReservationDao;
import com.springcar.app.models.entity.Reservation;
import com.springcar.app.models.service.interfaces.IReservationService;

@Service
public class ResercationService implements IReservationService{

	@Autowired
	IReservationDao reservationDao;
	
	@Override
	public void save(Reservation reserv) {
		reservationDao.save(reserv);
		
	}

	@Override
	public Reservation findByNumReservation(Long reservation) {
		return  reservationDao.findById(reservation).orElse(null);
	}

	
	@Override public Reservation findByIdNumber(String idNumber) { 
		return reservationDao.findByIdNumber(idNumber).orElse(null); 
	}
	

}
