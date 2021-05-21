package com.tannghia.model;

import java.util.Date;

public class MemberDTO {
	private String email;
	private String password;
	private String repassword;
	private String fullname;
	private String dob;
	private boolean sex;
	private String gioitinh;
	private String hocvan;
	private String diachi;
	private String dienthoai;
	private Date ngaysinh;

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getHocvan() {
		return hocvan;
	}

	public void setHocvan(String hocvan) {
		this.hocvan = hocvan;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getDienthoai() {
		return dienthoai;
	}

	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}

}
