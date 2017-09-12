/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karma
 */
public class Bird {

    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public Bird(String name) {
        this(name, null);
    }

    public void addLatinName(String name) {
        latinName = name;
    }

    public void addObservation() {
        observations++;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "(" + latinName + "): " + observations + " observations";
    }

}
