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
public enum Genre {M,F;

    /**
     * Transforms genre to String
     * 
     * @param g Genre
     * @return String fo genre
     */
    public String GenreToString(Genre g){
        switch(g){
            case M: return "Masculino";
            case F: return "Feminino";
            default: return "Inválido";
        }
    }
    
}
