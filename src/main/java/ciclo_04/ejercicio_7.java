package ciclo_04;
import java.util.Scanner;
/**
 *
 * @author JOSTHEN GABRIEL
 */
public class ejercicio_7 {
    public static void main(String[] args){
        Scanner prom = new Scanner (System.in);        
        int suma1=0;
        int suma2=0;
        
        for (int i=1; i<=5; i++){
            System.out.println("Introduce el numero:");
            int n = prom.nextInt();
            suma1 = suma1 + n;
        }
        for (int i=6; i<=10; i++){
            System.out.println("Introduce el numero:");
            int n = prom.nextInt();
            suma2 = suma2 + n;
        }
        int total = suma1*suma2;
        System.out.println("La suma de los 5 primeros numeros es: "+suma1);
        System.out.println("La suma de los 5 ultimos numeros es: "+suma2);        
        System.out.println("La multiplicacion de las sumas es:" +total);
    }   
}
