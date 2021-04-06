package com.ngonhuhai.service;

import java.util.List;

import com.ngonhuhai.model.LienHeModel;

public interface iLienHeService {
	List<LienHeModel> findAll(Integer offset, Integer limit);
	int getTotalItem();
	
}
