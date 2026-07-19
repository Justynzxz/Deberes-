/**
 * @author Justyn Ricardo Chamba Jordan
 */
package ejercicios;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double num1;
        double num2;
        int opcion;
        
        System.out.println("Ingrese el primer numero"); 
        num1 = sc.nextDouble();
        
        System.out.println("Ingrese el segundo numero"); 
        num2 = sc.nextDouble();
        
        System.out.println("Elija la opcion que necesite"); 
        System.out.println("1- Suma"); 
        System.out.println("2- Resta"); 
        System.out.println("3- Multiplicacion"); 
        System.out.println("4- Division"); 
        System.out.println("5- Residuo"); 
        opcion = sc.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Suma "+(num1 + num2));
                break;
            case 2:
                System.out.println("Resta "+(num1 - num2));
                break;
            case 3:
                System.out.println("Multiplicacion "+(num1 * num2));
                break;
            case 4:
                System.out.println("Division "+(num1 / num2));
                break;
            case 5:
                System.out.println("Residuo "+(num1 % num2));
                break;
            default:
                System.out.println("Opcion Invalida");
        }        
    }
}
