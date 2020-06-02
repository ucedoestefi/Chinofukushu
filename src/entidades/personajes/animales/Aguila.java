/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.personajes.animales;

public class Aguila extends Animal {

    public Aguila(String nombre, double vida) {
        super(nombre, vida);
        super.habilidad = "Apresar";
    }
    
    public Aguila(String nombre, double vida, double ataqueBasico) {
        super(nombre, vida);
        super.habilidad = "Apresar";
        this.ataqueBasico = ataqueBasico;
    }
}
    
