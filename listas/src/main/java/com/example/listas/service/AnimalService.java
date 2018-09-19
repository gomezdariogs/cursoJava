package com.example.listas.service;

import com.example.listas.model.Animal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

@Service
public class AnimalService {

    private List<Animal> animalList;

    public AnimalService() {
        this.animalList = new ArrayList<>();

        Animal animal = new Animal("Leon", "Mamifero", true, 120, false, 80);
        Animal animal1 = new Animal("Rata", "Mamifero", false, 1, false, 2);
        Animal animal2 = new Animal("Tortuga", "Reptil", false, 20, true, 15);
        Animal animal3 = new Animal("Lechuza", "Ave", true, 60, false, 10);
        Animal animal4 = new Animal("Ballena", "Pez", false, 2000, false, 800000);

        animalList.add(animal);
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
    }


    public List<Animal> getCazadores() {

        return animalList.stream().filter(animal-> animal.isEsCazador() ).collect(Collectors.toList());

    }
    public List<Animal> getFuertes(){
        return animalList.stream().filter(animal -> animal.getFuerza()>100).collect(Collectors.toList());
    }
    public List<Animal> getMedianos(){
        return animalList.stream().filter(animal -> animal.getPeso() >= 40 && animal.getPeso() <=100).collect(Collectors.toList());
    }
    public List<Animal> getAnimales(){
        return animalList;
    }
    public List<String> getFamilias(){
        return animalList.stream().map(animal -> animal.getFamilia()).collect(Collectors.toList());
    }
    public List<Integer> getFuerzas(){
        return animalList.stream().map(animal -> animal.getFuerza()).collect(Collectors.toList());
    }
    public void darDeComer(Animal unAnimal){
        unAnimal.setFuerza(unAnimal.getFuerza() + 5);
    }
    public List<Integer> getFuerzasComidos(){
        animalList.stream().forEach(unAnimal -> darDeComer(unAnimal));
        return this.getFuerzas();
    }
    public List<String> getFamiliasPesoMenorA30(){
        return animalList.stream().filter(animal -> animal.getPeso()<30).map(animal -> animal.getFamilia()).collect(Collectors.toList());
    }
}
