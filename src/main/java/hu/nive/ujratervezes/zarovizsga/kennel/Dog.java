package hu.nive.ujratervezes.zarovizsga.kennel;

public abstract class Dog {

    protected String name;
    protected int happines =0;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happines;
    }

    public abstract void feed();

    public abstract void play(int hours);



}
