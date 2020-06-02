package entidades.personajes.humanos;

import entidades.items.armas.Arma;
import entidades.items.armas.Armadura;
import entidades.items.pociones.Pocion;
import entidades.personajes.Personaje;
import entidades.personajes.animales.Animal;

class Humano extends Personaje {
    
    public String nombreAtaqueBasico;
    public String nombreAtaqueEspecial;
    private Animal mascota;
    private Arma armaPrincipal;
    private Armadura armadura;
    private Pocion[] pocion;
    
    private double maximoVida;
    
    public Humano(String nombre, double vida) {
        super(nombre, vida);
        mascota = null;
        pocion = new Pocion[2];
        maximoVida = vida;
    }
    
    public boolean realizarAtaqueBasico() {
        double res = Math.random();
        
        if(res > 0.4) {
            //Ataque exitoso
            return true;
        }
        //El ataque no fue exitoso
        return false;
    }
    
    public boolean realizarAtaqueEspecial() {
        double res = Math.random();
        
        if(res > 0.6) {
            //Ataque exitoso
            return true;
        }
        //El ataque no fue exitoso
        return false;
    }
    
    public void usarPocion(String tipoPocion) {
        //TODO
        for (int i = 0; i < this.getCantidadPociones(); i++) {
            if(this.getPociones()[i] != null && this.getPociones()[i].getTipoPocion().equals(tipoPocion)) {
                double cantidadVidaRecuperada = this.getPociones()[i].getCantidadRecupero() + this.getVida();
                if(cantidadVidaRecuperada > this.getMaximoVida()){
                    this.setVida(this.getMaximoVida());
                }else {
                    this.setVida(cantidadVidaRecuperada);
                }
                    
                this.getPociones()[i] = null;
                i = this.getCantidadPociones() + 1;    
            } 
        }
    }
    
    public void setPocion(Pocion[] pociones) {
        this.pocion = pociones;
    }
    
    public Arma getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(Arma armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }
 
    public void setMascota(Animal mascota) {
        this.mascota = mascota;
    }
    
    public String getNombreAtaqueBasico() {
        return this.nombreAtaqueBasico;
    }
    
    public String getNombreAtaqueEspecial() {
        return this.nombreAtaqueEspecial;
    }
    
    public int getCantidadPociones() {
        return this.pocion.length;
    }
    
    public Pocion[] getPociones() {
        return this.pocion;
    }
    
    public double getMaximoVida() {
        return this.maximoVida;
    }
}
