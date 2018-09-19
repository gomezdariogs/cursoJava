package com.cursoJava.ejercicioServicios.controllers;

import com.cursoJava.ejercicioServicios.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/es-ccntratado")
    public boolean esContratado(@RequestParam("edad") int edad,
                                      @RequestParam("experiencia") int experiencia,
                                      @RequestParam("profesion") String profesion){

        return empleadoService.esContratado(edad,experiencia,profesion);
    }

    @GetMapping("/salario")
    public float salario(@RequestParam("edad") int edad,
                         @RequestParam("experiencia") int experiencia,
                         @RequestParam("profesion") String profesion){

        return empleadoService.salario(edad,experiencia,profesion);
    }

    @GetMapping("/telefono-valido")
    public boolean telefonoValido(@RequestParam("prefijo") String prefijo,
                                  @RequestParam("numero") String numero){

        return empleadoService.telefonoValido(prefijo,numero);
    }
}
