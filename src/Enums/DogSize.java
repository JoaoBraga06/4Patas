/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author joaop
 */
public enum DogSize {P,M,G;

    /**
     * Transforms dog size to string
     * 
     * @param dz Dog Size
     * @return String of Dog Size
     */
    public String DogSizeToString(DogSize dz){
        switch(dz){
            case P: return "Pequeno";
            case M: return "Médio";
            case G: return "Grande";
            default: return "Inválido";
        }
    } 
    
}
