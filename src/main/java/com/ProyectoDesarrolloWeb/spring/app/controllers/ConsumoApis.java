package com.ProyectoDesarrolloWeb.spring.app.controllers;




import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ProyectoDesarrolloWeb.spring.app.DTO.CambioMoneda;
import com.ProyectoDesarrolloWeb.spring.app.DTO.Product;


public class ConsumoApis {	
	public static void main(String[] args) {	
   /* Product prueba=consumo_producto();
    System.out.println("titulo: "+prueba.getProductTitle()+"precio: "+prueba.getPrice());
*/
		
		CambioMoneda prueba=consumo_cambio();
	    System.out.println("titulo: "+prueba.getUSD_GTQ());
		
	}
	
	public static CambioMoneda consumo_cambio() {

		RestTemplate restTemplate=new RestTemplate();
		String url="http://free.currconv.com/api/v7/convert";	
        UriComponentsBuilder uri=UriComponentsBuilder.fromHttpUrl(url)
        		.queryParam("q","USD_GTQ")
        		.queryParam("compact","ultra")
        		.queryParam("apiKey","78cc8ab338b6c20c7d75");
		
        HttpHeaders headers=new HttpHeaders();
        headers.set("apiKey", "78cc8ab338b6c20c7d75");
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Product> entity=new HttpEntity<>(headers);
        
		System.out.println(uri.toUriString());
		 

		
		ResponseEntity<CambioMoneda> responseEntity = 
				  restTemplate.exchange(
				    uri.toUriString(),
				    HttpMethod.GET,
				    entity,
				    new ParameterizedTypeReference<CambioMoneda>() {}
						  );
		
		
		CambioMoneda valor=responseEntity.getBody();
		return valor;
		
	}
	
	
	
	
	
	
	
	public static Product consumo_producto() {

		RestTemplate restTemplate=new RestTemplate();
		String url="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product";	
        UriComponentsBuilder uri=UriComponentsBuilder.fromHttpUrl(url)
        		.queryParam("url","https://www.amazon.com/-/es/Corsair-Vengeance-3200MHz-computadora-escritorio/dp/B07D1XCKWW/?_encoding=UTF8&pd_rd_w=RuqTA&pf_rd_p=6e9da02f-f7a3-444f-aea6-9ef09ed8bb89&pf_rd_r=X90BKQB5EMKH9WN1BCX0&pd_rd_r=15daca3e-8343-4ab0-a9c2-e958d3b1be26&pd_rd_wg=pPb9b&ref_=pd_gw_ci_mcx_mr_hp_d");
		
        HttpHeaders headers=new HttpHeaders();
        headers.set("x-rapidapi-host", "axesso-axesso-amazon-data-service-v1.p.rapidapi.com");
        headers.set("x-rapidapi-key", "64d95a7b48msh73a031e39ad14f1p1928dbjsn568d8e615b6f");
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Product> entity=new HttpEntity<>(headers);
        
		System.out.println(uri.toUriString());
		 

		
		ResponseEntity<Product> responseEntity = 
				  restTemplate.exchange(
				    uri.toUriString(),
				    HttpMethod.GET,
				    entity,
				    new ParameterizedTypeReference<Product>() {}
						  );
		
		
		Product producto=responseEntity.getBody();
		return producto;
		
		
	}
}













