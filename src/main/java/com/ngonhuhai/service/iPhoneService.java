package com.ngonhuhai.service;

import java.util.List;

import com.ngonhuhai.model.PhoneModel;

public interface iPhoneService {
	PhoneModel save(PhoneModel newModel);

	List<PhoneModel> findAll(Integer offset, Integer limit);

	int getTotalItem();

	PhoneModel insert(PhoneModel pm);

	PhoneModel update(PhoneModel um);

	void delete(long[] ids);
	PhoneModel findOne(Long id);
	List<PhoneModel> findAllbyhangID(Integer offset, Integer limit, Long hangid);
}
