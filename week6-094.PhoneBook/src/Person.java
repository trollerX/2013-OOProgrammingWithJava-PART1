/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karma
 */
public class Person {
    private String name;
    private String number;

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
    
    public Person(String name, String number){
        this.name = name;
        this.number = number;
    }
    
    public void changeNumber(String number){
        number = number;
    }

    @Override
    public String toString() {
        return getName() + "  number: " + getNumber();
    }
    
}

