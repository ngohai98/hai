package com.ngonhuhai.mapper;

import java.sql.ResultSet;

import com.ngonhuhai.model.BrandModel;
import com.ngonhuhai.model.DonHangModel;
import com.ngonhuhai.model.PhoneModel;
import com.ngonhuhai.model.RoleModel;
import com.ngonhuhai.model.UserModel;
import com.ngonhuhai.model.chitietDonHangModel;

public class chitietDonHangMapper implements RowMapper<chitietDonHangModel> {

	@Override
	public chitietDonHangModel mapRow(ResultSet rs) {
		try {
			chitietDonHangModel ctdh = new chitietDonHangModel();
			ctdh.setCt_soluong(rs.getLong("ct_soluong"));
			ctdh.setCt_gia(rs.getLong("ct_gia"));
			ctdh.setCt_thanhtien(rs.getLong("ct_thanhtien"));

			DonHangModel donhang = new DonHangModel();
			donhang.setDh_id(rs.getLong("dh_id"));
			donhang.setDh_ngaylap(rs.getString("dh_ngaylap"));
			donhang.setDh_user_id(rs.getLong("dh_user_id"));
			donhang.setDh_tongtien(rs.getLong("dh_tongtien"));

			UserModel user = new UserModel();
			user.setUser_id(rs.getLong("user_id"));
			user.setUser_ten(rs.getString("user_ten"));
			user.setUser_matkhau(rs.getString("user_matkhau"));
			user.setUser_sodienthoai(rs.getString("user_sodienthoai"));
			user.setUser_mail(rs.getString("user_mail"));
			user.setUser_diachi(rs.getString("user_diachi"));
			
			RoleModel role = new RoleModel();
			role.setRole_id(rs.getLong("role_id"));
			role.setRole_ten(rs.getString("role_ten"));
			user.setRole(role);

			donhang.setUser(user);

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



			BrandModel brand = new BrandModel();
			brand.setHang_id(rs.getLong("hang_id"));
			brand.setHang_ten(rs.getString("hang_ten"));
			phone.setHang(brand);

			ctdh.setDonhang(donhang);
			ctdh.setPhone(phone);
			return ctdh;
		} catch (

		Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
