package com.tannghia.entity;

import javax.persistence.*;

@Entity
@Table(name = "THANHVIEN")
public class Member {

	@Id
	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "matkhau")
	private String password;

	@Column(name = "hoten")
	private String fullname;

	@Column(name = "ngaysinh")
	private String dob;

	@Column(name= "nu")
	private boolean sex;

	@Column(name="tdvanhoa")
	private String hocvan;

	@Column(name="diachi")
	private String diachi;

	@Column(name="dienthoai")
	private String dienthoai;

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

	public boolean isSex() {
		return sex;
	}
}
