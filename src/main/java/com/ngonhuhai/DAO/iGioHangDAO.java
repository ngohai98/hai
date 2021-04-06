package com.ngonhuhai.DAO;

import java.util.List;

import com.ngonhuhai.model.GiohangModel;

public interface iGioHangDAO extends GenericDAO<GiohangModel> {
	List<GiohangModel> findALl();

	Long save(GiohangModel ghm);

	void update(GiohangModel update);

	void delete(Long ghid,Long dtid);

	List<GiohangModel> findAll2(Integer offset, Integer limit , Long id);

	int getTotalItem();

	GiohangModel findOne(Long id);

	List<GiohangModel> findAll(Integer offset, Integer limit);

}
