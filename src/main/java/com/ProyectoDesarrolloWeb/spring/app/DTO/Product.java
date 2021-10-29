package com.ProyectoDesarrolloWeb.spring.app.DTO;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties
public class Product {
String productTitle;
BigDecimal price;


public String getProductTitle() {
	return productTitle;
}
public void setProductTitle(String productTitle) {
	this.productTitle = productTitle;
}
public BigDecimal getPrice() {
	return price;
}
public void setPrice(BigDecimal price) {
	this.price = price;
}

	
	
}
