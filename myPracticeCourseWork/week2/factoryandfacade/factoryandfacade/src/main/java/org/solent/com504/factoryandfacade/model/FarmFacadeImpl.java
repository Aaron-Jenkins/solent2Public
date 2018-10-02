package org.solent.com504.factoryandfacade.model;

import java.util.ArrayList;
import java.util.List;

public class FarmFacadeImpl implements FarmFacade{

    List<Animal> AllAnimals = new ArrayList();

    public List<Animal> getAllAnimals() {
        return AllAnimals;
    }

    public void addDog(String name) {
        Animal animal = AnimalObjectFactory.createDog();
        animal.setName(name);
        AllAnimals.add(animal);
    }

    public void addCat(String name) {
        Animal animal = AnimalObjectFactory.createCat();
        animal.setName(name);
        AllAnimals.add(animal);
    }

    public void addCow(String name) {
        Animal animal = AnimalObjectFactory.createCow();
        animal.setName(name);
        AllAnimals.add(animal);
    }
}
