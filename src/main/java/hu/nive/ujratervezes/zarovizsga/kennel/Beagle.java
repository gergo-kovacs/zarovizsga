package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog{

    public Beagle(String name) {
        super(name);
    }

    @Override
    public void feed() {
    super.happines+=2;
    }

    @Override
    public void play(int hours) {
        super.happines+=hours*2;
    }


    public int getHappiness() {
        return super.happines;
    }
}
