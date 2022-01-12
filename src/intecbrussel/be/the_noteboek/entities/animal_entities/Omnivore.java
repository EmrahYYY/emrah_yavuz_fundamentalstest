package intecbrussel.be.the_noteboek.entities.animal_entities;

import intecbrussel.be.the_noteboek.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal {


    Set<Plant> plantDiet;

    {
        plantDiet = new HashSet<>();
    }

    private double maxFoodSize;

    public Omnivore(String name) {
        super(name, 0, 0, 0);

    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }


    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }


    public void addPlantToDiet(Plant plant) {
        if (maxFoodSize > plant.getHeight()) {
            plantDiet.add(plant);
        }
    }

    @Override
    public String toString() {
        return "Omnivore{" +
                "plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize +
                "} " + super.toString();
    }
}
