package com.example.handlingformsubmission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {
	@Autowired
	Pservices Serv;
	
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("usuario", new usuario());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute usuario usuario) {
        if(Serv.verificar(usuario.getUsuario(), usuario.getPass())) {
        	return"result";
        }
    	
    	return "pingUsuario";
    }
    @GetMapping("/result")
    	public String resultForm(Model model) {
    	model.addAttribute("usuario1", new usuario());
    	
    	return "result";
    	
    	}
    @PostMapping("/result")
    public String resultSubmit(@ModelAttribute usuario usuario1) {
    	Serv.registrar(usuario1);
    	
    	return"result";
    }
    
    @GetMapping("/buscador")
    public String buscadorForm(Model model) {
    	model.addAttribute("usuario1", new usuario());
        return "buscador";
    }
    
    

}
