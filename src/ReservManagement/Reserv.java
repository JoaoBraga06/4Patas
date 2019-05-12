/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReservManagement;
import Enums.*;
import Animals.*;

/**
 *
 * @author joaop
 */
public class Reserv {
    /**
     * Animal
     */
    private Animal animal;
    
    /**
     * Services
     */
    private Services services[];
    
    /**
     * Date
     */
    private Date date;
    
    /**
     * Status
     */
    private ReservStatus status;

    /**
     * Constructor of Reserv
     * 
     * @param animal Animal
     * @param services Services
     * @param date Date
     */
    public Reserv(Animal animal, Services services[], Date date) {
        this.animal = animal;
        this.services = services;
        this.date = date;
        this.status=ReservStatus.A;
    }

    /**
     * @return the animal
     */
    public Animal getAnimal() {
        return animal;
    }

    /**
     * @param animal the animal to set
     */
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    /**
     * @return the services
     */
    public Services[] getServices() {
        return services;
    }

    /**
     * @param services the services to set
     */
    public void setServices(Services services[]) {
        this.services = services;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the status
     */
    public ReservStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(ReservStatus status) {
        this.status = status;
    }
    
    
    
}
