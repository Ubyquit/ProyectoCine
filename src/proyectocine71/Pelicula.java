
package proyectocine71;

/**
 *
 * @author utadmin
 */
public class Pelicula {
    //Atributos
    private String titulo, director;
    private int duracion, edadMinima;
    //Contructor
    public Pelicula(String titulo, String director, int duracion, int edadMinima) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }

    //Metodos
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return " La pelicula es: " + titulo 
                + " el director: " + director 
                + " la pelicula dura: " + duracion 
                + " la edad minima: " + edadMinima;
    }
    
    
    
}
