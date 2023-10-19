package com.example.id.controllers;

import com.example.id.service.IServicio;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// @Controller es una anotación que se utiliza para indicar que una clase es un controlador.
@Controller
public class IndexController {
    // inyeccion de dependencias de la clase MiServico
    //private MiServico servicio = new MiServico();

    //  @GetMapping ({"/", " ","/index"})
    // public String index(Model model) {

    //  model.addAttribute("titulo", servicio.operacion());

    //  return "index";
    //  }

    // inyeccion de dependencias de la clase MiServico

/////////////////////////////////////////////////////////////////////

    // @Autowired es una anotación que se utiliza para indicar que un atributo o  un método setter
    //de una clase se va a utilizar para inyectar una dependencia.
    @Autowired
    // @Qualifier es una anotación que se utiliza para indicar que una clase es un componente.
   // @Qualifier("miServicioComplejo")

    private IServicio servicio;

    @GetMapping({"/", " ", "/index"})
    public String index(Model model) {

        model.addAttribute("titulo", servicio.operacion());

        return "index";
    }


}
