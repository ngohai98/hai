package com.ngonhuhai.model;

public class ImageModel {
	private String base64;
	private String name;
	public String getBase64() {
		return base64.split(",")[1];
	}
	public void setBase64(String base64) {
		this.base64 = base64;
	}
	public String getName() {
		return name;
	}
	public void setImageName(String name) {
		this.name = name;
	}
}