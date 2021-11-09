package com.ProyectoDesarrolloWeb.spring.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ProyectoDesarrolloWeb.spring.app.entities.Audit;
import com.ProyectoDesarrolloWeb.spring.app.entities.Configuraciones;
import com.ProyectoDesarrolloWeb.spring.app.repositories.ConfiguracionesRepository;



@Controller
public class ConfiguracionesController {
	@Autowired
	private ConfiguracionesRepository configuraciones;

	@PreAuthorize("hasRole('ROLE_ADMIN')")	
	@RequestMapping(value = "/configuracion", method = RequestMethod.GET)
	public String configuracion(Model model) {
		Configuraciones configuracion = configuraciones.findById((long) 1).get();
		model.addAttribute("configuracion", configuracion);
		return "configuracion";
	}
	
	
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")	
	@RequestMapping(value = "/editar-configuracion/1", method = RequestMethod.GET)
	public String editarCliente(Model model) {
		Long id = 1L;
		Configuraciones configuracion = null;
		if (id == 1) {
			configuracion = configuraciones.findById(id).get();
		} else {
			return "redirect:/configuraciones";
		}
		model.addAttribute("titulo", "Editar Configuracion");
		model.addAttribute("configuracion", configuracion);
		return "form-configuraciones";
	}	

}
