package entidades.personajes.humanos;

public class Samurai extends Humano {
   
    private static final double ATAQUE_BASICO = 20;
    private static final double ATAQUE_ESPECIAL = 30;
    private static final double DEFENSA_BASICA = 1;
    private static final double ENERGIA = 120;
    private static final double ENERGIA_PERDIDA_ATAQUE_BASICO = 10;
    private static final double ENERGIA_PERDIDA_ATAQUE_ESPECIAL = 15;
  


    public Samurai(String nombre, double vida) {
        super(nombre, vida);
        
        super.ataqueBasico = ATAQUE_BASICO;
        super.ataqueEspecial = ATAQUE_ESPECIAL;
        super.defensaBasica = DEFENSA_BASICA;
        super.energia = ENERGIA;
        super.energiaPerdidaAtaqueBasico = ENERGIA_PERDIDA_ATAQUE_BASICO;
        super.energiaPerdidaAtaqueEspecial = ENERGIA_PERDIDA_ATAQUE_ESPECIAL;

        
        super.nombreAtaqueBasico = "Pecado de Ziusudra";
        super.nombreAtaqueEspecial = "Susano-o"
               ;

    }

}

