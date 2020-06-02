/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.items.armas;

import entidades.items.Item;

public class Arma extends Item {
    
    private double dañoBasico;
    private double dañoEspecial;

    public Arma(String nombre, double dañoBasico, double dañoEspecial) {
        super(nombre);
        this.dañoBasico = dañoBasico;
        this.dañoEspecial = dañoEspecial;
    }
    
    public double getDañoBasico() {
        return dañoBasico;
    }

    public double getDañoEspecial() {
        return dañoEspecial;
    }
    
}
