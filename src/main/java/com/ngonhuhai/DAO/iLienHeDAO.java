package com.ngonhuhai.DAO;

import java.util.List;

import com.ngonhuhai.model.LienHeModel;

public interface iLienHeDAO extends GenericDAO<LienHeModel> {
	
	Long save(LienHeModel lhm);

	List<LienHeModel> findAll2(Integer offset, Integer limit);

	int getTotalItem();
}
