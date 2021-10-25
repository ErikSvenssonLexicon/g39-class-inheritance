package se.lexicon.model;

import java.util.Objects;

public class Dog extends Animal{

    private int legs;
    private int tail;
    private int teeth;

    public Dog(String name, double weight, int legs, int tail, int teeth){
        super(name, weight);
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }



    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }


    @Override
    public void eat() {
        System.out.println(getName() + " chews on a bone");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", legs=" + legs +
                ", tail=" + tail +
                ", teeth=" + teeth +
                '}';
    }
}
