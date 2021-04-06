package com.ngonhuhai.DAO;

import java.util.List;

import com.ngonhuhai.model.DonHangModel;

public interface iDonHangDAO extends GenericDAO<DonHangModel> {
	List<DonHangModel> findAll();

	Long save(DonHangModel dhm);

	void update(DonHangModel update);

	void delete(Long id);

	List<DonHangModel> findAll2(Integer offset, Integer limit);

	int getTotalItem();
}
