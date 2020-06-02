/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.personajes.animales;

public class Serpiente extends Animal {
    
    public Serpiente(String nombre, double vida) {
        super(nombre, vida);
        super.habilidad = "Paralizar";

    }
    
    public Serpiente(String nombre, double vida, double ataqueBasico) {
        super(nombre, vida);
        super.ataqueBasico = ataqueBasico;
        super.habilidad = "Paralizar";
    }



}
