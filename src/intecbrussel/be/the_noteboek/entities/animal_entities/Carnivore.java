package intecbrussel.be.the_noteboek.entities.animal_entities;

public class Carnivore extends Animal {
    private double maxFoodSize;

    public Carnivore(String name) {
        super(name, 0, 0, 0);

    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }


    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "maxFoodSize=" + maxFoodSize +
                "} " + super.toString();
    }
}
