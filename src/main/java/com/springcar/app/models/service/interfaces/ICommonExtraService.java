package com.springcar.app.models.service.interfaces;

import java.util.List;

import com.springcar.app.models.entity.CommonExtra;

public interface ICommonExtraService {
	public List<CommonExtra> findAll();
	public CommonExtra findbyId(Long id);
}
