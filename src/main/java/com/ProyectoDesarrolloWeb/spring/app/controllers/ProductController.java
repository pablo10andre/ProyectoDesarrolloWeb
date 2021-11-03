package com.ProyectoDesarrolloWeb.spring.app.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ProyectoDesarrolloWeb.spring.app.DTO.Product;




@Controller
public class ProductController {

	@RequestMapping(value = "/producto")
	public String producto(@RequestParam(required = true) String url, Model model) {
		Product producto_api=ConsumoApis.consumo_producto(url);   
		model.addAttribute("productos",producto_api);
		
		return "producto";
	}	
	

}
