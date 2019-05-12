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
public abstract class Animal {
    /**
     * ID
     */
    private int id;
    
    /**
     * Name
     */
    private String name;
    
    /**
     * Genre
     */
    private Genre gen;
    
    /**
     * Age
     */
    private int age;

    /**
     * Constructor of Animal
     * 
     * @param id ID
     * @param name Name
     * @param gen Genre
     * @param age Age
     */
    public Animal(int id, String name, Genre gen, int age) {
        this.id = id;
        this.name = name;
        this.gen = gen;
        this.age = age;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gen
     */
    public Genre getGen() {
        return gen;
    }

    /**
     * @param gen the gen to set
     */
    public void setGen(Genre gen) {
        this.gen = gen;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}
