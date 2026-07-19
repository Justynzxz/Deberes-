/**
 * @author Justyn Ricardo Chamba Jordan
 */
package ejercicios;
import java.util.Scanner;
public class Ejercicios {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        int edad;
        String carrera;
        double estatura;
        
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Ingrese la carrera que esta estudiando: ");
        carrera = sc.nextLine();
        
        System.out.println("Ingrese su estatura: ");
        estatura = sc.nextDouble();
        
        System.out.println("Mi nombre es "+ nombre);
        System.out.println("Mi edad es "+ edad);
        System.out.println("Estudio la carrera de "+ carrera);
        System.out.println("Mi estatura es "+ estatura);   
    }    
}
