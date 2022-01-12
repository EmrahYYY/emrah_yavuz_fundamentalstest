package intecbrussel.be.the_noteboek.entities.app;

import intecbrussel.be.the_noteboek.entities.animal_entities.Animal;
import intecbrussel.be.the_noteboek.entities.animal_entities.Carnivore;
import intecbrussel.be.the_noteboek.entities.animal_entities.Herbivore;
import intecbrussel.be.the_noteboek.entities.animal_entities.Omnivore;
import intecbrussel.be.the_noteboek.entities.plant_entities.*;
import intecbrussel.be.the_noteboek.entities.service.ForestNotebook;


public class NatureApp {

    public static void main(String[] args) {


        Bush bush = new Bush("Cactus", 1.63);
        bush.setFruit("Poison fruit");
        bush.setLeafType(LeafType.HEART);
        Flower flower = new Flower("Tulip", 0.38);
        flower.setSmell(Scent.ORANGE);
        Tree tree1 = new Tree("Pine", 4.7);
        tree1.setLeafType(LeafType.HAND);
        Tree tree2 = new Tree("Poplar", 3.5);
        tree2.setLeafType(LeafType.SPEAR);
        Weed weed = new Weed("seaweed", 0.15);
        weed.setArea(14);

        Plant[] plants = new Plant[]{bush, flower, tree1, tree2, weed};


        Carnivore carnivore1 = new Carnivore("Lion", 1, 1.5, 2);
        carnivore1.setMaxFoodSize(3);
        Carnivore carnivore2 = new Carnivore("Hyena", 0.5, 1, 3);
        carnivore2.setMaxFoodSize(2);
        Carnivore carnivore3 = new Carnivore("Fish", 0.3, 0.11, 0.4);
        carnivore3.setMaxFoodSize(4);
        Herbivore herbivore1 = new Herbivore("Horse", 2, 2, 3);
        herbivore1.addPlantToDiet(plants[0]);
        Herbivore herbivore2 = new Herbivore("Cow", 0.5, 1., 2.3);
        herbivore2.addPlantToDiet(plants[3]);
        Herbivore herbivore3 = new Herbivore("Goat", 0.6, 1.2, 2.1);
        herbivore3.addPlantToDiet(plants[2]);
        Omnivore omnivore1 = new Omnivore("Cat", 0.2, 0.15, 0.3);
        omnivore1.setMaxFoodSize(1.5);
        omnivore1.addPlantToDiet(plants[2]);
        Omnivore omnivore2 = new Omnivore("Seagull", 0.33, 0.35, 0.6);
        omnivore2.setMaxFoodSize(3);
        omnivore2.addPlantToDiet(plants[1]);
        Omnivore omnivore3 = new Omnivore("Dog", 0.9, 1.4, 2.2);
        omnivore3.setMaxFoodSize(2);
        omnivore3.addPlantToDiet(plants[0]);

        System.out.println(" Printing Plants and Animals ****************************************************");

        for (Plant plant : plants) {
            System.out.println(plant);
        }

        Animal[] animals = new Animal[]{carnivore1, carnivore2, carnivore3, herbivore1, herbivore2, herbivore3, omnivore1, omnivore2, omnivore3};

        for (Animal animal : animals) {
            System.out.println(animal);
        }


        System.out.println("Adding to ForestNotebook and Printing  ******************************************");

        ForestNotebook sundayWalkNotebook = new ForestNotebook();

        for (Animal animal : animals) {
            sundayWalkNotebook.addAnimal(animal);
        }
        sundayWalkNotebook.addAnimal(omnivore3); // repeating object can not add

        for (Plant plant : plants) {
            sundayWalkNotebook.addPlant(plant);
        }
        sundayWalkNotebook.addPlant(weed);// repeating object can not add

        sundayWalkNotebook.printNotebook();

        System.out.println("Printing Carnivores, Omnivores, Herbivores lists ******************************");

        System.out.println(sundayWalkNotebook.getCarnivores());
        System.out.println(sundayWalkNotebook.getOmnivores());
        System.out.println(sundayWalkNotebook.getHerbivores());

        System.out.println("Sorting Animals and Plants by Name ********************************************");

        sundayWalkNotebook.sortAnimalsByName();
        sundayWalkNotebook.sortPlantByName();

        System.out.println("Sorting Animals and Plants by Height ******************************************");

        sundayWalkNotebook.sortAnimalsByHeight();
        sundayWalkNotebook.sortPlantsByHeight();
        sundayWalkNotebook.printNotebook();

        System.out.println("*******************************************************************************");

        System.out.println("number of animals added: " + sundayWalkNotebook.getAnimalCount());
        System.out.println("number of plants added: " + sundayWalkNotebook.getPlantCount());


    }


}
