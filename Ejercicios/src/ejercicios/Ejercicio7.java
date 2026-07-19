/**
 * @author Justyn Ricardo Chamba Jordan
 */
package ejercicios;
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int cantidad;
        int suma;
        
        cantidad = 0;
        suma = 0;

        System.out.println("Ingrese numeros positivos: ");
        
        do {    
            num = sc.nextInt();
            
            if (num >= 0){
                cantidad++;
                suma += num;
            }
            
        }  while (0 < num);
        
        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Numeros positivos sumados: "+ suma);
    }
}
