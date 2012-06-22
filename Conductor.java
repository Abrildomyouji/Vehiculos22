/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intefaz;

import javax.swing.JOptionPane;

/**
 *
 * @author 666-MAGH-666
 */
public class Conductor implements Persona{

    private String nombre;
    private boolean isinvehiculo;
    private Vehiculo vehiculo;
    
    public Conductor(String n){
        this.nombre=n;
        this.isinvehiculo=false;
    }
    @Override
    public boolean subirVehiculo(Vehiculo v) {
//        throw new UnsupportedOperationException("Not supported yet.");
        boolean r=false;
        if(this.isinvehiculo=false)
        {
            this.isinvehiculo=true;
            this.vehiculo=v;
            r=true;
        }
        return r;
    }

    @Override
    public boolean isConductor() {
        return true;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean isInVehiculo() {
        return this.isinvehiculo;
    }

    @Override
    public boolean bajarVehiculo() {
        this.isinvehiculo=false;
        return true;
    }

    @Override
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }
    
    public void conducir(){
        String r="No tengo vehiculo que conducir";
        if(this.isInVehiculo())
        {
            r="Look at me, i´m driving"+vehiculo.getNombre();
        }
        JOptionPane.showMessageDialog(null, r);
    }
    
}
