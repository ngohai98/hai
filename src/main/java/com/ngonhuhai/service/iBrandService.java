package com.ngonhuhai.service;

import java.util.List;

import com.ngonhuhai.model.BrandModel;

public interface iBrandService {
	List<BrandModel> findAll();

	BrandModel findOne(Long id);
}
