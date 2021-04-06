package com.ngonhuhai.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.ngonhuhai.DAO.iRoleDAO;
import com.ngonhuhai.DAO.impl.RoleDAO;
import com.ngonhuhai.model.RoleModel;
import com.ngonhuhai.service.iRoleService;

public class RoleService implements iRoleService {

	private iRoleDAO roleDAO=new RoleDAO();
	@Override
	public List<RoleModel> findAll() {
		
		return roleDAO.findAll();
	}
	@Override
	public RoleModel findOne(Long id) {
		// TODO Auto-generated method stub
		return roleDAO.findOne(id);
	}

}
