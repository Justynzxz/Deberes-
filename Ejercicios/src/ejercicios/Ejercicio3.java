/**
 * @author Justyn Ricardo Chamba Jordan
 */
package ejercicios;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int edad;
  
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        
        if(edad >= 18){
            System.out.println("Es mayor de edad ");
        } else
            System.out.println("Es menor de edad ");
    }
}
