/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intefaz;

/**
 *
 * @author 666-MAGH-666
 */
public class Pasajero implements Persona{
    
    private String nombre;
    public Pasajero(String n){
        this.nombre=n;
    }

    @Override
    public boolean subirVehiculo(Vehiculo v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isConductor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isInVehiculo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean bajarVehiculo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Vehiculo getVehiculo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
