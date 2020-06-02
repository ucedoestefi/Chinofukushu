package sistemas;

import entidades.personajes.humanos.Ninja;
import entidades.personajes.humanos.Samurai;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import ifts16.pp.juego.utiles.Opcion;
import ifts16.pp.juego.utiles.Opciones;
import java.awt.Color;
import java.awt.EventQueue;

public class Juego {
    
    private IOBase ventana = null;
    private NivelJuego nivel;
    private Samurai enemigo;
    private Ninja lexa = null;
    private Fabrica repositorioObjetos = null;
    Color colorFondo = Color.YELLOW;
    Color colorLetra = Color.RED;

    
    public Juego() {
        ventana = new IOBase ();
    }
    
    private void configurarEntornoPantalla() {
        ventana.setTitle("ChinoFukushu");
        EventQueue.invokeLater(ventana);
    }
    
    private void configurarEntornoJuego() {
        //Se hace solamente la primer vez
        nivel = NivelJuego.OSHU;
        repositorioObjetos = new Fabrica();
        repositorioObjetos.crearPersonajePrincipal();
        repositorioObjetos.crearEnemigos();
    }

    public void cargarEscenario() {
        RepositorioPrincipal.eliminar("Lexa");
        repositorioObjetos.crearPersonajePrincipal();
        lexa = (Ninja)RepositorioPrincipal.traer("Lexa");
        
        if(nivel.equals(NivelJuego.OSHU)) {
            enemigo = (Samurai)RepositorioPrincipal.traer("Kirishima");
        }

        if(nivel.equals(NivelJuego.OSAKA)) {
            enemigo = (Samurai)RepositorioPrincipal.traer("Haru");
        }

        if(nivel.equals(NivelJuego.ECHIGO)) {
            enemigo = (Samurai)RepositorioPrincipal.traer("Azaide");
        }

        if(nivel.equals(NivelJuego.KAI)) {
            enemigo = (Samurai)RepositorioPrincipal.traer("Naraku");
        }

    }

    public void mostrarIntro() {
        if(nivel.equals(NivelJuego.OSHU)) {
          IOBase.mostrarTexto("***************************************************************************************************************************", colorLetra, colorFondo);
          IOBase.mostrarTexto("                                                                     Bienvenido a Oshu", colorLetra, colorFondo);
          IOBase.mostrarTexto("***************************************************************************************************************************", colorLetra, colorFondo);
          IOBase.mostrarTexto("Es la ciudad más grande e importante del lado "
                  + "del mar de Japón. Ha sido un importante puerto marítimo");
          IOBase.mostrarTexto("  ");
        }

        if(nivel.equals(NivelJuego.OSAKA)) {
          // mostrarIntroOsaka
          IOBase.mostrarTexto("***************************************************************************************************************************", colorLetra, colorFondo);
          IOBase.mostrarTexto("                                                                     Bienvenido a Osaka", colorLetra, colorFondo);
          IOBase.mostrarTexto("***************************************************************************************************************************", colorLetra, colorFondo);
          IOBase.mostrarTexto("Se encuentra ubicada en la principal isla del "
                  + "archipiélago, Honshū, en la desembocadura "
                  + "del río Yodo en la bahía de Osaka. La ciudad es uno de "
                  + "los puertos y centros industriales más importantes");
        }

        if(nivel.equals(NivelJuego.ECHIGO)) {
          IOBase.mostrarTexto("***************************************************************************************************************************", colorLetra, colorFondo);
          IOBase.mostrarTexto("                                                                     Bienvenido a Echigo", colorLetra, colorFondo);
          IOBase.mostrarTexto("***************************************************************************************************************************", colorLetra, colorFondo);
          IOBase.mostrarTexto("Es una zona donde hace frio todo el año y hay nieve, "
                  + "cerca de una zona pesquera");
        }

        if(nivel.equals(NivelJuego.KAI)) {
          //mostrarIntro = 
          IOBase.mostrarTexto("***************************************************************************************************************************", colorLetra, colorFondo);
          IOBase.mostrarTexto("                                                                     Bienvenido a Kai", colorLetra, colorFondo);
          IOBase.mostrarTexto("***************************************************************************************************************************", colorLetra, colorFondo);
          IOBase.mostrarTexto("Es una región sin salida al mar, la cual"
            + "incluye el monte Fuji cerca de la frontera con la " 
            + "prefectura de Shizuoka");
        }
    }
    
  /* 
    public void escenarioOsaka() {
        /*RepositorioPrincipal.traer("enemigo1");*/
    //}
    
 /*   public void crearPersonajePrincipal() {
    
        lexa = new Ninja("Lexa", 100);
        double fuerza = IOBase.ingresarNumero("Ingrese la fuerza");
        lexa.setFuerza(fuerza);
    }*/
    
    public boolean esAtaqueEspecial() {
        double res = Math.random();
        
        if(res > 0.7) {
            //Ataque exitoso
            return true;
        }
        //El ataque no fue exitoso
        return false;
    }

    public int pelear(Ninja lexa, Samurai enemigo) {
        boolean siguePelea = true;
        boolean esTurnoEnemigo = false;
        boolean pasarTurnoEnemigo = true;
        int resultado = 0;
        
        /*
            Mostrar mensaje de que ha comenzado la pelea entre Lexa y el enemigo
            
         */
        while(siguePelea) {
                IOBase.mostrarTexto("=======================================================");
                IOBase.mostrarTexto("VIDA LEXA: " + lexa.getVida() + " -- ENERGIA LEXA: " + lexa.getEnergia());
                IOBase.mostrarTexto("VIDA " +enemigo.getNombre() + ": " + enemigo.getVida() + " -- ENERGIA " + enemigo.getNombre() + ": " + enemigo.getEnergia());
                IOBase.mostrarTexto("=======================================================");

            //Si es el turno del personaje principal
            if(!esTurnoEnemigo) { 
                                
                /*IOBase.mostrarTexto("=======================================================");
                IOBase.mostrarTexto("Elija el ataque a realizar");
                IOBase.mostrarTexto("1 - Ataque Basico");
                IOBase.mostrarTexto("2 - Ataque especial");
                IOBase.mostrarTexto("=======================================================");*/
                do {
                    pasarTurnoEnemigo = true;
                            
                    Opcion opcion1 = new Opcion("000000001", "Ataque Basico");
                    Opcion opcion2 = new Opcion("000000002", "Ataque Especial");
                    Opcion opcion3 = new Opcion("000000003", "Pociones");
                    Opcion opcionElegida = null;

                    Opciones opcionesAtaque = new Opciones();
                    opcionesAtaque.agregar(opcion1);
                    opcionesAtaque.agregar(opcion2);
                    opcionesAtaque.agregar(opcion3);

                    opcionElegida = IOBase.elegirOpcion(opcionesAtaque);

                    //if(opcionElegida.getEntidadId().equals("000000001")) {
                    if(opcionElegida.getComando().equals("000000001")) {

                        //Chequeo si se puede realizar el ataque
                        if(lexa.getEnergia() - lexa.getEnergiaPerdidaAtaqueBasico() > 0) {
                            //Ataque Basico
                            double ataqueTotal = lexa.getAtaqueBasico() + lexa.getArmaPrincipal().getDa�oBasico();
                            double defensaTotalEnemigo = enemigo.getDefensaBasica() + enemigo.getArmadura().getDefensa();
                            double danioTotal = ataqueTotal - defensaTotalEnemigo;
                            double energiaPerdida = lexa.getEnergia() - lexa.getEnergiaPerdidaAtaqueBasico();

                            if(danioTotal < 0) {
                                danioTotal = 0;
                            }

                            if(energiaPerdida < 0) {
                                energiaPerdida = 0;
                            }

                            enemigo.setVida(enemigo.getVida() - danioTotal);

                            lexa.setEnergia(energiaPerdida);

                            IOBase.mostrarTexto("Lexa ha realizado el ataque: " + lexa.getNombreAtaqueBasico());
                            IOBase.mostrarTexto("Ataque Total: " + ataqueTotal);
                            IOBase.mostrarTexto("Defensa Total Enemigo: " + defensaTotalEnemigo);
                            IOBase.mostrarTexto(enemigo.getNombre() + " ha usado su escudo y el daño total fue de " + danioTotal);         
                        }
                    }
                    else  if (opcionElegida.getComando().equals("000000002")){

                        //Ataque Especial
                        if(lexa.getEnergia() - lexa.getEnergiaPerdidaAtaqueEspecial() > 0) {
                            double ataqueTotal = lexa.getAtaqueEspecial() + lexa.getArmaPrincipal().getDa�oEspecial();
                            double defensaTotalEnemigo = enemigo.getDefensaBasica()+ enemigo.getArmadura().getDefensa();
                            double danioTotal = ataqueTotal - defensaTotalEnemigo;
                            double energiaPerdida = lexa.getEnergia() - lexa.getEnergiaPerdidaAtaqueEspecial();

                            if(danioTotal < 0) {
                                danioTotal = 0;
                            }

                            if(energiaPerdida < 0) {
                                energiaPerdida = 0;
                            }

                            enemigo.setVida(enemigo.getVida() - danioTotal);

                            lexa.setEnergia(energiaPerdida);

                            IOBase.mostrarTexto("Lexa ha realizado el ataque: " + lexa.getNombreAtaqueEspecial());
                            IOBase.mostrarTexto("Ataque Total: " + ataqueTotal);
                            IOBase.mostrarTexto("Defensa Total Enemigo: " + defensaTotalEnemigo);
                            IOBase.mostrarTexto(enemigo.getNombre() + " ha usado su escudo y el daño total fue de " + danioTotal);
                        }
                    } else {
                        int cantidadPociones = 0;
                        int cantidadUltraPociones = 0;

                        for (int i = 0; i < lexa.getCantidadPociones(); i++) {
                            if(lexa.getPociones()[i] != null) {
                                if(lexa.getPociones()[i].getTipoPocion().equals("Pocion")) {
                                    cantidadPociones++;
                                } else {
                                    cantidadUltraPociones++;
                                }
                            }
                        }
                        if(cantidadPociones != 0 || cantidadUltraPociones != 0) {
                            IOBase.mostrarTexto("Pociones disponibles: ");
                            Opcion pocion = new Opcion("000000001", "Pocion: X" + cantidadPociones);
                            Opcion ultraPocion = new Opcion("000000002", "UltraPocion: X" + cantidadUltraPociones);
                            Opcion pocionElegida = null;

                            Opciones opcionesPocion = new Opciones();
                            opcionesPocion.agregar(pocion);
                            opcionesPocion.agregar(ultraPocion);

                            pocionElegida = IOBase.elegirOpcion(opcionesPocion);

                            if(pocionElegida.getComando().equals("000000001")){
                                if(cantidadPociones == 0) {
                                    IOBase.mostrarTexto("No hay pociones disponibles");
                                    pasarTurnoEnemigo = false;
                                } else {  
                                    lexa.usarPocion("Pocion");
                                }
                            } else {
                                if(cantidadUltraPociones == 0) {
                                    IOBase.mostrarTexto("No hay ultra pociones disponibles");
                                    pasarTurnoEnemigo = false;
                                } else {
                                    lexa.usarPocion("Ultra Pocion");
                                }
                            }
                        } else {
                            IOBase.mostrarTexto("No tiene pociones disponible");
                            pasarTurnoEnemigo = false;
                        } 
                    }

                } while(pasarTurnoEnemigo == false);
                
                esTurnoEnemigo = true;
            }
            else { //Turno del enemigo
               
                if(!esAtaqueEspecial()) {
                    if(enemigo.getEnergia() - enemigo.getEnergiaPerdidaAtaqueBasico() > 0) {
                        //Ataque Basico
                        double ataqueTotal = enemigo.getAtaqueBasico() + lexa.getArmaPrincipal().getDa�oBasico();
                        double defensaTotalEnemigo = lexa.getDefensaBasica() + lexa.getArmadura().getDefensa();
                        double danioTotal = ataqueTotal - defensaTotalEnemigo;
                        double energiaPerdida = lexa.getEnergia() - lexa.getEnergiaPerdidaAtaqueEspecial();

                        if(danioTotal < 0) {
                            danioTotal = 0;
                        }

                        if(energiaPerdida < 0) {
                            energiaPerdida = 0;
                        }

                        lexa.setVida(lexa.getVida() - danioTotal);


                        enemigo.setEnergia(energiaPerdida);
                        
                        IOBase.mostrarTexto(enemigo.getNombre() + " ha realizado el ataque: " + enemigo.getNombreAtaqueBasico());
                        IOBase.mostrarTexto("Ataque Total: " + ataqueTotal);
                        IOBase.mostrarTexto("Defensa Total Enemigo: " + defensaTotalEnemigo);
                        IOBase.mostrarTexto(lexa.getNombre() + " ha usado su escudo y el daño total fue de " + danioTotal);
                    }
                }
                else {
                    if(enemigo.getEnergia() - enemigo.getEnergiaPerdidaAtaqueEspecial() > 0) {
                        double ataqueTotal = enemigo.getAtaqueEspecial() + enemigo.getArmaPrincipal().getDa�oEspecial();
                        double defensaTotalEnemigo = lexa.getDefensaBasica()+ lexa.getArmadura().getDefensa();
                        double danioTotal = ataqueTotal - defensaTotalEnemigo;
                        double energiaPerdida = enemigo.getEnergia() - enemigo.getEnergiaPerdidaAtaqueEspecial();

                        if(danioTotal < 0) {
                            danioTotal = 0;
                        }

                        if(energiaPerdida < 0) {
                            energiaPerdida = 0;
                        }

                        lexa.setVida(lexa.getVida() - danioTotal);

                        enemigo.setEnergia(energiaPerdida);

                        IOBase.mostrarTexto(enemigo.getNombre() + " ha realizado el ataque: " + enemigo.getNombreAtaqueEspecial());
                        IOBase.mostrarTexto("Ataque Total: " + ataqueTotal);
                        IOBase.mostrarTexto("Defensa Total Enemigo: " + defensaTotalEnemigo);
                        IOBase.mostrarTexto(lexa.getNombre() + " ha usado su escudo y el daño total fue de " + danioTotal);
                    }
                }
                esTurnoEnemigo = false;
            }
                if(enemigo.getVida() <= 0) {
                    siguePelea = false;
                    resultado = 1; //Gano lexa
                }

                if(lexa.getVida() <= 0) {
                    siguePelea = false;
                    resultado = 0; //Perdio lexa
                }
        }
               
        //Devuelve resultado de la pelea
        return resultado;
    }
    
    public void cambiarNivel() {
        switch(nivel) {
            case OSHU: nivel = NivelJuego.OSAKA;
                       break;
            case OSAKA: nivel = NivelJuego.ECHIGO;
                        break;
            case ECHIGO: nivel = NivelJuego.KAI;
                        break;
        }
    }
    
    public void mostrarMensajeVictoria() {
        if(nivel.equals(NivelJuego.OSHU)) {
            IOBase.mostrarTexto("***********************************");
            IOBase.mostrarTexto("Has derrotado a Kirishima");
            IOBase.mostrarTexto("***********************************");
            IOBase.mostrarTexto("  ");
            IOBase.mostrarTexto("  ");
            
        }

        if(nivel.equals(NivelJuego.OSAKA)) {
            IOBase.mostrarTexto("***********************************");
            IOBase.mostrarTexto("Has derrotado a Haru");
            IOBase.mostrarTexto("***********************************");
            IOBase.mostrarTexto("  ");
            IOBase.mostrarTexto("  "); 
        }

        if(nivel.equals(NivelJuego.ECHIGO)) {
            IOBase.mostrarTexto("***********************************");
            IOBase.mostrarTexto("Has derrotado a Azaide");
            IOBase.mostrarTexto("***********************************");
            IOBase.mostrarTexto("  ");
            IOBase.mostrarTexto("  ");
        }

        if(nivel.equals(NivelJuego.KAI)) {
            IOBase.mostrarTexto("***********************************");
            IOBase.mostrarTexto("Has derrotado a Naraku");
            IOBase.mostrarTexto("***********************************");
        }
         IOBase.mostrarTexto("  ");
         IOBase.mostrarTexto("  ");
    }
    
    
    
    public void ejecutar() {
        //Configurar Ventana
        this.configurarEntornoPantalla();
        this.configurarEntornoJuego();
        //resultado de la pelea
        int res = 0;
        //guarda si el juego sigue
        int seguirIterando = 1;
      
        
        do {
            this.cargarEscenario();
            //Mostrar texto inicio
            this.mostrarIntro();
            res = this.pelear(lexa, enemigo);
            //Si gano la pelea
            if(res == 1) {
                //Agregar Metodo que dependiendo del nivel muestre
                //un mensaje de victoria
                mostrarMensajeVictoria();
                
                if(nivel == NivelJuego.KAI) {
                    seguirIterando = 0;
                }
                else {
                    cambiarNivel(); 
                }
            } 
            else {
                seguirIterando = 0;
            }
        } while(seguirIterando == 1);
    
        //
        if(res == 1) {
            //Mostrar mensaje Ganaste el juego
            IOBase.mostrarTexto("Has ganado el juego");
        } else {
            //Mostrar mensaje perdiste el juego
            IOBase.mostrarTexto("Has perdido el juego");
        }
    String nombre = IOBase.ingresarTexto("Ingrese la opcion que desea");
    Integer opc = IOBase.ingresarEntero("Ingrese su opcion");
    
    switch(opc){
        //case opc: //codigo
          //          break;
    }
    IOBase.mostrarTexto("su nombre es " + nombre);
   // fabrica.crearLugares();
    }
}

