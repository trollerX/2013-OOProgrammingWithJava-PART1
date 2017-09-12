/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Karma
 */
public class BirdsDatabase {

    ArrayList<Bird> birds;

    public BirdsDatabase() {
        this.birds = new ArrayList<Bird>();
    }

    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public void observed(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

    public void printDatabase() {
        for (Bird bird : birds) {
            System.out.println(bird);
//            bird.toString();
        }
    }
    
    public void show(String name){
        for(Bird bird : birds){
            if(bird.getName().equals(name)){
                System.out.println(bird);
            }
        }
    }
}
