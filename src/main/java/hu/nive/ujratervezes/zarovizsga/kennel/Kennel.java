package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    List<Dog> dogs = new ArrayList<>();


    void addDog(Dog dog){
    dogs.add(dog);
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void feedAll() {

        for (Dog dog : dogs) {
            dog.feed();
        }
    }

    public Dog findByName(String name) {
        for (Dog dog : dogs) {
            if(dog.getName().equals(name)){
                return dog;
            }
        }
       throw new IllegalArgumentException("Can not find name.");
    }

    public void playWith(String name, int i) {
        for (Dog dog : dogs) {
            if(dog.getName().equals(name)){
                dog.play(i);
            }
        }

    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> dogNames = new ArrayList<>();

        for (Dog dog : dogs) {
            if(dog.getHappiness()>minHappiness){
                dogNames.add(dog.name);
            }
        }
        return dogNames;
    }
}
