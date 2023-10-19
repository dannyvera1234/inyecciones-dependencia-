package com.example.id.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
// @Component es una anotación que se utiliza para indicar que una clase es un componente.

@Component("miServicioSimple")
public class MiServico implements IServicio {
    // @Override es una anotación que se
    // utiliza para indicar que un método sobrescribe un método de la clase padre.
    @Override
    public String operacion() {
        return "ejecutando algún proceso importante simple dad...";
    }


}
