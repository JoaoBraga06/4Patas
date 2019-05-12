/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;
import Enums.*;

/**
 *
 * @author joaop
 */
public class Dog extends Animal{
    
    /**
     * Dog Size
     */
    private DogSize size;

    /**
     * Constructor of Dog
     * 
     * @param size Size
     * @param id ID
     * @param name Name
     * @param gen Genre
     * @param age Age
     */
    public Dog(DogSize size, int id, String name, Genre gen, int age) {
        super(id, name, gen, age);
        this.size = size;
    }

    /**
     * @return the size
     */
    public DogSize getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(DogSize size) {
        this.size = size;
    }
}
