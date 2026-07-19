/**
 * @author Justyn Ricardo Chamba Jordan
 */
package ejercicios;
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.print("Ingrese una nota entre 0 y 10: ");
        nota = sc.nextDouble();

        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 8){
            System.out.println("Muy bueno");
        } else if (nota >= 7){
            System.out.println("Bueno");
        } else if (nota >= 5){
            System.out.println("Regular");
        } else if (nota >= 0){
            System.out.println("Deficiente");
        } else {
            System.out.println("Nota invalida ");
        } 
    }
}