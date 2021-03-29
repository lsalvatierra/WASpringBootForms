package edu.pe.idat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.pe.idat.model.Alumno;

@Controller
public class InicioController {

    @GetMapping("/hola")
    public String hola(Model model) {
        model.addAttribute("message", "Hola Mundo!");
        return "hola";
    }
    
    @GetMapping("/alumno")    
    public String obtenerAlumnos(Model model) {
    	List<Alumno> alumnos = new ArrayList<Alumno>();
    	alumnos.add(new Alumno("A1512233", "Juan Alejandro", "Perez Garcia", "angelitotierno@gmail.com"));
    	alumnos.add(new Alumno("A1512233", "Juan Alejandro", "Perez Garcia", "angelitotierno@gmail.com"));
    	alumnos.add(new Alumno("A1512233", "Juan Alejandro", "Perez Garcia", "angelitotierno@gmail.com"));
    	alumnos.add(new Alumno("A1512233", "Juan Alejandro", "Perez Garcia", "angelitotierno@gmail.com"));
    	alumnos.add(new Alumno("A1512233", "Juan Alejandro", "Perez Garcia", "angelitotierno@gmail.com"));
    	model.addAttribute("alumnos", alumnos);
    	return "listaalumnos";
    }
}
