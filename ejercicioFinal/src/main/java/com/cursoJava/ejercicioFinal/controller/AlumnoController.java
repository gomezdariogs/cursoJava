package com.cursoJava.ejercicioFinal.controller;

import java.util.List;

import com.cursoJava.ejercicioFinal.model.Alumno;
import com.cursoJava.ejercicioFinal.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {

    @Autowired
    public AlumnoService alumnoService;

    @GetMapping("/mayor-nota")
    public Alumno alumnoConMayorNota(){
        return this.alumnoService.alumnoConMayorNota();
    }

    @GetMapping("/nota")
    public List<Alumno> alumnosCon9(@RequestParam ("valor") int valor){
        return this.alumnoService.alumnosCon9(valor);
    }

    @GetMapping("/cantidad-alumnos")
    public int cantidadDeAlumnos(){
        return this.alumnoService.cantidadDeAlumnos();
    }

    @GetMapping("/apellido-con-z")
    public List<Alumno> apellidosTerminadosEnZ(){
        return this.alumnoService.apellidosTerminadosEnZ();
    }
}
