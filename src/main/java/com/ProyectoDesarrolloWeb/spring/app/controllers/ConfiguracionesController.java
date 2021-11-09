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

	
}
