package com.cursoJava.ejercicioServicios.services;

import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

    private final int salarioBase= 15000;


    public boolean esContratado(int edad, int experiencia, String profesion) {
        if (profesion.equalsIgnoreCase("desarrollador")) {
            return experiencia >= 3 && edad >= 22 && edad <= 30;
        }
        if (profesion.equalsIgnoreCase("administrativo")) {
            return edad > 30 || (edad <= 30 && experiencia >= 9);
        }
        if (profesion.equalsIgnoreCase("ingeniero")) {
            return true;
        }
        return false;
    }
    public float salario(int edad,int experiencia,String profesion){

        if(profesion.equalsIgnoreCase("ingeniero")){
            return salarioBase + experiencia * 1000 + 500 * edad;
        }
        if(profesion.equalsIgnoreCase("desarrollador")){
            return salarioBase + experiencia * 1500;
        }
        return salarioBase;
        }

    public boolean telefonoValido(String prefijo,String numero){
        return (prefijo.length() + numero.length() == 10 || prefijo.length() + numero.length() == 12 && numero.startsWith("15"));
    }

}

