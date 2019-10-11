
package proyectocine71;

import java.util.Set;

/**
 *
 * @author utadmin
 */
public class Cine {
    
    private Asiento asientos[][];
    private Pelicula pelicula;
    private double precio;
    
    //Contructor

    public Cine(int filas,int columnas, Pelicula pelicula, double precio) {
        asientos = new Asiento[filas][columnas];
        this.pelicula = pelicula;
        this.precio = precio;
        rellenaButacas();
    }
    //Metodos

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    private void rellenaButacas(){
        int fila = asientos.length;
        for(int i = 0; i < asientos.length; i++){
            for(int j = 0; j < asientos[0].length; j++){
                asientos[i][j] = new Asiento((char)('A' + j), fila);
            }
            fila--;
        }
    }
    
    //genar si hay o no asientos ocupados
    public boolean hayAsiento(){
        for(int i = 0; i < asientos.length; i++){
            for(int j = 0; j < asientos[0].length; j++){
                if(!asientos[i][j].ocupado()){
                    return true;
                }
            }
        }
        return false;
    }
    
    //Vericar si esta disponible
    public boolean hayButacaDisponible(int fila, char letra){
        return getAsiento(fila, letra).ocupado();
    }
    //Metodo asientos
    public Asiento getAsiento(int fila, char letra){
        return asientos[asientos.length - fila - 1][letra - 'A'];
    }
    //Verificar si el usuario cumple los requisitos minimos
    public boolean sePuedeSentar(Espectador e){
        return e.tieneDinero(precio) && e.tieneEdad(pelicula.getEdadMinima());
    }
    
    //Sentar al espectador
    public void sentar(int fila, char letra, Espectador e){
        getAsiento(fila, letra).setEspectador(e); 
    }
    //Numero de filas de nuestro cine
    public int getFilas(){
        return asientos.length;
    }
    //Numero de columnas de nuestro cine
    public int getColumnas(){
        return asientos[0].length;
    }
    
    //Mostrar la información del cine
    public void mostrar(){
        System.out.println("Información del cine");
        System.out.println("Pelicula reproducida: " + pelicula);
        System.out.println("Precio de la entrada: " + precio + "\n");
        
        for(int i = 0; i < asientos.length; i++){
            for(int j = 0; j < asientos[0].length; j++){
                System.out.println(asientos[i][j]);
            }
            System.out.println("");
        }         
    }
}
