package com.example.id;

import com.example.id.service.IServicio;
import com.example.id.service.MiServico;
import com.example.id.service.MiServicoComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
// @Configuration es una anotación que se utiliza para indicar que una clase es una clase de configuración.
@Configuration
public class AppConfig {
    //@Bean es una anotación que se utiliza para indicar que un método
   @Bean("miServicioSimple")
   // @Primary
    public IServicio registrarMiServicio(){
        return new MiServico();
    }
  //  @Bean("miServicioComplejo")

    public IServicio registrarMiServicioComplejo(){
        return new MiServicoComplejo();
    }
}
