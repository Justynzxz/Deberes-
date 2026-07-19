/**
 * @author Justyn Ricardo Chamba Jordan
 */
package ejercicios;
import java.util.Scanner;
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int contador;
        
        System.out.println("Ingrese un numero: "); 
        num = sc.nextInt();
        
        contador = 1; 
        
        while (contador <= 12){
            System.out.println(num +"x"+ contador +"=" + (num * contador));
            contador++;
        }
    }
}    