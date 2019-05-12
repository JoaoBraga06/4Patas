/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;
import Enums.*;
import Animals.*;
import ReservManagement.*;

/**
 *
 * @author joaop
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Animals
        Dog d = new Dog(DogSize.M,170,"Rex",Genre.M,5);
        
        //Services
        Services serv[] = {Services.Alojamento,Services.Passeio};
        
        //Date
        Date dat = new Date(12, 5, 2019);
        
        //Reservs
        Reserv r = new Reserv(d, serv, dat);
        Reserv re = new Reserv(d,serv,dat);
        
        //Reserv Management
        ReservManagement reservs = new ReservManagement(4);

        reservs.addReserv(r);
        reservs.addReserv(re);
        reservs.validateReserv(r);
        reservs.reservsOpen(dat);
    }
    
}
