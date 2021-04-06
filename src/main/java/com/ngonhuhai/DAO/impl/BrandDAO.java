package com.ngonhuhai.DAO.impl;

import java.util.List;

import com.ngonhuhai.DAO.iBrandDAO;
import com.ngonhuhai.mapper.BrandMapper;
import com.ngonhuhai.model.BrandModel;

public class BrandDAO extends AbstractDAO<BrandModel> implements iBrandDAO {

	@Override
	public List<BrandModel> findAll() {
		// TODO Auto-generated method stub
		String sql="select * from tblhangdt ";
				
		return query(sql, new BrandMapper());
	}

	@Override
	public Long save(BrandModel bm) {
		// TODO Auto-generated method stub
		String sql = "insert into tblhangdt(hang_id, hang_ten) VALUES (?,?)";

		return insert(sql, bm.getHang_id(), bm.getHang_ten());
	}

	@Override
	public void update(BrandModel update) {
		// TODO Auto-generated method stub
		String sql="UPDATE tblhangdt"
				+ "SET hang_ten = ? \r\n"
				+ "WHERE hang_id=?";
		update(sql,update);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		String sql="DELETE FROM tblhangdt WHERE hang_id=?";
		delete(sql, id);
	}

	@Override
	public List<BrandModel> findAll2(Integer offset, Integer limit) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM tblhangdt LIMIT ?,?";
		return query(sql, new BrandMapper(), offset,limit);
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		String sql="Select Count(*) from tblhangdt";
		return count(sql);
	}

	@Override
	public BrandModel findOne(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tblhangdt WHERE hang_id=?";
		List<BrandModel> brand = query(sql.toString(), new BrandMapper(), id);

		return brand.isEmpty() ? null : brand.get(0);
	}

}
