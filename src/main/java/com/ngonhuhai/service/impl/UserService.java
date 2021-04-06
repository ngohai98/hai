package com.ngonhuhai.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.ngonhuhai.DAO.iRoleDAO;
import com.ngonhuhai.DAO.iUserDAO;
import com.ngonhuhai.DAO.impl.RoleDAO;
import com.ngonhuhai.DAO.impl.UserDAO;
import com.ngonhuhai.model.RoleModel;
import com.ngonhuhai.model.UserModel;
import com.ngonhuhai.service.iUserService;


public class UserService implements iUserService {
	

	private iUserDAO userDAO = new UserDAO();

	private iRoleDAO roleDAO=new RoleDAO();
	public  UserService() {
//		userDAO=new UserDAO();
	}
	@Override
	public UserModel findByUserPass(String username, String password) {
		// TODO Auto-generated method stub
		return userDAO.findbyUserpass(username, password);
	}
	@Override
	public List<UserModel> findAll(Integer offset, Integer limit) {
		// TODO Auto-generated method stub
		return userDAO.findAll2(offset, limit);
	}
	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return userDAO.getTotalItem();
	}
	@Override
	public Long insert(UserModel um) {
		// TODO Auto-generated method stub
		return userDAO.save2(um);
	}
	@Override
	public UserModel findOne(Long id) {
		// TODO Auto-generated method stub
		UserModel userModel= userDAO.findOne(id);


		return userModel;
	}
	@Override
	public UserModel insert2(UserModel um) {
		// TODO Auto-generated method stub
		Long userId=userDAO.save(um);
		return userDAO.findOne(userId);
	}
	@Override
	public UserModel update(UserModel um) {
		
		userDAO.update(um);
		return userDAO.findOne(um.getId());
		
	}
	@Override
	public void delete(long[] ids) {
		for (long id: ids) {
			//1.delete comment (khoa ngoai new_id)
			//2.delete news
			userDAO.delete(id);
		}
	}

    @Override
    public void updatePass(String passN, long id) {
			userDAO.updatePass(passN,id);
    }

}
