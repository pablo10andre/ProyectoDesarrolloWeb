package com.ProyectoDesarrolloWeb.spring.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ProyectoDesarrolloWeb.spring.app.entities.Configuraciones;
import com.ProyectoDesarrolloWeb.spring.app.repositories.ConfiguracionesRepository;


@Controller
public class ConfiguracionesController {
	@Autowired
	private ConfiguracionesRepository configuraciones;

	@RequestMapping(value = "/configuracion", method = RequestMethod.GET)
	public String detalleCliente(Model model) {

		Configuraciones configuracion = configuraciones.findById((long) 1).get();
		model.addAttribute("configuracion", configuracion);
		return "configuracion";
	}
}
