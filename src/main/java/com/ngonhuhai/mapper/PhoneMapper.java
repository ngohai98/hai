package com.ngonhuhai.mapper;

import java.sql.ResultSet;
import java.time.LocalDateTime;

import com.ngonhuhai.model.BrandModel;
import com.ngonhuhai.model.PhoneModel;

public class PhoneMapper implements RowMapper<PhoneModel> {

	@Override
	public PhoneModel mapRow(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			PhoneModel phone= new PhoneModel();
			phone.setDt_id(rs.getLong("dt_id"));
			phone.setDt_Ten(rs.getString("dt_Ten"));
			phone.setDt_HinhAnh(rs.getString("dt_HinhAnh"));
			phone.setDt_ThongTinChiTiet(rs.getString("dt_ThongTinChiTiet"));
			phone.setDt_GiaBan(rs.getString("dt_GiaBan"));
			phone.setDt_SoLuong(rs.getString("dt_SoLuong"));
			phone.setDt_MauSac(rs.getString("dt_MauSac"));
			phone.setDt_Size(rs.getString("dt_Size"));
			phone.setDt_Tag(rs.getString("dt_Tag"));
			phone.setDt_TrangThai(rs.getString("dt_TrangThai"));
			phone.setDt_NgayDang(rs.getString("dt_NgayDang"));

			try {
				BrandModel brand = new BrandModel();
				brand.setHang_id(rs.getLong("hang_id"));
				brand.setHang_ten(rs.getString("hang_ten"));
				phone.setHang(brand);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.print(e.getMessage());
			}
			return phone;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
	
}
