
package proyectocine71;

import java.util.Scanner;

public class ProyectoCine71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        //Variables
        int filas, columnas, numEspectadores;
        double precio;
        // Crear peliculas
        Pelicula pelicula = new Pelicula("El Bromas","Todd Phillips", 120, 18);
        //Objeto Scanner
        Scanner insertar = new Scanner(System.in);
        //Solicitar datos para el cine
        System.out.println("Numero de filas");
        filas = insertar.nextInt();
        System.out.println("Numero de columnas");
        columnas = insertar.nextInt();
        System.out.println("Costo de la entrada");
        precio = insertar.nextDouble();
        //Crear un objeto cine
        Cine cine = new Cine(filas, columnas, pelicula, precio);
        //Solicitar cantidad del espectadores
        System.out.println("Ingresa el numero de Espectadores");
        numEspectadores = insertar.nextInt();
        
        //Variables y obejetos a utilizar
        Espectador e;
        int fila;
        char letra;
        System.out.println("Espectadores generados");
        
        for(int i = 0; i < numEspectadores && cine.hayAsiento(); i++){
            
            e = new Espectador(
                    Metodos.nombres[Metodos.generadorAleatorio(0, Metodos.nombres.length - 1)],
                    Metodos.generadorAleatorio(10, 100),//Edad
                    Metodos.generadorAleatorio(1, 100));//Dinero disponible
        //Imprimir espectadores generados
            System.out.println(e);
            
            do{
                fila = Metodos.generadorAleatorio(0,cine.getFilas()-1);
                letra = (char)Metodos.generadorAleatorio('A','A'+(cine.getColumnas()-1));
            
            }while(cine.hayButacaDisponible(fila,letra));
            //Si cumple los requisitos
            if(cine.sePuedeSentar(e)){
                e.pagar(cine.getPrecio());//el espectador paga la entrada
                cine.sentar(fila, letra, e);//el Espectador se sienta
            }    
        }
        System.out.println("");
        cine.mostrar();  
    }
    
}
