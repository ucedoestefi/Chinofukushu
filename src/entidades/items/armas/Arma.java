/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.items.armas;

import entidades.items.Item;

public class Arma extends Item {
    
    private double da�oBasico;
    private double da�oEspecial;

    public Arma(String nombre, double da�oBasico, double da�oEspecial) {
        super(nombre);
        this.da�oBasico = da�oBasico;
        this.da�oEspecial = da�oEspecial;
    }
    
    public double getDa�oBasico() {
        return da�oBasico;
    }

    public double getDa�oEspecial() {
        return da�oEspecial;
    }
    
}
