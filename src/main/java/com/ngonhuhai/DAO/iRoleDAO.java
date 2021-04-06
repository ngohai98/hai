package com.ngonhuhai.DAO;

import java.util.List;

import com.ngonhuhai.model.RoleModel;

public interface iRoleDAO extends GenericDAO<RoleModel> {
	List<RoleModel> findAll();

	Long save(RoleModel rm);

	void update(RoleModel update);

	void delete(Long id);

	List<RoleModel> findAll2(Integer offset, Integer limit);

	int getTotalItem();
	RoleModel findOne(Long id);
}
