package com.ngonhuhai.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ngonhuhai.model.*;

public class DonHangMapper implements RowMapper<DonHangModel> {

	@Override
	public DonHangModel mapRow(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			DonHangModel donhang = new DonHangModel();
			donhang.setDh_id(rs.getLong("dh_id"));
			donhang.setDh_ngaylap(rs.getString("dh_ngaylap"));
			donhang.setDh_user_id(rs.getLong("dh_user_id"));
			donhang.setDh_tongtien(rs.getLong("dh_tongtien"));
			donhang.setDh_tinhtrang(rs.getBoolean("dh_tinhtrang"));
			donhang.setGh_id(rs.getLong("gh_id"));
			try {
				UserModel user = new UserModel();
				user.setUser_id(rs.getLong("user_id"));
				user.setUser_ten(rs.getString("user_ten"));
				user.setUser_matkhau(rs.getString("user_matkhau"));
				user.setUser_sodienthoai(rs.getString("user_sodienthoai"));
				user.setUser_mail(rs.getString("user_mail"));
				user.setUser_diachi(rs.getString("user_diachi"));
				try {
					RoleModel role = new RoleModel();
					role.setRole_id(rs.getLong("role_id"));
					role.setRole_ten(rs.getString("role_ten"));
					user.setRole(role);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.print(e.getMessage());
				}
				donhang.setUser(user);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.print(e.getMessage());
			}
			try {
				GiohangModel giohang = new GiohangModel();
				giohang.setGh_id(rs.getLong("gh_id"));
				giohang.setGh_gia(rs.getLong("gh_gia"));
				giohang.setGh_soluongmua(rs.getLong("gh_soluongmua"));
				giohang.setGh_tongtien(rs.getLong("gh_tongtien"));
				giohang.setGh_dt_id(rs.getLong("gh_dt_id"));
				giohang.setGh_user_id(rs.getLong("gh_user_id"));
				try {
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

					try {
						BrandModel brand = new BrandModel();
						brand.setHang_id(rs.getLong("hang_id"));
						brand.setHang_ten(rs.getString("hang_ten"));
						phone.setHang(brand);
					} catch (Exception e) {
						// TODO: handle exception
						System.out.print(e.getMessage());
					}

					giohang.setPhone(phone);
				} catch (Exception e) {
					System.out.print(e.getMessage());
				}
				donhang.setGiohang(giohang);

			} catch (Exception e) {
				System.out.print(e.getMessage());
			}

			return donhang;
		} catch (SQLException e) {
			// TODO: handle exception
			return null;
		}
	}

}