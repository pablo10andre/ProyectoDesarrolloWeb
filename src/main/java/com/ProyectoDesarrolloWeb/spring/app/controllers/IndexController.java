package com.ProyectoDesarrolloWeb.spring.app.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class IndexController {

    @GetMapping("/index")
    public String index(@RequestParam(name="name", required=false, defaultValue = "Worls")String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }
    
}
