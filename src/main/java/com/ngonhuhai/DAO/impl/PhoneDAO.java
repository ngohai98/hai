package com.ngonhuhai.DAO.impl;

import java.util.List;

import com.ngonhuhai.DAO.iPhoneDAO;
import com.ngonhuhai.mapper.PhoneMapper;
import com.ngonhuhai.model.PhoneModel;

public class PhoneDAO extends AbstractDAO<PhoneModel> implements iPhoneDAO {

	@Override
	public List<PhoneModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long save(PhoneModel pm) {
		// TODO Auto-generated method stub
		String sql = "insert into tblphone(dt_Ten,dt_HinhAnh,dt_ThongTinChiTiet,dt_GiaBan,dt_SoLuong,dt_MauSac,dt_Size,dt_TrangThai,dt_NgayDang,hang_id) values(?,?,?,?,?,?,?,?,?,?)";
		return insert(sql, pm.getDt_Ten(),pm.getDt_HinhAnh(),pm.getDt_ThongTinChiTiet(),pm.getDt_GiaBan(),pm.getDt_SoLuong(),pm.getDt_MauSac()
				,pm.getDt_Size(),pm.getDt_TrangThai(),pm.getDt_NgayDang(),pm.getHang_id());
	}

	@Override
	public void update(PhoneModel pm) {
		// TODO Auto-generated method stub
		String sql = "update tblphone set dt_Ten=?,dt_HinhAnh=?, dt_ThongTinChiTiet=?, dt_GiaBan=?,  dt_SoLuong=?, dt_MauSac=?, dt_Size=?, dt_TrangThai=?, dt_NgayDang=?, hang_id=? where dt_id=?";

		update(sql,pm.getDt_Ten(),pm.getDt_HinhAnh(),pm.getDt_ThongTinChiTiet(),pm.getDt_GiaBan(),pm.getDt_SoLuong(),pm.getDt_MauSac(),pm.getDt_Size(),pm.getDt_TrangThai(),pm.getDt_NgayDang(),pm.getHang_id(),pm.getDt_id() );
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM tblphone WHERE dt_id=?";
		delete(sql, id);
	}

	@Override
	public List<PhoneModel> findAll2(Integer offset, Integer limit) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tblphone AS p INNER JOIN tblhangdt AS h ON p.hang_id = h.hang_id  LIMIT  ?,?";
		return query(sql, new PhoneMapper(), offset, limit);
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		String sql = "Select Count(*) from tblphone";
		return count(sql);
	}

	@Override
	public PhoneModel findOne(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tblPhone WHERE dt_id=?";
		List<PhoneModel> phones = query(sql.toString(), new PhoneMapper(), id);

		return phones.isEmpty() ? null : phones.get(0);
	}

	@Override
	public List<PhoneModel> findAllbyhangId(Integer offset, Integer limit, Long hangid) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tblphone AS p INNER JOIN tblhangdt AS h ON p.hang_id = h.hang_id where p.hang_id=? "
				+ "LIMIT ?,?";
		return query(sql, new PhoneMapper(),hangid, offset, limit);
	}

}
