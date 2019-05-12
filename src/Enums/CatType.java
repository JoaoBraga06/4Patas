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
public enum CatType {I,E;

    /**
     * Transforms cat type to string
     * 
     * @param type Cat Type
     * @return String of cat type
     */
    public String CatTypeToString(CatType type){
        switch(type){
            case I: return "Interior";
            case E: return "Exterior";
            default: return "Inválido";
        }
    }
    
}
