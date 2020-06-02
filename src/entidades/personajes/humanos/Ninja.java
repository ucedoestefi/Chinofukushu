package entidades.personajes.humanos;

public class Ninja extends Humano {
    
    private static final double ATAQUE_BASICO = 50;
    private static final double ATAQUE_ESPECIAL = 70;
    private static final double DEFENSA_BASICA = 10;
    private static final double ENERGIA = 150;
    private static final double ENERGIA_PERDIDA_ATAQUE_BASICO = 15;
    private static final double ENERGIA_PERDIDA_ATAQUE_ESPECIAL = 20;

    public Ninja(String nombre, double vida) {
        super(nombre, vida);
        
        super.ataqueBasico = ATAQUE_BASICO;
        super.ataqueEspecial = ATAQUE_ESPECIAL;
        super.defensaBasica = DEFENSA_BASICA;
        super.energiaPerdidaAtaqueBasico = ENERGIA_PERDIDA_ATAQUE_BASICO;
        super.energiaPerdidaAtaqueEspecial = ENERGIA_PERDIDA_ATAQUE_ESPECIAL;
        super.energia = ENERGIA;
        
        super.nombreAtaqueBasico = "Girtablulu";
        super.nombreAtaqueEspecial = "Vuelo del fenix";
    }
}

