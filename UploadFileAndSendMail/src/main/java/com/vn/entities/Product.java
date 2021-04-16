package com.vn.entities;

public class Product {

	private Integer id;
	private String name;

	private String url1;
	private String url2;
	private String url3;
	private String url4;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl1() {
		return url1;
	}

	public void setUrl1(String url1) {
		this.url1 = url1;
	}

	public String getUrl2() {
		return url2;
	}

	public void setUrl2(String url2) {
		this.url2 = url2;
	}

	public String getUrl3() {
		return url3;
	}

	public void setUrl3(String url3) {
		this.url3 = url3;
	}

	public String getUrl4() {
		return url4;
	}

	public void setUrl4(String url4) {
		this.url4 = url4;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", url1=" + url1 + ", url2=" + url2 + ", url3=" + url3
				+ ", url4=" + url4 + "]";
	}
	
}