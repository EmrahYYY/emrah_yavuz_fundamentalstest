package intecbrussel.be.the_noteboek.entities.service;

import intecbrussel.be.the_noteboek.entities.animal_entities.Animal;
import intecbrussel.be.the_noteboek.entities.animal_entities.Carnivore;
import intecbrussel.be.the_noteboek.entities.animal_entities.Herbivore;
import intecbrussel.be.the_noteboek.entities.animal_entities.Omnivore;
import intecbrussel.be.the_noteboek.entities.plant_entities.Plant;

import java.util.*;


public class ForestNotebook { //forest/orman
    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount, animalCount;
    private List<Animal> animals;
    private List<Plant> plants;

    public ForestNotebook() {
        carnivores = new ArrayList<>();
        omnivores = new ArrayList<>();
        herbivores = new ArrayList<>();
        animals = new ArrayList<>();
        plants = new ArrayList<>();
    }

    public List<Carnivore> getCarnivores() {

        return carnivores;

    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;

    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void addAnimal(Animal animal) {


        if (animal instanceof Carnivore) {
            carnivores.add((Carnivore) animal);
            Object[] objects1 = carnivores.toArray();
            for (Object a : objects1) {
                if (carnivores.indexOf(a) != carnivores.lastIndexOf(a)) {
                    carnivores.remove(carnivores.lastIndexOf(a));
                }
            }

            animals.add(animal);
            animalCount++;
            Object[] objects2 = animals.toArray();
            for (Object a : objects2) {
                if (animals.indexOf(a) != animals.lastIndexOf(a)) {
                    animals.remove(animals.lastIndexOf(a));
                    animalCount--;
                }
            }

        }

        if (animal instanceof Herbivore) {
            herbivores.add((Herbivore) animal);
            Object[] objects3 = herbivores.toArray();
            for (Object a : objects3) {
                if (herbivores.indexOf(a) != herbivores.lastIndexOf(a)) {
                    herbivores.remove(herbivores.lastIndexOf(a));
                }
            }

            animals.add(animal);
            animalCount++;
            Object[] objects4 = animals.toArray();
            for (Object a : objects4) {
                if (animals.indexOf(a) != animals.lastIndexOf(a)) {
                    animals.remove(animals.lastIndexOf(a));
                    animalCount--;
                }
            }
        }

        if (animal instanceof Omnivore) {
            omnivores.add((Omnivore) animal);
            Object[] objects5 = omnivores.toArray();
            for (Object a : objects5) {
                if (omnivores.indexOf(a) != omnivores.lastIndexOf(a)) {
                    omnivores.remove(omnivores.lastIndexOf(a));
                }
            }

            animals.add(animal);
            animalCount++;
            Object[] objects6 = animals.toArray();
            for (Object a : objects6) {
                if (animals.indexOf(a) != animals.lastIndexOf(a)) {
                    animals.remove(animals.lastIndexOf(a));
                    animalCount--;
                }
            }
        }
    }


    public void addPlant(Plant plant) {

        plants.add(plant);
        plantCount++;

        Object[] objects = plants.toArray();
        for (Object p : objects) {
            if (plants.indexOf(p) != plants.lastIndexOf(p)) {
                plants.remove(plants.lastIndexOf(p));
                plantCount--;
            }
        }
    }

    public void printNotebook() {
        animals.forEach(System.out::println);
        plants.forEach(System.out::println);
    }

    public void sortAnimalsByName() {
        animals.stream()
                .sorted(Comparator.comparing(Animal::getName))
                .forEach(System.out::println);

    }

    public void sortPlantByName() {
        plants.stream()
                .sorted(Comparator.comparing(Plant::getName))
                .forEach(System.out::println);
    }

    public void sortAnimalsByHeight() {
        animals.sort(Comparator.comparing(Animal::getHeight));
    }

    public void sortPlantsByHeight() {
        plants.sort(Comparator.comparing(Plant::getHeight));
    }


}
