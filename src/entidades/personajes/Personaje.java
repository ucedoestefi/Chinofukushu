package entidades.personajes;

import ifts16.pp.juego.componentes.Referencia;
import ifts16.pp.juego.entidades.Entidad;

public class Personaje extends Entidad {
    
    protected String nombre;
    protected double vida;
    protected double ataqueBasico;
    protected double ataqueEspecial;
    protected double defensaBasica;
    protected double energia;
    protected double energiaPerdidaAtaqueBasico;
    protected double energiaPerdidaAtaqueEspecial;
 
    public Personaje(String nombre, double vida) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataqueBasico = 0;
        this.ataqueEspecial = 0;
        this.defensaBasica = 0;
        this.energia = 0;
    }
    
    public Personaje(String nombre, double vida, double ataqueBasico) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataqueBasico = ataqueBasico;
        this.ataqueEspecial = 0;
        this.defensaBasica = 0;
        this.energia = 0;
    }
    
    public void setEnergia(double energia) {
        this.energia = energia;
    }
    
    public void setVida(double vida) {
        this.vida = vida;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getVida() {
        return vida;
    }

    public double getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public double getDefensaBasica() {
        return defensaBasica;
    }

    public double getEnergia() {
        return energia;
    }
    
    public double getAtaqueBasico() {
        return ataqueBasico;
    }
    
    public double getEnergiaPerdidaAtaqueBasico() {
        return energiaPerdidaAtaqueBasico;
    }

    public double getEnergiaPerdidaAtaqueEspecial() {
        return energiaPerdidaAtaqueEspecial;
    }

    @Override
    public Referencia referencia(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Referencia referencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

