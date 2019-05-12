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
public enum ReservStatus {A,C;

    /**
     * Transforms ReservStatus to string
     * 
     * @param status Status
     * @return String of status
     */
    public String ReservStatusToString(ReservStatus status){
        switch(status){
            case A: return "Aberta";
            case C: return "Concluída";
            default: return "Inválido";
        }
    }
    
}
