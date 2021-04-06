package com.ngonhuhai.mapper;

import java.sql.ResultSet;

import com.ngonhuhai.model.BrandModel;
import com.ngonhuhai.model.PhoneModel;
import com.ngonhuhai.model.RoleModel;
import com.ngonhuhai.model.UserModel;
import com.ngonhuhai.model.YeuThichModel;

public class YeuThichMapper implements RowMapper<YeuThichModel> {

	@Override
	public YeuThichModel mapRow(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			YeuThichModel yt = new YeuThichModel();
			yt.setYt_id(rs.getLong("yt_id"));
			yt.setSoLuongBan(rs.getLong("soLuongBan"));

			UserModel user = new UserModel();
			user.setUser_id(rs.getLong("user_id"));
			user.setUser_ten(rs.getString("user_ten"));
			user.setUser_matkhau(rs.getString("user_matkhau"));
			user.setUser_sodienthoai(rs.getString("user_sodienthoai"));
			user.setUser_mail(rs.getString("user_mail"));
			try {
				RoleModel role = new RoleModel();
				role.setRole_id(rs.getLong("role_id"));
				role.setRole_ten(rs.getString("role_ten"));
				user.setRole(role);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.print(e.getMessage());
			}
			PhoneModel phone = new PhoneModel();
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

			;
			try {
				BrandModel brand = new BrandModel();
				brand.setHang_id(rs.getLong("hang_id"));
				brand.setHang_ten(rs.getString("hang_ten"));
				phone.setHang(brand);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.print(e.getMessage());
			}
			yt.setUser(user);
			yt.setPhone(phone);

			return yt;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}
}
