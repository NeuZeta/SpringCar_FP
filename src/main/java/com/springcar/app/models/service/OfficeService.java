package com.springcar.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcar.app.models.dao.IOfficeDao;
import com.springcar.app.models.entity.Office;
import com.springcar.app.models.service.interfaces.IOfficeMasterService;

@Service
public class OfficeService implements IOfficeMasterService{

	@Autowired
	IOfficeDao officeDao;
	
	@Override
	public List<Office> findAll() {
		return (List<Office>) officeDao.findAll();
	}

	@Override
	public String findByIdAndReturnOfficeCode(Long idOffice) {
		return officeDao.findById(idOffice).get().getOfficeCode();
		
	}

}
