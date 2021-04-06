package com.ngonhuhai.DAO;

import java.util.List;

import com.ngonhuhai.model.BrandModel;

public interface iBrandDAO extends GenericDAO<BrandModel> {
	List<BrandModel> findAll();

	Long save(BrandModel bm);

	void update(BrandModel update);

	void delete(Long id);

	List<BrandModel> findAll2(Integer offset, Integer limit);

	int getTotalItem();
	
	BrandModel findOne(Long id);

}
