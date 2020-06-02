package sistemas;

import entidades.items.armas.Armadura;
import entidades.items.armas.espadas.Espada;
import entidades.items.pociones.Pocion;
import entidades.personajes.humanos.Ninja;
import entidades.personajes.humanos.Samurai;
import ifts16.pp.juego.sistemas.FabricaPrincipal;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;

/**
 *
 * @author IFTS16
 */
public class Fabrica extends FabricaPrincipal{
      
    public static void crearPersonajePrincipal() {
        Ninja personajePrincipal = new Ninja("Lexa", 300);
        
        Espada espadaPrincipal = new Espada("Masamune");
        Armadura armaduraPrincipal = new Armadura("Shukimura");
        Pocion pociones[] = { new Pocion("Ultra Pocion Ninja", "Ultra Pocion"), new Pocion("Pocion Ninja", "Pocion"), new Pocion("Ultra Pocion Ninja", "Ultra Pocion") };
        
        
        personajePrincipal.setArmaPrincipal(espadaPrincipal);
        personajePrincipal.setArmadura(armaduraPrincipal);
        personajePrincipal.setPocion(pociones);
        
        RepositorioPrincipal.agregar(personajePrincipal, "Lexa");
    }
    
    public static void crearEnemigos() {
        Samurai enemigo = new Samurai("Kirishima", 350);
        Samurai enemigo2 = new Samurai("Haru", 350);
        Samurai enemigo3 = new Samurai("Azaide", 350);
        Samurai enemigo4 = new Samurai("Naraku", 400);

        Pocion pocion = new Pocion("Pocion", "Pocion");
        Pocion ultraPocion = new Pocion("Ultra Pocion", "Ultra Pocion");
        
        //primer enemigo kirishima
        Espada espadaPrincipal1 = new Espada("Kack");
        Armadura armaduraPrincipal1 = new Armadura("Bambu");
        
        Pocion[] pociones = new Pocion[1];
        pociones[0] = pocion;
        
        enemigo.setArmaPrincipal(espadaPrincipal1);
        enemigo.setArmadura(armaduraPrincipal1);
        enemigo.setPocion(pociones);
        
        //segundo enemigo haru
        Espada espadaPrincipal2 = new Espada("Shingen");
        Armadura armaduraPrincipal2 = new Armadura("tigre");
        
        Pocion[] pocionesEnemigo2 = new Pocion[2];
        pocionesEnemigo2[0] = pocion;
        pocionesEnemigo2[1] = ultraPocion;
       
        enemigo2.setArmaPrincipal(espadaPrincipal2);
        enemigo2.setArmadura(armaduraPrincipal2);
        enemigo2.setPocion(pocionesEnemigo2);
        
        //tercer enemigo azaide 
        Espada espadaPrincipal3 = new Espada("koyuro");
        Armadura armaduraPrincipal3 = new Armadura("rayo");
        
        Pocion[] pocionesEnemigo3 = new Pocion[3];
        pocionesEnemigo3[0] = pocion;
        pocionesEnemigo3[1] = pocion;
        pocionesEnemigo3[2] = ultraPocion;
        
        enemigo3.setArmaPrincipal(espadaPrincipal3);
        enemigo3.setArmadura(armaduraPrincipal3);
        enemigo3.setPocion(pocionesEnemigo3);
        
        //cuarto enemigo naraku
        Espada espadaPrincipal4 = new Espada("Masamune");
        Armadura armaduraPrincipal4 = new Armadura("Dragon");
        
        Pocion[] pocionesEnemigo4 = new Pocion[4];
        pocionesEnemigo4[0] = pocion;
        pocionesEnemigo4[1] = pocion;
        pocionesEnemigo4[2] = ultraPocion;
        pocionesEnemigo4[3] = ultraPocion;
        
        enemigo4.setArmaPrincipal(espadaPrincipal4);
        enemigo4.setArmadura(armaduraPrincipal4);
        enemigo4.setPocion(pocionesEnemigo4);
        
        RepositorioPrincipal.agregar(enemigo, "Kirishima");
        RepositorioPrincipal.agregar(enemigo2, "Haru");
        RepositorioPrincipal.agregar(enemigo3, "Azaide");
        RepositorioPrincipal.agregar(enemigo4, "Naraku");
    }
}
    

