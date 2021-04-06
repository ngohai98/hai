package com.ngonhuhai.DAO;

import java.util.List;

import com.ngonhuhai.model.PhoneModel;

public interface iPhoneDAO extends GenericDAO<PhoneModel> {
	List<PhoneModel> findAll();

	Long save(PhoneModel pm);

	void update(PhoneModel update);

	void delete(Long id);

	List<PhoneModel> findAll2(Integer offset, Integer limit);

	int getTotalItem();
	PhoneModel findOne(Long id);
	List<PhoneModel> findAllbyhangId(Integer offset, Integer limit, Long hangid);
}
