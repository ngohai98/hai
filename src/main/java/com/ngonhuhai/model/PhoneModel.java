package com.ngonhuhai.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class PhoneModel  extends AbstractModel<PhoneModel>{
	private Long dt_id;
	private String dt_Ten;
	private String dt_HinhAnh;
	private String dt_ThongTinChiTiet;
	private String dt_GiaBan;
	private String dt_SoLuong;
	private String dt_MauSac;

	private String dt_Size;
	private String dt_Tag;
	private String dt_TrangThai;
	private String dt_NgayDang;

	
	private Long hang_id;

	private BrandModel hang = new BrandModel();

	public Long getDt_id() {
		return dt_id;
	}

	public void setDt_id(Long dt_id) {
		this.dt_id = dt_id;
	}

	public String getDt_Ten() {
		return dt_Ten;
	}

	public void setDt_Ten(String dt_Ten) {
		this.dt_Ten = dt_Ten;
	}

	public String getDt_HinhAnh() {
		return dt_HinhAnh;
	}

	public void setDt_HinhAnh(String dt_HinhAnh) {
		this.dt_HinhAnh = dt_HinhAnh;
	}

	public String getDt_ThongTinChiTiet() {
		return dt_ThongTinChiTiet;
	}

	public void setDt_ThongTinChiTiet(String dt_ThongTinChiTiet) {
		this.dt_ThongTinChiTiet = dt_ThongTinChiTiet;
	}

	public String getDt_GiaBan() {
		return dt_GiaBan;
	}

	public void setDt_GiaBan(String dt_GiaBan) {
		this.dt_GiaBan = dt_GiaBan;
	}

	public String getDt_SoLuong() {
		return dt_SoLuong;
	}

	public void setDt_SoLuong(String dt_SoLuong) {
		this.dt_SoLuong = dt_SoLuong;
	}

	public String getDt_MauSac() {
		return dt_MauSac;
	}

	public void setDt_MauSac(String dt_MauSac) {
		this.dt_MauSac = dt_MauSac;
	}

	public String getDt_Size() {
		return dt_Size;
	}

	public void setDt_Size(String dt_Size) {
		this.dt_Size = dt_Size;
	}

	public String getDt_Tag() {
		return dt_Tag;
	}

	public void setDt_Tag(String dt_Tag) {
		this.dt_Tag = dt_Tag;
	}

	public String getDt_TrangThai() {
		return dt_TrangThai;
	}

	public void setDt_TrangThai(String dt_TrangThai) {
		this.dt_TrangThai = dt_TrangThai;
	}

	public String getDt_NgayDang() {
		return dt_NgayDang;
	}

	public void setDt_NgayDang(String dt_NgayDang) {
		this.dt_NgayDang = dt_NgayDang;
	}

	public Long getHang_id() {
		return hang_id;
	}

	public void setHang_id(Long hang_id) {
		this.hang_id = hang_id;
	}

	public BrandModel getHang() {
		return hang;
	}

	public void setHang(BrandModel hang) {
		this.hang = hang;
	}
}
