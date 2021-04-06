package com.ngonhuhai.service.impl;

import java.util.List;



import com.ngonhuhai.DAO.iBrandDAO;
import com.ngonhuhai.DAO.iPhoneDAO;
import com.ngonhuhai.DAO.impl.BrandDAO;
import com.ngonhuhai.DAO.impl.PhoneDAO;
import com.ngonhuhai.model.BrandModel;
import com.ngonhuhai.model.PhoneModel;
import com.ngonhuhai.service.iPhoneService;

public class PhoneService implements iPhoneService {


	private iPhoneDAO phoneDAO= new PhoneDAO();

	private iBrandDAO brandDAO= new BrandDAO();

	@Override
	public PhoneModel save(PhoneModel newModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhoneModel> findAll(Integer offset, Integer limit) {
		// TODO Auto-generated method stub
		return phoneDAO.findAll2(offset, limit);
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return phoneDAO.getTotalItem();
	}

	@Override
	public PhoneModel insert(PhoneModel pm) {
		// TODO Auto-generated method stub


		System.out.println();
		BrandModel  brandModel= brandDAO.findOne(pm.getHang_id());
		pm.setHang_id(brandModel.getHang_id());
		Long phoneid=phoneDAO.save(pm);
		return phoneDAO.findOne(phoneid);
		
	}
	

	@Override
	public PhoneModel update(PhoneModel pm) {
		// TODO Auto-generated method stub
		
		phoneDAO.update(pm);
		return phoneDAO.findOne(pm.getDt_id());
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub
		for (long id: ids) {
			//1.delete comment (khoa ngoai new_id)
			//2.delete news
			phoneDAO.delete(id);
		}
	}

	@Override
	public PhoneModel findOne(Long id) {
		// TODO Auto-generated method stub
		PhoneModel phoneModel=phoneDAO.findOne(id);
//		BrandModel brandModel=brandDAO.findOne(phoneModel.getHang_id());
//		phoneModel.setHang_id(brandModel.getHang_id());
		return phoneModel;
	}

	@Override
	public List<PhoneModel> findAllbyhangID(Integer offset, Integer limit, Long hangid) {
		// TODO Auto-generated method stub
		return phoneDAO.findAllbyhangId(offset, limit,hangid);
	}

}
