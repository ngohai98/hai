package com.ngonhuhai.service;

import java.util.List;

import com.ngonhuhai.model.RoleModel;

public interface iRoleService {
	List<RoleModel> findAll();
	RoleModel findOne(Long id);
}
