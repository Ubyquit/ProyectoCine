package proyectocine71;

/**
 *
 * @author utadmin
 */
public class Metodos {

    public static final String nombres[] = {"Fernanda", "Alejandro", "profe", "Marcos", "Goku"};

    public static int generadorAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }
    
    public static int generadorAleatorios(int minimo, int maximo){
        int num = (int)(Math.random() * (minimo - (maximo + 1))+(maximo + 1));
        return num;
    }
}
