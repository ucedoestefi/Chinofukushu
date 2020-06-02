/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.items.armas;

import entidades.items.Item;

public class Armadura extends Item {
    
    private double defensa;

    public Armadura(String nombre) {
        super(nombre);
        this.defensa = 2;
    }

    public double getDefensa() {
        return defensa;
    }
    

}
