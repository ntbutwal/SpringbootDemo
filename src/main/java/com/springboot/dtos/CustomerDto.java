package com.springboot.dtos;

public class CustomerDto {
	private Long id;
	private String name;
	private String address;
	private String userid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "CustomerDto [id=" + id + ", name=" + name + ", address=" + address + ", userid=" + userid + "]";
	}

}
