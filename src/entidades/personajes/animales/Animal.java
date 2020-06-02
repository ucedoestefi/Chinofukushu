/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.personajes.animales;

import entidades.personajes.Personaje;

public class Animal extends Personaje {
    
    protected String habilidad;
    
    public Animal(String nombre, double vida) {
        super(nombre, vida);
    }
    
    public boolean realizarHabilidad() {
        double res = Math.random();
        if(res > 0.4) {
            //Ataque exitoso
            return true;
        }
        //El ataque no fue exitoso
        return false;
    }
    
    public String getHabilidad() {
        return habilidad;
    }
}
