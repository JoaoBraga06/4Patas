/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReservManagement;

import Enums.*;
import containerofobjectsapi.ContainerOfObjects;

/**
 *
 * @author joaop
 */
public class ReservManagement extends containerofobjectsapi.ContainerOfObjects{
    /**
     * Container of Reservs
     */
    private containerofobjectsapi.ContainerOfObjects container;

    /**
     * Constructor of Reserva Management by objects
     * 
     * @param objects Objects
     */
    public ReservManagement(Object[] objects) {
        super(objects);
    }

    /**
     * Constructor of Reserva Management by max size
     * 
     * @param max_value Max size
     */
    public ReservManagement(int max_value) {
        super(max_value);
    }
    
    /**
     * Constructor of Reserv Management by default
     */
    public ReservManagement(){
        super();
    }

    /**
     * Add Reserv to array
     * 
     * @param reserv Reserv
     * @return Sucess
     */
    public boolean addReserv(Reserv reserv){
        int i=0;
        Object reserv_tmp = (Object) reserv;
        while(i<this.Size()){
            if(this.getObjects()[i].equals(reserv_tmp)){
                System.out.println("A reserva já existe." + '\n');
                return false;
            }
            i++;
        }
        if(i==this.getObjects().length){
            System.out.println("Reserva não adicionada.");
            return false;
        }
        else{
            this.AddObject(reserv);
            System.out.println("Reserva adicionada");
            return true;
        }
    }
    
    /**
     * Validates the reserv
     * 
     * @param reserv Reserv
     * @return Sucess
     */
    public boolean validateReserv(Reserv reserv){
        Object reserv_tmp = (Object) reserv;
        if(this.searchObject(reserv_tmp)){
            reserv.setStatus(ReservStatus.C);
            System.out.println("Reserva concluída." + '\n');
            return true;
        }
        else{
            System.out.println("Reserva não encontrada." + '\n');
            return false;
        }
    }
    
    /**
     * Finds the object in the array
     * 
     * @param obj Object
     * @return Sucess
     */
    private boolean searchObject(Object obj){
        int i=0;
        while(i<this.Size() && this.getObjects()[i]!=obj){
            i++;
        }
        if(this.getObjects()[i]==obj){
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Shows the open reservs
     * 
     * @param d Date
     */
    public void reservsOpen(Date d){
        for(int i=0;i<this.Size();i++){
            Reserv reserv_tmp = (Reserv) this.getObjects()[i];
            if(reserv_tmp.getDate().equals(d)){
                if(reserv_tmp.getStatus()==ReservStatus.A){
                    System.out.println("-----Reserva nº"+(i+1)+"-----");
                    System.out.println("ID: " + reserv_tmp.getAnimal().getId());
                    System.out.println("Nome: " + reserv_tmp.getAnimal().getName());
                    System.out.println("Idade: " + reserv_tmp.getAnimal().getAge());
                    System.out.println("Género: " + reserv_tmp.getAnimal().getGen()+'\n');
                }
            }
        }
    }
}
