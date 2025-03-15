import java.util.Scanner; /* se utiliza esta etiqueta para poder importar,escanear y almacenar lo que se ingrese desde el teclado */

public class App {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner( System.in); /* Es lo mismo que el leer se debe colocar para que se pueda almacenar automaticamente en el prpyecto*/
       String nombre;
       System.out.println("Ingrese su nombre");
       nombre= teclado.nextLine(); /* Cuando haga uso de la variable "teclado" va a almacenar la informacion que
                                      se ingrese desde el teclado como un "leer" en pseint */
       System.out.println("hola: " + nombre);







        // /* hacer un algoritmo que calcule el salario con valorhora 30000 y cantidad horas 100 */
        // double valorhora= 30000; /* es lo mismo que definir + asignar variable en pseint */
        // double cantidadhora=100; /* es lo mismo que definir + asignar variable en pseint */
        // double salario;
        // salario= valorhora*cantidadhora;
        // System.out.println("El salario del empleador es " + salario); /* Es lo mismo que el escribir en Pseint */ 

        
    }
}
