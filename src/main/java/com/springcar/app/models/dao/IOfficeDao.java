package com.springcar.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springcar.app.models.entity.Office;

public interface IOfficeDao extends CrudRepository<Office, Long> {

}
