package com.ngonhuhai.DAO.impl;

import java.util.List;

import com.ngonhuhai.DAO.iRoleDAO;
import com.ngonhuhai.mapper.RoleMapper;
import com.ngonhuhai.model.RoleModel;

public class RoleDAO extends AbstractDAO<RoleModel> implements iRoleDAO{

	

	@Override
	public List<RoleModel> findAll() {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM tblrole";
		return query(sql, new RoleMapper());
	}

	@Override
	public Long save(RoleModel rm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(RoleModel update) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RoleModel> findAll2(Integer offset, Integer limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RoleModel findOne(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM ngonhuhai.tblrole WHERE role_id=?";
		List<RoleModel> roles = query(sql.toString(), new RoleMapper(), id);

		return roles.isEmpty() ? null : roles.get(0);
	}

}
