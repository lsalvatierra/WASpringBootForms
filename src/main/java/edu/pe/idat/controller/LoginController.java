package edu.pe.idat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edu.pe.idat.model.LoginForm;

@Controller
public class LoginController {

	
    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
 
    @PostMapping("/login")
    public String login(@ModelAttribute("loginform") LoginForm login, Model model) {
    	model.addAttribute("message", login.getUsuario());
        return "home";
    }
}
