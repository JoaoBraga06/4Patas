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
public enum Services {Passeio,Alojamento,Tranporte,Banho,Tosquia,Sessao;

    /**
     * Transforms service to String
     * 
     * @param s Service
     * @return String fo service
     */
    public String ServicesToString(Services s){
        switch(s){
            case Passeio: return "Passeio";
            case Alojamento: return "Alojamento";
            case Tranporte: return "Transporte";
            case Banho: return "Banho";
            case Tosquia: return "Tosquia";
            case Sessao: return "Sessão fotográfica";
            default: return "Inválido";
        }
    }
    
}
