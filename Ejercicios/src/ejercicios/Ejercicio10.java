/**
 * @author Justyn Ricardo Chamba Jordan
 */
package ejercicios;
import java.util.Scanner;
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int suma;
        int i;
        double promedio;
        
        suma = 0;

        for (i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            num = sc.nextInt();
            suma += num;
        }

        promedio = (double) suma / 10;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}