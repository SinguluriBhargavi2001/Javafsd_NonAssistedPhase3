package com.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EProductEntity {
	
	private long product_id;
	private String product_name;
	private BigDecimal price;
	
	public EProductEntity() {
		// TODO Auto-generated constructor stub
	}

	public EProductEntity(int product_id,String name, BigDecimal price) {
		super();
		this.product_id=product_id;
		this.product_name = product_name;
		this.price = price;
	}

	public long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}

	
	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "EProductEntity [product_id=" + product_id + ", name=" + product_name + "]";
	}
	
	

}