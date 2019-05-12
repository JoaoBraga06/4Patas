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
public class Cat extends Animal{
    /**
     * Cat Type
     */
    private CatType type;

    /**
     * Constructor of cat
     * 
     * @param type Type
     * @param id ID
     * @param name Name
     * @param gen Genre
     * @param age Age
     */
    public Cat(CatType type, int id, String name, Genre gen, int age) {
        super(id, name, gen, age);
        this.type = type;
    }

    /**
     * @return the type
     */
    public CatType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(CatType type) {
        this.type = type;
    } 
}
