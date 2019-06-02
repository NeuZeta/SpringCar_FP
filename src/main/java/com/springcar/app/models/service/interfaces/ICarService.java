package com.springcar.app.models.service.interfaces;

import java.util.List;

import com.springcar.app.models.entity.Car;
import com.springcar.app.models.entity.TypeTransmission;

public interface ICarService {
	public List<Car> findAll();
	public Car findById(Long id);
	public List<Car> findByCategory(String category);
	public List<Car> findByTransmission(TypeTransmission transmission);
	public List<Car> findByTransmissionAndCategory(TypeTransmission transmission, String Category);
	

}
