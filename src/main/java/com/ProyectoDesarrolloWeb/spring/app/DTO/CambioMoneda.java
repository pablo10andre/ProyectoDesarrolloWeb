package com.ProyectoDesarrolloWeb.spring.app.DTO;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class CambioMoneda {
private String USD_GTQ;

public String getUSD_GTQ() {
	return USD_GTQ;
}

public void setUSD_GTQ(String uSD_GTQ) {
	USD_GTQ = uSD_GTQ;
}




}
