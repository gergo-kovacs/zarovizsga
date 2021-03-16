package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog{

    public Husky(String name) {
        super(name);
    }

    @Override
    public void feed() {
        super.happines +=4;
    }

    @Override
    public void play(int hours) {
        super.happines+=hours*3;
    }

    public int getHappiness() {
        return super.happines;
    }
}

