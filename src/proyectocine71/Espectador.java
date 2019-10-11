package proyectocine71;

/**
 *
 * @author utadmin
 */
public class Espectador {
    
    //Atributos
    private String nombre;
    private int edad;
    private double dinero;
     //Contructor
    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }
        
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    //Saber si tienes dinero
    public boolean tieneDinero(double precioEntrada){
        return dinero >= precioEntrada;
    } 
    
    //pagar
    public void pagar(double precio){
        dinero -= precio;
    }
    
    //Verificar la edad del usuario
    public boolean tieneEdad(int edadMinima){
        return edad >= edadMinima;
    }

    @Override
    public String toString() {
        return "Nombre del Expectador: " + nombre 
                + " su edad es: " + edad 
                + " le sobra" + dinero;
    }
    
    
    
}
