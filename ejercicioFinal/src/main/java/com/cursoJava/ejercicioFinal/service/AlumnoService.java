package com.cursoJava.ejercicioFinal.service;

import com.cursoJava.ejercicioFinal.model.Alumno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlumnoService {

    private List<Alumno> alumnos= new ArrayList<>();

    public AlumnoService() {

        Alumno alumno1 = new Alumno("Federico", "Nuñez", 8, "Matematica");
        Alumno alumno2 = new Alumno("Dario", "Gomez", 6, "Paradigmas de programacion");
        Alumno alumno3 = new Alumno("Juan", "Morillo", 2, "Matematica");
        Alumno alumno4 = new Alumno("Osvaldo", "Cardoso", 9, "Analisis de sistemas");
        Alumno alumno5 = new Alumno("Javier", "Perez", 4, "Matematica");


        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
    }

    public Alumno alumnoConMayorNota(){
        return alumnos.stream().max((unAlumno,otroAlumno) -> (Integer.compare(unAlumno.getNota(),otroAlumno.getNota()))).get();
    }
    public List<Alumno> alumnosCon9(int valor){
        return alumnos.stream().filter(alumno -> alumno.getNota() == valor).collect(Collectors.toList());
    }
    public int cantidadDeAlumnos(){
        return alumnos.size();
    }
    public List<Alumno> apellidosTerminadosEnZ(){
        return  alumnos.stream().filter(alumno->alumno.getApellido().endsWith("z")).collect(Collectors.toList());
    }






}
