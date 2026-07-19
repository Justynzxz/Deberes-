/**
 * @author Justyn Ricardo Chamba Jordan
 */
package ejercicios;
import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dia;
        int opcion;
        
        System.out.println("Ingrese un numero entre el 1 y el 7"); 
        dia = sc.nextInt();
        
        switch (dia){
            case 1:
                System.out.println("-> Lunes");
                break;
            case 2:
                System.out.println("-> Martes");
                break;
            case 3:
                System.out.println("-> Miercoles");
                break;
            case 4:
                System.out.println("-> Jueves");
                break;
            case 5:
                System.out.println("-> Viernes");
                break;
            case 6:
                System.out.println("-> Sabado");
                break;
            case 7:
                System.out.println("-> Domingo");
                break;
            default:
                System.out.println("Opcion Invalida");
        }        
    }
}
