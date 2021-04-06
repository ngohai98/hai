package com.ngonhuhai.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.ngonhuhai.DAO.iBrandDAO;
import com.ngonhuhai.DAO.impl.BrandDAO;
import com.ngonhuhai.model.BrandModel;
import com.ngonhuhai.service.iBrandService;

public class BrandService implements iBrandService {


	private iBrandDAO brandDAO = new BrandDAO();
	@Override
	public List<BrandModel> findAll() {
		// TODO Auto-generated method stub
		return brandDAO.findAll();
	}

	@Override
	public BrandModel findOne(Long id) {
		// TODO Auto-generated method stub
		return brandDAO.findOne(id);
	}

}
