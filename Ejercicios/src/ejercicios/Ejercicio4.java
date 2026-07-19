/**
 * @author Justyn Ricardo Chamba Jordan
 */
package ejercicios;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nota;
  
        System.out.println("Ingrese la nota del estudiante ");
        nota = sc.nextInt();
        
        if(nota >= 7){
            System.out.println("Aprobado ");
        } else
            System.out.println("Reprobado ");
    }
}