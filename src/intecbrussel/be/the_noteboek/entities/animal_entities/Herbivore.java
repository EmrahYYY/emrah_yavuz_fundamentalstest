package intecbrussel.be.the_noteboek.entities.animal_entities;

import intecbrussel.be.the_noteboek.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Herbivore extends Animal {

    Set<Plant> plantDiet;

    {
        plantDiet = new HashSet<>();
    }


    public Herbivore(String name) {
        super(name, 0, 0, 0);

    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);

    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    public void printDiet() {
        plantDiet.forEach(System.out::println);
    }


    @Override
    public String toString() {
        return "Herbivore{" +
                "plantDiet=" + plantDiet +
                "} " + super.toString();
    }
}
