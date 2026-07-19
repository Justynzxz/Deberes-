/**
 * @author Justyn Ricardo Chamba Jordan
 */
package ejercicios;
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String clave; 
       
        do { 
            
            System.out.print("Ingrese la contraseña: ");
            clave = sc.nextLine();

            if (!clave.equals("java2026")) {
                System.out.println("Intente nuevamente.");
            }
        }  while (!clave.equals("java2026"));
        
        System.out.println("Acceso consedido");
    }
}
