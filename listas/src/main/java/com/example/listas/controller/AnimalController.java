package com.example.listas.controller;

import com.example.listas.service.AnimalService;
import com.example.listas.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    public AnimalService animalService;



    @GetMapping("/cazadores")
    public List<Animal> getMamifero(){

        return this.animalService.getCazadores();

    }

    @GetMapping("/fuertes")
    public List<Animal> getFuertes(){

        return this.animalService.getFuertes();
    }

    @GetMapping("/medianos")
    public List<Animal> getMedianos(){

        return this.animalService.getMedianos();
    }

    @GetMapping("/animales")
    public List<Animal> getAnimales(){

        return this.animalService.getAnimales();

    }

    @GetMapping("/familias")
    public List<String> getFamilias(){

        return this.animalService.getFamilias();
    }

    @GetMapping("/fuerzas")
    public List<Integer> getFuerzas(){

        return this.animalService.getFuerzas();
    }

    @GetMapping("/fuerzasComidos")
    public List<Integer> getFuerzasComidos(){
        return this.animalService.getFuerzasComidos();
    }

    @GetMapping("/familiasDeAnimalesPesoMenorA30")
    public List<String> getFamiliasAnimalesPesoMenorA30(){
        return this.animalService.getFamiliasPesoMenorA30();
    }


}
