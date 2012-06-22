/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intefaz;

/**
 *
 * @author Memoeslink
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo carro = new Vehiculo();
        carro.setNombre("Mini Cooper");
        carro.setllantas(4);
        carro.setCapacidad(4);
        carro.setCinturones(true);
        carro.mensaje();
        carro.abrocharCinturones();
        Conductor Juan = new Conductor("Juan");
        Juan.conducir();
        Juan.isInVehiculo();
        
        Vehiculo camioneta = new Vehiculo();
        camioneta.setNombre("Lobo Raptor");
        camioneta.setllantas(4);
        camioneta.setCapacidad(8);
        camioneta.setCinturones(true);
        camioneta.mensaje();
        camioneta.abrocharCinturones();
        
        Vehiculo autobus = new Vehiculo();
        autobus.setNombre("CapaCity");
        autobus.setllantas(4);
        autobus.setCapacidad(50);
        autobus.setCinturones(true);
        autobus.mensaje();
        autobus.abrocharCinturones();
        
        Vehiculo moto = new Vehiculo("Yamaha", 2, 2, false, false);
        moto.mensaje();
        moto.abrocharCinturones();
    }
}
