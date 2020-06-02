/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.items.armas.espadas;

import entidades.items.armas.Arma;

public class Espada extends Arma {
    
    private static final double DA�O_BASICO_ESPADA = 10;
    private static final double DA�O_ESPECIAL_ESPADA = 20;
    
    public Espada(String nombre) {
        super(nombre, DA�O_BASICO_ESPADA, DA�O_ESPECIAL_ESPADA);
    }
    
}
