package com.ProyectoDesarrolloWeb.spring.app.DTO;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class USD_GTQ {
private Rate info;

public Rate getInfo() {
	return info;
}

public void setInfo(Rate info) {
	this.info = info;
}







}
