/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intefaz;

/**
 *
 * @author 666-MAGH-666
 */
public interface Persona {
 public boolean subirVehiculo(Vehiculo v);
 public boolean isConductor();
 public String getNombre();
 public boolean isInVehiculo();
 public boolean bajarVehiculo();
 public Vehiculo getVehiculo();
}
