/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.items.pociones;

import entidades.items.Item;

public class Pocion extends Item {
    
    private String tipoPocion;
    private double cantidadRecupero;
    
    public Pocion(String nombre, String tipoPocion) {
        super(nombre);
        this.tipoPocion = tipoPocion;
    }
    
    public double getCantidadRecupero() {
        if(tipoPocion.equals("Pocion")) {
            return 50;
        }
        //Ultra Pocion
        return 100;
    }
    public String getTipoPocion() {
        return this.tipoPocion;
    }
    
}
