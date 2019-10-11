package proyectocine71;

/**
 *
 * @author utadmin
 */
public class Asiento {
    //Atributo
    private char letra;
    private int fila;
    private Espectador espectador;

    public Asiento(char letra, int fila) {
        this.letra = letra;
        this.fila = fila;
        this.espectador = null;//generar asientos vacios
    }
    //Metodos

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }
    
    //Verificar si el asiento esta ocupado
    public boolean ocupado(){
        return espectador != null;
    }

    @Override
    public String toString() {
        if(ocupado()){
            return "Asiento " + fila + letra + " y " 
                    + espectador;
        }
        return "Asiento " + fila + letra + " el asiendo esta vacio                   ";
    }
     
}
