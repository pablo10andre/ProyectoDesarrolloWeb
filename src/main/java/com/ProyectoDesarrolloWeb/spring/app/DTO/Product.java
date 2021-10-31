package com.ProyectoDesarrolloWeb.spring.app.DTO;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties
public class Product {
String productTitle;
BigDecimal price;
List<String> imageUrlList;
List<String> features;


public List<String> getFeatures() {
	return features;
}
public void setFeatures(List<String> features) {
	this.features = features;
}
public List<String> getImageUrlList() {
	return imageUrlList;
}
public void setImageUrlList(List<String> imageUrlList) {
	this.imageUrlList = imageUrlList;
}
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
